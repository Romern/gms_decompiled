package com.google.android.gms.trustlet.onbody.internal;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnbodyLure$GserviceChangeReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ auvq f109250a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnbodyLure$GserviceChangeReceiver(auvq auvq) {
        super("trustlet_onbody");
        this.f109250a = auvq;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            auvq auvq = this.f109250a;
            if (!auvq.f92618c) {
                auvq.mo50978b();
            }
        }
    }
}
