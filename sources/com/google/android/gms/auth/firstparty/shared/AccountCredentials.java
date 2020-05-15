package com.google.android.gms.auth.firstparty.shared;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountCredentials extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iyw();

    /* renamed from: a */
    final int f10827a;

    /* renamed from: b */
    public boolean f10828b;

    /* renamed from: c */
    public String f10829c;

    /* renamed from: d */
    public String f10830d;

    /* renamed from: e */
    public String f10831e;

    /* renamed from: f */
    public String f10832f;

    /* renamed from: g */
    public String f10833g;

    /* renamed from: h */
    public String f10834h;

    /* renamed from: i */
    public final String f10835i;

    @Deprecated
    public AccountCredentials() {
        this("com.google");
    }

    /* renamed from: a */
    public final Account mo7674a() {
        if (!TextUtils.isEmpty(this.f10829c)) {
            return new Account(this.f10829c, this.f10835i);
        }
        return null;
    }

    public AccountCredentials(int i, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f10827a = i;
        this.f10828b = z;
        this.f10829c = str;
        this.f10830d = str2;
        this.f10831e = str3;
        this.f10832f = str4;
        this.f10833g = str5;
        this.f10834h = str6;
        this.f10835i = str7;
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
        see.m35063b(parcel, 1, this.f10827a);
        see.m35051a(parcel, 2, this.f10828b);
        see.m35046a(parcel, 3, this.f10829c, false);
        see.m35046a(parcel, 4, this.f10830d, false);
        see.m35046a(parcel, 5, this.f10831e, false);
        see.m35046a(parcel, 6, this.f10832f, false);
        see.m35046a(parcel, 7, this.f10833g, false);
        see.m35046a(parcel, 8, this.f10834h, false);
        see.m35046a(parcel, 9, this.f10835i, false);
        see.m35062b(parcel, a);
    }

    public AccountCredentials(Account account) {
        this(account.type);
        this.f10829c = account.name;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    public AccountCredentials(String str) {
        this.f10827a = 2;
        sdo.m34969a(str, (Object) "Account type can't be empty.");
        this.f10835i = str;
    }
}
