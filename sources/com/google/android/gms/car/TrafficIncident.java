package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TrafficIncident extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nwr();

    /* renamed from: a */
    public int f29463a;

    /* renamed from: b */
    public int f29464b;

    /* renamed from: c */
    public double f29465c;

    /* renamed from: d */
    public double f29466d;

    public TrafficIncident(int i, int i2, double d, double d2) {
        this.f29463a = i;
        this.f29464b = i2;
        this.f29466d = d2;
        this.f29465c = d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f29463a);
        see.m35063b(parcel, 2, this.f29464b);
        see.m35033a(parcel, 3, this.f29465c);
        see.m35033a(parcel, 4, this.f29466d);
        see.m35062b(parcel, a);
    }
}
