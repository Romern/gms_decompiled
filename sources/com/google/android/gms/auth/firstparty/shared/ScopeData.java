package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ScopeData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new izh();

    /* renamed from: a */
    public static final List f10880a = Collections.emptyList();

    /* renamed from: b */
    final int f10881b;

    /* renamed from: c */
    public final String f10882c;

    /* renamed from: d */
    public final String f10883d;

    /* renamed from: e */
    public final String f10884e;

    /* renamed from: f */
    public String f10885f;

    /* renamed from: g */
    public final boolean f10886g;

    /* renamed from: h */
    public String f10887h;

    /* renamed from: i */
    public final String f10888i;

    /* renamed from: j */
    public boolean f10889j;

    /* renamed from: k */
    public boolean f10890k;

    /* renamed from: l */
    public boolean f10891l;

    /* renamed from: m */
    public boolean f10892m;

    /* renamed from: n */
    public boolean f10893n;

    /* renamed from: o */
    public boolean f10894o;

    /* renamed from: p */
    public List f10895p;

    /* renamed from: q */
    public String f10896q;

    public ScopeData(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, String str7) {
        this.f10881b = i;
        this.f10882c = str;
        this.f10883d = str2;
        this.f10884e = str3;
        this.f10885f = str4;
        this.f10886g = z;
        this.f10887h = str5;
        this.f10888i = str6;
        this.f10889j = z2;
        this.f10890k = z3;
        this.f10891l = z4;
        this.f10892m = z5;
        this.f10893n = z6;
        this.f10894o = z7;
        this.f10895p = list;
        this.f10896q = str7;
    }

    /* renamed from: a */
    public final boolean mo7700a() {
        return this.f10885f != null;
    }

    /* renamed from: b */
    public final boolean mo7701b() {
        return !this.f10895p.isEmpty();
    }

    /* renamed from: c */
    public final String mo7702c() {
        return mo7701b() ? (String) this.f10895p.get(0) : "";
    }

    public ScopeData(String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, String str7) {
        this(1, str, str2, str3, str4, z, str5, str6, z2, z3, z4, z5, z6, z7, list, str7);
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
        see.m35063b(parcel, 1, this.f10881b);
        see.m35046a(parcel, 2, this.f10882c, false);
        see.m35046a(parcel, 3, this.f10883d, false);
        see.m35046a(parcel, 4, this.f10884e, false);
        see.m35046a(parcel, 5, this.f10885f, false);
        see.m35051a(parcel, 6, this.f10886g);
        see.m35046a(parcel, 7, this.f10887h, false);
        see.m35046a(parcel, 8, this.f10888i, false);
        see.m35051a(parcel, 9, this.f10889j);
        see.m35051a(parcel, 10, this.f10890k);
        see.m35051a(parcel, 11, this.f10891l);
        see.m35051a(parcel, 12, this.f10892m);
        see.m35051a(parcel, 13, this.f10893n);
        see.m35051a(parcel, 14, this.f10894o);
        see.m35065b(parcel, 15, this.f10895p, false);
        see.m35046a(parcel, 16, this.f10896q, false);
        see.m35062b(parcel, a);
    }
}
