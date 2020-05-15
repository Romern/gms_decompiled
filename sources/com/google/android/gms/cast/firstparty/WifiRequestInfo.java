package com.google.android.gms.cast.firstparty;

import android.net.wifi.WifiConfiguration;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiRequestInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new prd();

    /* renamed from: a */
    public final String f29884a;

    /* renamed from: b */
    public final String f29885b;

    /* renamed from: c */
    public int f29886c;

    public WifiRequestInfo(String str, String str2, int i) {
        this.f29884a = str;
        this.f29885b = str2;
        this.f29886c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WifiRequestInfo) {
            WifiRequestInfo wifiRequestInfo = (WifiRequestInfo) obj;
            return ptk.m31236a(this.f29884a, wifiRequestInfo.f29884a) && ptk.m31236a(this.f29885b, wifiRequestInfo.f29885b) && this.f29886c == wifiRequestInfo.f29886c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29884a, this.f29885b, Integer.valueOf(this.f29886c)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "%s - %s - %s", this.f29884a, this.f29885b, WifiConfiguration.KeyMgmt.strings[this.f29886c]);
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
        see.m35046a(parcel, 2, this.f29884a, false);
        see.m35046a(parcel, 3, this.f29885b, false);
        see.m35063b(parcel, 4, this.f29886c);
        see.m35062b(parcel, a);
    }
}
