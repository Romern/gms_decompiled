package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SetValuableSmartTapEnabledRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new algk();

    /* renamed from: a */
    public Account f81602a;

    /* renamed from: b */
    public String f81603b;

    /* renamed from: c */
    public boolean f81604c;

    private SetValuableSmartTapEnabledRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetValuableSmartTapEnabledRequest) {
            SetValuableSmartTapEnabledRequest setValuableSmartTapEnabledRequest = (SetValuableSmartTapEnabledRequest) obj;
            return sdg.m34949a(this.f81602a, setValuableSmartTapEnabledRequest.f81602a) && sdg.m34949a(this.f81603b, setValuableSmartTapEnabledRequest.f81603b) && sdg.m34949a(Boolean.valueOf(this.f81604c), Boolean.valueOf(setValuableSmartTapEnabledRequest.f81604c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81602a, this.f81603b, Boolean.valueOf(this.f81604c)});
    }

    public SetValuableSmartTapEnabledRequest(Account account, String str, boolean z) {
        this.f81602a = account;
        this.f81603b = str;
        this.f81604c = z;
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
        see.m35040a(parcel, 1, this.f81602a, i, false);
        see.m35046a(parcel, 2, this.f81603b, false);
        see.m35051a(parcel, 3, this.f81604c);
        see.m35062b(parcel, a);
    }
}
