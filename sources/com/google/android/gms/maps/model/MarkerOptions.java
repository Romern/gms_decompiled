package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afhh();

    /* renamed from: a */
    public LatLng f79899a;

    /* renamed from: b */
    public String f79900b;

    /* renamed from: c */
    public String f79901c;

    /* renamed from: d */
    public afgv f79902d;

    /* renamed from: e */
    public float f79903e = 0.5f;

    /* renamed from: f */
    public float f79904f = 1.0f;

    /* renamed from: g */
    public boolean f79905g;

    /* renamed from: h */
    public boolean f79906h = true;

    /* renamed from: i */
    public boolean f79907i = false;

    /* renamed from: j */
    public float f79908j = 0.0f;

    /* renamed from: k */
    public float f79909k = 0.5f;

    /* renamed from: l */
    public float f79910l = 0.0f;

    /* renamed from: m */
    public float f79911m = 1.0f;

    /* renamed from: n */
    public float f79912n;

    public MarkerOptions() {
    }

    /* renamed from: a */
    public final void mo43877a() {
        this.f79903e = 0.5f;
        this.f79904f = 0.84375f;
    }

    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        vzr vzr;
        IBinder iBinder2 = iBinder;
        this.f79899a = latLng;
        this.f79900b = str;
        this.f79901c = str2;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof vzr) {
                vzr = (vzr) queryLocalInterface;
            } else {
                vzr = new vzp(iBinder);
            }
            this.f79902d = new afgv(vzr);
        } else {
            this.f79902d = null;
        }
        this.f79903e = f;
        this.f79904f = f2;
        this.f79905g = z;
        this.f79906h = z2;
        this.f79907i = z3;
        this.f79908j = f3;
        this.f79909k = f4;
        this.f79910l = f5;
        this.f79911m = f6;
        this.f79912n = f7;
    }

    /* renamed from: a */
    public final void mo43878a(LatLng latLng) {
        if (latLng != null) {
            this.f79899a = latLng;
            return;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
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
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f79899a, i, false);
        see.m35046a(parcel, 3, this.f79900b, false);
        see.m35046a(parcel, 4, this.f79901c, false);
        afgv afgv = this.f79902d;
        if (afgv != null) {
            iBinder = afgv.f64237a.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 5, iBinder);
        see.m35034a(parcel, 6, this.f79903e);
        see.m35034a(parcel, 7, this.f79904f);
        see.m35051a(parcel, 8, this.f79905g);
        see.m35051a(parcel, 9, this.f79906h);
        see.m35051a(parcel, 10, this.f79907i);
        see.m35034a(parcel, 11, this.f79908j);
        see.m35034a(parcel, 12, this.f79909k);
        see.m35034a(parcel, 13, this.f79910l);
        see.m35034a(parcel, 14, this.f79911m);
        see.m35034a(parcel, 15, this.f79912n);
        see.m35062b(parcel, a);
    }
}
