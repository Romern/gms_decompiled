package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Permissions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adgt();

    /* renamed from: a */
    public final String[] f79185a;

    /* renamed from: b */
    public final String[] f79186b;

    /* renamed from: c */
    public final String[] f79187c;

    /* renamed from: d */
    public final String[] f79188d;

    public Permissions(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        this.f79185a = strArr;
        this.f79186b = strArr2;
        this.f79188d = strArr3;
        this.f79187c = strArr4;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String[], boolean):void
     arg types: [android.os.Parcel, int, java.lang.String[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
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
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35058a(parcel, 1, this.f79185a, false);
        see.m35058a(parcel, 2, this.f79186b, false);
        see.m35058a(parcel, 3, this.f79187c, false);
        see.m35058a(parcel, 4, this.f79188d, false);
        see.m35062b(parcel, a);
    }
}
