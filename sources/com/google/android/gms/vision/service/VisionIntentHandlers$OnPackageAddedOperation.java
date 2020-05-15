package com.google.android.gms.vision.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VisionIntentHandlers$OnPackageAddedOperation extends IntentOperation {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avzo.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.vision.service.VisionIntentHandlers$OnPackageAddedOperation, java.lang.String, int]
     candidates:
      avzo.a(android.content.Context, java.util.Set, boolean):void
      avzo.a(android.content.Context, java.lang.String, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    public final void onHandleIntent(Intent intent) {
        new Object[1][0] = intent;
        if (intent.getData() == null) {
            avxz.m79525a("Null data for %s", intent);
            return;
        }
        String[] split = intent.getData().toString().split(":");
        if (split.length < 2) {
            avxz.m79525a("Data not package name: %s", intent.getData());
            return;
        }
        String str = split[1];
        String str2 = null;
        try {
            ApplicationInfo a = svr.m36484b(this).mo26172a(str, 128);
            if (a == null || a.metaData == null) {
                new Object[1][0] = str;
                if (str2 != null) {
                    new Object[1][0] = str;
                } else {
                    avzo.m79548a((Context) this, str2, true);
                }
            } else {
                String string = a.metaData.getString("com.google.android.gms.vision.DEPENDENCIES");
                if (TextUtils.isEmpty(string)) {
                    string = a.metaData.getString("com.google.firebase.ml.vision.DEPENDENCIES");
                }
                str2 = TextUtils.isEmpty(string) ? a.metaData.getString("com.google.mlkit.vision.DEPENDENCIES") : string;
                if (str2 != null) {
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            avxz.m79525a("Failed to find package %s", str);
        }
    }
}
