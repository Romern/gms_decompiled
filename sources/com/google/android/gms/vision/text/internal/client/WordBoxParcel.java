package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WordBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awae();

    /* renamed from: a */
    public final SymbolBoxParcel[] f109749a;

    /* renamed from: b */
    public final BoundingBoxParcel f109750b;

    /* renamed from: c */
    public final BoundingBoxParcel f109751c;

    /* renamed from: d */
    public final String f109752d;

    /* renamed from: e */
    public final float f109753e;

    /* renamed from: f */
    public final String f109754f;

    /* renamed from: g */
    public final boolean f109755g;

    public WordBoxParcel(SymbolBoxParcel[] symbolBoxParcelArr, BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2, String str, float f, String str2, boolean z) {
        this.f109749a = symbolBoxParcelArr;
        this.f109750b = boundingBoxParcel;
        this.f109751c = boundingBoxParcel2;
        this.f109752d = str;
        this.f109753e = f;
        this.f109754f = str2;
        this.f109755g = z;
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
        see.m35057a(parcel, 2, this.f109749a, i);
        see.m35040a(parcel, 3, this.f109750b, i, false);
        see.m35040a(parcel, 4, this.f109751c, i, false);
        see.m35046a(parcel, 5, this.f109752d, false);
        see.m35034a(parcel, 6, this.f109753e);
        see.m35046a(parcel, 7, this.f109754f, false);
        see.m35051a(parcel, 8, this.f109755g);
        see.m35062b(parcel, a);
    }
}
