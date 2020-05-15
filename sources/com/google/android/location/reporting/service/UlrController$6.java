package com.google.android.location.reporting.service;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UlrController$6 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bgxx f150889a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UlrController$6(bgxx bgxx, String str) {
        super(str);
        this.f150889a = bgxx;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        bgxx bgxx = this.f150889a;
        int i = bgxx.f117951w;
        bgxt bgxt = bgxx.f117961k;
        bgxt.sendMessage(bgxt.obtainMessage(1, intent));
    }
}
