package com.google.android.gms.asterism;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetAsterismConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gbi();

    /* renamed from: a */
    public final int f9829a;

    /* renamed from: b */
    public final int f9830b;

    /* renamed from: c */
    public final int f9831c;

    /* renamed from: d */
    public final int[] f9832d;

    /* renamed from: e */
    public final Long f9833e;

    /* renamed from: f */
    public final int f9834f;

    /* renamed from: g */
    public final Bundle f9835g;

    /* renamed from: h */
    public final int f9836h;

    /* renamed from: i */
    public final String f9837i;

    /* renamed from: j */
    public final String f9838j;

    /* renamed from: k */
    public final String f9839k;

    /* renamed from: l */
    public final String f9840l;

    /* renamed from: m */
    public final String f9841m;

    public SetAsterismConsentRequest(int i, int i2, int i3, int[] iArr, Long l, int i4, Bundle bundle, int i5, String str, String str2, String str3, String str4, String str5) {
        this.f9829a = i;
        this.f9830b = i2;
        this.f9831c = i3;
        this.f9832d = iArr;
        this.f9833e = l;
        this.f9834f = i4;
        this.f9835g = bundle;
        this.f9836h = i5;
        this.f9837i = str;
        this.f9838j = str2;
        this.f9839k = str3;
        this.f9840l = str4;
        this.f9841m = str5;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, int[], boolean):void
     arg types: [android.os.Parcel, int, int[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void */
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
        see.m35063b(parcel, 1, this.f9829a);
        see.m35063b(parcel, 2, this.f9830b);
        see.m35063b(parcel, 3, this.f9831c);
        see.m35055a(parcel, 4, this.f9832d, false);
        see.m35045a(parcel, 5, this.f9833e);
        see.m35063b(parcel, 6, this.f9834f);
        see.m35037a(parcel, 7, this.f9835g, false);
        see.m35063b(parcel, 8, this.f9836h);
        see.m35046a(parcel, 9, this.f9837i, false);
        see.m35046a(parcel, 10, this.f9838j, false);
        see.m35046a(parcel, 11, this.f9839k, false);
        see.m35046a(parcel, 12, this.f9840l, false);
        see.m35046a(parcel, 13, this.f9841m, false);
        see.m35062b(parcel, a);
    }
}
