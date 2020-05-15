package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awba();

    /* renamed from: a */
    String f109823a;

    /* renamed from: b */
    public String f109824b;

    /* renamed from: c */
    String f109825c;

    /* renamed from: d */
    String f109826d;

    /* renamed from: e */
    public String f109827e;

    /* renamed from: f */
    String f109828f;

    /* renamed from: g */
    String f109829g;

    /* renamed from: h */
    String f109830h;
    @Deprecated

    /* renamed from: i */
    String f109831i;

    /* renamed from: j */
    String f109832j;

    /* renamed from: k */
    int f109833k;

    /* renamed from: l */
    ArrayList f109834l;

    /* renamed from: m */
    TimeInterval f109835m;

    /* renamed from: n */
    ArrayList f109836n;
    @Deprecated

    /* renamed from: o */
    String f109837o;
    @Deprecated

    /* renamed from: p */
    String f109838p;

    /* renamed from: q */
    ArrayList f109839q;

    /* renamed from: r */
    boolean f109840r;

    /* renamed from: s */
    ArrayList f109841s;

    /* renamed from: t */
    ArrayList f109842t;

    /* renamed from: u */
    ArrayList f109843u;

    /* renamed from: v */
    public LoyaltyPoints f109844v;

    LoyaltyWalletObject() {
        this.f109834l = sqc.m35954a();
        this.f109836n = sqc.m35954a();
        this.f109839q = sqc.m35954a();
        this.f109841s = sqc.m35954a();
        this.f109842t = sqc.m35954a();
        this.f109843u = sqc.m35954a();
    }

    /* renamed from: a */
    public final CommonWalletObject mo59760a() {
        axdm a = CommonWalletObject.m94305a();
        a.mo53044a(this.f109823a);
        String str = this.f109832j;
        CommonWalletObject commonWalletObject = a.f95841a;
        commonWalletObject.f110599b = str;
        commonWalletObject.f110600c = this.f109826d;
        commonWalletObject.f110601d = this.f109825c;
        commonWalletObject.f110602e = this.f109828f;
        commonWalletObject.f110603f = this.f109829g;
        commonWalletObject.f110604g = this.f109830h;
        commonWalletObject.f110605h = this.f109831i;
        commonWalletObject.f110606i = this.f109833k;
        commonWalletObject.f110607j.addAll(this.f109834l);
        TimeInterval timeInterval = this.f109835m;
        CommonWalletObject commonWalletObject2 = a.f95841a;
        commonWalletObject2.f110608k = timeInterval;
        commonWalletObject2.f110609l.addAll(this.f109836n);
        String str2 = this.f109837o;
        CommonWalletObject commonWalletObject3 = a.f95841a;
        commonWalletObject3.f110610m = str2;
        commonWalletObject3.f110611n = this.f109838p;
        commonWalletObject3.f110612o.addAll(this.f109839q);
        boolean z = this.f109840r;
        CommonWalletObject commonWalletObject4 = a.f95841a;
        commonWalletObject4.f110613p = z;
        commonWalletObject4.f110614q.addAll(this.f109841s);
        a.f95841a.f110615r.addAll(this.f109842t);
        a.f95841a.f110616s.addAll(this.f109843u);
        return a.f95841a;
    }

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
        this.f109823a = str;
        this.f109824b = str2;
        this.f109825c = str3;
        this.f109826d = str4;
        this.f109827e = str5;
        this.f109828f = str6;
        this.f109829g = str7;
        this.f109830h = str8;
        this.f109831i = str9;
        this.f109832j = str10;
        this.f109833k = i;
        this.f109834l = arrayList;
        this.f109835m = timeInterval;
        this.f109836n = arrayList2;
        this.f109837o = str11;
        this.f109838p = str12;
        this.f109839q = arrayList3;
        this.f109840r = z;
        this.f109841s = arrayList4;
        this.f109842t = arrayList5;
        this.f109843u = arrayList6;
        this.f109844v = loyaltyPoints;
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
        see.m35046a(parcel, 2, this.f109823a, false);
        see.m35046a(parcel, 3, this.f109824b, false);
        see.m35046a(parcel, 4, this.f109825c, false);
        see.m35046a(parcel, 5, this.f109826d, false);
        see.m35046a(parcel, 6, this.f109827e, false);
        see.m35046a(parcel, 7, this.f109828f, false);
        see.m35046a(parcel, 8, this.f109829g, false);
        see.m35046a(parcel, 9, this.f109830h, false);
        see.m35046a(parcel, 10, this.f109831i, false);
        see.m35046a(parcel, 11, this.f109832j, false);
        see.m35063b(parcel, 12, this.f109833k);
        see.m35066c(parcel, 13, this.f109834l, false);
        see.m35040a(parcel, 14, this.f109835m, i, false);
        see.m35066c(parcel, 15, this.f109836n, false);
        see.m35046a(parcel, 16, this.f109837o, false);
        see.m35046a(parcel, 17, this.f109838p, false);
        see.m35066c(parcel, 18, this.f109839q, false);
        see.m35051a(parcel, 19, this.f109840r);
        see.m35066c(parcel, 20, this.f109841s, false);
        see.m35066c(parcel, 21, this.f109842t, false);
        see.m35066c(parcel, 22, this.f109843u, false);
        see.m35040a(parcel, 23, this.f109844v, i, false);
        see.m35062b(parcel, a);
    }
}
