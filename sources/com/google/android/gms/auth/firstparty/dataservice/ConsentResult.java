package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConsentResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new iwp();

    /* renamed from: a */
    public static final String f10615a = ConsentResult.class.getName();

    /* renamed from: b */
    public final int f10616b;

    /* renamed from: c */
    public final String f10617c;

    /* renamed from: d */
    public final String f10618d;

    /* renamed from: e */
    public final FACLConfig f10619e;

    /* renamed from: f */
    public final String f10620f;

    /* renamed from: g */
    public final String f10621g;

    /* renamed from: h */
    public final String f10622h;

    public ConsentResult(int i, String str, String str2, FACLConfig fACLConfig, String str3, String str4, String str5) {
        this.f10616b = i;
        sdo.m34959a((Object) str);
        this.f10617c = str;
        this.f10618d = str2;
        this.f10619e = fACLConfig;
        this.f10620f = str3;
        this.f10621g = str4;
        this.f10622h = str5;
    }

    /* renamed from: a */
    public final izj mo7619a() {
        return izj.m16366a(this.f10617c);
    }

    /* renamed from: b */
    public final iyb mo7620b() {
        return iyb.m16329a(this.f10620f);
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
        see.m35063b(parcel, 1, this.f10616b);
        see.m35046a(parcel, 2, this.f10617c, false);
        see.m35046a(parcel, 3, this.f10618d, false);
        see.m35040a(parcel, 4, this.f10619e, i, false);
        see.m35046a(parcel, 5, this.f10620f, false);
        see.m35046a(parcel, 6, this.f10621g, false);
        see.m35046a(parcel, 7, this.f10622h, false);
        see.m35062b(parcel, a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public ConsentResult(izj izj, iyb iyb, String str) {
        this(3, r2, null, null, iyb.toString(), null, str);
        sdo.m34959a(izj);
        String str2 = izj.toString();
        sdo.m34959a(iyb);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public ConsentResult(izj izj, String str, FACLConfig fACLConfig, iyb iyb, String str2) {
        this(3, r2, str, fACLConfig, iyb.toString(), str2, null);
        sdo.m34959a(izj);
        String str3 = izj.toString();
        sdo.m34959a(iyb);
    }
}
