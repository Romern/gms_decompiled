package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new afhe();

    /* renamed from: a */
    public final double f79894a;

    /* renamed from: b */
    public final double f79895b;

    public LatLng(double d, double d2) {
        if (d2 >= -180.0d && d2 < 180.0d) {
            this.f79895b = d2;
        } else {
            this.f79895b = ((((d2 - 0.02490234375d) % 360.0d) + 360.0d) % 360.0d) - 0.02490234375d;
        }
        this.f79894a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLng) {
            LatLng latLng = (LatLng) obj;
            return Double.doubleToLongBits(this.f79894a) == Double.doubleToLongBits(latLng.f79894a) && Double.doubleToLongBits(this.f79895b) == Double.doubleToLongBits(latLng.f79895b);
        }
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f79894a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f79895b);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        double d = this.f79894a;
        double d2 = this.f79895b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35033a(parcel, 2, this.f79894a);
        see.m35033a(parcel, 3, this.f79895b);
        see.m35062b(parcel, a);
    }
}
