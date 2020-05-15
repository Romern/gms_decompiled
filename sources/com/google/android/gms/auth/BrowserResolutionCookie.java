package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BrowserResolutionCookie extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ghw();

    /* renamed from: a */
    public String f9919a;

    /* renamed from: b */
    public String f9920b;

    /* renamed from: c */
    public String f9921c;

    /* renamed from: d */
    public String f9922d = "/";

    /* renamed from: e */
    public long f9923e = -1;

    /* renamed from: f */
    public boolean f9924f;

    /* renamed from: g */
    public boolean f9925g;

    public BrowserResolutionCookie() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BrowserResolutionCookie) {
            BrowserResolutionCookie browserResolutionCookie = (BrowserResolutionCookie) obj;
            return sdg.m34949a(this.f9919a, browserResolutionCookie.f9919a) && sdg.m34949a(this.f9920b, browserResolutionCookie.f9920b) && sdg.m34949a(this.f9921c, browserResolutionCookie.f9921c) && sdg.m34949a(this.f9922d, browserResolutionCookie.f9922d) && sdg.m34949a(Long.valueOf(this.f9923e), Long.valueOf(browserResolutionCookie.f9923e)) && sdg.m34949a(Boolean.valueOf(this.f9924f), Boolean.valueOf(browserResolutionCookie.f9924f)) && sdg.m34949a(Boolean.valueOf(this.f9925g), Boolean.valueOf(browserResolutionCookie.f9925g));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9919a, this.f9920b, this.f9921c, this.f9922d, Long.valueOf(this.f9923e), Boolean.valueOf(this.f9924f), Boolean.valueOf(this.f9925g)});
    }

    public BrowserResolutionCookie(String str, String str2, String str3, String str4, long j, boolean z, boolean z2) {
        sdo.m34977c(str);
        this.f9919a = str;
        sdo.m34977c(str2);
        this.f9920b = str2;
        sdo.m34977c(str3);
        this.f9921c = str3;
        sdo.m34977c(str4);
        this.f9922d = str4;
        this.f9923e = j;
        this.f9924f = z;
        this.f9925g = z2;
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
        see.m35046a(parcel, 1, this.f9919a, false);
        see.m35046a(parcel, 2, this.f9920b, false);
        see.m35046a(parcel, 3, this.f9921c, false);
        see.m35046a(parcel, 4, this.f9922d, false);
        see.m35036a(parcel, 5, this.f9923e);
        see.m35051a(parcel, 6, this.f9924f);
        see.m35051a(parcel, 7, this.f9925g);
        see.m35062b(parcel, a);
    }
}
