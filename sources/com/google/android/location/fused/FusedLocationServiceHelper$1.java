package com.google.android.location.fused;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FusedLocationServiceHelper$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bfqm f150715a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FusedLocationServiceHelper$1(bfqm bfqm, String str) {
        super(str);
        this.f150715a = bfqm;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.USER_FOREGROUND".equals(action)) {
            this.f150715a.f114878e.mo62058a();
        } else if ("android.intent.action.USER_BACKGROUND".equals(action)) {
            this.f150715a.f114878e.mo62061b();
        }
    }
}
