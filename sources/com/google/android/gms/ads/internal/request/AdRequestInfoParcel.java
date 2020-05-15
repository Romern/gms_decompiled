package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.IconAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.instream.InstreamAdConfigurationParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AdRequestInfoParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0540a();

    /* renamed from: A */
    public final long f8575A;

    /* renamed from: B */
    public final String f8576B;

    /* renamed from: C */
    public final float f8577C;

    /* renamed from: D */
    public final int f8578D;

    /* renamed from: E */
    public final int f8579E;

    /* renamed from: F */
    public final boolean f8580F;

    /* renamed from: G */
    public final boolean f8581G;

    /* renamed from: H */
    public final String f8582H;

    /* renamed from: I */
    public final boolean f8583I;

    /* renamed from: J */
    public final String f8584J;

    /* renamed from: K */
    public final boolean f8585K;

    /* renamed from: L */
    public final int f8586L;

    /* renamed from: M */
    public final Bundle f8587M;

    /* renamed from: N */
    public final String f8588N;

    /* renamed from: O */
    public final IconAdOptionsParcel f8589O;

    /* renamed from: P */
    public final boolean f8590P;

    /* renamed from: Q */
    public final Bundle f8591Q;

    /* renamed from: R */
    public final String f8592R;

    /* renamed from: S */
    public final String f8593S;

    /* renamed from: T */
    public final String f8594T;

    /* renamed from: U */
    public final boolean f8595U;

    /* renamed from: V */
    public final List f8596V;

    /* renamed from: W */
    public final String f8597W;

    /* renamed from: X */
    public final List f8598X;

    /* renamed from: Y */
    public final int f8599Y;

    /* renamed from: Z */
    public final boolean f8600Z;

    /* renamed from: a */
    public final int f8601a;

    /* renamed from: aa */
    public final boolean f8602aa;

    /* renamed from: ab */
    public final boolean f8603ab;

    /* renamed from: ac */
    public final ArrayList f8604ac;

    /* renamed from: ad */
    public final String f8605ad;

    /* renamed from: ae */
    public final InstreamAdConfigurationParcel f8606ae;

    /* renamed from: af */
    public final String f8607af;

    /* renamed from: ag */
    public final Bundle f8608ag;

    /* renamed from: b */
    public final Bundle f8609b;

    /* renamed from: c */
    public final AdRequestParcel f8610c;

    /* renamed from: d */
    public final AdSizeParcel f8611d;

    /* renamed from: e */
    public final String f8612e;

    /* renamed from: f */
    public final ApplicationInfo f8613f;

    /* renamed from: g */
    public final PackageInfo f8614g;

    /* renamed from: h */
    public final String f8615h;

    /* renamed from: i */
    public final String f8616i;

    /* renamed from: j */
    public final String f8617j;

    /* renamed from: k */
    public final VersionInfoParcel f8618k;

    /* renamed from: l */
    public final Bundle f8619l;

    /* renamed from: m */
    public final int f8620m;

    /* renamed from: n */
    public final List f8621n;

    /* renamed from: o */
    public final Bundle f8622o;

    /* renamed from: p */
    public final boolean f8623p;

    /* renamed from: q */
    public final int f8624q;

    /* renamed from: r */
    public final int f8625r;

    /* renamed from: s */
    public final float f8626s;

    /* renamed from: t */
    public final String f8627t;

    /* renamed from: u */
    public final long f8628u;

    /* renamed from: v */
    public final String f8629v;

    /* renamed from: w */
    public final List f8630w;

    /* renamed from: x */
    public final String f8631x;

    /* renamed from: y */
    public final NativeAdOptionsParcel f8632y;

    /* renamed from: z */
    public final List f8633z;

    public AdRequestInfoParcel(int i, Bundle bundle, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, VersionInfoParcel versionInfoParcel, Bundle bundle2, int i2, List list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List list2, String str7, NativeAdOptionsParcel nativeAdOptionsParcel, List list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, boolean z4, String str9, String str10, boolean z5, int i7, Bundle bundle4, String str11, IconAdOptionsParcel iconAdOptionsParcel, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List list4, String str15, List list5, int i8, boolean z8, boolean z9, boolean z10, ArrayList arrayList, String str16, InstreamAdConfigurationParcel instreamAdConfigurationParcel, String str17, Bundle bundle6) {
        List list6;
        this.f8601a = i;
        this.f8609b = bundle;
        this.f8610c = adRequestParcel;
        this.f8611d = adSizeParcel;
        this.f8612e = str;
        this.f8613f = applicationInfo;
        this.f8614g = packageInfo;
        this.f8615h = str2;
        this.f8616i = str3;
        this.f8617j = str4;
        this.f8618k = versionInfoParcel;
        this.f8619l = bundle2;
        this.f8620m = i2;
        this.f8621n = list;
        this.f8633z = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.f8622o = bundle3;
        this.f8623p = z;
        this.f8624q = i3;
        this.f8625r = i4;
        this.f8626s = f;
        this.f8627t = str5;
        this.f8628u = j;
        this.f8629v = str6;
        if (list2 == null) {
            list6 = Collections.emptyList();
        } else {
            list6 = Collections.unmodifiableList(list2);
        }
        this.f8630w = list6;
        this.f8631x = str7;
        this.f8632y = nativeAdOptionsParcel;
        this.f8575A = j2;
        this.f8576B = str8;
        this.f8577C = f2;
        this.f8583I = z2;
        this.f8578D = i5;
        this.f8579E = i6;
        this.f8580F = z3;
        this.f8581G = z4;
        this.f8582H = str9;
        this.f8584J = str10;
        this.f8585K = z5;
        this.f8586L = i7;
        this.f8587M = bundle4;
        this.f8588N = str11;
        this.f8589O = iconAdOptionsParcel;
        this.f8590P = z6;
        this.f8591Q = bundle5;
        this.f8592R = str12;
        this.f8593S = str13;
        this.f8594T = str14;
        this.f8595U = z7;
        this.f8596V = list4;
        this.f8597W = str15;
        this.f8598X = list5;
        this.f8599Y = i8;
        this.f8600Z = z8;
        this.f8602aa = z9;
        this.f8603ab = z10;
        this.f8604ac = arrayList;
        this.f8605ad = str16;
        this.f8606ae = instreamAdConfigurationParcel;
        this.f8607af = str17;
        this.f8608ag = bundle6;
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.util.List, boolean):void
     arg types: [android.os.Parcel, int, java.util.List, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f8601a);
        see.m35037a(parcel, 2, this.f8609b, false);
        see.m35040a(parcel, 3, this.f8610c, i, false);
        see.m35040a(parcel, 4, this.f8611d, i, false);
        see.m35046a(parcel, 5, this.f8612e, false);
        see.m35040a(parcel, 6, this.f8613f, i, false);
        see.m35040a(parcel, 7, this.f8614g, i, false);
        see.m35046a(parcel, 8, this.f8615h, false);
        see.m35046a(parcel, 9, this.f8616i, false);
        see.m35046a(parcel, 10, this.f8617j, false);
        see.m35040a(parcel, 11, this.f8618k, i, false);
        see.m35037a(parcel, 12, this.f8619l, false);
        see.m35063b(parcel, 13, this.f8620m);
        see.m35065b(parcel, 14, this.f8621n, false);
        see.m35037a(parcel, 15, this.f8622o, false);
        see.m35051a(parcel, 16, this.f8623p);
        see.m35063b(parcel, 18, this.f8624q);
        see.m35063b(parcel, 19, this.f8625r);
        see.m35034a(parcel, 20, this.f8626s);
        see.m35046a(parcel, 21, this.f8627t, false);
        see.m35036a(parcel, 25, this.f8628u);
        see.m35046a(parcel, 26, this.f8629v, false);
        see.m35065b(parcel, 27, this.f8630w, false);
        see.m35046a(parcel, 28, this.f8631x, false);
        see.m35040a(parcel, 29, this.f8632y, i, false);
        see.m35065b(parcel, 30, this.f8633z, false);
        see.m35036a(parcel, 31, this.f8575A);
        see.m35046a(parcel, 33, this.f8576B, false);
        see.m35034a(parcel, 34, this.f8577C);
        see.m35063b(parcel, 35, this.f8578D);
        see.m35063b(parcel, 36, this.f8579E);
        see.m35051a(parcel, 37, this.f8580F);
        see.m35051a(parcel, 38, this.f8581G);
        see.m35046a(parcel, 39, this.f8582H, false);
        see.m35051a(parcel, 40, this.f8583I);
        see.m35046a(parcel, 41, this.f8584J, false);
        see.m35051a(parcel, 42, this.f8585K);
        see.m35063b(parcel, 43, this.f8586L);
        see.m35037a(parcel, 44, this.f8587M, false);
        see.m35046a(parcel, 45, this.f8588N, false);
        see.m35040a(parcel, 46, this.f8589O, i, false);
        see.m35051a(parcel, 47, this.f8590P);
        see.m35037a(parcel, 48, this.f8591Q, false);
        see.m35046a(parcel, 49, this.f8592R, false);
        see.m35046a(parcel, 50, this.f8593S, false);
        see.m35046a(parcel, 51, this.f8594T, false);
        see.m35051a(parcel, 52, this.f8595U);
        see.m35049a(parcel, 53, this.f8596V, false);
        see.m35046a(parcel, 54, this.f8597W, false);
        see.m35065b(parcel, 55, this.f8598X, false);
        see.m35063b(parcel, 56, this.f8599Y);
        see.m35051a(parcel, 57, this.f8600Z);
        see.m35051a(parcel, 58, this.f8602aa);
        see.m35051a(parcel, 59, this.f8603ab);
        see.m35065b(parcel, 60, this.f8604ac, false);
        see.m35046a(parcel, 61, this.f8605ad, false);
        see.m35040a(parcel, 63, this.f8606ae, i, false);
        see.m35046a(parcel, 64, this.f8607af, false);
        see.m35037a(parcel, 65, this.f8608ag, false);
        see.m35062b(parcel, a);
    }
}
