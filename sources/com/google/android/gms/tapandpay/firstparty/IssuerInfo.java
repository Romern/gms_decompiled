package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IssuerInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asod();

    /* renamed from: a */
    public String f108388a;

    /* renamed from: b */
    public String f108389b;

    /* renamed from: c */
    public String f108390c;

    /* renamed from: d */
    public String f108391d;

    /* renamed from: e */
    public String f108392e;

    /* renamed from: f */
    public String f108393f;

    /* renamed from: g */
    public String f108394g;

    /* renamed from: h */
    public String f108395h;

    /* renamed from: i */
    public String f108396i;

    /* renamed from: j */
    public String f108397j;

    /* renamed from: k */
    public String f108398k;

    /* renamed from: l */
    public String f108399l;

    /* renamed from: m */
    public String f108400m;

    /* renamed from: n */
    public long f108401n;

    /* renamed from: o */
    public String f108402o;

    /* renamed from: p */
    public String f108403p;

    /* renamed from: q */
    public String f108404q;

    /* renamed from: r */
    public String f108405r;

    /* renamed from: s */
    public String f108406s;

    /* renamed from: t */
    public String f108407t;

    /* renamed from: u */
    public String f108408u;

    /* renamed from: v */
    public int f108409v;

    public IssuerInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i) {
        this.f108388a = str;
        this.f108389b = str2;
        this.f108390c = str3;
        this.f108391d = str4;
        this.f108392e = str5;
        this.f108393f = str6;
        this.f108394g = str7;
        this.f108395h = str8;
        this.f108396i = str9;
        this.f108397j = str10;
        this.f108398k = str11;
        this.f108399l = str12;
        this.f108400m = str13;
        this.f108401n = j;
        this.f108402o = str14;
        this.f108403p = str15;
        this.f108404q = str16;
        this.f108405r = str17;
        this.f108406s = str18;
        this.f108407t = str19;
        this.f108408u = str20;
        this.f108409v = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IssuerInfo) {
            IssuerInfo issuerInfo = (IssuerInfo) obj;
            if (!sdg.m34949a(this.f108388a, issuerInfo.f108388a) || !sdg.m34949a(this.f108389b, issuerInfo.f108389b) || !sdg.m34949a(this.f108390c, issuerInfo.f108390c) || !sdg.m34949a(this.f108391d, issuerInfo.f108391d) || !sdg.m34949a(this.f108392e, issuerInfo.f108392e) || !sdg.m34949a(this.f108393f, issuerInfo.f108393f) || !sdg.m34949a(this.f108394g, issuerInfo.f108394g) || !sdg.m34949a(this.f108395h, issuerInfo.f108395h) || !sdg.m34949a(this.f108396i, issuerInfo.f108396i) || !sdg.m34949a(this.f108397j, issuerInfo.f108397j) || !sdg.m34949a(this.f108398k, issuerInfo.f108398k) || !sdg.m34949a(this.f108399l, issuerInfo.f108399l) || !sdg.m34949a(this.f108400m, issuerInfo.f108400m) || this.f108401n != issuerInfo.f108401n || !sdg.m34949a(this.f108402o, issuerInfo.f108402o) || !sdg.m34949a(this.f108403p, issuerInfo.f108403p) || !sdg.m34949a(this.f108404q, issuerInfo.f108404q) || !sdg.m34949a(this.f108405r, issuerInfo.f108405r) || !sdg.m34949a(this.f108406s, issuerInfo.f108406s) || !sdg.m34949a(this.f108407t, issuerInfo.f108407t) || !sdg.m34949a(this.f108408u, issuerInfo.f108408u) || !sdg.m34949a(Integer.valueOf(this.f108409v), Integer.valueOf(issuerInfo.f108409v))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f108388a, this.f108389b, this.f108390c, this.f108391d, this.f108392e, this.f108393f, this.f108394g, this.f108395h, this.f108396i, this.f108397j, this.f108398k, this.f108399l, this.f108400m, Long.valueOf(this.f108401n), this.f108402o, this.f108403p, this.f108404q, this.f108405r, this.f108406s, this.f108407t, this.f108408u, Integer.valueOf(this.f108409v)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("issuerName", this.f108388a);
        a.mo25396a("issuerPhoneNumber", this.f108389b);
        a.mo25396a("appLogoUrl", this.f108390c);
        a.mo25396a("appName", this.f108391d);
        a.mo25396a("appDeveloperName", this.f108392e);
        a.mo25396a("appPackageName", this.f108393f);
        a.mo25396a("privacyNoticeUrl", this.f108394g);
        a.mo25396a("termsAndConditionsUrl", this.f108395h);
        a.mo25396a("productShortName", this.f108396i);
        a.mo25396a("appAction", this.f108397j);
        a.mo25396a("appIntentExtraMessage", this.f108398k);
        a.mo25396a("issuerMessageHeadline", this.f108399l);
        a.mo25396a("issuerMessageBody", this.f108400m);
        a.mo25396a("issuerMessageExpiryTimestampMillis", Long.valueOf(this.f108401n));
        a.mo25396a("issuerMessageLinkPackageName", this.f108402o);
        a.mo25396a("issuerMessageLinkAction", this.f108403p);
        a.mo25396a("issuerMessageLinkExtraText", this.f108404q);
        a.mo25396a("issuerMessageLinkUrl", this.f108405r);
        a.mo25396a("issuerMessageLinkText", this.f108406s);
        a.mo25396a("issuerWebLinkUrl", this.f108407t);
        a.mo25396a("issuerWebLinkText", this.f108408u);
        a.mo25396a("issuerMessageType", Integer.valueOf(this.f108409v));
        return a.toString();
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
        see.m35046a(parcel, 2, this.f108388a, false);
        see.m35046a(parcel, 3, this.f108389b, false);
        see.m35046a(parcel, 4, this.f108390c, false);
        see.m35046a(parcel, 5, this.f108391d, false);
        see.m35046a(parcel, 6, this.f108392e, false);
        see.m35046a(parcel, 7, this.f108393f, false);
        see.m35046a(parcel, 8, this.f108394g, false);
        see.m35046a(parcel, 9, this.f108395h, false);
        see.m35046a(parcel, 10, this.f108396i, false);
        see.m35046a(parcel, 11, this.f108397j, false);
        see.m35046a(parcel, 12, this.f108398k, false);
        see.m35046a(parcel, 13, this.f108399l, false);
        see.m35046a(parcel, 14, this.f108400m, false);
        see.m35036a(parcel, 15, this.f108401n);
        see.m35046a(parcel, 16, this.f108402o, false);
        see.m35046a(parcel, 17, this.f108403p, false);
        see.m35046a(parcel, 18, this.f108404q, false);
        see.m35046a(parcel, 20, this.f108405r, false);
        see.m35046a(parcel, 21, this.f108406s, false);
        see.m35046a(parcel, 22, this.f108407t, false);
        see.m35046a(parcel, 23, this.f108408u, false);
        see.m35063b(parcel, 24, this.f108409v);
        see.m35062b(parcel, a);
    }
}
