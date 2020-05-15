package com.google.android.gms.car.diagnostics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConnectionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nzn();

    /* renamed from: a */
    public final long f29472a;

    /* renamed from: b */
    public final int f29473b;

    /* renamed from: c */
    public final CriticalError f29474c;

    /* renamed from: d */
    public final long f29475d;

    public ConnectionState(long j, int i, CriticalError criticalError, long j2) {
        this.f29472a = j;
        this.f29473b = i;
        this.f29474c = criticalError;
        this.f29475d = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f29472a);
        see.m35063b(parcel, 2, this.f29473b);
        see.m35040a(parcel, 3, this.f29474c, i, false);
        see.m35036a(parcel, 4, this.f29475d);
        see.m35062b(parcel, a);
    }
}
