package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SelectPayGlobalActionCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alge();

    /* renamed from: a */
    public Account f81588a;

    /* renamed from: b */
    public int f81589b;

    /* renamed from: c */
    public String f81590c;

    /* renamed from: d */
    public int f81591d;

    public SelectPayGlobalActionCardRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectPayGlobalActionCardRequest) {
            SelectPayGlobalActionCardRequest selectPayGlobalActionCardRequest = (SelectPayGlobalActionCardRequest) obj;
            return sdg.m34949a(this.f81588a, selectPayGlobalActionCardRequest.f81588a) && sdg.m34949a(Integer.valueOf(this.f81589b), Integer.valueOf(selectPayGlobalActionCardRequest.f81589b)) && sdg.m34949a(this.f81590c, selectPayGlobalActionCardRequest.f81590c) && sdg.m34949a(Integer.valueOf(this.f81591d), Integer.valueOf(selectPayGlobalActionCardRequest.f81591d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81588a, Integer.valueOf(this.f81589b), this.f81590c, Integer.valueOf(this.f81591d)});
    }

    public SelectPayGlobalActionCardRequest(Account account, int i, String str, int i2) {
        this.f81588a = account;
        this.f81589b = i;
        this.f81590c = str;
        this.f81591d = i2;
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
        see.m35040a(parcel, 1, this.f81588a, i, false);
        see.m35063b(parcel, 2, this.f81589b);
        see.m35046a(parcel, 3, this.f81590c, false);
        see.m35063b(parcel, 4, this.f81591d);
        see.m35062b(parcel, a);
    }
}
