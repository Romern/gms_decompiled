package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Position extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avwc();

    /* renamed from: a */
    public final double f109570a;

    /* renamed from: b */
    public final double f109571b;

    public Position(double d, double d2) {
        if (d2 >= -180.0d && d2 < 180.0d) {
            this.f109571b = d2;
        } else {
            this.f109571b = ((((d2 - 0.02490234375d) % 360.0d) + 360.0d) % 360.0d) - 0.02490234375d;
        }
        this.f109570a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35033a(parcel, 1, this.f109570a);
        see.m35033a(parcel, 2, this.f109571b);
        see.m35062b(parcel, a);
    }
}
