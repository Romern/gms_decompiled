package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetCapabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axrd();

    /* renamed from: a */
    public final int f110921a;

    /* renamed from: b */
    public final CapabilityInfoParcelable f110922b;

    public GetCapabilityResponse(int i, CapabilityInfoParcelable capabilityInfoParcelable) {
        this.f110921a = i;
        this.f110922b = capabilityInfoParcelable;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110921a);
        see.m35040a(parcel, 3, this.f110922b, i, false);
        see.m35062b(parcel, a);
    }
}
