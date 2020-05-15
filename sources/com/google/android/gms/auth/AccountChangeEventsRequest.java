package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ghr();

    /* renamed from: a */
    final int f9910a;

    /* renamed from: b */
    public int f9911b;
    @Deprecated

    /* renamed from: c */
    public String f9912c;

    /* renamed from: d */
    Account f9913d;

    public AccountChangeEventsRequest() {
        this.f9910a = 1;
    }

    public AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.f9910a = i;
        this.f9911b = i2;
        this.f9912c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f9913d = account;
        } else {
            this.f9913d = new Account(str, "com.google");
        }
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
        see.m35063b(parcel, 1, this.f9910a);
        see.m35063b(parcel, 2, this.f9911b);
        see.m35046a(parcel, 3, this.f9912c, false);
        see.m35040a(parcel, 4, this.f9913d, i, false);
        see.m35062b(parcel, a);
    }
}
