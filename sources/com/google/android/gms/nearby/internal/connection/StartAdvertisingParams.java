package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class StartAdvertisingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aiil();

    /* renamed from: a */
    public aigu f80628a;

    /* renamed from: b */
    public aifs f80629b;

    /* renamed from: c */
    public String f80630c;

    /* renamed from: d */
    public String f80631d;

    /* renamed from: e */
    public long f80632e;

    /* renamed from: f */
    public AdvertisingOptions f80633f;

    /* renamed from: g */
    public aify f80634g;

    /* renamed from: h */
    public byte[] f80635h;

    public StartAdvertisingParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartAdvertisingParams) {
            StartAdvertisingParams startAdvertisingParams = (StartAdvertisingParams) obj;
            return sdg.m34949a(this.f80628a, startAdvertisingParams.f80628a) && sdg.m34949a(this.f80629b, startAdvertisingParams.f80629b) && sdg.m34949a(this.f80630c, startAdvertisingParams.f80630c) && sdg.m34949a(this.f80631d, startAdvertisingParams.f80631d) && sdg.m34949a(Long.valueOf(this.f80632e), Long.valueOf(startAdvertisingParams.f80632e)) && sdg.m34949a(this.f80633f, startAdvertisingParams.f80633f) && sdg.m34949a(this.f80634g, startAdvertisingParams.f80634g) && Arrays.equals(this.f80635h, startAdvertisingParams.f80635h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80628a, this.f80629b, this.f80630c, this.f80631d, Long.valueOf(this.f80632e), this.f80633f, this.f80634g, Integer.valueOf(Arrays.hashCode(this.f80635h))});
    }

    public StartAdvertisingParams(IBinder iBinder, IBinder iBinder2, String str, String str2, long j, AdvertisingOptions advertisingOptions, IBinder iBinder3, byte[] bArr) {
        aigu aigu;
        aifs aifs;
        aify aify = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
            aigu = queryLocalInterface instanceof aigu ? (aigu) queryLocalInterface : new aigs(iBinder);
        } else {
            aigu = null;
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
            aifs = queryLocalInterface2 instanceof aifs ? (aifs) queryLocalInterface2 : new aifq(iBinder2);
        } else {
            aifs = null;
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            if (queryLocalInterface3 instanceof aify) {
                aify = (aify) queryLocalInterface3;
            } else {
                aify = new aifw(iBinder3);
            }
        }
        this.f80628a = aigu;
        this.f80629b = aifs;
        this.f80630c = str;
        this.f80631d = str2;
        this.f80632e = j;
        this.f80633f = advertisingOptions;
        this.f80634g = aify;
        this.f80635h = bArr;
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int a = see.m35030a(parcel);
        aigu aigu = this.f80628a;
        IBinder iBinder3 = null;
        if (aigu != null) {
            iBinder = aigu.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 1, iBinder);
        aifs aifs = this.f80629b;
        if (aifs != null) {
            iBinder2 = aifs.asBinder();
        } else {
            iBinder2 = null;
        }
        see.m35038a(parcel, 2, iBinder2);
        see.m35046a(parcel, 3, this.f80630c, false);
        see.m35046a(parcel, 4, this.f80631d, false);
        see.m35036a(parcel, 5, this.f80632e);
        see.m35040a(parcel, 6, this.f80633f, i, false);
        aify aify = this.f80634g;
        if (aify != null) {
            iBinder3 = aify.asBinder();
        }
        see.m35038a(parcel, 7, iBinder3);
        see.m35052a(parcel, 8, this.f80635h, false);
        see.m35062b(parcel, a);
    }
}
