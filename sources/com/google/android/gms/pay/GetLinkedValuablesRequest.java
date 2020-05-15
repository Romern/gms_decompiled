package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetLinkedValuablesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alds();

    /* renamed from: a */
    public Account f81486a;

    /* renamed from: b */
    public String f81487b;

    /* renamed from: c */
    public int f81488c;

    private GetLinkedValuablesRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetLinkedValuablesRequest) {
            GetLinkedValuablesRequest getLinkedValuablesRequest = (GetLinkedValuablesRequest) obj;
            return sdg.m34949a(this.f81486a, getLinkedValuablesRequest.f81486a) && sdg.m34949a(this.f81487b, getLinkedValuablesRequest.f81487b) && sdg.m34949a(Integer.valueOf(this.f81488c), Integer.valueOf(getLinkedValuablesRequest.f81488c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81486a, this.f81487b, Integer.valueOf(this.f81488c)});
    }

    public GetLinkedValuablesRequest(Account account, String str, int i) {
        this.f81486a = account;
        this.f81487b = str;
        this.f81488c = i;
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
        see.m35040a(parcel, 1, this.f81486a, i, false);
        see.m35046a(parcel, 2, this.f81487b, false);
        see.m35063b(parcel, 3, this.f81488c);
        see.m35062b(parcel, a);
    }
}
