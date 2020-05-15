package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OnConnectionInitiatedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aihd();

    /* renamed from: a */
    public String f80570a;

    /* renamed from: b */
    public String f80571b;

    /* renamed from: c */
    public String f80572c;

    /* renamed from: d */
    public boolean f80573d;

    /* renamed from: e */
    public byte[] f80574e;

    /* renamed from: f */
    public byte[] f80575f;

    /* renamed from: g */
    public byte[] f80576g;

    /* renamed from: h */
    public boolean f80577h;

    public OnConnectionInitiatedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnConnectionInitiatedParams) {
            OnConnectionInitiatedParams onConnectionInitiatedParams = (OnConnectionInitiatedParams) obj;
            return sdg.m34949a(this.f80570a, onConnectionInitiatedParams.f80570a) && sdg.m34949a(this.f80571b, onConnectionInitiatedParams.f80571b) && sdg.m34949a(this.f80572c, onConnectionInitiatedParams.f80572c) && sdg.m34949a(Boolean.valueOf(this.f80573d), Boolean.valueOf(onConnectionInitiatedParams.f80573d)) && Arrays.equals(this.f80574e, onConnectionInitiatedParams.f80574e) && Arrays.equals(this.f80575f, onConnectionInitiatedParams.f80575f) && Arrays.equals(this.f80576g, onConnectionInitiatedParams.f80576g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80570a, this.f80571b, this.f80572c, Boolean.valueOf(this.f80573d), Integer.valueOf(Arrays.hashCode(this.f80574e)), Integer.valueOf(Arrays.hashCode(this.f80575f)), Integer.valueOf(Arrays.hashCode(this.f80576g))});
    }

    public OnConnectionInitiatedParams(String str, String str2, String str3, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z2) {
        this.f80570a = str;
        this.f80571b = str2;
        this.f80572c = str3;
        this.f80573d = z;
        this.f80574e = bArr;
        this.f80575f = bArr2;
        this.f80576g = bArr3;
        this.f80577h = z2;
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
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f80570a, false);
        see.m35046a(parcel, 2, this.f80571b, false);
        see.m35046a(parcel, 3, this.f80572c, false);
        see.m35051a(parcel, 4, this.f80573d);
        see.m35052a(parcel, 5, this.f80574e, false);
        see.m35052a(parcel, 6, this.f80575f, false);
        see.m35052a(parcel, 7, this.f80576g, false);
        see.m35051a(parcel, 8, this.f80573d);
        see.m35062b(parcel, a);
    }
}
