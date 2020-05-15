package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Address extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awag();

    /* renamed from: a */
    public String f109756a;

    /* renamed from: b */
    public String f109757b;

    /* renamed from: c */
    public String f109758c;

    /* renamed from: d */
    public String f109759d;

    /* renamed from: e */
    public String f109760e;

    /* renamed from: f */
    public String f109761f;

    /* renamed from: g */
    public String f109762g;

    /* renamed from: h */
    public String f109763h;

    /* renamed from: i */
    public String f109764i;

    /* renamed from: j */
    boolean f109765j;

    /* renamed from: k */
    public String f109766k;

    public Address() {
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        this.f109756a = str;
        this.f109757b = str2;
        this.f109758c = str3;
        this.f109759d = str4;
        this.f109760e = str5;
        this.f109761f = str6;
        this.f109762g = str7;
        this.f109763h = str8;
        this.f109764i = str9;
        this.f109765j = z;
        this.f109766k = str10;
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
        see.m35046a(parcel, 2, this.f109756a, false);
        see.m35046a(parcel, 3, this.f109757b, false);
        see.m35046a(parcel, 4, this.f109758c, false);
        see.m35046a(parcel, 5, this.f109759d, false);
        see.m35046a(parcel, 6, this.f109760e, false);
        see.m35046a(parcel, 7, this.f109761f, false);
        see.m35046a(parcel, 8, this.f109762g, false);
        see.m35046a(parcel, 9, this.f109763h, false);
        see.m35046a(parcel, 10, this.f109764i, false);
        see.m35051a(parcel, 11, this.f109765j);
        see.m35046a(parcel, 12, this.f109766k, false);
        see.m35062b(parcel, a);
    }
}
