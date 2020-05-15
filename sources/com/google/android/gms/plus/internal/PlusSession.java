package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlusSession extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new anwl();

    /* renamed from: a */
    public final int f82350a;

    /* renamed from: b */
    public final String f82351b;

    /* renamed from: c */
    public final String[] f82352c;

    /* renamed from: d */
    public final String[] f82353d;

    /* renamed from: e */
    public final String[] f82354e;

    /* renamed from: f */
    public final String f82355f;

    /* renamed from: g */
    public final String f82356g;

    /* renamed from: h */
    public final String f82357h;

    /* renamed from: i */
    public final String f82358i;

    /* renamed from: j */
    public final PlusCommonExtras f82359j;

    public PlusSession(int i, String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, String str5, PlusCommonExtras plusCommonExtras) {
        this.f82350a = i;
        this.f82351b = str;
        this.f82352c = strArr;
        this.f82353d = strArr2;
        this.f82354e = strArr3;
        this.f82355f = str2;
        this.f82356g = str3;
        this.f82357h = str4;
        this.f82358i = str5;
        this.f82359j = plusCommonExtras;
    }

    /* renamed from: a */
    public final Bundle mo46579a() {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(PlusCommonExtras.class.getClassLoader());
        this.f82359j.mo46574a(bundle);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PlusSession) {
            PlusSession plusSession = (PlusSession) obj;
            if (this.f82350a != plusSession.f82350a || !sdg.m34949a(this.f82351b, plusSession.f82351b) || !Arrays.equals(this.f82352c, plusSession.f82352c) || !Arrays.equals(this.f82353d, plusSession.f82353d) || !Arrays.equals(this.f82354e, plusSession.f82354e) || !sdg.m34949a(this.f82355f, plusSession.f82355f) || !sdg.m34949a(this.f82356g, plusSession.f82356g) || !sdg.m34949a(this.f82357h, plusSession.f82357h) || !sdg.m34949a(this.f82358i, plusSession.f82358i) || !sdg.m34949a(this.f82359j, plusSession.f82359j)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f82350a), this.f82351b, this.f82352c, this.f82353d, this.f82354e, this.f82355f, this.f82356g, this.f82357h, this.f82358i, this.f82359j});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("versionCode", Integer.valueOf(this.f82350a));
        a.mo25396a("accountName", this.f82351b);
        a.mo25396a("requestedScopes", this.f82352c);
        a.mo25396a("visibleActivities", this.f82353d);
        a.mo25396a("requiredFeatures", this.f82354e);
        a.mo25396a("packageNameForAuth", this.f82355f);
        a.mo25396a("callingPackageName", this.f82356g);
        a.mo25396a("applicationName", this.f82357h);
        a.mo25396a("extra", this.f82359j.toString());
        return a.toString();
    }

    public PlusSession(String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, PlusCommonExtras plusCommonExtras) {
        this.f82350a = 1;
        this.f82351b = str;
        this.f82352c = strArr;
        this.f82353d = strArr2;
        this.f82354e = strArr3;
        this.f82355f = str2;
        this.f82356g = str3;
        this.f82357h = str4;
        this.f82358i = null;
        this.f82359j = plusCommonExtras;
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
     method: see.a(android.os.Parcel, int, java.lang.String[], boolean):void
     arg types: [android.os.Parcel, int, java.lang.String[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
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
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f82351b, false);
        see.m35058a(parcel, 2, this.f82352c, false);
        see.m35058a(parcel, 3, this.f82353d, false);
        see.m35058a(parcel, 4, this.f82354e, false);
        see.m35046a(parcel, 5, this.f82355f, false);
        see.m35046a(parcel, 6, this.f82356g, false);
        see.m35046a(parcel, 7, this.f82357h, false);
        see.m35046a(parcel, 8, this.f82358i, false);
        see.m35040a(parcel, 9, this.f82359j, i, false);
        see.m35063b(parcel, 1000, this.f82350a);
        see.m35062b(parcel, a);
    }
}
