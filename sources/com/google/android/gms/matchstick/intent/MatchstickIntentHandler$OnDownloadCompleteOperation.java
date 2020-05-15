package com.google.android.gms.matchstick.intent;

import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MatchstickIntentHandler$OnDownloadCompleteOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        long longExtra = intent.getLongExtra("extra_download_id", -1);
        Object[] objArr = {Long.valueOf(longExtra), intent};
        azeb.m85505a(getBaseContext().getApplicationContext(), longExtra);
    }
}
