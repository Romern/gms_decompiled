package com.google.android.gms.asterism;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetAsterismConsentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gbg();

    /* renamed from: a */
    public final int f9827a;

    /* renamed from: b */
    public final int f9828b;

    public GetAsterismConsentResponse(int i, int i2) {
        this.f9827a = i;
        this.f9828b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f9827a);
        see.m35063b(parcel, 2, this.f9828b);
        see.m35062b(parcel, a);
    }
}
