package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.provider.Settings;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.RecursiveTask;

public class Service1 extends Service {
    public Service1() {
    }

    private WindowManager mWindowManager;
    private View mOverlayView;
    private String mAppPackageName;
    @Override
    public IBinder onBind(Intent intent) {

        throw new UnsupportedOperationException("Pamagiti");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mWindowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        mAppPackageName = getPackageName();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mOverlayView != null) {
            mWindowManager.removeView(mOverlayView);
            mOverlayView = null;
        }
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (mOverlayView == null) {
            Toast.makeText(this,"Fixing loneliness", Toast.LENGTH_SHORT);
            mOverlayView = LayoutInflater.from(this).inflate(R.layout.overlay_layout, null);

            TextView textView = mOverlayView.findViewById(R.id.overlay_textview);
            textView.setText(getString(R.string.overlay_message));
            Button button = mOverlayView.findViewById(R.id.overlay_button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent launchIntent = getPackageManager().getLaunchIntentForPackage(mAppPackageName);
                    if (launchIntent != null) {
                        startActivity(launchIntent);
                    }
                    stopSelf();
                }
            });

            final WindowManager.LayoutParams params = new
                    WindowManager.LayoutParams(
                    WindowManager.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
                    WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                    PixelFormat.TRANSLUCENT);
            mWindowManager.addView(mOverlayView, params);
            params.gravity = Gravity.BOTTOM | Gravity.CENTER;
            mWindowManager.updateViewLayout(mOverlayView, params);
        }

        return START_STICKY;
    }
}