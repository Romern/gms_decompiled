package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AdBreakInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pee();

    /* renamed from: a */
    public final long f29694a;

    /* renamed from: b */
    public final String f29695b;

    /* renamed from: c */
    public final long f29696c;

    /* renamed from: d */
    public final boolean f29697d;

    /* renamed from: e */
    public String[] f29698e;

    /* renamed from: f */
    public final boolean f29699f;

    public AdBreakInfo(long j, String str, long j2, boolean z, String[] strArr, boolean z2) {
        this.f29694a = j;
        this.f29695b = str;
        this.f29696c = j2;
        this.f29697d = z;
        this.f29698e = strArr;
        this.f29699f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdBreakInfo) {
            AdBreakInfo adBreakInfo = (AdBreakInfo) obj;
            return ptk.m31236a(this.f29695b, adBreakInfo.f29695b) && this.f29694a == adBreakInfo.f29694a && this.f29696c == adBreakInfo.f29696c && this.f29697d == adBreakInfo.f29697d && Arrays.equals(this.f29698e, adBreakInfo.f29698e) && this.f29699f == adBreakInfo.f29699f;
        }
    }

    public final int hashCode() {
        return this.f29695b.hashCode();
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
     method: see.a(android.os.Parcel, int, java.lang.String[], boolean):void
     arg types: [android.os.Parcel, int, java.lang.String[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
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
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 2, this.f29694a);
        see.m35046a(parcel, 3, this.f29695b, false);
        see.m35036a(parcel, 4, this.f29696c);
        see.m35051a(parcel, 5, this.f29697d);
        see.m35058a(parcel, 6, this.f29698e, false);
        see.m35051a(parcel, 7, this.f29699f);
        see.m35062b(parcel, a);
    }
}
