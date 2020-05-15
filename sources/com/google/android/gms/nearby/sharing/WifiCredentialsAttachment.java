package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WifiCredentialsAttachment extends Attachment {
    public static final Parcelable.Creator CREATOR = new ajuf();

    /* renamed from: a */
    public final String f81057a;

    /* renamed from: b */
    public final int f81058b;

    /* renamed from: c */
    public final Bundle f81059c;

    /* renamed from: d */
    public final String f81060d;

    /* renamed from: e */
    public final boolean f81061e;

    public WifiCredentialsAttachment(String str, int i, Bundle bundle, String str2, boolean z) {
        this.f81057a = str;
        this.f81058b = i;
        this.f81059c = bundle;
        this.f81060d = str2;
        this.f81061e = z;
    }

    /* renamed from: a */
    public final long mo44383a() {
        return 0;
    }

    /* renamed from: b */
    public final int mo44384b() {
        return this.f81058b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WifiCredentialsAttachment) {
            WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) obj;
            return sdg.m34949a(this.f81057a, wifiCredentialsAttachment.f81057a) && sdg.m34949a(Integer.valueOf(this.f81058b), Integer.valueOf(wifiCredentialsAttachment.f81058b));
        }
    }

    /* renamed from: f */
    public final int mo44388f() {
        return 4;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81057a, Integer.valueOf(this.f81058b)});
    }

    public final String toString() {
        return String.format(Locale.US, "WifiCredentialsAttachment<ssid: %s, security type: %s>", this.f81057a, Integer.valueOf(this.f81058b));
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
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
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f81057a, false);
        see.m35063b(parcel, 2, this.f81058b);
        see.m35037a(parcel, 3, this.f81059c, false);
        see.m35046a(parcel, 4, this.f81060d, false);
        see.m35051a(parcel, 5, this.f81061e);
        see.m35062b(parcel, a);
    }
}
