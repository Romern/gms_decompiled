package com.google.android.gms.cast.activity;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NearbyPinActivityImpl$CastNearbyAbortedReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ phj f29866a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyPinActivityImpl$CastNearbyAbortedReceiver(phj phj) {
        super("cast");
        this.f29866a = phj;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        phj phj = this.f29866a;
        String str = phj.f39110a;
        phj.f39114c.mo23670a("Received CAST_NEARBY_ABORTED intent - closing the dialog.", new Object[0]);
        this.f29866a.mo23084g();
    }
}
