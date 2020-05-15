package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RoutingOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adgv();

    /* renamed from: a */
    public boolean f79196a;

    /* renamed from: b */
    public String f79197b;

    /* renamed from: c */
    public boolean f79198c;

    /* renamed from: d */
    public boolean f79199d;

    /* renamed from: e */
    public boolean f79200e;

    /* renamed from: f */
    public boolean f79201f;

    /* renamed from: g */
    public boolean f79202g;

    public RoutingOptions() {
    }

    public RoutingOptions(boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f79196a = z;
        this.f79197b = str;
        this.f79198c = z2;
        this.f79199d = z3;
        this.f79200e = z4;
        this.f79201f = z5;
        this.f79202g = z6;
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
        see.m35051a(parcel, 1, this.f79196a);
        see.m35046a(parcel, 2, this.f79197b, false);
        see.m35051a(parcel, 3, this.f79198c);
        see.m35051a(parcel, 4, this.f79199d);
        see.m35051a(parcel, 5, this.f79200e);
        see.m35051a(parcel, 6, this.f79201f);
        see.m35051a(parcel, 7, this.f79202g);
        see.m35062b(parcel, a);
    }
}
