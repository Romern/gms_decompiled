package com.google.android.gms.ads.internal.cache;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CacheOffering extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0322d();

    /* renamed from: a */
    public final String f8081a;

    /* renamed from: b */
    public final long f8082b;

    /* renamed from: c */
    public final String f8083c;

    /* renamed from: d */
    public final String f8084d;

    /* renamed from: e */
    public final String f8085e;

    /* renamed from: f */
    public final Bundle f8086f;

    /* renamed from: g */
    public final boolean f8087g;

    /* renamed from: h */
    public long f8088h;

    public CacheOffering(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.f8081a = str;
        this.f8082b = j;
        this.f8083c = str2 == null ? "" : str2;
        this.f8084d = str3 == null ? "" : str3;
        this.f8085e = str4 == null ? "" : str4;
        this.f8086f = bundle == null ? new Bundle() : bundle;
        this.f8087g = z;
        this.f8088h = j2;
    }

    /* renamed from: a */
    public static CacheOffering m5254a(String str) {
        Uri parse = Uri.parse(str);
        try {
            if (!"gcache".equals(parse.getScheme())) {
                return null;
            }
            List<String> pathSegments = parse.getPathSegments();
            if (pathSegments.size() == 2) {
                String str2 = pathSegments.get(0);
                String str3 = pathSegments.get(1);
                String host = parse.getHost();
                String queryParameter = parse.getQueryParameter("url");
                boolean equals = "1".equals(parse.getQueryParameter("read_only"));
                String queryParameter2 = parse.getQueryParameter("expiration");
                long parseLong = queryParameter2 != null ? Long.parseLong(queryParameter2) : 0;
                Bundle bundle = new Bundle();
                C0387d.m5364b();
                for (String str4 : parse.getQueryParameterNames()) {
                    if (str4.startsWith("tag.")) {
                        bundle.putString(str4.substring(4), parse.getQueryParameter(str4));
                    }
                }
                return new CacheOffering(queryParameter, parseLong, host, str2, str3, bundle, equals, 0);
            }
            int size = pathSegments.size();
            StringBuilder sb = new StringBuilder(62);
            sb.append("Expected 2 path parts for namespace and id, found :");
            sb.append(size);
            C0633h.m5672d(sb.toString());
            return null;
        } catch (NullPointerException | NumberFormatException e) {
            C0633h.m5673d("Unable to parse Uri into cache offering.", e);
            return null;
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
        see.m35046a(parcel, 2, this.f8081a, false);
        see.m35036a(parcel, 3, this.f8082b);
        see.m35046a(parcel, 4, this.f8083c, false);
        see.m35046a(parcel, 5, this.f8084d, false);
        see.m35046a(parcel, 6, this.f8085e, false);
        see.m35037a(parcel, 7, this.f8086f, false);
        see.m35051a(parcel, 8, this.f8087g);
        see.m35036a(parcel, 9, this.f8088h);
        see.m35062b(parcel, a);
    }
}
