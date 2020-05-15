package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PowerStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lrv();

    /* renamed from: a */
    public final int f11716a;

    /* renamed from: b */
    public final double f11717b;

    public PowerStateImpl(int i, double d) {
        this.f11716a = i;
        this.f11717b = d;
    }

    public final String toString() {
        String num = Integer.toString(this.f11716a);
        double d = this.f11717b;
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 69);
        sb.append("PowerConnectionState = ");
        sb.append(num);
        sb.append(" Battery Percentage = ");
        sb.append(d);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f11716a);
        see.m35033a(parcel, 3, this.f11717b);
        see.m35062b(parcel, a);
    }
}
