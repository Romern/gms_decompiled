package com.google.android.gms.gcm;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmPackageIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (!"android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) || !intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
            GcmProxyIntentOperation.m24313a(this, intent);
        }
    }

    /* renamed from: a */
    public static aamh m24312a(Intent intent, int i) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return aamh.m21513a(str, i);
        }
        return null;
    }
}
