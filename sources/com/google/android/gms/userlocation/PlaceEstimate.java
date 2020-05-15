package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlaceEstimate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avwb();

    /* renamed from: a */
    public static String f109562a = "unknown";

    /* renamed from: b */
    public final String f109563b;

    /* renamed from: c */
    public final float f109564c;

    /* renamed from: d */
    public final String f109565d;

    /* renamed from: e */
    public final int f109566e;

    /* renamed from: f */
    public final String f109567f;

    /* renamed from: g */
    public final float f109568g;

    /* renamed from: h */
    public final boolean f109569h;

    public PlaceEstimate(String str, float f, String str2, int i, String str3, float f2, boolean z) {
        this.f109563b = str;
        this.f109564c = f;
        this.f109565d = str2;
        this.f109566e = i;
        this.f109567f = str3;
        this.f109568g = f2;
        this.f109569h = z;
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
        see.m35046a(parcel, 1, this.f109563b, false);
        see.m35034a(parcel, 2, this.f109564c);
        see.m35046a(parcel, 3, this.f109565d, false);
        see.m35063b(parcel, 4, this.f109566e);
        see.m35046a(parcel, 5, this.f109567f, false);
        see.m35034a(parcel, 6, this.f109568g);
        see.m35051a(parcel, 7, this.f109569h);
        see.m35062b(parcel, a);
    }
}
