package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OnEndpointDistanceChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aihn();

    /* renamed from: a */
    public String f80588a;

    /* renamed from: b */
    public int f80589b;

    public OnEndpointDistanceChangedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnEndpointDistanceChangedParams) {
            OnEndpointDistanceChangedParams onEndpointDistanceChangedParams = (OnEndpointDistanceChangedParams) obj;
            return sdg.m34949a(this.f80588a, onEndpointDistanceChangedParams.f80588a) && sdg.m34949a(Integer.valueOf(this.f80589b), Integer.valueOf(onEndpointDistanceChangedParams.f80589b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80588a, Integer.valueOf(this.f80589b)});
    }

    public OnEndpointDistanceChangedParams(String str, int i) {
        this.f80588a = str;
        this.f80589b = i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f80588a, false);
        see.m35063b(parcel, 2, this.f80589b);
        see.m35062b(parcel, a);
    }
}
