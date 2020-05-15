package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExportedSymmetricKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ioz();

    /* renamed from: a */
    final int f10530a;

    /* renamed from: b */
    public final byte[] f10531b;

    /* renamed from: c */
    public final long f10532c;

    public ExportedSymmetricKey(int i, byte[] bArr, long j) {
        this.f10530a = i;
        this.f10531b = bArr;
        this.f10532c = j;
    }

    public ExportedSymmetricKey(byte[] bArr, long j) {
        this(1, bArr, j);
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
        see.m35063b(parcel, 1, this.f10530a);
        see.m35052a(parcel, 2, this.f10531b, false);
        see.m35036a(parcel, 3, this.f10532c);
        see.m35062b(parcel, a);
    }
}
