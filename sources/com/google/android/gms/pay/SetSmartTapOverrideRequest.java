package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SetSmartTapOverrideRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new algi();

    /* renamed from: a */
    public Account f81597a;

    /* renamed from: b */
    public String f81598b;

    /* renamed from: c */
    public long f81599c;

    private SetSmartTapOverrideRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetSmartTapOverrideRequest) {
            SetSmartTapOverrideRequest setSmartTapOverrideRequest = (SetSmartTapOverrideRequest) obj;
            return sdg.m34949a(this.f81597a, setSmartTapOverrideRequest.f81597a) && sdg.m34949a(this.f81598b, setSmartTapOverrideRequest.f81598b) && sdg.m34949a(Long.valueOf(this.f81599c), Long.valueOf(setSmartTapOverrideRequest.f81599c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81597a, this.f81598b, Long.valueOf(this.f81599c)});
    }

    public SetSmartTapOverrideRequest(Account account, String str, long j) {
        this.f81597a = account;
        this.f81598b = str;
        this.f81599c = j;
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
        see.m35040a(parcel, 1, this.f81597a, i, false);
        see.m35046a(parcel, 2, this.f81598b, false);
        see.m35036a(parcel, 3, this.f81599c);
        see.m35062b(parcel, a);
    }
}
