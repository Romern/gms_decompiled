package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afhn();

    /* renamed from: a */
    public final float f79940a;

    /* renamed from: b */
    public final float f79941b;

    public StreetViewPanoramaOrientation(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f);
        sdo.m34975b(z, sb.toString());
        this.f79940a = f + 0.0f;
        this.f79941b = (((double) f2) <= 0.0d ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StreetViewPanoramaOrientation) {
            StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
            return Float.floatToIntBits(this.f79940a) == Float.floatToIntBits(streetViewPanoramaOrientation.f79940a) && Float.floatToIntBits(this.f79941b) == Float.floatToIntBits(streetViewPanoramaOrientation.f79941b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f79940a), Float.valueOf(this.f79941b)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("tilt", Float.valueOf(this.f79940a));
        a.mo25396a("bearing", Float.valueOf(this.f79941b));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35034a(parcel, 2, this.f79940a);
        see.m35034a(parcel, 3, this.f79941b);
        see.m35062b(parcel, a);
    }
}
