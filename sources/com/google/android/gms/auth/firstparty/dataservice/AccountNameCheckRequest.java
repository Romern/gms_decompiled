package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountNameCheckRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iwd();

    /* renamed from: a */
    final int f10574a;
    @Deprecated

    /* renamed from: b */
    String f10575b;

    /* renamed from: c */
    public String f10576c;

    /* renamed from: d */
    public String f10577d;

    /* renamed from: e */
    public AppDescription f10578e;

    /* renamed from: f */
    public CaptchaSolution f10579f;

    /* renamed from: g */
    public Account f10580g;

    public AccountNameCheckRequest() {
        this.f10574a = 2;
    }

    public AccountNameCheckRequest(int i, String str, String str2, String str3, AppDescription appDescription, CaptchaSolution captchaSolution, Account account) {
        this.f10574a = i;
        this.f10575b = str;
        this.f10576c = str2;
        this.f10577d = str3;
        this.f10578e = appDescription;
        this.f10579f = captchaSolution;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f10580g = account;
        } else {
            this.f10580g = new Account(str, "com.google");
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
        see.m35063b(parcel, 1, this.f10574a);
        see.m35046a(parcel, 2, this.f10575b, false);
        see.m35046a(parcel, 3, this.f10576c, false);
        see.m35046a(parcel, 4, this.f10577d, false);
        see.m35040a(parcel, 5, this.f10578e, i, false);
        see.m35040a(parcel, 6, this.f10579f, i, false);
        see.m35040a(parcel, 7, this.f10580g, i, false);
        see.m35062b(parcel, a);
    }
}
