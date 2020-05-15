package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarWindowSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new npm();

    /* renamed from: a */
    public final String f29397a;

    /* renamed from: b */
    public final String f29398b;

    /* renamed from: c */
    public final CarWindowLayoutParams f29399c;

    /* renamed from: d */
    public final int f29400d;

    public CarWindowSpec(String str, String str2, CarWindowLayoutParams carWindowLayoutParams, int i) {
        this.f29397a = str;
        this.f29398b = str2;
        this.f29399c = carWindowLayoutParams;
        this.f29400d = i;
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
        see.m35046a(parcel, 1, this.f29397a, false);
        see.m35046a(parcel, 2, this.f29398b, false);
        see.m35040a(parcel, 3, this.f29399c, i, false);
        see.m35063b(parcel, 4, this.f29400d);
        see.m35062b(parcel, a);
    }
}
