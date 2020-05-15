package com.google.android.gms.cast.discovery;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DiscoveryManager$DiscoveryManagerReceiver extends aacn {

    /* renamed from: a */
    public final /* synthetic */ pmh f29869a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiscoveryManager$DiscoveryManagerReceiver(pmh pmh) {
        super("cast");
        this.f29869a = pmh;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        pmh pmh = this.f29869a;
        long j = pmh.f39672b;
        pmh.f39679g.execute(new pmg(this, intent));
    }
}
