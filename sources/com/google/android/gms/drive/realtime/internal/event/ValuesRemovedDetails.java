package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ValuesRemovedDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vko();

    /* renamed from: a */
    final int f31186a;

    /* renamed from: b */
    final int f31187b;

    /* renamed from: c */
    final int f31188c;

    /* renamed from: d */
    final String f31189d;

    /* renamed from: e */
    final int f31190e;

    public ValuesRemovedDetails(int i, int i2, int i3, String str, int i4) {
        this.f31186a = i;
        this.f31187b = i2;
        this.f31188c = i3;
        this.f31189d = str;
        this.f31190e = i4;
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
        see.m35063b(parcel, 2, this.f31186a);
        see.m35063b(parcel, 3, this.f31187b);
        see.m35063b(parcel, 4, this.f31188c);
        see.m35046a(parcel, 5, this.f31189d, false);
        see.m35063b(parcel, 6, this.f31190e);
        see.m35062b(parcel, a);
    }
}
