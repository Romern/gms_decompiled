package com.google.android.gms.ads.measurement.service;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.measurement.service.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0745c extends dck implements C0746d {
    public C0745c() {
        super("com.google.android.gms.ads.measurement.service.IGmpConversionTrackingService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo7040a((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
