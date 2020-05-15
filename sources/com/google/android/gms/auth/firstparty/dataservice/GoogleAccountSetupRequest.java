package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleAccountSetupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ixm();

    /* renamed from: a */
    final int f10635a;

    /* renamed from: b */
    Bundle f10636b;

    /* renamed from: c */
    public boolean f10637c;

    /* renamed from: d */
    public boolean f10638d;

    /* renamed from: e */
    boolean f10639e;

    /* renamed from: f */
    public String f10640f;

    /* renamed from: g */
    public String f10641g;

    /* renamed from: h */
    public String f10642h;

    /* renamed from: i */
    String f10643i;

    /* renamed from: j */
    boolean f10644j;

    /* renamed from: k */
    boolean f10645k;

    /* renamed from: l */
    public boolean f10646l;

    /* renamed from: m */
    String f10647m;

    /* renamed from: n */
    public AppDescription f10648n;

    /* renamed from: o */
    public AccountCredentials f10649o;

    /* renamed from: p */
    public CaptchaSolution f10650p;

    /* renamed from: q */
    public String f10651q;

    /* renamed from: r */
    public String f10652r;

    public GoogleAccountSetupRequest() {
        this.f10635a = 1;
        this.f10636b = new Bundle();
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
        see.m35063b(parcel, 1, this.f10635a);
        see.m35037a(parcel, 2, this.f10636b, false);
        see.m35051a(parcel, 3, this.f10637c);
        see.m35051a(parcel, 4, this.f10638d);
        see.m35051a(parcel, 5, this.f10639e);
        see.m35046a(parcel, 6, this.f10640f, false);
        see.m35046a(parcel, 7, this.f10641g, false);
        see.m35046a(parcel, 8, this.f10642h, false);
        see.m35046a(parcel, 9, this.f10643i, false);
        see.m35051a(parcel, 10, this.f10644j);
        see.m35051a(parcel, 11, this.f10645k);
        see.m35051a(parcel, 12, this.f10646l);
        see.m35046a(parcel, 13, this.f10647m, false);
        see.m35040a(parcel, 14, this.f10648n, i, false);
        see.m35040a(parcel, 15, this.f10649o, i, false);
        see.m35040a(parcel, 16, this.f10650p, i, false);
        see.m35046a(parcel, 17, this.f10651q, false);
        see.m35046a(parcel, 18, this.f10652r, false);
        see.m35062b(parcel, a);
    }

    public GoogleAccountSetupRequest(int i, Bundle bundle, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, boolean z4, boolean z5, boolean z6, String str5, AppDescription appDescription, AccountCredentials accountCredentials, CaptchaSolution captchaSolution, String str6, String str7) {
        this.f10635a = i;
        this.f10636b = bundle;
        this.f10637c = z;
        this.f10638d = z2;
        this.f10639e = z3;
        this.f10640f = str;
        this.f10641g = str2;
        this.f10642h = str3;
        this.f10643i = str4;
        this.f10644j = z4;
        this.f10645k = z5;
        this.f10646l = z6;
        this.f10647m = str5;
        this.f10648n = appDescription;
        this.f10649o = accountCredentials;
        this.f10650p = captchaSolution;
        this.f10651q = str6;
        this.f10652r = str7;
    }
}
