package com.google.android.gms.trustagent.common.trustlet;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AbstractTrustletService$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ auou f109158a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractTrustletService$1(auou auou, String str) {
        super(str);
        this.f109158a = auou;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            auou.f92221e.mo50711a("onReceive: GSERVICES_CHANGED", new Object[0]);
            this.f109158a.mo50775t();
        }
    }
}
