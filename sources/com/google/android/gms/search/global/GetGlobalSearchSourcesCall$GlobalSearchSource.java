package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetGlobalSearchSourcesCall$GlobalSearchSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new appv();

    /* renamed from: a */
    public String f107416a;

    /* renamed from: b */
    public String f107417b;

    /* renamed from: c */
    public int f107418c;

    /* renamed from: d */
    public int f107419d;

    /* renamed from: e */
    public int f107420e;

    /* renamed from: f */
    public String f107421f;

    /* renamed from: g */
    public String f107422g;

    /* renamed from: h */
    public String f107423h;

    /* renamed from: i */
    public GetGlobalSearchSourcesCall$CorpusInfo[] f107424i;

    /* renamed from: j */
    public boolean f107425j;

    public GetGlobalSearchSourcesCall$GlobalSearchSource() {
    }

    public GetGlobalSearchSourcesCall$GlobalSearchSource(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5, GetGlobalSearchSourcesCall$CorpusInfo[] getGlobalSearchSourcesCall$CorpusInfoArr, boolean z) {
        this.f107416a = str;
        this.f107417b = str2;
        this.f107418c = i;
        this.f107419d = i2;
        this.f107420e = i3;
        this.f107421f = str3;
        this.f107422g = str4;
        this.f107423h = str5;
        this.f107424i = getGlobalSearchSourcesCall$CorpusInfoArr;
        this.f107425j = z;
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
        see.m35046a(parcel, 1, this.f107416a, false);
        see.m35063b(parcel, 2, this.f107418c);
        see.m35063b(parcel, 3, this.f107419d);
        see.m35063b(parcel, 4, this.f107420e);
        see.m35046a(parcel, 5, this.f107421f, false);
        see.m35046a(parcel, 6, this.f107422g, false);
        see.m35046a(parcel, 7, this.f107423h, false);
        see.m35057a(parcel, 8, this.f107424i, i);
        see.m35051a(parcel, 9, this.f107425j);
        see.m35046a(parcel, 10, this.f107417b, false);
        see.m35062b(parcel, a);
    }
}
