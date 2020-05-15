package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agcw();

    /* renamed from: a */
    public final String f80098a;

    /* renamed from: b */
    public final String f80099b;

    /* renamed from: c */
    public final String f80100c;

    /* renamed from: d */
    public final String f80101d;

    /* renamed from: e */
    public final long f80102e;

    /* renamed from: f */
    public final long f80103f;

    /* renamed from: g */
    public final String f80104g;

    /* renamed from: h */
    public final boolean f80105h;

    /* renamed from: i */
    public final boolean f80106i;

    /* renamed from: j */
    public final long f80107j;

    /* renamed from: k */
    public final String f80108k;

    /* renamed from: l */
    public final long f80109l;

    /* renamed from: m */
    public final long f80110m;

    /* renamed from: n */
    public final int f80111n;

    /* renamed from: o */
    public final boolean f80112o;

    /* renamed from: p */
    public final boolean f80113p;

    /* renamed from: q */
    public final boolean f80114q;

    /* renamed from: r */
    public final String f80115r;

    /* renamed from: s */
    public final Boolean f80116s;

    /* renamed from: t */
    public final long f80117t;

    /* renamed from: u */
    public final List f80118u;

    /* renamed from: v */
    public final String f80119v;

    public AppMetadata(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List list) {
        sdo.m34977c(str);
        this.f80098a = str;
        this.f80099b = !TextUtils.isEmpty(str2) ? str2 : null;
        this.f80100c = str3;
        this.f80107j = j;
        this.f80101d = str4;
        this.f80102e = j2;
        this.f80103f = j3;
        this.f80104g = str5;
        this.f80105h = z;
        this.f80106i = z2;
        this.f80108k = str6;
        this.f80109l = j4;
        this.f80110m = j5;
        this.f80111n = i;
        this.f80112o = z3;
        this.f80113p = z4;
        this.f80114q = z5;
        this.f80115r = str7;
        this.f80116s = bool;
        this.f80117t = j6;
        this.f80118u = list;
        this.f80119v = null;
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
        see.m35046a(parcel, 2, this.f80098a, false);
        see.m35046a(parcel, 3, this.f80099b, false);
        see.m35046a(parcel, 4, this.f80100c, false);
        see.m35046a(parcel, 5, this.f80101d, false);
        see.m35036a(parcel, 6, this.f80102e);
        see.m35036a(parcel, 7, this.f80103f);
        see.m35046a(parcel, 8, this.f80104g, false);
        see.m35051a(parcel, 9, this.f80105h);
        see.m35051a(parcel, 10, this.f80106i);
        see.m35036a(parcel, 11, this.f80107j);
        see.m35046a(parcel, 12, this.f80108k, false);
        see.m35036a(parcel, 13, this.f80109l);
        see.m35036a(parcel, 14, this.f80110m);
        see.m35063b(parcel, 15, this.f80111n);
        see.m35051a(parcel, 16, this.f80112o);
        see.m35051a(parcel, 17, this.f80113p);
        see.m35051a(parcel, 18, this.f80114q);
        see.m35046a(parcel, 19, this.f80115r, false);
        see.m35041a(parcel, 21, this.f80116s);
        see.m35036a(parcel, 22, this.f80117t);
        see.m35065b(parcel, 23, this.f80118u, false);
        see.m35046a(parcel, 24, this.f80119v, false);
        see.m35062b(parcel, a);
    }

    public AppMetadata(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List list, String str8) {
        this.f80098a = str;
        this.f80099b = str2;
        this.f80100c = str3;
        this.f80107j = j3;
        this.f80101d = str4;
        this.f80102e = j;
        this.f80103f = j2;
        this.f80104g = str5;
        this.f80105h = z;
        this.f80106i = z2;
        this.f80108k = str6;
        this.f80109l = j4;
        this.f80110m = j5;
        this.f80111n = i;
        this.f80112o = z3;
        this.f80113p = z4;
        this.f80114q = z5;
        this.f80115r = str7;
        this.f80116s = bool;
        this.f80117t = j6;
        this.f80118u = list;
        this.f80119v = str8;
    }
}
