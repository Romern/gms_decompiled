package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TransitEstimate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avwz();

    /* renamed from: a */
    public final int f109586a;

    /* renamed from: b */
    public final float f109587b;

    public TransitEstimate(int i, float f) {
        this.f109586a = i;
        this.f109587b = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f109586a);
        see.m35034a(parcel, 2, this.f109587b);
        see.m35062b(parcel, a);
    }
}
