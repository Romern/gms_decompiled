package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarInstrumentClusterInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nlw();

    /* renamed from: a */
    public int f29349a;

    /* renamed from: b */
    public int f29350b;

    /* renamed from: c */
    public int f29351c;

    /* renamed from: d */
    public int f29352d;

    /* renamed from: e */
    public int f29353e;

    public CarInstrumentClusterInfo() {
    }

    public CarInstrumentClusterInfo(int i, int i2, int i3, int i4, int i5) {
        this.f29349a = i;
        this.f29350b = i2;
        this.f29351c = i3;
        this.f29352d = i4;
        this.f29353e = i5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f29349a);
        see.m35063b(parcel, 2, this.f29350b);
        see.m35063b(parcel, 3, this.f29351c);
        see.m35063b(parcel, 4, this.f29352d);
        see.m35063b(parcel, 5, this.f29353e);
        see.m35062b(parcel, a);
    }
}
