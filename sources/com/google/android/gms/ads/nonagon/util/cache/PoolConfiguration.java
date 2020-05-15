package com.google.android.gms.ads.nonagon.util.cache;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PoolConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0847a();

    /* renamed from: a */
    public final int f9343a;

    /* renamed from: b */
    public final int f9344b;

    /* renamed from: c */
    public final int f9345c;

    /* renamed from: d */
    public final int f9346d;

    /* renamed from: e */
    public final String f9347e;

    /* renamed from: f */
    public final int f9348f;

    /* renamed from: g */
    public final int f9349g;

    /* renamed from: h */
    private final int[] f9350h;

    /* renamed from: i */
    private final int[] f9351i;

    /* renamed from: j */
    private final int[] f9352j;

    public PoolConfiguration(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        int[] iArr = {1, 2, 3};
        this.f9350h = iArr;
        int[] iArr2 = {1, 2, 3};
        this.f9351i = iArr2;
        int[] iArr3 = {1};
        this.f9352j = iArr3;
        this.f9343a = i;
        int i7 = iArr[i];
        this.f9344b = i2;
        this.f9345c = i3;
        this.f9346d = i4;
        this.f9347e = str;
        this.f9348f = i5;
        int i8 = iArr2[i5];
        this.f9349g = i6;
        int i9 = iArr3[i6];
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
        see.m35063b(parcel, 1, this.f9343a);
        see.m35063b(parcel, 2, this.f9344b);
        see.m35063b(parcel, 3, this.f9345c);
        see.m35063b(parcel, 4, this.f9346d);
        see.m35046a(parcel, 5, this.f9347e, false);
        see.m35063b(parcel, 6, this.f9348f);
        see.m35063b(parcel, 7, this.f9349g);
        see.m35062b(parcel, a);
    }
}
