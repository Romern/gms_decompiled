package com.google.android.places.service;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlaceDetectionServiceImpl$FlagChangeBroadCastReceiver extends aacn {

    /* renamed from: a */
    private final bicz f151371a;

    public PlaceDetectionServiceImpl$FlagChangeBroadCastReceiver(bicz bicz) {
        super("places");
        this.f151371a = bicz;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) || "com.google.android.gms.phenotype.COMMITTED".equals(action)) {
            bicz bicz = this.f151371a;
            if (cggg.m145198b() != bicz.f120273f) {
                bicz.mo64538a();
            }
            bicz.f120273f = cggg.m145198b();
        }
    }
}
