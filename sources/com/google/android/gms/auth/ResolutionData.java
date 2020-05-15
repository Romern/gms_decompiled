package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ResolutionData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new gio();

    /* renamed from: a */
    final int f9931a;

    /* renamed from: b */
    public final String f9932b;

    /* renamed from: c */
    public final int f9933c;

    /* renamed from: d */
    public final String f9934d;

    /* renamed from: e */
    public final BrowserResolutionCookie[] f9935e;

    public ResolutionData(int i, String str, int i2, String str2, BrowserResolutionCookie[] browserResolutionCookieArr) {
        this.f9931a = i;
        this.f9932b = str;
        this.f9933c = i2;
        this.f9934d = str2;
        this.f9935e = browserResolutionCookieArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ResolutionData) {
            ResolutionData resolutionData = (ResolutionData) obj;
            if (!TextUtils.equals(this.f9932b, resolutionData.f9932b) || this.f9933c != resolutionData.f9933c || !TextUtils.equals(this.f9934d, resolutionData.f9934d) || !Arrays.equals(this.f9935e, resolutionData.f9935e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9932b, Integer.valueOf(this.f9933c), this.f9934d, Integer.valueOf(Arrays.hashCode(this.f9935e))});
    }

    public ResolutionData(String str, int i, String str2, BrowserResolutionCookie[] browserResolutionCookieArr) {
        this(2, str, i, str2, browserResolutionCookieArr);
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
        see.m35063b(parcel, 1, this.f9931a);
        see.m35046a(parcel, 2, this.f9932b, false);
        see.m35063b(parcel, 3, this.f9933c);
        see.m35046a(parcel, 4, this.f9934d, false);
        see.m35057a(parcel, 5, this.f9935e, i);
        see.m35062b(parcel, a);
    }
}
