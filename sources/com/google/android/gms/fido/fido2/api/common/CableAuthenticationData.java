package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CableAuthenticationData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xpp();

    /* renamed from: a */
    public final long f31737a;

    /* renamed from: b */
    public final byte[] f31738b;

    /* renamed from: c */
    public final byte[] f31739c;

    /* renamed from: d */
    public final byte[] f31740d;

    public CableAuthenticationData(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f31737a = j;
        this.f31738b = (byte[]) sdo.m34959a(bArr);
        this.f31739c = (byte[]) sdo.m34959a(bArr2);
        this.f31740d = (byte[]) sdo.m34959a(bArr3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CableAuthenticationData) {
            CableAuthenticationData cableAuthenticationData = (CableAuthenticationData) obj;
            if (this.f31737a != cableAuthenticationData.f31737a || !Arrays.equals(this.f31738b, cableAuthenticationData.f31738b) || !Arrays.equals(this.f31739c, cableAuthenticationData.f31739c) || !Arrays.equals(this.f31740d, cableAuthenticationData.f31740d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f31737a), this.f31738b, this.f31739c, this.f31740d});
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
        see.m35036a(parcel, 1, this.f31737a);
        see.m35052a(parcel, 2, this.f31738b, false);
        see.m35052a(parcel, 3, this.f31739c, false);
        see.m35052a(parcel, 4, this.f31740d, false);
        see.m35062b(parcel, a);
    }
}
