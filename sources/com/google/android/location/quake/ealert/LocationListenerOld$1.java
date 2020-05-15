package com.google.android.location.quake.ealert;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.LocationResult;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationListenerOld$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bgsl f150859a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationListenerOld$1(bgsl bgsl, String str) {
        super(str);
        this.f150859a = bgsl;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        Location a;
        int i = bgsl.f117424d;
        intent.getAction();
        if (LocationResult.m66866a(intent) && (a = LocationResult.m66867b(intent).mo43561a()) != null && !aeim.m51907k(a)) {
            this.f150859a.mo63135a(a);
        }
    }
}
