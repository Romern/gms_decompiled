package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleAccountData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iwt();

    /* renamed from: a */
    final int f10628a;
    @Deprecated

    /* renamed from: b */
    String f10629b;

    /* renamed from: c */
    boolean f10630c;

    /* renamed from: d */
    public List f10631d;

    /* renamed from: e */
    public String f10632e;

    /* renamed from: f */
    public String f10633f;

    /* renamed from: g */
    public Account f10634g;

    public GoogleAccountData(int i, String str, boolean z, List list, String str2, String str3, Account account) {
        this.f10628a = i;
        this.f10629b = str;
        this.f10630c = z;
        this.f10631d = list;
        this.f10632e = str2;
        this.f10633f = str3;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f10634g = account;
        } else {
            this.f10634g = new Account(str, "com.google");
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
        see.m35063b(parcel, 1, this.f10628a);
        see.m35046a(parcel, 2, this.f10629b, false);
        see.m35051a(parcel, 3, this.f10630c);
        see.m35065b(parcel, 4, this.f10631d, false);
        see.m35046a(parcel, 5, this.f10632e, false);
        see.m35046a(parcel, 6, this.f10633f, false);
        see.m35040a(parcel, 7, this.f10634g, i, false);
        see.m35062b(parcel, a);
    }

    public GoogleAccountData(Account account, boolean z, List list, String str, String str2) {
        this.f10628a = 2;
        this.f10634g = account;
        this.f10630c = z;
        this.f10631d = Collections.unmodifiableList(new ArrayList(list));
        this.f10632e = str;
        this.f10633f = str2;
    }
}
