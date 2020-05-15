package com.google.android.gms.walletp2p.internal.zeroparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ValidateDraftTokenResponse extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new axob();

    /* renamed from: a */
    public long f110849a;

    /* renamed from: b */
    public String f110850b;

    /* renamed from: c */
    public String f110851c;

    /* renamed from: d */
    public String f110852d;

    /* renamed from: e */
    public String f110853e;

    /* renamed from: f */
    public String f110854f;

    /* renamed from: g */
    public ErrorDetails f110855g;

    /* renamed from: h */
    public byte[] f110856h;

    public ValidateDraftTokenResponse(long j, String str, String str2, String str3, String str4, String str5, ErrorDetails errorDetails, byte[] bArr) {
        this.f110849a = j;
        this.f110850b = str;
        this.f110851c = str2;
        this.f110852d = str3;
        this.f110853e = str4;
        this.f110854f = str5;
        this.f110855g = errorDetails;
        this.f110856h = bArr;
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
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 2, this.f110849a);
        see.m35046a(parcel, 3, this.f110850b, false);
        see.m35046a(parcel, 4, this.f110851c, false);
        see.m35046a(parcel, 5, this.f110852d, false);
        see.m35046a(parcel, 6, this.f110853e, false);
        see.m35046a(parcel, 7, this.f110854f, false);
        see.m35040a(parcel, 8, this.f110855g, i, false);
        see.m35052a(parcel, 9, this.f110856h, false);
        see.m35062b(parcel, a);
    }
}
