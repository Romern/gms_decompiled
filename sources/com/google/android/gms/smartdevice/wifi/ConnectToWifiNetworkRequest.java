package com.google.android.gms.smartdevice.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ConnectToWifiNetworkRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asdf();

    /* renamed from: a */
    public String f108266a;

    /* renamed from: b */
    public String f108267b;

    /* renamed from: c */
    public String f108268c;

    /* renamed from: d */
    public boolean f108269d;

    public ConnectToWifiNetworkRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectToWifiNetworkRequest) {
            ConnectToWifiNetworkRequest connectToWifiNetworkRequest = (ConnectToWifiNetworkRequest) obj;
            return sdg.m34949a(this.f108266a, connectToWifiNetworkRequest.f108266a) && sdg.m34949a(this.f108267b, connectToWifiNetworkRequest.f108267b) && sdg.m34949a(this.f108268c, connectToWifiNetworkRequest.f108268c) && sdg.m34949a(Boolean.valueOf(this.f108269d), Boolean.valueOf(connectToWifiNetworkRequest.f108269d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f108266a, this.f108267b, this.f108268c, Boolean.valueOf(this.f108269d)});
    }

    public ConnectToWifiNetworkRequest(String str, String str2, String str3, boolean z) {
        this.f108266a = str;
        this.f108267b = str2;
        this.f108268c = str3;
        this.f108269d = z;
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
        see.m35046a(parcel, 1, this.f108266a, false);
        see.m35046a(parcel, 2, this.f108267b, false);
        see.m35046a(parcel, 3, this.f108268c, false);
        see.m35051a(parcel, 4, this.f108269d);
        see.m35062b(parcel, a);
    }
}
