package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aszp();

    /* renamed from: a */
    public String f108591a;

    /* renamed from: b */
    public String f108592b;

    /* renamed from: c */
    public String f108593c;

    /* renamed from: d */
    String f108594d;

    /* renamed from: e */
    String f108595e;

    /* renamed from: f */
    String f108596f;

    /* renamed from: g */
    public String f108597g;

    /* renamed from: h */
    public String f108598h;

    /* renamed from: i */
    public String f108599i;

    /* renamed from: j */
    public String f108600j;

    /* renamed from: k */
    String f108601k;

    /* renamed from: l */
    public String f108602l;

    /* renamed from: m */
    boolean f108603m;

    /* renamed from: n */
    String f108604n;

    /* renamed from: o */
    String f108605o;

    UserAddress() {
    }

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.f108591a = str;
        this.f108592b = str2;
        this.f108593c = str3;
        this.f108594d = str4;
        this.f108595e = str5;
        this.f108596f = str6;
        this.f108597g = str7;
        this.f108598h = str8;
        this.f108599i = str9;
        this.f108600j = str10;
        this.f108601k = str11;
        this.f108602l = str12;
        this.f108603m = z;
        this.f108604n = str13;
        this.f108605o = str14;
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
        see.m35046a(parcel, 2, this.f108591a, false);
        see.m35046a(parcel, 3, this.f108592b, false);
        see.m35046a(parcel, 4, this.f108593c, false);
        see.m35046a(parcel, 5, this.f108594d, false);
        see.m35046a(parcel, 6, this.f108595e, false);
        see.m35046a(parcel, 7, this.f108596f, false);
        see.m35046a(parcel, 8, this.f108597g, false);
        see.m35046a(parcel, 9, this.f108598h, false);
        see.m35046a(parcel, 10, this.f108599i, false);
        see.m35046a(parcel, 11, this.f108600j, false);
        see.m35046a(parcel, 12, this.f108601k, false);
        see.m35046a(parcel, 13, this.f108602l, false);
        see.m35051a(parcel, 14, this.f108603m);
        see.m35046a(parcel, 15, this.f108604n, false);
        see.m35046a(parcel, 16, this.f108605o, false);
        see.m35062b(parcel, a);
    }
}
