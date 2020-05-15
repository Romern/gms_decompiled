package com.google.android.gms.walletp2p.internal.zeroparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Transaction extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new axnz();

    /* renamed from: a */
    public int f110831a;

    /* renamed from: b */
    public int f110832b;

    /* renamed from: c */
    public String f110833c;

    /* renamed from: d */
    public long f110834d;

    /* renamed from: e */
    public String f110835e;

    /* renamed from: f */
    public long f110836f;

    /* renamed from: g */
    public String f110837g;

    /* renamed from: h */
    public String f110838h;

    /* renamed from: i */
    public String f110839i;

    /* renamed from: j */
    public String f110840j;

    /* renamed from: k */
    public String f110841k;

    /* renamed from: l */
    public String f110842l;

    /* renamed from: m */
    public String f110843m;

    /* renamed from: n */
    public boolean f110844n;

    /* renamed from: o */
    public String f110845o;

    public Transaction(int i, int i2, String str, long j, String str2, long j2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        this.f110831a = i;
        this.f110832b = i2;
        this.f110833c = str;
        this.f110834d = j;
        this.f110835e = str2;
        this.f110836f = j2;
        this.f110837g = str3;
        this.f110838h = str4;
        this.f110839i = str5;
        this.f110840j = str6;
        this.f110841k = str7;
        this.f110842l = str8;
        this.f110843m = str9;
        this.f110844n = z;
        this.f110845o = str10;
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
        see.m35063b(parcel, 2, this.f110831a);
        see.m35063b(parcel, 3, this.f110832b);
        see.m35046a(parcel, 4, this.f110833c, false);
        see.m35036a(parcel, 5, this.f110834d);
        see.m35046a(parcel, 6, this.f110835e, false);
        see.m35036a(parcel, 7, this.f110836f);
        see.m35046a(parcel, 8, this.f110837g, false);
        see.m35046a(parcel, 9, this.f110838h, false);
        see.m35046a(parcel, 10, this.f110839i, false);
        see.m35046a(parcel, 11, this.f110840j, false);
        see.m35046a(parcel, 12, this.f110841k, false);
        see.m35046a(parcel, 13, this.f110842l, false);
        see.m35046a(parcel, 14, this.f110843m, false);
        see.m35051a(parcel, 15, this.f110844n);
        see.m35046a(parcel, 16, this.f110845o, false);
        see.m35062b(parcel, a);
    }
}
