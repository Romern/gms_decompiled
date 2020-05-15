package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupAccountWorkflowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new iyp();

    /* renamed from: a */
    public final int f10781a;

    /* renamed from: b */
    public boolean f10782b;

    /* renamed from: c */
    public boolean f10783c;

    /* renamed from: d */
    public List f10784d;

    /* renamed from: e */
    public Bundle f10785e;

    /* renamed from: f */
    public final AppDescription f10786f;

    /* renamed from: g */
    public boolean f10787g;

    /* renamed from: h */
    public final String f10788h;

    /* renamed from: i */
    public AccountAuthenticatorResponse f10789i;

    /* renamed from: j */
    public boolean f10790j;

    /* renamed from: k */
    public boolean f10791k;

    /* renamed from: l */
    public String f10792l;

    /* renamed from: m */
    public String f10793m;

    /* renamed from: n */
    public String f10794n;

    /* renamed from: o */
    public String f10795o;

    /* renamed from: p */
    public boolean f10796p;

    /* renamed from: q */
    public boolean f10797q;

    /* renamed from: r */
    public boolean f10798r;

    /* renamed from: s */
    public boolean f10799s;

    /* renamed from: t */
    public ManagedAuthOptions f10800t;

    public SetupAccountWorkflowRequest(int i, boolean z, boolean z2, List list, Bundle bundle, AppDescription appDescription, boolean z3, String str, AccountAuthenticatorResponse accountAuthenticatorResponse, boolean z4, boolean z5, String str2, String str3, String str4, String str5, boolean z6, boolean z7, boolean z8, boolean z9, ManagedAuthOptions managedAuthOptions) {
        this.f10781a = i;
        this.f10782b = z;
        this.f10783c = z2;
        this.f10784d = list;
        this.f10785e = bundle;
        sdo.m34959a(appDescription);
        this.f10786f = appDescription;
        this.f10787g = z3;
        this.f10788h = str;
        this.f10789i = accountAuthenticatorResponse;
        this.f10790j = z4;
        this.f10791k = z5;
        this.f10792l = str2;
        this.f10793m = str3;
        this.f10794n = str4;
        this.f10795o = str5;
        this.f10796p = z6;
        this.f10797q = z7;
        this.f10798r = z8;
        this.f10799s = z9;
        this.f10800t = managedAuthOptions;
    }

    /* renamed from: a */
    public final List mo7659a() {
        List list = this.f10784d;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return null;
    }

    /* renamed from: b */
    public final Bundle mo7660b() {
        return new Bundle(this.f10785e);
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
        see.m35063b(parcel, 1, this.f10781a);
        see.m35051a(parcel, 2, this.f10782b);
        see.m35051a(parcel, 3, this.f10783c);
        see.m35065b(parcel, 4, this.f10784d, false);
        see.m35037a(parcel, 5, this.f10785e, false);
        see.m35040a(parcel, 6, this.f10786f, i, false);
        see.m35051a(parcel, 7, this.f10787g);
        see.m35046a(parcel, 8, this.f10788h, false);
        see.m35040a(parcel, 9, this.f10789i, i, false);
        see.m35051a(parcel, 10, this.f10790j);
        see.m35051a(parcel, 11, this.f10791k);
        see.m35046a(parcel, 12, this.f10792l, false);
        see.m35046a(parcel, 13, this.f10793m, false);
        see.m35046a(parcel, 14, this.f10794n, false);
        see.m35046a(parcel, 15, this.f10795o, false);
        see.m35051a(parcel, 16, this.f10796p);
        see.m35051a(parcel, 17, this.f10797q);
        see.m35051a(parcel, 18, this.f10798r);
        see.m35051a(parcel, 19, this.f10799s);
        see.m35040a(parcel, 20, this.f10800t, i, false);
        see.m35062b(parcel, a);
    }

    public SetupAccountWorkflowRequest(AppDescription appDescription, String str) {
        this.f10781a = 10;
        this.f10785e = new Bundle();
        this.f10800t = new ManagedAuthOptions();
        this.f10786f = appDescription;
        this.f10788h = str;
    }
}
