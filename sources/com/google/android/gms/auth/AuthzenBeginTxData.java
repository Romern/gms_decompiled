package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthzenBeginTxData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ghu();

    /* renamed from: a */
    final int f9916a;

    /* renamed from: b */
    final int f9917b;

    /* renamed from: c */
    public final byte[] f9918c;

    public AuthzenBeginTxData(int i, int i2, byte[] bArr) {
        this.f9916a = i;
        this.f9917b = i2;
        this.f9918c = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthzenBeginTxData) {
            AuthzenBeginTxData authzenBeginTxData = (AuthzenBeginTxData) obj;
            if (this.f9917b != authzenBeginTxData.f9917b || !Arrays.equals(this.f9918c, authzenBeginTxData.f9918c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9917b), this.f9918c});
    }

    public AuthzenBeginTxData(int i, byte[] bArr) {
        this.f9916a = 1;
        this.f9917b = i;
        this.f9918c = bArr;
    }

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
        see.m35063b(parcel, 1, this.f9916a);
        see.m35063b(parcel, 2, this.f9917b);
        see.m35052a(parcel, 3, this.f9918c, false);
        see.m35062b(parcel, a);
    }
}
