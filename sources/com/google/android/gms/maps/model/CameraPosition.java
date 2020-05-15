package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new afgy();

    /* renamed from: a */
    public final LatLng f79866a;

    /* renamed from: b */
    public final float f79867b;

    /* renamed from: c */
    public final float f79868c;

    /* renamed from: d */
    public final float f79869d;

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        boolean z;
        sdo.m34966a(latLng, "null camera target");
        if (f2 < 0.0f || f2 > 90.0f) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34976b(z, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f79866a = latLng;
        this.f79867b = f;
        this.f79868c = f2 + 0.0f;
        this.f79869d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    /* renamed from: a */
    public static afgx m67167a() {
        return new afgx();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CameraPosition) {
            CameraPosition cameraPosition = (CameraPosition) obj;
            return this.f79866a.equals(cameraPosition.f79866a) && Float.floatToIntBits(this.f79867b) == Float.floatToIntBits(cameraPosition.f79867b) && Float.floatToIntBits(this.f79868c) == Float.floatToIntBits(cameraPosition.f79868c) && Float.floatToIntBits(this.f79869d) == Float.floatToIntBits(cameraPosition.f79869d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79866a, Float.valueOf(this.f79867b), Float.valueOf(this.f79868c), Float.valueOf(this.f79869d)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("target", this.f79866a);
        a.mo25396a("zoom", Float.valueOf(this.f79867b));
        a.mo25396a("tilt", Float.valueOf(this.f79868c));
        a.mo25396a("bearing", Float.valueOf(this.f79869d));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f79866a, i, false);
        see.m35034a(parcel, 3, this.f79867b);
        see.m35034a(parcel, 4, this.f79868c);
        see.m35034a(parcel, 5, this.f79869d);
        see.m35062b(parcel, a);
    }
}
