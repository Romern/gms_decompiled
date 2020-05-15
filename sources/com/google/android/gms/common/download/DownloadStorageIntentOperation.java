package com.google.android.gms.common.download;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DownloadStorageIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        Context baseContext = getBaseContext();
        String action = intent.getAction();
        if ("android.intent.action.DEVICE_STORAGE_LOW".equals(action)) {
            DownloadIntentOperation.m22553a(baseContext).edit().putBoolean("ds__storage_low__", true).apply();
        } else if ("android.intent.action.DEVICE_STORAGE_OK".equals(action)) {
            DownloadIntentOperation.m22553a(baseContext).edit().remove("ds__storage_low__").apply();
        } else {
            String valueOf = String.valueOf(action);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Unknown action: ") : "Unknown action: ".concat(valueOf));
        }
    }
}
