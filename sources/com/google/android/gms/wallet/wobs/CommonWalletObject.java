package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axdn();

    /* renamed from: a */
    public String f110598a;

    /* renamed from: b */
    public String f110599b;

    /* renamed from: c */
    public String f110600c;

    /* renamed from: d */
    public String f110601d;

    /* renamed from: e */
    public String f110602e;

    /* renamed from: f */
    public String f110603f;

    /* renamed from: g */
    public String f110604g;
    @Deprecated

    /* renamed from: h */
    public String f110605h;

    /* renamed from: i */
    public int f110606i;

    /* renamed from: j */
    public ArrayList f110607j;

    /* renamed from: k */
    public TimeInterval f110608k;

    /* renamed from: l */
    public ArrayList f110609l;
    @Deprecated

    /* renamed from: m */
    public String f110610m;
    @Deprecated

    /* renamed from: n */
    public String f110611n;

    /* renamed from: o */
    public ArrayList f110612o;

    /* renamed from: p */
    public boolean f110613p;

    /* renamed from: q */
    public ArrayList f110614q;

    /* renamed from: r */
    public ArrayList f110615r;

    /* renamed from: s */
    public ArrayList f110616s;

    public CommonWalletObject() {
        this.f110607j = sqc.m35954a();
        this.f110609l = sqc.m35954a();
        this.f110612o = sqc.m35954a();
        this.f110614q = sqc.m35954a();
        this.f110615r = sqc.m35954a();
        this.f110616s = sqc.m35954a();
    }

    /* renamed from: a */
    public static axdm m94305a() {
        return new axdm(new CommonWalletObject());
    }

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f110598a = str;
        this.f110599b = str2;
        this.f110600c = str3;
        this.f110601d = str4;
        this.f110602e = str5;
        this.f110603f = str6;
        this.f110604g = str7;
        this.f110605h = str8;
        this.f110606i = i;
        this.f110607j = arrayList;
        this.f110608k = timeInterval;
        this.f110609l = arrayList2;
        this.f110610m = str9;
        this.f110611n = str10;
        this.f110612o = arrayList3;
        this.f110613p = z;
        this.f110614q = arrayList4;
        this.f110615r = arrayList5;
        this.f110616s = arrayList6;
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
        see.m35046a(parcel, 2, this.f110598a, false);
        see.m35046a(parcel, 3, this.f110599b, false);
        see.m35046a(parcel, 4, this.f110600c, false);
        see.m35046a(parcel, 5, this.f110601d, false);
        see.m35046a(parcel, 6, this.f110602e, false);
        see.m35046a(parcel, 7, this.f110603f, false);
        see.m35046a(parcel, 8, this.f110604g, false);
        see.m35046a(parcel, 9, this.f110605h, false);
        see.m35063b(parcel, 10, this.f110606i);
        see.m35066c(parcel, 11, this.f110607j, false);
        see.m35040a(parcel, 12, this.f110608k, i, false);
        see.m35066c(parcel, 13, this.f110609l, false);
        see.m35046a(parcel, 14, this.f110610m, false);
        see.m35046a(parcel, 15, this.f110611n, false);
        see.m35066c(parcel, 16, this.f110612o, false);
        see.m35051a(parcel, 17, this.f110613p);
        see.m35066c(parcel, 18, this.f110614q, false);
        see.m35066c(parcel, 19, this.f110615r, false);
        see.m35066c(parcel, 20, this.f110616s, false);
        see.m35062b(parcel, a);
    }
}
