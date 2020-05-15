package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ProgramRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aaid();

    /* renamed from: a */
    public final int f32760a;

    /* renamed from: b */
    public final int f32761b;

    /* renamed from: c */
    public final String f32762c;

    /* renamed from: d */
    public final String f32763d;

    /* renamed from: e */
    public final int f32764e;

    public ProgramRequest(int i, int i2, int i3, String str, String str2) {
        this.f32760a = i;
        this.f32761b = i2;
        this.f32762c = str;
        this.f32763d = str2;
        this.f32764e = i3;
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
        see.m35063b(parcel, 1, this.f32760a);
        see.m35063b(parcel, 2, this.f32761b);
        see.m35046a(parcel, 3, this.f32762c, false);
        see.m35046a(parcel, 4, this.f32763d, false);
        see.m35063b(parcel, 5, this.f32764e);
        see.m35062b(parcel, a);
    }
}
