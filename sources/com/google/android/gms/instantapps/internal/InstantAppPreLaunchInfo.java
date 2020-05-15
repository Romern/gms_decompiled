package com.google.android.gms.instantapps.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InstantAppPreLaunchInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adgh();

    /* renamed from: a */
    public final int f79167a;

    /* renamed from: b */
    public final String f79168b;

    /* renamed from: c */
    public final boolean f79169c;

    /* renamed from: d */
    public final Intent f79170d;

    /* renamed from: e */
    public final Intent f79171e;

    /* renamed from: f */
    public final AppInfo f79172f;

    /* renamed from: g */
    public final Route f79173g;

    /* renamed from: h */
    public final boolean f79174h;

    /* renamed from: i */
    public final byte[] f79175i;

    /* renamed from: j */
    public final String f79176j;

    /* renamed from: k */
    public final int f79177k;

    /* renamed from: l */
    public final int f79178l;

    /* renamed from: m */
    public final String f79179m;

    /* renamed from: n */
    public final byte[] f79180n;

    /* renamed from: o */
    public final Bundle f79181o;

    public InstantAppPreLaunchInfo(int i, String str, boolean z, Intent intent, Intent intent2, AppInfo appInfo, Route route, boolean z2, byte[] bArr, String str2, int i2, int i3, String str3, byte[] bArr2, Bundle bundle) {
        this.f79167a = i;
        this.f79168b = str;
        this.f79169c = z;
        this.f79170d = intent;
        this.f79171e = intent2;
        this.f79172f = appInfo;
        this.f79173g = route;
        this.f79174h = z2;
        this.f79175i = bArr;
        this.f79176j = str2;
        this.f79177k = i2;
        this.f79179m = str3;
        this.f79178l = i3;
        this.f79180n = bArr2;
        this.f79181o = bundle;
    }

    /* renamed from: a */
    public static InstantAppPreLaunchInfo m66758a(Intent intent, boolean z, byte[] bArr) {
        sdo.m34959a(intent);
        return new InstantAppPreLaunchInfo(0, null, z, null, intent, null, null, false, bArr, null, 0, 0, null, null, null);
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
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
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
        see.m35063b(parcel, 2, this.f79167a);
        see.m35046a(parcel, 3, this.f79168b, false);
        see.m35051a(parcel, 4, this.f79169c);
        see.m35040a(parcel, 5, this.f79170d, i, false);
        see.m35040a(parcel, 6, this.f79171e, i, false);
        see.m35040a(parcel, 8, this.f79172f, i, false);
        see.m35040a(parcel, 9, this.f79173g, i, false);
        see.m35051a(parcel, 10, this.f79174h);
        see.m35052a(parcel, 11, this.f79175i, false);
        see.m35046a(parcel, 12, this.f79176j, false);
        see.m35063b(parcel, 13, this.f79177k);
        see.m35046a(parcel, 14, this.f79179m, false);
        see.m35037a(parcel, 15, this.f79181o, false);
        see.m35063b(parcel, 16, this.f79178l);
        see.m35052a(parcel, 17, this.f79180n, false);
        see.m35062b(parcel, a);
    }
}
