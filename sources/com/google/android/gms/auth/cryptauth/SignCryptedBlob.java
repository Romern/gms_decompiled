package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SignCryptedBlob extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iph();

    /* renamed from: a */
    final int f10553a;

    /* renamed from: b */
    public final byte[] f10554b;

    /* renamed from: c */
    public final byte[] f10555c;

    public SignCryptedBlob(int i, byte[] bArr, byte[] bArr2) {
        this.f10553a = i;
        this.f10554b = bArr;
        this.f10555c = bArr2;
    }

    public SignCryptedBlob(byte[] bArr, byte[] bArr2) {
        this(1, bArr, bArr2);
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
        see.m35063b(parcel, 1, this.f10553a);
        see.m35052a(parcel, 2, this.f10554b, false);
        see.m35052a(parcel, 3, this.f10555c, false);
        see.m35062b(parcel, a);
    }
}
