package com.google.android.gms.location.places.fencing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlacefencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aemp();

    /* renamed from: a */
    public final String f79510a;

    /* renamed from: b */
    public final PlacefencingFilter f79511b;

    /* renamed from: c */
    public final int f79512c;

    /* renamed from: d */
    public final int f79513d;

    /* renamed from: e */
    public final int f79514e;

    /* renamed from: f */
    public final int f79515f;

    public PlacefencingRequest(String str, PlacefencingFilter placefencingFilter, int i, int i2, int i3, int i4) {
        this.f79510a = str;
        this.f79511b = placefencingFilter;
        this.f79512c = i;
        this.f79513d = i2;
        this.f79514e = i3;
        this.f79515f = i4;
    }

    /* renamed from: a */
    public final boolean mo43667a() {
        return (this.f79512c & -13) == 0;
    }

    /* renamed from: a */
    public final boolean mo43668a(int i) {
        return (i & this.f79512c) != 0;
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
        see.m35046a(parcel, 1, this.f79510a, false);
        see.m35040a(parcel, 2, this.f79511b, i, false);
        see.m35063b(parcel, 3, this.f79512c);
        see.m35063b(parcel, 4, this.f79513d);
        see.m35063b(parcel, 5, this.f79514e);
        see.m35063b(parcel, 6, this.f79515f);
        see.m35062b(parcel, a);
    }
}
