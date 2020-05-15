package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class QuerySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new frw();

    /* renamed from: a */
    public final boolean f9614a;

    /* renamed from: b */
    public final List f9615b;

    /* renamed from: c */
    public final List f9616c;

    /* renamed from: d */
    public final boolean f9617d;

    /* renamed from: e */
    public final int f9618e;

    /* renamed from: f */
    public final int f9619f;

    /* renamed from: g */
    public final boolean f9620g;

    /* renamed from: h */
    public final int f9621h;

    /* renamed from: i */
    public final boolean f9622i;

    /* renamed from: j */
    public final int[] f9623j;

    /* renamed from: k */
    public final byte[] f9624k;

    /* renamed from: l */
    public final STSortSpec f9625l;

    /* renamed from: m */
    public final String f9626m;

    /* renamed from: n */
    public final int f9627n;

    /* renamed from: o */
    public final CacheSpec f9628o;

    public QuerySpecification(boolean z, List list, List list2, boolean z2, int i, int i2, boolean z3, int i3, boolean z4, int[] iArr, byte[] bArr, STSortSpec sTSortSpec, String str, int i4, CacheSpec cacheSpec) {
        this.f9614a = z;
        this.f9615b = list;
        this.f9616c = list2;
        this.f9617d = z2;
        this.f9618e = i;
        this.f9619f = i2;
        this.f9620g = z3;
        this.f9621h = i3;
        this.f9622i = z4;
        this.f9623j = iArr;
        this.f9624k = bArr;
        this.f9625l = sTSortSpec;
        this.f9626m = str;
        this.f9627n = i4;
        this.f9628o = cacheSpec;
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
        see.m35051a(parcel, 1, this.f9614a);
        see.m35065b(parcel, 2, this.f9615b, false);
        see.m35066c(parcel, 3, this.f9616c, false);
        see.m35051a(parcel, 4, this.f9617d);
        see.m35063b(parcel, 5, this.f9618e);
        see.m35063b(parcel, 6, this.f9619f);
        see.m35051a(parcel, 7, this.f9620g);
        see.m35063b(parcel, 8, this.f9621h);
        see.m35051a(parcel, 9, this.f9622i);
        see.m35055a(parcel, 10, this.f9623j, false);
        see.m35052a(parcel, 11, this.f9624k, false);
        see.m35040a(parcel, 12, this.f9625l, i, false);
        see.m35046a(parcel, 13, this.f9626m, false);
        see.m35063b(parcel, 14, this.f9627n);
        see.m35040a(parcel, 15, this.f9628o, i, false);
        see.m35062b(parcel, a);
    }
}
