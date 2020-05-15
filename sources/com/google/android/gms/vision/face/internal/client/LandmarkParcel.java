package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LandmarkParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avzk();

    /* renamed from: a */
    public final int f109711a;

    /* renamed from: b */
    public final float f109712b;

    /* renamed from: c */
    public final float f109713c;

    /* renamed from: d */
    public final int f109714d;

    public LandmarkParcel(int i, float f, float f2, int i2) {
        this.f109711a = i;
        this.f109712b = f;
        this.f109713c = f2;
        this.f109714d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f109711a);
        see.m35034a(parcel, 2, this.f109712b);
        see.m35034a(parcel, 3, this.f109713c);
        see.m35063b(parcel, 4, this.f109714d);
        see.m35062b(parcel, a);
    }
}
