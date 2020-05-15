package com.google.android.gms.payse.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.payse.SecureElementStoredValue;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExecuteSdkOperationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alkf();

    /* renamed from: a */
    public Account f81683a;

    /* renamed from: b */
    public int f81684b;

    /* renamed from: c */
    SecureElementStoredValue f81685c;

    /* renamed from: d */
    String f81686d;

    /* renamed from: e */
    long f81687e;

    public ExecuteSdkOperationRequest(Account account, int i, SecureElementStoredValue secureElementStoredValue, String str, long j) {
        this.f81684b = i;
        this.f81685c = secureElementStoredValue;
        this.f81683a = account;
        this.f81686d = str;
        this.f81687e = j;
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
        see.m35040a(parcel, 1, this.f81683a, i, false);
        see.m35063b(parcel, 2, this.f81684b);
        see.m35040a(parcel, 3, this.f81685c, i, false);
        see.m35046a(parcel, 4, this.f81686d, false);
        see.m35036a(parcel, 5, this.f81687e);
        see.m35062b(parcel, a);
    }
}
