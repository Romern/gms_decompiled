package com.google.android.gms.trustlet.place.tracker;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HomeAddressChangeTracker$UserPresentBroadcastReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ auxn f109295a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeAddressChangeTracker$UserPresentBroadcastReceiver(auxn auxn) {
        super("trustlet_place");
        this.f109295a = auxn;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        auxn.f92725a.mo50711a("User Present. Maybe fetch home.", new Object[0]).mo50708c();
        this.f109295a.mo51032a();
    }
}
