package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StationPreset extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nwf();

    /* renamed from: a */
    public int f29454a;

    /* renamed from: b */
    public int f29455b;

    /* renamed from: c */
    public int f29456c;

    public StationPreset(int i, int i2, int i3) {
        this.f29454a = i;
        this.f29455b = i2;
        this.f29456c = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f29454a);
        see.m35063b(parcel, 2, this.f29455b);
        see.m35063b(parcel, 3, this.f29456c);
        see.m35062b(parcel, a);
    }
}
