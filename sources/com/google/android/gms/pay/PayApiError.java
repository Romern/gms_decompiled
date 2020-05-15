package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PayApiError extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alfk();

    /* renamed from: a */
    public String f81534a;

    /* renamed from: b */
    public String f81535b;

    /* renamed from: c */
    public boolean f81536c;

    /* renamed from: d */
    public byte[] f81537d;

    /* renamed from: e */
    public int f81538e;

    private PayApiError() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayApiError) {
            PayApiError payApiError = (PayApiError) obj;
            return sdg.m34949a(this.f81534a, payApiError.f81534a) && sdg.m34949a(this.f81535b, payApiError.f81535b) && sdg.m34949a(Boolean.valueOf(this.f81536c), Boolean.valueOf(payApiError.f81536c)) && Arrays.equals(this.f81537d, payApiError.f81537d) && sdg.m34949a(Integer.valueOf(this.f81538e), Integer.valueOf(payApiError.f81538e));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81534a, this.f81535b, Boolean.valueOf(this.f81536c), Integer.valueOf(Arrays.hashCode(this.f81537d)), Integer.valueOf(this.f81538e)});
    }

    public PayApiError(String str, String str2, boolean z, byte[] bArr, int i) {
        this.f81534a = str;
        this.f81535b = str2;
        this.f81536c = z;
        this.f81537d = bArr;
        this.f81538e = i;
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
        see.m35046a(parcel, 1, this.f81534a, false);
        see.m35046a(parcel, 2, this.f81535b, false);
        see.m35051a(parcel, 3, this.f81536c);
        see.m35052a(parcel, 4, this.f81537d, false);
        see.m35063b(parcel, 5, this.f81538e);
        see.m35062b(parcel, a);
    }
}
