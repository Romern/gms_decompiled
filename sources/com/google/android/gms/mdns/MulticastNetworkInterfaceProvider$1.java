package com.google.android.gms.mdns;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MulticastNetworkInterfaceProvider$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ agbv f80080a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MulticastNetworkInterfaceProvider$1(agbv agbv, String str) {
        super(str);
        this.f80080a = agbv;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        agbv.f65198a.mo35221a("Connectivity changed.");
        this.f80080a.f65202d = true;
    }
}
