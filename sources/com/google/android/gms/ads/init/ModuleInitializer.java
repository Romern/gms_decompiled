package com.google.android.gms.ads.init;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.ads.identifier.settings.C0287e;
import com.google.android.gms.ads.identifier.settings.C0301s;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.settings.internal.C0880a;
import com.google.android.gms.ads.settings.internal.C0881b;
import com.google.android.gms.ads.settings.internal.C0882c;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleInitializer extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6536b(Intent intent, boolean z) {
        int i = stu.m36320f().getInt("prev_version_code", -1);
        Context applicationContext = getApplicationContext();
        C0287e a = C0287e.m5194a(applicationContext);
        C0371o.m5339a(applicationContext);
        int i2 = Build.VERSION.SDK_INT;
        if (((DevicePolicyManager) applicationContext.getSystemService("device_policy")).isDeviceOwnerApp("com.google.android.apps.enterprise.dmagent")) {
            C0880a aVar = new C0880a(a, i, applicationContext);
            C0882c cVar = new C0882c(applicationContext, aVar);
            Intent intent2 = new Intent("com.google.android.nfcprovision.IOwnedService.BIND");
            intent2.setComponent(new ComponentName("com.google.android.nfcprovision", "com.google.android.nfcprovision.SchoolOwnedService"));
            try {
                if (!skh.m35531a().mo25690a(applicationContext, intent2, cVar, 1)) {
                    aVar.mo7117a(false);
                }
            } catch (SecurityException e) {
                Log.w("EduDeviceHelper", "Fail to bind to school-ownership service; assuming it's not school-owned.");
                Log.w("EduDeviceHelper", e);
                aVar.mo7117a(false);
            }
        }
        if (cbvp.m128522i()) {
            Bundle a2 = C0881b.m6073a("gmscore_upgrade", Boolean.toString(a.mo6518i()), Integer.toString(i));
            a2.putString("locale", Locale.getDefault().toString());
            C0387d.m5363a().mo6853a(applicationContext, null, "gmob-apps", a2);
        }
        C0301s.m5225a(applicationContext).mo6522a();
    }
}
