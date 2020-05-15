package com.google.android.gms.identity.accounts.security;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class EncryptedAccountData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acxz();

    /* renamed from: a */
    public final int f79104a;

    /* renamed from: b */
    public final byte[] f79105b;

    /* renamed from: c */
    public final byte[] f79106c;

    /* renamed from: d */
    public final byte[] f79107d;

    public EncryptedAccountData(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        boolean z = true;
        sdo.m34975b(bArr.length > 0, "Encrypted bytes must not be empty.");
        sdo.m34975b(bArr2.length > 0, "IV bytes must not be empty.");
        sdo.m34975b(bArr3.length <= 0 ? false : z, "MAC bytes must not be empty.");
        this.f79104a = i;
        this.f79105b = bArr;
        this.f79106c = bArr2;
        this.f79107d = bArr3;
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
        see.m35052a(parcel, 1, this.f79105b, false);
        see.m35052a(parcel, 2, this.f79106c, false);
        see.m35052a(parcel, 3, this.f79107d, false);
        see.m35063b(parcel, 1000, this.f79104a);
        see.m35062b(parcel, a);
    }
}
