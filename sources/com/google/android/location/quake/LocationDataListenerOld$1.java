package com.google.android.location.quake;

import android.content.Context;
import android.content.Intent;
import android.location.Location;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationDataListenerOld$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bgpr f150842a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationDataListenerOld$1(bgpr bgpr, String str) {
        super(str);
        this.f150842a = bgpr;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int i = bgpr.f117227a;
        intent.getAction();
        Location location = (Location) intent.getParcelableExtra("com.google.android.location.LOCATION");
        if (location != null && !aeim.m51907k(location)) {
            this.f150842a.mo63084a(location);
        }
    }
}
