package com.google.android.wallet.bender3.framework.client;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WidgetConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bjhk();

    /* renamed from: a */
    public Account f151760a;

    /* renamed from: b */
    public int f151761b;

    /* renamed from: c */
    public int f151762c;

    /* renamed from: d */
    public int f151763d;

    /* renamed from: e */
    public int f151764e;

    /* renamed from: f */
    public int f151765f;

    /* renamed from: g */
    public String f151766g;

    /* renamed from: h */
    public int f151767h;

    /* renamed from: i */
    public long f151768i;

    /* renamed from: j */
    public int f151769j;

    public WidgetConfig() {
        this.f151761b = 0;
        this.f151762c = 1;
        this.f151765f = -1;
        this.f151767h = 1;
        this.f151768i = 0;
        this.f151769j = 0;
    }

    /* renamed from: a */
    public final String mo71762a() {
        Account account = this.f151760a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public WidgetConfig(Account account, int i, int i2, int i3, int i4, int i5, String str, int i6, long j, int i7) {
        this.f151760a = account;
        this.f151761b = i;
        this.f151762c = i2;
        this.f151763d = i3;
        this.f151764e = i4;
        this.f151765f = i5;
        this.f151766g = str;
        this.f151767h = i6;
        this.f151768i = j;
        this.f151769j = i7;
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
        see.m35040a(parcel, 1, this.f151760a, i, false);
        see.m35063b(parcel, 2, this.f151761b);
        see.m35063b(parcel, 3, this.f151762c);
        see.m35063b(parcel, 4, this.f151763d);
        see.m35063b(parcel, 5, this.f151764e);
        see.m35063b(parcel, 6, this.f151765f);
        see.m35046a(parcel, 7, this.f151766g, false);
        see.m35063b(parcel, 8, this.f151767h);
        see.m35036a(parcel, 9, this.f151768i);
        see.m35063b(parcel, 10, this.f151769j);
        see.m35062b(parcel, a);
    }
}
