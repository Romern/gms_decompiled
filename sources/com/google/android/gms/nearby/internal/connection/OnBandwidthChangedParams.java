package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OnBandwidthChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aihb();

    /* renamed from: a */
    public String f80568a;

    /* renamed from: b */
    public int f80569b;

    public OnBandwidthChangedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnBandwidthChangedParams) {
            OnBandwidthChangedParams onBandwidthChangedParams = (OnBandwidthChangedParams) obj;
            return sdg.m34949a(this.f80568a, onBandwidthChangedParams.f80568a) && sdg.m34949a(Integer.valueOf(this.f80569b), Integer.valueOf(onBandwidthChangedParams.f80569b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80568a, Integer.valueOf(this.f80569b)});
    }

    public OnBandwidthChangedParams(String str, int i) {
        this.f80568a = str;
        this.f80569b = i;
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
        see.m35046a(parcel, 1, this.f80568a, false);
        see.m35063b(parcel, 2, this.f80569b);
        see.m35062b(parcel, a);
    }
}
