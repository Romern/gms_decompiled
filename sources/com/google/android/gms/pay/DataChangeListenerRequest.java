package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DataChangeListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alcx();

    /* renamed from: a */
    public Account f81450a;

    /* renamed from: b */
    public DataChangeListenerType f81451b;

    /* renamed from: c */
    public String f81452c;

    private DataChangeListenerRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataChangeListenerRequest) {
            DataChangeListenerRequest dataChangeListenerRequest = (DataChangeListenerRequest) obj;
            return sdg.m34949a(this.f81450a, dataChangeListenerRequest.f81450a) && sdg.m34949a(this.f81451b, dataChangeListenerRequest.f81451b) && sdg.m34949a(this.f81452c, dataChangeListenerRequest.f81452c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81450a, this.f81451b, this.f81452c});
    }

    public DataChangeListenerRequest(Account account, DataChangeListenerType dataChangeListenerType, String str) {
        this.f81450a = account;
        this.f81451b = dataChangeListenerType;
        this.f81452c = str;
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
        see.m35040a(parcel, 1, this.f81450a, i, false);
        see.m35040a(parcel, 2, this.f81451b, i, false);
        see.m35046a(parcel, 3, this.f81452c, false);
        see.m35062b(parcel, a);
    }
}
