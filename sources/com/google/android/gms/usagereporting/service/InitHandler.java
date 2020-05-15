package com.google.android.gms.usagereporting.service;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Process;
import android.os.SystemProperties;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InitHandler extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        boolean z;
        if (!Process.myUserHandle().isOwner()) {
            avvn a = avvn.m79436a();
            synchronized (a.f93986a) {
                boolean z2 = false;
                if (!avvm.m79434a() && !SystemProperties.getBoolean("ro.fw.mu.headless_system_user", false) && !SystemProperties.getBoolean("android.car.systemuser.headless", false)) {
                    z2 = true;
                }
                SharedPreferences b = a.mo51647b();
                rzz.m34727a(b, "Unexpected null from getPrefs.");
                z = b.getBoolean("OptInUsageReporting", z2);
            }
            avvm.m79433a(this, z);
            return;
        }
        avvn.m79436a().mo51644a(this);
    }
}
