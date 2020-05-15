package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LineBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avzz();

    /* renamed from: a */
    public final WordBoxParcel[] f109737a;

    /* renamed from: b */
    public final BoundingBoxParcel f109738b;

    /* renamed from: c */
    public final BoundingBoxParcel f109739c;

    /* renamed from: d */
    public final BoundingBoxParcel f109740d;

    /* renamed from: e */
    public final String f109741e;

    /* renamed from: f */
    public final float f109742f;

    /* renamed from: g */
    public final String f109743g;

    /* renamed from: h */
    public final int f109744h;

    /* renamed from: i */
    public final boolean f109745i;

    /* renamed from: j */
    public final int f109746j;

    /* renamed from: k */
    public final int f109747k;

    public LineBoxParcel(WordBoxParcel[] wordBoxParcelArr, BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2, BoundingBoxParcel boundingBoxParcel3, String str, float f, String str2, int i, boolean z, int i2, int i3) {
        this.f109737a = wordBoxParcelArr;
        this.f109738b = boundingBoxParcel;
        this.f109739c = boundingBoxParcel2;
        this.f109740d = boundingBoxParcel3;
        this.f109741e = str;
        this.f109742f = f;
        this.f109743g = str2;
        this.f109744h = i;
        this.f109745i = z;
        this.f109746j = i2;
        this.f109747k = i3;
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
        see.m35057a(parcel, 2, this.f109737a, i);
        see.m35040a(parcel, 3, this.f109738b, i, false);
        see.m35040a(parcel, 4, this.f109739c, i, false);
        see.m35040a(parcel, 5, this.f109740d, i, false);
        see.m35046a(parcel, 6, this.f109741e, false);
        see.m35034a(parcel, 7, this.f109742f);
        see.m35046a(parcel, 8, this.f109743g, false);
        see.m35063b(parcel, 9, this.f109744h);
        see.m35051a(parcel, 10, this.f109745i);
        see.m35063b(parcel, 11, this.f109746j);
        see.m35063b(parcel, 12, this.f109747k);
        see.m35062b(parcel, a);
    }
}
