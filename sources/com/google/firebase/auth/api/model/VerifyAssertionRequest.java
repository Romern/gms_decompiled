package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VerifyAssertionRequest extends AbstractSafeParcelable implements brpy {
    public static final Parcelable.Creator CREATOR = new brrj();

    /* renamed from: a */
    public String f152556a;

    /* renamed from: b */
    public String f152557b;

    /* renamed from: c */
    public String f152558c;

    /* renamed from: d */
    public String f152559d;

    /* renamed from: e */
    public String f152560e;

    /* renamed from: f */
    public String f152561f;

    /* renamed from: g */
    public String f152562g;

    /* renamed from: h */
    public String f152563h;

    /* renamed from: i */
    public boolean f152564i;

    /* renamed from: j */
    public boolean f152565j;

    /* renamed from: k */
    public String f152566k;

    /* renamed from: l */
    public String f152567l;

    /* renamed from: m */
    public String f152568m;

    /* renamed from: n */
    public String f152569n;

    /* renamed from: o */
    public boolean f152570o;

    /* renamed from: p */
    public String f152571p;

    public VerifyAssertionRequest() {
        this.f152564i = true;
        this.f152565j = true;
    }

    /* renamed from: b */
    public final void mo72421b() {
        this.f152570o = true;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69786a() {
        bxvd da = bklb.f124686k.mo74144da();
        boolean z = this.f152564i;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bklb bklb = (bklb) da.f164949b;
        int i = bklb.f124688a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bklb.f124688a = i;
        bklb.f124693f = z;
        boolean z2 = this.f152565j;
        int i2 = i | 1024;
        bklb.f124688a = i2;
        bklb.f124695h = z2;
        String str = this.f152557b;
        if (str != null) {
            str.getClass();
            i2 |= 128;
            bklb.f124688a = i2;
            bklb.f124692e = str;
        }
        String str2 = this.f152556a;
        if (str2 != null) {
            str2.getClass();
            i2 |= 1;
            bklb.f124688a = i2;
            bklb.f124689b = str2;
        }
        String str3 = this.f152562g;
        if (str3 != null) {
            str3.getClass();
            i2 |= 2;
            bklb.f124688a = i2;
            bklb.f124690c = str3;
        }
        String str4 = this.f152569n;
        if (str4 != null) {
            str4.getClass();
            i2 |= 2048;
            bklb.f124688a = i2;
            bklb.f124696i = str4;
        }
        String str5 = this.f152571p;
        if (str5 != null) {
            str5.getClass();
            bklb.f124688a = i2 | 4096;
            bklb.f124697j = str5;
        }
        if (!TextUtils.isEmpty(this.f152567l)) {
            String str6 = this.f152567l;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bklb bklb2 = (bklb) da.f164949b;
            str6.getClass();
            bklb2.f124688a |= 16;
            bklb2.f124691d = str6;
        }
        if (!TextUtils.isEmpty(this.f152568m)) {
            String str7 = this.f152568m;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bklb bklb3 = (bklb) da.f164949b;
            str7.getClass();
            bklb3.f124688a |= 1;
            bklb3.f124689b = str7;
        }
        boolean z3 = this.f152570o;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bklb bklb4 = (bklb) da.f164949b;
        bklb4.f124688a |= 512;
        bklb4.f124694g = z3;
        return (bklb) da.mo74062i();
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
        see.m35046a(parcel, 2, this.f152556a, false);
        see.m35046a(parcel, 3, this.f152557b, false);
        see.m35046a(parcel, 4, this.f152558c, false);
        see.m35046a(parcel, 5, this.f152559d, false);
        see.m35046a(parcel, 6, this.f152560e, false);
        see.m35046a(parcel, 7, this.f152561f, false);
        see.m35046a(parcel, 8, this.f152562g, false);
        see.m35046a(parcel, 9, this.f152563h, false);
        see.m35051a(parcel, 10, this.f152564i);
        see.m35051a(parcel, 11, this.f152565j);
        see.m35046a(parcel, 12, this.f152566k, false);
        see.m35046a(parcel, 13, this.f152567l, false);
        see.m35046a(parcel, 14, this.f152568m, false);
        see.m35046a(parcel, 15, this.f152569n, false);
        see.m35051a(parcel, 16, this.f152570o);
        see.m35046a(parcel, 17, this.f152571p, false);
        see.m35062b(parcel, a);
    }

    public VerifyAssertionRequest(brrt brrt, String str) {
        sdo.m34959a(brrt);
        String str2 = brrt.f143281a;
        sdo.m34977c(str2);
        this.f152567l = str2;
        sdo.m34977c(str);
        this.f152568m = str;
        String str3 = brrt.f143283c;
        sdo.m34977c(str3);
        this.f152560e = str3;
        this.f152564i = true;
        this.f152562g = "providerId=" + this.f152560e;
    }

    public VerifyAssertionRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, String str11, String str12, boolean z3, String str13) {
        this.f152556a = str;
        this.f152557b = str2;
        this.f152558c = str3;
        this.f152559d = str4;
        this.f152560e = str5;
        this.f152561f = str6;
        this.f152562g = str7;
        this.f152563h = str8;
        this.f152564i = z;
        this.f152565j = z2;
        this.f152566k = str9;
        this.f152567l = str10;
        this.f152568m = str11;
        this.f152569n = str12;
        this.f152570o = z3;
        this.f152571p = str13;
    }
}
