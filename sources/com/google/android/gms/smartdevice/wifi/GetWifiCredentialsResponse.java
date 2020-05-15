package com.google.android.gms.smartdevice.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetWifiCredentialsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asdi();

    /* renamed from: a */
    public int f108271a;

    /* renamed from: b */
    public String f108272b;

    private GetWifiCredentialsResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetWifiCredentialsResponse) {
            GetWifiCredentialsResponse getWifiCredentialsResponse = (GetWifiCredentialsResponse) obj;
            return sdg.m34949a(Integer.valueOf(this.f108271a), Integer.valueOf(getWifiCredentialsResponse.f108271a)) && sdg.m34949a(this.f108272b, getWifiCredentialsResponse.f108272b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f108271a), this.f108272b});
    }

    public GetWifiCredentialsResponse(int i, String str) {
        this.f108271a = i;
        this.f108272b = str;
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
        see.m35063b(parcel, 1, this.f108271a);
        see.m35046a(parcel, 2, this.f108272b, false);
        see.m35062b(parcel, a);
    }
}
