package com.google.android.gms.mdm.services;

import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BaseLockscreenMessageChimeraService$1 extends aacn {
    public BaseLockscreenMessageChimeraService$1(String str) {
        super(str);
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (((TelephonyManager) context.getSystemService("phone")).getCallState() == 0) {
            context.startActivity(afys.m53682a(context, (String) afzd.f64992f.mo10351a(), (String) afzd.f64993g.mo10351a(), true));
        }
    }
}
