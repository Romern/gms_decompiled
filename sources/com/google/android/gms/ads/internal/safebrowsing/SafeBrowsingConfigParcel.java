package com.google.android.gms.ads.internal.safebrowsing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.C0611ai;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SafeBrowsingConfigParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0579a();

    /* renamed from: a */
    public final String f8864a;

    /* renamed from: b */
    public final String f8865b;

    /* renamed from: c */
    public final boolean f8866c;

    /* renamed from: d */
    public final boolean f8867d;

    /* renamed from: e */
    public final List f8868e;

    /* renamed from: f */
    public final boolean f8869f;

    /* renamed from: g */
    public final boolean f8870g;

    /* renamed from: h */
    public final List f8871h;

    public SafeBrowsingConfigParcel(String str, String str2, boolean z, boolean z2, List list, boolean z3, boolean z4, List list2) {
        this.f8864a = str;
        this.f8865b = str2;
        this.f8866c = z;
        this.f8867d = z2;
        this.f8868e = list;
        this.f8869f = z3;
        this.f8870g = z4;
        this.f8871h = list2 == null ? new ArrayList() : list2;
    }

    /* renamed from: a */
    public static SafeBrowsingConfigParcel m5579a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new SafeBrowsingConfigParcel(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), C0611ai.m5615a(jSONObject.optJSONArray("allowed_headers")), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), C0611ai.m5615a(jSONObject.optJSONArray("webview_permissions")));
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
        see.m35046a(parcel, 2, this.f8864a, false);
        see.m35046a(parcel, 3, this.f8865b, false);
        see.m35051a(parcel, 4, this.f8866c);
        see.m35051a(parcel, 5, this.f8867d);
        see.m35065b(parcel, 6, this.f8868e, false);
        see.m35051a(parcel, 7, this.f8869f);
        see.m35051a(parcel, 8, this.f8870g);
        see.m35065b(parcel, 9, this.f8871h, false);
        see.m35062b(parcel, a);
    }
}
