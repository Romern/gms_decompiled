package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afhr();

    /* renamed from: a */
    public final LatLng f79949a;

    /* renamed from: b */
    public final LatLng f79950b;

    /* renamed from: c */
    public final LatLng f79951c;

    /* renamed from: d */
    public final LatLng f79952d;

    /* renamed from: e */
    public final LatLngBounds f79953e;

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f79949a = latLng;
        this.f79950b = latLng2;
        this.f79951c = latLng3;
        this.f79952d = latLng4;
        this.f79953e = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VisibleRegion) {
            VisibleRegion visibleRegion = (VisibleRegion) obj;
            return this.f79949a.equals(visibleRegion.f79949a) && this.f79950b.equals(visibleRegion.f79950b) && this.f79951c.equals(visibleRegion.f79951c) && this.f79952d.equals(visibleRegion.f79952d) && this.f79953e.equals(visibleRegion.f79953e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79949a, this.f79950b, this.f79951c, this.f79952d, this.f79953e});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("nearLeft", this.f79949a);
        a.mo25396a("nearRight", this.f79950b);
        a.mo25396a("farLeft", this.f79951c);
        a.mo25396a("farRight", this.f79952d);
        a.mo25396a("latLngBounds", this.f79953e);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f79949a, i, false);
        see.m35040a(parcel, 3, this.f79950b, i, false);
        see.m35040a(parcel, 4, this.f79951c, i, false);
        see.m35040a(parcel, 5, this.f79952d, i, false);
        see.m35040a(parcel, 6, this.f79953e, i, false);
        see.m35062b(parcel, a);
    }
}
