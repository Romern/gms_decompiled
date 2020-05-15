package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SyncTransactionsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new algr();

    /* renamed from: a */
    public boolean f81612a;

    /* renamed from: b */
    public byte[] f81613b;

    private SyncTransactionsResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SyncTransactionsResponse) {
            SyncTransactionsResponse syncTransactionsResponse = (SyncTransactionsResponse) obj;
            return sdg.m34949a(Boolean.valueOf(this.f81612a), Boolean.valueOf(syncTransactionsResponse.f81612a)) && Arrays.equals(this.f81613b, syncTransactionsResponse.f81613b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f81612a), Integer.valueOf(Arrays.hashCode(this.f81613b))});
    }

    public SyncTransactionsResponse(boolean z, byte[] bArr) {
        this.f81612a = z;
        this.f81613b = bArr;
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
        see.m35051a(parcel, 1, this.f81612a);
        see.m35052a(parcel, 2, this.f81613b, false);
        see.m35062b(parcel, a);
    }
}
