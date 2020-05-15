package com.google.android.location.quake;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.LocationResult;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationDataListener$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bgpq f150841a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationDataListener$1(bgpq bgpq, String str) {
        super(str);
        this.f150841a = bgpq;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        Location a;
        int i = bgpq.f117212a;
        intent.getAction();
        LocationResult.m66866a(intent);
        if (LocationResult.m66866a(intent) && (a = LocationResult.m66867b(intent).mo43561a()) != null && !aeim.m51907k(a)) {
            this.f150841a.mo63077a(a);
        }
    }
}
