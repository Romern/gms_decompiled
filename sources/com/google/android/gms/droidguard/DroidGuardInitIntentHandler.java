package com.google.android.gms.droidguard;

import android.content.ComponentName;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DroidGuardInitIntentHandler extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        try {
            vyd vyd = new vyd(this);
            vyd.f50224a.getPackageManager().setComponentEnabledSetting(new ComponentName("com.google.android.gms", "com.google.android.gms.droidguard.DroidGuardGcmTaskService"), 1, 1);
            vyd.mo28955b();
        } catch (Exception e) {
            vwf.m41483a(this).mo28911a(e);
        }
    }
}
