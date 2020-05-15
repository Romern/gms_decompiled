package com.google.android.gms.mdm.services;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BaseLockscreenMessageChimeraService$2 extends aacn {
    public BaseLockscreenMessageChimeraService$2(String str) {
        super(str);
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            afzq.m53768e(context);
            afzq.m53769f(context);
            afyu.m53686a(new cake[]{cake.SCREEN_UNLOCKED}, null, null, null, (String) afzd.f64998l.mo10351a(), null, afzw.m53778a(context), null, null, null);
            afzj.m53717a(context);
        }
    }
}
