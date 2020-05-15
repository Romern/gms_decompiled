package com.google.android.gms.ads.internal.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.safebrowsing.SafeBrowsingConfigParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AdResponseParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0541b();

    /* renamed from: A */
    public final boolean f8634A;

    /* renamed from: B */
    public final boolean f8635B;

    /* renamed from: C */
    public final RewardItemParcel f8636C;

    /* renamed from: D */
    public final List f8637D;

    /* renamed from: E */
    public final List f8638E;

    /* renamed from: F */
    public final boolean f8639F;

    /* renamed from: G */
    public final AutoClickProtectionConfigurationParcel f8640G;

    /* renamed from: H */
    public final boolean f8641H;

    /* renamed from: I */
    public String f8642I;

    /* renamed from: J */
    public final List f8643J;

    /* renamed from: K */
    public final boolean f8644K;

    /* renamed from: L */
    public final String f8645L;

    /* renamed from: M */
    public final SafeBrowsingConfigParcel f8646M;

    /* renamed from: N */
    public final String f8647N;

    /* renamed from: O */
    public final boolean f8648O;

    /* renamed from: P */
    public final boolean f8649P;

    /* renamed from: Q */
    public Bundle f8650Q;

    /* renamed from: R */
    public final boolean f8651R;

    /* renamed from: S */
    public final int f8652S;

    /* renamed from: T */
    public final boolean f8653T;

    /* renamed from: U */
    public final List f8654U;

    /* renamed from: V */
    public final boolean f8655V;

    /* renamed from: W */
    public final String f8656W;

    /* renamed from: X */
    public String f8657X;

    /* renamed from: Y */
    public boolean f8658Y;

    /* renamed from: Z */
    public boolean f8659Z;

    /* renamed from: a */
    public final int f8660a;

    /* renamed from: aa */
    private AdRequestInfoParcel f8661aa;

    /* renamed from: b */
    public final String f8662b;

    /* renamed from: c */
    public String f8663c;

    /* renamed from: d */
    public final List f8664d;

    /* renamed from: e */
    public final int f8665e;

    /* renamed from: f */
    public final List f8666f;

    /* renamed from: g */
    public final long f8667g;

    /* renamed from: h */
    public final boolean f8668h;

    /* renamed from: i */
    public final long f8669i;

    /* renamed from: j */
    public final List f8670j;

    /* renamed from: k */
    public final long f8671k;

    /* renamed from: l */
    public final int f8672l;

    /* renamed from: m */
    public final String f8673m;

    /* renamed from: n */
    public final long f8674n;

    /* renamed from: o */
    public final String f8675o;

    /* renamed from: p */
    public final boolean f8676p;

    /* renamed from: q */
    public final String f8677q;

    /* renamed from: r */
    public final String f8678r;

    /* renamed from: s */
    public final boolean f8679s;

    /* renamed from: t */
    public final boolean f8680t;

    /* renamed from: u */
    public final boolean f8681u;

    /* renamed from: v */
    public final boolean f8682v;

    /* renamed from: w */
    public final boolean f8683w;

    /* renamed from: x */
    public LargeParcelTeleporter f8684x;

    /* renamed from: y */
    public String f8685y;

    /* renamed from: z */
    public final String f8686z;

    public AdResponseParcel(int i) {
        this(19, null, null, null, i, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null, null, false, false);
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
    public final void writeToParcel(Parcel parcel, int i) {
        AdRequestInfoParcel adRequestInfoParcel = this.f8661aa;
        if (adRequestInfoParcel != null && adRequestInfoParcel.f8601a >= 9 && !TextUtils.isEmpty(this.f8663c)) {
            this.f8684x = new LargeParcelTeleporter(new StringParcel(this.f8663c));
            this.f8663c = null;
        }
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f8660a);
        see.m35046a(parcel, 2, this.f8662b, false);
        see.m35046a(parcel, 3, this.f8663c, false);
        see.m35065b(parcel, 4, this.f8664d, false);
        see.m35063b(parcel, 5, this.f8665e);
        see.m35065b(parcel, 6, this.f8666f, false);
        see.m35036a(parcel, 7, this.f8667g);
        see.m35051a(parcel, 8, this.f8668h);
        see.m35036a(parcel, 9, this.f8669i);
        see.m35065b(parcel, 10, this.f8670j, false);
        see.m35036a(parcel, 11, this.f8671k);
        see.m35063b(parcel, 12, this.f8672l);
        see.m35046a(parcel, 13, this.f8673m, false);
        see.m35036a(parcel, 14, this.f8674n);
        see.m35046a(parcel, 15, this.f8675o, false);
        see.m35051a(parcel, 18, this.f8676p);
        see.m35046a(parcel, 19, this.f8677q, false);
        see.m35046a(parcel, 21, this.f8678r, false);
        see.m35051a(parcel, 22, this.f8679s);
        see.m35051a(parcel, 23, this.f8680t);
        see.m35051a(parcel, 24, this.f8681u);
        see.m35051a(parcel, 25, this.f8682v);
        see.m35051a(parcel, 26, this.f8683w);
        see.m35040a(parcel, 28, this.f8684x, i, false);
        see.m35046a(parcel, 29, this.f8685y, false);
        see.m35046a(parcel, 30, this.f8686z, false);
        see.m35051a(parcel, 31, this.f8634A);
        see.m35051a(parcel, 32, this.f8635B);
        see.m35040a(parcel, 33, this.f8636C, i, false);
        see.m35065b(parcel, 34, this.f8637D, false);
        see.m35065b(parcel, 35, this.f8638E, false);
        see.m35051a(parcel, 36, this.f8639F);
        see.m35040a(parcel, 37, this.f8640G, i, false);
        see.m35051a(parcel, 38, this.f8641H);
        see.m35046a(parcel, 39, this.f8642I, false);
        see.m35065b(parcel, 40, this.f8643J, false);
        see.m35051a(parcel, 42, this.f8644K);
        see.m35046a(parcel, 43, this.f8645L, false);
        see.m35040a(parcel, 44, this.f8646M, i, false);
        see.m35046a(parcel, 45, this.f8647N, false);
        see.m35051a(parcel, 46, this.f8648O);
        see.m35051a(parcel, 47, this.f8649P);
        see.m35037a(parcel, 48, this.f8650Q, false);
        see.m35051a(parcel, 49, this.f8651R);
        see.m35063b(parcel, 50, this.f8652S);
        see.m35051a(parcel, 51, this.f8653T);
        see.m35065b(parcel, 52, this.f8654U, false);
        see.m35051a(parcel, 53, this.f8655V);
        see.m35046a(parcel, 54, this.f8656W, false);
        see.m35046a(parcel, 55, this.f8657X, false);
        see.m35051a(parcel, 56, this.f8658Y);
        see.m35051a(parcel, 57, this.f8659Z);
        see.m35062b(parcel, a);
    }

    public AdResponseParcel(int i, String str, String str2, List list, int i2, List list2, long j, boolean z, long j2, List list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LargeParcelTeleporter largeParcelTeleporter, String str7, String str8, boolean z8, boolean z9, RewardItemParcel rewardItemParcel, List list4, List list5, boolean z10, AutoClickProtectionConfigurationParcel autoClickProtectionConfigurationParcel, boolean z11, String str9, List list6, boolean z12, String str10, SafeBrowsingConfigParcel safeBrowsingConfigParcel, String str11, boolean z13, boolean z14, Bundle bundle, boolean z15, int i4, boolean z16, List list7, boolean z17, String str12, String str13, boolean z18, boolean z19) {
        List list8;
        List list9;
        List list10;
        StringParcel stringParcel;
        LargeParcelTeleporter largeParcelTeleporter2 = largeParcelTeleporter;
        this.f8660a = i;
        this.f8662b = str;
        this.f8663c = str2;
        List list11 = null;
        if (list != null) {
            list8 = Collections.unmodifiableList(list);
        } else {
            list8 = null;
        }
        this.f8664d = list8;
        this.f8665e = i2;
        if (list2 != null) {
            list9 = Collections.unmodifiableList(list2);
        } else {
            list9 = null;
        }
        this.f8666f = list9;
        this.f8667g = j;
        this.f8668h = z;
        this.f8669i = j2;
        if (list3 != null) {
            list10 = Collections.unmodifiableList(list3);
        } else {
            list10 = null;
        }
        this.f8670j = list10;
        this.f8671k = j3;
        this.f8672l = i3;
        this.f8673m = str3;
        this.f8674n = j4;
        this.f8675o = str4;
        this.f8676p = z2;
        this.f8677q = str5;
        this.f8678r = str6;
        this.f8679s = z3;
        this.f8680t = z4;
        this.f8681u = z5;
        this.f8682v = z6;
        this.f8648O = z13;
        this.f8683w = z7;
        this.f8684x = largeParcelTeleporter2;
        this.f8685y = str7;
        this.f8686z = str8;
        if (this.f8663c == null && largeParcelTeleporter2 != null && (stringParcel = (StringParcel) largeParcelTeleporter2.mo6718a(StringParcel.CREATOR)) != null && !TextUtils.isEmpty(stringParcel.f8703a)) {
            this.f8663c = stringParcel.f8703a;
        }
        this.f8634A = z8;
        this.f8635B = z9;
        this.f8636C = rewardItemParcel;
        this.f8637D = list4;
        this.f8638E = list5;
        this.f8639F = z10;
        this.f8640G = autoClickProtectionConfigurationParcel;
        this.f8641H = z11;
        this.f8642I = str9;
        this.f8643J = list6;
        this.f8644K = z12;
        this.f8645L = str10;
        this.f8646M = safeBrowsingConfigParcel;
        this.f8647N = str11;
        this.f8649P = z14;
        this.f8650Q = bundle;
        this.f8651R = z15;
        this.f8652S = i4;
        this.f8653T = z16;
        this.f8654U = list7 != null ? Collections.unmodifiableList(list7) : list11;
        this.f8655V = z17;
        this.f8656W = str12;
        this.f8657X = str13;
        this.f8658Y = z18;
        this.f8659Z = z19;
    }

    public AdResponseParcel(AdRequestInfoParcel adRequestInfoParcel, String str, String str2, List list, List list2, long j, boolean z, long j2, List list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, RewardItemParcel rewardItemParcel, List list4, List list5, boolean z10, AutoClickProtectionConfigurationParcel autoClickProtectionConfigurationParcel, boolean z11, String str8, List list6, boolean z12, String str9, SafeBrowsingConfigParcel safeBrowsingConfigParcel, String str10, boolean z13, boolean z14, boolean z15, boolean z16, List list7, boolean z17, String str11, String str12, boolean z18, boolean z19) {
        this(19, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, null, null, str7, z8, z9, rewardItemParcel, list4, list5, z10, autoClickProtectionConfigurationParcel, z11, str8, list6, z12, str9, safeBrowsingConfigParcel, str10, z13, z14, null, z15, 0, z16, list7, z17, str11, str12, z18, z19);
        this.f8661aa = adRequestInfoParcel;
    }

    public AdResponseParcel(AdRequestInfoParcel adRequestInfoParcel, String str, String str2, List list, List list2, long j, boolean z, List list3, long j2, int i, String str3, long j3, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, String str6, boolean z6, boolean z7, RewardItemParcel rewardItemParcel, List list4, List list5, boolean z8, AutoClickProtectionConfigurationParcel autoClickProtectionConfigurationParcel, boolean z9, String str7, List list6, boolean z10, String str8, SafeBrowsingConfigParcel safeBrowsingConfigParcel, String str9, boolean z11, boolean z12, boolean z13, int i2, boolean z14, List list7, boolean z15, String str10, String str11, boolean z16, boolean z17) {
        this(19, str, str2, list, -2, list2, j, z, -1, list3, j2, i, str3, j3, str4, false, null, str5, z2, z3, z4, z5, false, null, null, str6, z6, z7, rewardItemParcel, list4, list5, z8, autoClickProtectionConfigurationParcel, z9, str7, list6, z10, str8, safeBrowsingConfigParcel, str9, z11, z12, null, z13, i2, z14, list7, z15, str10, str11, z16, z17);
        this.f8661aa = adRequestInfoParcel;
    }
}
