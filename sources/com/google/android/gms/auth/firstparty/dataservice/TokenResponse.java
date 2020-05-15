package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.AuthzenBeginTxData;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TokenResponse extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new iyd();

    /* renamed from: A */
    public AuthzenBeginTxData f10723A;

    /* renamed from: a */
    final int f10724a;
    @Deprecated

    /* renamed from: b */
    String f10725b;

    /* renamed from: c */
    String f10726c;
    @Deprecated

    /* renamed from: d */
    public String f10727d;

    /* renamed from: e */
    public String f10728e;

    /* renamed from: f */
    public String f10729f;

    /* renamed from: g */
    public String f10730g;

    /* renamed from: h */
    public String f10731h;

    /* renamed from: i */
    public String f10732i;

    /* renamed from: j */
    public boolean f10733j;

    /* renamed from: k */
    public boolean f10734k;

    /* renamed from: l */
    public boolean f10735l;

    /* renamed from: m */
    public boolean f10736m;

    /* renamed from: n */
    public CaptchaChallenge f10737n;

    /* renamed from: o */
    public List f10738o;

    /* renamed from: p */
    public String f10739p;

    /* renamed from: q */
    public String f10740q;

    /* renamed from: r */
    public boolean f10741r;

    /* renamed from: s */
    public int f10742s;

    /* renamed from: t */
    PostSignInData f10743t;

    /* renamed from: u */
    public Account f10744u;

    /* renamed from: v */
    public String f10745v;

    /* renamed from: w */
    public TokenData f10746w;

    /* renamed from: x */
    public Bundle f10747x;

    /* renamed from: y */
    public String f10748y;

    /* renamed from: z */
    public ResolutionData f10749z;

    public TokenResponse() {
        this.f10747x = new Bundle();
        this.f10724a = 8;
        this.f10738o = new ArrayList();
    }

    @Deprecated
    /* renamed from: a */
    public final String mo7643a() {
        Account account = this.f10744u;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo7645a(TokenData tokenData) {
        if (tokenData != null) {
            this.f10727d = tokenData.f9944b;
        } else {
            tokenData = null;
            this.f10727d = null;
        }
        this.f10746w = tokenData;
    }

    /* renamed from: b */
    public final izj mo7647b() {
        return izj.m16369c(this.f10726c);
    }

    /* renamed from: c */
    public final List mo7648c() {
        return Collections.unmodifiableList(this.f10738o);
    }

    /* renamed from: a */
    public final void mo7644a(Account account) {
        sdo.checkIfNull(account, "Account can't be null.");
        this.f10744u = account;
        this.f10725b = account.name;
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
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10724a);
        see.m35046a(parcel, 2, this.f10725b, false);
        see.m35046a(parcel, 3, this.f10726c, false);
        see.m35046a(parcel, 4, this.f10727d, false);
        see.m35046a(parcel, 5, this.f10728e, false);
        see.m35046a(parcel, 6, this.f10729f, false);
        see.m35046a(parcel, 7, this.f10730g, false);
        see.m35046a(parcel, 8, this.f10731h, false);
        see.m35046a(parcel, 9, this.f10732i, false);
        see.m35051a(parcel, 10, this.f10733j);
        see.m35051a(parcel, 11, this.f10734k);
        see.m35051a(parcel, 12, this.f10735l);
        see.m35051a(parcel, 13, this.f10736m);
        see.m35040a(parcel, 14, this.f10737n, i, false);
        see.m35066c(parcel, 15, this.f10738o, false);
        see.m35046a(parcel, 16, this.f10739p, false);
        see.m35046a(parcel, 17, this.f10740q, false);
        see.m35051a(parcel, 19, this.f10741r);
        see.m35063b(parcel, 20, this.f10742s);
        see.m35040a(parcel, 21, this.f10743t, i, false);
        see.m35040a(parcel, 22, this.f10744u, i, false);
        see.m35046a(parcel, 26, this.f10745v, false);
        see.m35040a(parcel, 27, this.f10746w, i, false);
        see.m35037a(parcel, 28, this.f10747x, false);
        see.m35046a(parcel, 29, this.f10748y, false);
        see.m35040a(parcel, 30, this.f10749z, i, false);
        see.m35040a(parcel, 31, this.f10723A, i, false);
        see.m35062b(parcel, a);
    }

    public TokenResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, CaptchaChallenge captchaChallenge, List list, String str9, String str10, boolean z5, int i2, PostSignInData postSignInData, Account account, String str11, TokenData tokenData, Bundle bundle, String str12, ResolutionData resolutionData, AuthzenBeginTxData authzenBeginTxData) {
        List list2;
        String str13 = str3;
        Account account2 = account;
        TokenData tokenData2 = tokenData;
        this.f10747x = new Bundle();
        this.f10724a = i;
        this.f10726c = str2;
        this.f10727d = str13;
        this.f10728e = str4;
        this.f10729f = str5;
        this.f10730g = str6;
        this.f10731h = str7;
        this.f10732i = str8;
        this.f10733j = z;
        this.f10734k = z2;
        this.f10735l = z3;
        this.f10736m = z4;
        this.f10737n = captchaChallenge;
        if (list == null) {
            list2 = new ArrayList();
        } else {
            list2 = list;
        }
        this.f10738o = list2;
        this.f10739p = str9;
        this.f10740q = str10;
        this.f10741r = z5;
        this.f10742s = i2;
        this.f10743t = postSignInData;
        this.f10745v = str11;
        this.f10747x = bundle;
        this.f10748y = str12;
        this.f10749z = resolutionData;
        this.f10723A = authzenBeginTxData;
        if (account2 != null) {
            mo7644a(account2);
        } else if (!TextUtils.isEmpty(str)) {
            mo7644a(new Account(str, "com.google"));
        } else {
            this.f10725b = null;
            this.f10744u = null;
        }
        if (str13 != null && tokenData2 == null) {
            giq giq = new giq();
            giq.f18307a = str13;
            mo7645a(giq.mo11915a());
            return;
        }
        mo7645a(tokenData2);
    }

    /* renamed from: a */
    public final void mo7646a(izj izj) {
        sdo.m34959a(izj);
        this.f10726c = izj.f22000ac;
    }
}
