package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GplusInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ixn();

    /* renamed from: a */
    final int f10653a;
    @Deprecated

    /* renamed from: b */
    String f10654b;

    /* renamed from: c */
    CaptchaSolution f10655c;

    /* renamed from: d */
    Account f10656d;

    public GplusInfoRequest() {
        this.f10653a = 2;
    }

    public GplusInfoRequest(int i, String str, CaptchaSolution captchaSolution, Account account) {
        this.f10653a = i;
        this.f10654b = str;
        this.f10655c = captchaSolution;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f10656d = account;
        } else {
            this.f10656d = new Account(str, "com.google");
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
        see.m35063b(parcel, 1, this.f10653a);
        see.m35046a(parcel, 2, this.f10654b, false);
        see.m35040a(parcel, 3, this.f10655c, i, false);
        see.m35040a(parcel, 4, this.f10656d, i, false);
        see.m35062b(parcel, a);
    }
}
