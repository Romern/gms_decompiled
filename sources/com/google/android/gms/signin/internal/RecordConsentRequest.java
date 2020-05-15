package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RecordConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aqoi();

    /* renamed from: a */
    final int f107704a;

    /* renamed from: b */
    public final Account f107705b;

    /* renamed from: c */
    public final Scope[] f107706c;

    /* renamed from: d */
    public final String f107707d;

    public RecordConsentRequest(int i, Account account, Scope[] scopeArr, String str) {
        this.f107704a = i;
        this.f107705b = account;
        this.f107706c = scopeArr;
        this.f107707d = str;
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
        see.m35063b(parcel, 1, this.f107704a);
        see.m35040a(parcel, 2, this.f107705b, i, false);
        see.m35057a(parcel, 3, this.f107706c, i);
        see.m35046a(parcel, 4, this.f107707d, false);
        see.m35062b(parcel, a);
    }
}
