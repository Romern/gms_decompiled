package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SelectGlobalActionCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asqj();

    /* renamed from: a */
    public int f108514a;

    /* renamed from: b */
    public String f108515b;

    /* renamed from: c */
    public int f108516c;

    private SelectGlobalActionCardRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectGlobalActionCardRequest) {
            SelectGlobalActionCardRequest selectGlobalActionCardRequest = (SelectGlobalActionCardRequest) obj;
            return sdg.m34949a(Integer.valueOf(this.f108514a), Integer.valueOf(selectGlobalActionCardRequest.f108514a)) && sdg.m34949a(this.f108515b, selectGlobalActionCardRequest.f108515b) && sdg.m34949a(Integer.valueOf(this.f108516c), Integer.valueOf(selectGlobalActionCardRequest.f108516c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f108514a), this.f108515b, Integer.valueOf(this.f108516c)});
    }

    public SelectGlobalActionCardRequest(int i, String str, int i2) {
        this.f108514a = i;
        this.f108515b = str;
        this.f108516c = i2;
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
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f108514a);
        see.m35046a(parcel, 3, this.f108515b, false);
        see.m35063b(parcel, 4, this.f108516c);
        see.m35062b(parcel, a);
    }
}
