package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class StartDiscoveryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aiin();

    /* renamed from: a */
    public aigr f80636a;

    /* renamed from: b */
    public aige f80637b;

    /* renamed from: c */
    public String f80638c;

    /* renamed from: d */
    public long f80639d;

    /* renamed from: e */
    public DiscoveryOptions f80640e;

    /* renamed from: f */
    public aigh f80641f;

    public StartDiscoveryParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartDiscoveryParams) {
            StartDiscoveryParams startDiscoveryParams = (StartDiscoveryParams) obj;
            return sdg.m34949a(this.f80636a, startDiscoveryParams.f80636a) && sdg.m34949a(this.f80637b, startDiscoveryParams.f80637b) && sdg.m34949a(this.f80638c, startDiscoveryParams.f80638c) && sdg.m34949a(Long.valueOf(this.f80639d), Long.valueOf(startDiscoveryParams.f80639d)) && sdg.m34949a(this.f80640e, startDiscoveryParams.f80640e) && sdg.m34949a(this.f80641f, startDiscoveryParams.f80641f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80636a, this.f80637b, this.f80638c, Long.valueOf(this.f80639d), this.f80640e, this.f80641f});
    }

    public StartDiscoveryParams(IBinder iBinder, IBinder iBinder2, String str, long j, DiscoveryOptions discoveryOptions, IBinder iBinder3) {
        aigr aigr;
        aige aige;
        aigh aigh = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            aigr = queryLocalInterface instanceof aigr ? (aigr) queryLocalInterface : new aigp(iBinder);
        } else {
            aigr = null;
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
            aige = queryLocalInterface2 instanceof aige ? (aige) queryLocalInterface2 : new aigc(iBinder2);
        } else {
            aige = null;
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
            if (queryLocalInterface3 instanceof aigh) {
                aigh = (aigh) queryLocalInterface3;
            } else {
                aigh = new aigf(iBinder3);
            }
        }
        this.f80636a = aigr;
        this.f80637b = aige;
        this.f80638c = str;
        this.f80639d = j;
        this.f80640e = discoveryOptions;
        this.f80641f = aigh;
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
        IBinder iBinder2;
        int a = see.m35030a(parcel);
        aigr aigr = this.f80636a;
        IBinder iBinder3 = null;
        if (aigr != null) {
            iBinder = aigr.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 1, iBinder);
        aige aige = this.f80637b;
        if (aige != null) {
            iBinder2 = aige.asBinder();
        } else {
            iBinder2 = null;
        }
        see.m35038a(parcel, 2, iBinder2);
        see.m35046a(parcel, 3, this.f80638c, false);
        see.m35036a(parcel, 4, this.f80639d);
        see.m35040a(parcel, 5, this.f80640e, i, false);
        aigh aigh = this.f80641f;
        if (aigh != null) {
            iBinder3 = aigh.asBinder();
        }
        see.m35038a(parcel, 6, iBinder3);
        see.m35062b(parcel, a);
    }
}
