package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.util.cache.PoolConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NonagonRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0549j();

    /* renamed from: a */
    public final Bundle f8692a;

    /* renamed from: b */
    public final VersionInfoParcel f8693b;

    /* renamed from: c */
    public final ApplicationInfo f8694c;

    /* renamed from: d */
    public final String f8695d;

    /* renamed from: e */
    public final List f8696e;

    /* renamed from: f */
    public final PackageInfo f8697f;

    /* renamed from: g */
    public final String f8698g;

    /* renamed from: h */
    public final boolean f8699h;

    /* renamed from: i */
    public final String f8700i;

    /* renamed from: j */
    public PoolConfiguration f8701j;

    /* renamed from: k */
    public String f8702k;

    public NonagonRequestParcel(Bundle bundle, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, boolean z, String str3, PoolConfiguration poolConfiguration, String str4) {
        this.f8692a = bundle;
        this.f8693b = versionInfoParcel;
        this.f8695d = str;
        this.f8694c = applicationInfo;
        this.f8696e = list;
        this.f8697f = packageInfo;
        this.f8698g = str2;
        this.f8699h = z;
        this.f8700i = str3;
        this.f8701j = poolConfiguration;
        this.f8702k = str4;
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
        see.m35037a(parcel, 1, this.f8692a, false);
        see.m35040a(parcel, 2, this.f8693b, i, false);
        see.m35040a(parcel, 3, this.f8694c, i, false);
        see.m35046a(parcel, 4, this.f8695d, false);
        see.m35065b(parcel, 5, this.f8696e, false);
        see.m35040a(parcel, 6, this.f8697f, i, false);
        see.m35046a(parcel, 7, this.f8698g, false);
        see.m35051a(parcel, 8, this.f8699h);
        see.m35046a(parcel, 9, this.f8700i, false);
        see.m35040a(parcel, 10, this.f8701j, i, false);
        see.m35046a(parcel, 11, this.f8702k, false);
        see.m35062b(parcel, a);
    }
}
