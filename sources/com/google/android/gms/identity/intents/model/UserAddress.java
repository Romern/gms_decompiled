package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new addb();

    /* renamed from: a */
    public String f79117a;

    /* renamed from: b */
    public String f79118b;

    /* renamed from: c */
    public String f79119c;

    /* renamed from: d */
    public String f79120d;

    /* renamed from: e */
    public String f79121e;

    /* renamed from: f */
    public String f79122f;

    /* renamed from: g */
    public String f79123g;

    /* renamed from: h */
    public String f79124h;

    /* renamed from: i */
    public String f79125i;

    /* renamed from: j */
    public String f79126j;

    /* renamed from: k */
    public String f79127k;

    /* renamed from: l */
    public String f79128l;

    /* renamed from: m */
    public boolean f79129m;

    /* renamed from: n */
    public String f79130n;

    /* renamed from: o */
    public String f79131o;

    public UserAddress() {
    }

    /* renamed from: a */
    public static adda m66752a() {
        return new adda(new UserAddress());
    }

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.f79117a = str;
        this.f79118b = str2;
        this.f79119c = str3;
        this.f79120d = str4;
        this.f79121e = str5;
        this.f79122f = str6;
        this.f79123g = str7;
        this.f79124h = str8;
        this.f79125i = str9;
        this.f79126j = str10;
        this.f79127k = str11;
        this.f79128l = str12;
        this.f79129m = z;
        this.f79130n = str13;
        this.f79131o = str14;
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
        see.m35046a(parcel, 2, this.f79117a, false);
        see.m35046a(parcel, 3, this.f79118b, false);
        see.m35046a(parcel, 4, this.f79119c, false);
        see.m35046a(parcel, 5, this.f79120d, false);
        see.m35046a(parcel, 6, this.f79121e, false);
        see.m35046a(parcel, 7, this.f79122f, false);
        see.m35046a(parcel, 8, this.f79123g, false);
        see.m35046a(parcel, 9, this.f79124h, false);
        see.m35046a(parcel, 10, this.f79125i, false);
        see.m35046a(parcel, 11, this.f79126j, false);
        see.m35046a(parcel, 12, this.f79127k, false);
        see.m35046a(parcel, 13, this.f79128l, false);
        see.m35051a(parcel, 14, this.f79129m);
        see.m35046a(parcel, 15, this.f79130n, false);
        see.m35046a(parcel, 16, this.f79131o, false);
        see.m35062b(parcel, a);
    }
}
