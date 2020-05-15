package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ParcelableIndexReference extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vjz();

    /* renamed from: a */
    public final String f31143a;

    /* renamed from: b */
    public final int f31144b;

    /* renamed from: c */
    public final boolean f31145c;

    /* renamed from: d */
    public final int f31146d;

    public ParcelableIndexReference(String str, int i, boolean z, int i2) {
        this.f31143a = str;
        this.f31144b = i;
        this.f31145c = z;
        this.f31146d = i2;
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
        see.m35046a(parcel, 2, this.f31143a, false);
        see.m35063b(parcel, 3, this.f31144b);
        see.m35051a(parcel, 4, this.f31145c);
        see.m35063b(parcel, 5, this.f31146d);
        see.m35062b(parcel, a);
    }
}
