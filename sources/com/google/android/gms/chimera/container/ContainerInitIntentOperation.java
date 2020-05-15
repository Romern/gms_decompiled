package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContainerInitIntentOperation extends qlf {
    /* renamed from: a */
    private final void m22388a() {
        int d = stu.m36318d();
        int e = spn.m35881e(this);
        if (d != e) {
            SharedPreferences.Editor edit = stu.m36320f().edit();
            edit.putInt("version_code", e);
            edit.putInt("prev_version_code", d);
            edit.apply();
        }
        String e2 = stu.m36319e();
        String c = stu.m36317c();
        if (!e2.equals(c)) {
            SharedPreferences.Editor edit2 = stu.m36320f().edit();
            edit2.putString("version_code_and_timestamp", c);
            edit2.apply();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo17616b(Intent intent) {
        aytw.m84814b();
        m22388a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        m22388a();
        aytw.m84814b();
        if (aytw.m84815b(this)) {
            anfb.m64142d(this, "direct_boot:gms_chimera_phenotype_flags");
            anfb.m64142d(this, "direct_boot:gms_chimera_phenotype_flags");
        }
        Intent intent2 = new Intent("com.google.android.gms.chimera.container.CONTAINER_UPDATED");
        intent2.setPackage(getPackageName());
        startService(intent2);
    }
}
