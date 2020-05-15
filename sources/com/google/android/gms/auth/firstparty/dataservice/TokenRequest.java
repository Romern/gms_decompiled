package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new iyc();

    /* renamed from: a */
    final int f10705a;

    /* renamed from: b */
    public String f10706b;

    /* renamed from: c */
    public String f10707c;

    /* renamed from: d */
    Bundle f10708d;

    /* renamed from: e */
    public FACLConfig f10709e;

    /* renamed from: f */
    public PACLConfig f10710f;

    /* renamed from: g */
    public boolean f10711g;

    /* renamed from: h */
    public boolean f10712h;

    /* renamed from: i */
    String f10713i;

    /* renamed from: j */
    public AppDescription f10714j;

    /* renamed from: k */
    public CaptchaSolution f10715k;

    /* renamed from: l */
    public boolean f10716l;

    /* renamed from: m */
    public boolean f10717m;

    /* renamed from: n */
    public String f10718n;

    /* renamed from: o */
    public int f10719o;

    /* renamed from: p */
    public String f10720p;

    /* renamed from: q */
    public String f10721q;

    /* renamed from: r */
    public String f10722r;

    public TokenRequest(int i, String str, String str2, Bundle bundle, FACLConfig fACLConfig, PACLConfig pACLConfig, boolean z, boolean z2, String str3, AppDescription appDescription, CaptchaSolution captchaSolution, boolean z3, boolean z4, String str4, int i2, String str5, String str6, String str7) {
        this.f10708d = new Bundle();
        iyb.UNKNOWN.toString();
        this.f10705a = i;
        this.f10706b = str;
        this.f10707c = str2;
        this.f10708d = bundle;
        this.f10709e = fACLConfig;
        this.f10710f = pACLConfig;
        this.f10711g = z;
        this.f10712h = z2;
        this.f10713i = str3;
        this.f10714j = appDescription;
        this.f10715k = captchaSolution;
        this.f10716l = z3;
        this.f10717m = z4;
        this.f10718n = str4;
        this.f10719o = i2;
        this.f10720p = str5;
        this.f10721q = str6;
        this.f10722r = str7;
    }

    /* renamed from: a */
    public final Account mo7637a() {
        if (!TextUtils.isEmpty(this.f10707c)) {
            return new Account(this.f10707c, this.f10718n);
        }
        return null;
    }

    /* renamed from: b */
    public final Bundle mo7640b() {
        return new Bundle(this.f10708d);
    }

    /* renamed from: c */
    public final iyb mo7641c() {
        return iyb.m16329a(this.f10713i);
    }

    /* renamed from: a */
    public final void mo7638a(Bundle bundle) {
        this.f10708d.clear();
        if (bundle != null) {
            this.f10708d.putAll(bundle);
        }
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
        see.m35063b(parcel, 1, this.f10705a);
        see.m35046a(parcel, 2, this.f10706b, false);
        see.m35046a(parcel, 3, this.f10707c, false);
        see.m35037a(parcel, 4, this.f10708d, false);
        see.m35040a(parcel, 5, this.f10709e, i, false);
        see.m35040a(parcel, 6, this.f10710f, i, false);
        see.m35051a(parcel, 7, this.f10711g);
        see.m35051a(parcel, 8, this.f10712h);
        see.m35046a(parcel, 9, this.f10713i, false);
        see.m35040a(parcel, 10, this.f10714j, i, false);
        see.m35040a(parcel, 11, this.f10715k, i, false);
        see.m35051a(parcel, 13, this.f10716l);
        see.m35051a(parcel, 14, this.f10717m);
        see.m35046a(parcel, 15, this.f10718n, false);
        see.m35063b(parcel, 16, this.f10719o);
        see.m35046a(parcel, 17, this.f10720p, false);
        see.m35046a(parcel, 18, this.f10721q, false);
        see.m35046a(parcel, 19, this.f10722r, false);
        see.m35062b(parcel, a);
    }

    public TokenRequest(Account account, String str) {
        this(account.name, account.type, str);
    }

    /* renamed from: a */
    public final void mo7639a(iyb iyb) {
        sdo.checkIfNull(iyb, " Consent cannot be null");
        this.f10713i = iyb.toString();
    }

    @Deprecated
    public TokenRequest(String str, String str2, String str3) {
        this.f10708d = new Bundle();
        this.f10713i = iyb.UNKNOWN.toString();
        this.f10716l = false;
        this.f10717m = true;
        this.f10719o = 0;
        this.f10705a = 5;
        this.f10707c = str;
        this.f10718n = str2;
        this.f10706b = str3;
    }
}
