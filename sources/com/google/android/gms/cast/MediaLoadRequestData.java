package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MediaLoadRequestData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pge();

    /* renamed from: a */
    public static final ptx f29767a = new ptx("MediaLoadRequestData");

    /* renamed from: b */
    public final MediaInfo f29768b;

    /* renamed from: c */
    public final MediaQueueData f29769c;

    /* renamed from: d */
    public final Boolean f29770d;

    /* renamed from: e */
    public final long f29771e;

    /* renamed from: f */
    public final double f29772f;

    /* renamed from: g */
    public final long[] f29773g;

    /* renamed from: h */
    String f29774h;

    /* renamed from: i */
    public final JSONObject f29775i;

    /* renamed from: j */
    public final String f29776j;

    /* renamed from: k */
    public final String f29777k;

    /* renamed from: l */
    public final String f29778l;

    /* renamed from: m */
    public final String f29779m;

    /* renamed from: n */
    public long f29780n;

    public MediaLoadRequestData(MediaInfo mediaInfo, MediaQueueData mediaQueueData, Boolean bool, long j, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j2) {
        this.f29768b = mediaInfo;
        this.f29769c = mediaQueueData;
        this.f29770d = bool;
        this.f29771e = j;
        this.f29772f = d;
        this.f29773g = jArr;
        this.f29775i = jSONObject;
        this.f29776j = str;
        this.f29777k = str2;
        this.f29778l = str3;
        this.f29779m = str4;
        this.f29780n = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaLoadRequestData) {
            MediaLoadRequestData mediaLoadRequestData = (MediaLoadRequestData) obj;
            return ssd.m36200a(this.f29775i, mediaLoadRequestData.f29775i) && sdg.m34949a(this.f29768b, mediaLoadRequestData.f29768b) && sdg.m34949a(this.f29769c, mediaLoadRequestData.f29769c) && sdg.m34949a(this.f29770d, mediaLoadRequestData.f29770d) && this.f29771e == mediaLoadRequestData.f29771e && this.f29772f == mediaLoadRequestData.f29772f && Arrays.equals(this.f29773g, mediaLoadRequestData.f29773g) && sdg.m34949a(this.f29776j, mediaLoadRequestData.f29776j) && sdg.m34949a(this.f29777k, mediaLoadRequestData.f29777k) && sdg.m34949a(this.f29778l, mediaLoadRequestData.f29778l) && sdg.m34949a(this.f29779m, mediaLoadRequestData.f29779m) && this.f29780n == mediaLoadRequestData.f29780n;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29768b, this.f29769c, this.f29770d, Long.valueOf(this.f29771e), Double.valueOf(this.f29772f), this.f29773g, String.valueOf(this.f29775i), this.f29776j, this.f29777k, this.f29778l, this.f29779m, Long.valueOf(this.f29780n)});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, long[], boolean):void
     arg types: [android.os.Parcel, int, long[], int]
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
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void */
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
        JSONObject jSONObject = this.f29775i;
        this.f29774h = jSONObject != null ? jSONObject.toString() : null;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f29768b, i, false);
        see.m35040a(parcel, 3, this.f29769c, i, false);
        see.m35041a(parcel, 4, this.f29770d);
        see.m35036a(parcel, 5, this.f29771e);
        see.m35033a(parcel, 6, this.f29772f);
        see.m35056a(parcel, 7, this.f29773g, false);
        see.m35046a(parcel, 8, this.f29774h, false);
        see.m35046a(parcel, 9, this.f29776j, false);
        see.m35046a(parcel, 10, this.f29777k, false);
        see.m35046a(parcel, 11, this.f29778l, false);
        see.m35046a(parcel, 12, this.f29779m, false);
        see.m35036a(parcel, 13, this.f29780n);
        see.m35062b(parcel, a);
    }
}
