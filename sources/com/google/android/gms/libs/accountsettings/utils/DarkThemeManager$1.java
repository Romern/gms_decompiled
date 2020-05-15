package com.google.android.gms.libs.accountsettings.utils;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DarkThemeManager$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ adyf f79288a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DarkThemeManager$1(adyf adyf, String str) {
        super(str);
        this.f79288a = adyf;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        boolean z;
        adyf adyf = this.f79288a;
        boolean f = adyf.m51388f();
        Boolean bool = adyf.f62894a;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (f != z && adyf.m51387a(adyf.f62898e, f, adyf.m51389g()) != adyf.f62897d) {
            adyf.f62894a = null;
            adyf.f62896c.recreate();
        }
    }
}
