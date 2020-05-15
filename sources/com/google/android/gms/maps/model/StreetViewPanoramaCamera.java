package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new afhm();

    /* renamed from: a */
    public final float f79937a;

    /* renamed from: b */
    public final float f79938b;

    /* renamed from: c */
    public final float f79939c;

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        float f4;
        boolean z = false;
        if (f2 >= -90.0f && f2 <= 90.0f) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        sdo.m34975b(z, sb.toString());
        this.f79937a = ((double) f) <= 0.0d ? 0.0f : f;
        this.f79938b = 0.0f + f2;
        if (((double) f3) <= 0.0d) {
            f4 = (f3 % 360.0f) + 360.0f;
        } else {
            f4 = f3;
        }
        this.f79939c = f4 % 360.0f;
        new StreetViewPanoramaOrientation(f2, f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StreetViewPanoramaCamera) {
            StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
            return Float.floatToIntBits(this.f79937a) == Float.floatToIntBits(streetViewPanoramaCamera.f79937a) && Float.floatToIntBits(this.f79938b) == Float.floatToIntBits(streetViewPanoramaCamera.f79938b) && Float.floatToIntBits(this.f79939c) == Float.floatToIntBits(streetViewPanoramaCamera.f79939c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f79937a), Float.valueOf(this.f79938b), Float.valueOf(this.f79939c)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("zoom", Float.valueOf(this.f79937a));
        a.mo25396a("tilt", Float.valueOf(this.f79938b));
        a.mo25396a("bearing", Float.valueOf(this.f79939c));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35034a(parcel, 2, this.f79937a);
        see.m35034a(parcel, 3, this.f79938b);
        see.m35034a(parcel, 4, this.f79939c);
        see.m35062b(parcel, a);
    }
}
