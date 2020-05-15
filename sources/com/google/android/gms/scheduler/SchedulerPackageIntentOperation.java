package com.google.android.gms.scheduler;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SchedulerPackageIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (!"android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) || !intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
            aajg.m21335a((Context) this);
            if (aajg.m21344d() == 0) {
                SchedulerProxyIntentOperation.m92334a(intent, 0);
                return;
            }
            Intent intent2 = new Intent("com.google.android.gms.gcm.nts.USER_FORWARD");
            intent2.setClassName(this, "com.google.android.gms.chimera.GmsIntentOperationService$PersistentInternalReceiver");
            intent2.putExtra("intent", intent);
            intent2.putExtra("userSerial", aajg.m21344d());
            aajg.m21337a(this, intent2);
        }
    }

    /* renamed from: a */
    public static aamh m92333a(Intent intent, int i) {
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
