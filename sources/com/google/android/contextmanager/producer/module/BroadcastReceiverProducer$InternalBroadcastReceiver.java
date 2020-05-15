package com.google.android.contextmanager.producer.module;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BroadcastReceiverProducer$InternalBroadcastReceiver extends aacn {

    /* renamed from: a */
    public final /* synthetic */ dyg f7713a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BroadcastReceiverProducer$InternalBroadcastReceiver(dyg dyg) {
        super("contextmanager");
        this.f7713a = dyg;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        dyg dyg = this.f7713a;
        if (dyg.f14400j) {
            dyg.f13883a.mo9435a(new dyf(this, context, intent), dqy.m9123a(String.valueOf(this.f7713a.f14387c).concat("_broadcast")));
        } else {
            dyg.mo9847a(context, intent);
        }
    }
}
