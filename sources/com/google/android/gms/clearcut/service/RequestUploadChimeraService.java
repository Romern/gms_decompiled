package com.google.android.gms.clearcut.service;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.PendingCallback;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RequestUploadChimeraService extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean d = cdej.m132798d();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Request upload: now=");
        sb.append(currentTimeMillis);
        sb.append(" debug=");
        sb.append(d);
        Log.i("RequestUploadService", sb.toString());
        if (!cdej.m132798d()) {
            Log.i("RequestUploadService", "Request denied: debug is false");
            return;
        }
        Intent intent2 = new Intent();
        PendingCallback pendingCallback = new PendingCallback(new rcb());
        intent2.setClassName("com.google.android.gms", "com.google.android.gms.clearcut.uploader.QosUploaderService");
        intent2.setAction("com.google.android.gms.gcm.ACTION_TASK_READY");
        intent2.putExtra("tag", "qos_debug_force_upload");
        intent2.putExtra("callback", pendingCallback);
        startService(intent2);
    }
}
