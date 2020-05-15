package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AdBreakClipInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ped();

    /* renamed from: a */
    public final String f29681a;

    /* renamed from: b */
    public final String f29682b;

    /* renamed from: c */
    public final long f29683c;

    /* renamed from: d */
    public final String f29684d;

    /* renamed from: e */
    public final String f29685e;

    /* renamed from: f */
    public final String f29686f;

    /* renamed from: g */
    public String f29687g;

    /* renamed from: h */
    public String f29688h;

    /* renamed from: i */
    public String f29689i;

    /* renamed from: j */
    public final long f29690j;

    /* renamed from: k */
    public final String f29691k;

    /* renamed from: l */
    public final VastAdsRequest f29692l;

    /* renamed from: m */
    public JSONObject f29693m;

    public AdBreakClipInfo(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, VastAdsRequest vastAdsRequest) {
        this.f29681a = str;
        this.f29682b = str2;
        this.f29683c = j;
        this.f29684d = str3;
        this.f29685e = str4;
        this.f29686f = str5;
        this.f29687g = str6;
        this.f29688h = str7;
        this.f29689i = str8;
        this.f29690j = j2;
        this.f29691k = str9;
        this.f29692l = vastAdsRequest;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f29693m = new JSONObject(str6);
            } catch (JSONException e) {
                Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", e.getMessage()));
                this.f29687g = null;
                this.f29693m = new JSONObject();
            }
        } else {
            this.f29693m = new JSONObject();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdBreakClipInfo) {
            AdBreakClipInfo adBreakClipInfo = (AdBreakClipInfo) obj;
            return ptk.m31236a(this.f29681a, adBreakClipInfo.f29681a) && ptk.m31236a(this.f29682b, adBreakClipInfo.f29682b) && this.f29683c == adBreakClipInfo.f29683c && ptk.m31236a(this.f29684d, adBreakClipInfo.f29684d) && ptk.m31236a(this.f29685e, adBreakClipInfo.f29685e) && ptk.m31236a(this.f29686f, adBreakClipInfo.f29686f) && ptk.m31236a(this.f29687g, adBreakClipInfo.f29687g) && ptk.m31236a(this.f29688h, adBreakClipInfo.f29688h) && ptk.m31236a(this.f29689i, adBreakClipInfo.f29689i) && this.f29690j == adBreakClipInfo.f29690j && ptk.m31236a(this.f29691k, adBreakClipInfo.f29691k) && ptk.m31236a(this.f29692l, adBreakClipInfo.f29692l);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29681a, this.f29682b, Long.valueOf(this.f29683c), this.f29684d, this.f29685e, this.f29686f, this.f29687g, this.f29688h, this.f29689i, Long.valueOf(this.f29690j), this.f29691k, this.f29692l});
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
        see.m35046a(parcel, 2, this.f29681a, false);
        see.m35046a(parcel, 3, this.f29682b, false);
        see.m35036a(parcel, 4, this.f29683c);
        see.m35046a(parcel, 5, this.f29684d, false);
        see.m35046a(parcel, 6, this.f29685e, false);
        see.m35046a(parcel, 7, this.f29686f, false);
        see.m35046a(parcel, 8, this.f29687g, false);
        see.m35046a(parcel, 9, this.f29688h, false);
        see.m35046a(parcel, 10, this.f29689i, false);
        see.m35036a(parcel, 11, this.f29690j);
        see.m35046a(parcel, 12, this.f29691k, false);
        see.m35040a(parcel, 13, this.f29692l, i, false);
        see.m35062b(parcel, a);
    }
}
