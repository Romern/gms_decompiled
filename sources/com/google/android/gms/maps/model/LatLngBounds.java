package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new afhd();

    /* renamed from: a */
    public final LatLng f79896a;

    /* renamed from: b */
    public final LatLng f79897b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        sdo.checkIfNull(latLng, "null southwest");
        sdo.checkIfNull(latLng2, "null northeast");
        double d = latLng2.f79894a;
        double d2 = latLng.f79894a;
        sdo.m34976b(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(latLng2.f79894a));
        this.f79896a = latLng;
        this.f79897b = latLng2;
    }

    /* renamed from: a */
    public final LatLng mo43870a() {
        double d;
        LatLng latLng = this.f79896a;
        double d2 = latLng.f79894a;
        LatLng latLng2 = this.f79897b;
        double d3 = (d2 + latLng2.f79894a) / 2.0d;
        double d4 = latLng2.f79895b;
        double d5 = latLng.f79895b;
        if (d5 > d4) {
            d = ((d4 + 360.0d) + d5) / 2.0d;
        } else {
            d = (d4 + d5) / 2.0d;
        }
        return new LatLng(d3, d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLngBounds) {
            LatLngBounds latLngBounds = (LatLngBounds) obj;
            return this.f79896a.equals(latLngBounds.f79896a) && this.f79897b.equals(latLngBounds.f79897b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79896a, this.f79897b});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("southwest", this.f79896a);
        a.mo25396a("northeast", this.f79897b);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f79896a, i, false);
        see.m35040a(parcel, 3, this.f79897b, i, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final boolean mo43871a(LatLng latLng) {
        double d = latLng.f79894a;
        LatLng latLng2 = this.f79896a;
        if (latLng2.f79894a > d) {
            return false;
        }
        LatLng latLng3 = this.f79897b;
        if (d > latLng3.f79894a) {
            return false;
        }
        double d2 = latLng.f79895b;
        double d3 = latLng2.f79895b;
        double d4 = latLng3.f79895b;
        return d3 <= d4 ? d3 <= d2 && d2 <= d4 : d3 <= d2 || d2 <= d4;
    }
}
