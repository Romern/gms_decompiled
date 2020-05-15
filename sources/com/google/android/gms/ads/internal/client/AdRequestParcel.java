package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AdRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0339f();

    /* renamed from: a */
    public final int f8118a;
    @Deprecated

    /* renamed from: b */
    public final long f8119b;

    /* renamed from: c */
    public final Bundle f8120c;
    @Deprecated

    /* renamed from: d */
    public final int f8121d;

    /* renamed from: e */
    public final List f8122e;

    /* renamed from: f */
    public final boolean f8123f;

    /* renamed from: g */
    public final int f8124g;

    /* renamed from: h */
    public final boolean f8125h;

    /* renamed from: i */
    public final String f8126i;

    /* renamed from: j */
    public final SearchAdRequestParcel f8127j;

    /* renamed from: k */
    public final Location f8128k;

    /* renamed from: l */
    public final String f8129l;

    /* renamed from: m */
    public final Bundle f8130m;

    /* renamed from: n */
    public final Bundle f8131n;

    /* renamed from: o */
    public final List f8132o;

    /* renamed from: p */
    public final String f8133p;

    /* renamed from: q */
    public final String f8134q;
    @Deprecated

    /* renamed from: r */
    public final boolean f8135r;

    /* renamed from: s */
    public final AdDataParcel f8136s;

    /* renamed from: t */
    public final int f8137t;

    /* renamed from: u */
    public final String f8138u;

    /* renamed from: v */
    public final List f8139v;

    public AdRequestParcel(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, SearchAdRequestParcel searchAdRequestParcel, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z3, AdDataParcel adDataParcel, int i4, String str5, List list3) {
        Bundle bundle4;
        Bundle bundle5;
        this.f8118a = i;
        this.f8119b = j;
        if (bundle == null) {
            bundle4 = new Bundle();
        } else {
            bundle4 = bundle;
        }
        this.f8120c = bundle4;
        this.f8121d = i2;
        this.f8122e = list;
        this.f8123f = z;
        this.f8124g = i3;
        this.f8125h = z2;
        this.f8126i = str;
        this.f8127j = searchAdRequestParcel;
        this.f8128k = location;
        this.f8129l = str2;
        if (bundle2 == null) {
            bundle5 = new Bundle();
        } else {
            bundle5 = bundle2;
        }
        this.f8130m = bundle5;
        this.f8131n = bundle3;
        this.f8132o = list2;
        this.f8133p = str3;
        this.f8134q = str4;
        this.f8135r = z3;
        this.f8136s = adDataParcel;
        this.f8137t = i4;
        this.f8138u = str5;
        this.f8139v = list3 == null ? new ArrayList() : list3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AdRequestParcel) {
            AdRequestParcel adRequestParcel = (AdRequestParcel) obj;
            if (this.f8118a != adRequestParcel.f8118a || this.f8119b != adRequestParcel.f8119b || !sdg.m34949a(this.f8120c, adRequestParcel.f8120c) || this.f8121d != adRequestParcel.f8121d || !sdg.m34949a(this.f8122e, adRequestParcel.f8122e) || this.f8123f != adRequestParcel.f8123f || this.f8124g != adRequestParcel.f8124g || this.f8125h != adRequestParcel.f8125h || !sdg.m34949a(this.f8126i, adRequestParcel.f8126i) || !sdg.m34949a(this.f8127j, adRequestParcel.f8127j) || !sdg.m34949a(this.f8128k, adRequestParcel.f8128k) || !sdg.m34949a(this.f8129l, adRequestParcel.f8129l) || !sdg.m34949a(this.f8130m, adRequestParcel.f8130m) || !sdg.m34949a(this.f8131n, adRequestParcel.f8131n) || !sdg.m34949a(this.f8132o, adRequestParcel.f8132o) || !sdg.m34949a(this.f8133p, adRequestParcel.f8133p) || !sdg.m34949a(this.f8134q, adRequestParcel.f8134q) || this.f8135r != adRequestParcel.f8135r || this.f8137t != adRequestParcel.f8137t || !sdg.m34949a(this.f8138u, adRequestParcel.f8138u) || !sdg.m34949a(this.f8139v, adRequestParcel.f8139v)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8118a), Long.valueOf(this.f8119b), this.f8120c, Integer.valueOf(this.f8121d), this.f8122e, Boolean.valueOf(this.f8123f), Integer.valueOf(this.f8124g), Boolean.valueOf(this.f8125h), this.f8126i, this.f8127j, this.f8128k, this.f8129l, this.f8130m, this.f8131n, this.f8132o, this.f8133p, this.f8134q, Boolean.valueOf(this.f8135r), Integer.valueOf(this.f8137t), this.f8138u, this.f8139v});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
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
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
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
        see.m35063b(parcel, 1, this.f8118a);
        see.m35036a(parcel, 2, this.f8119b);
        see.m35037a(parcel, 3, this.f8120c, false);
        see.m35063b(parcel, 4, this.f8121d);
        see.m35065b(parcel, 5, this.f8122e, false);
        see.m35051a(parcel, 6, this.f8123f);
        see.m35063b(parcel, 7, this.f8124g);
        see.m35051a(parcel, 8, this.f8125h);
        see.m35046a(parcel, 9, this.f8126i, false);
        see.m35040a(parcel, 10, this.f8127j, i, false);
        see.m35040a(parcel, 11, this.f8128k, i, false);
        see.m35046a(parcel, 12, this.f8129l, false);
        see.m35037a(parcel, 13, this.f8130m, false);
        see.m35037a(parcel, 14, this.f8131n, false);
        see.m35065b(parcel, 15, this.f8132o, false);
        see.m35046a(parcel, 16, this.f8133p, false);
        see.m35046a(parcel, 17, this.f8134q, false);
        see.m35051a(parcel, 18, this.f8135r);
        see.m35040a(parcel, 19, this.f8136s, i, false);
        see.m35063b(parcel, 20, this.f8137t);
        see.m35046a(parcel, 21, this.f8138u, false);
        see.m35065b(parcel, 22, this.f8139v, false);
        see.m35062b(parcel, a);
    }
}
