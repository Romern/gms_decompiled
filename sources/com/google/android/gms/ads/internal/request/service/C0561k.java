package com.google.android.gms.ads.internal.request.service;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.request.service.k */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0561k {

    /* renamed from: a */
    public final List f8780a;

    /* renamed from: b */
    public final String f8781b;

    /* renamed from: c */
    public final String f8782c;

    /* renamed from: d */
    public final boolean f8783d;

    /* renamed from: e */
    public final String f8784e;

    /* renamed from: f */
    public final String f8785f;

    /* renamed from: g */
    public final int f8786g;

    /* renamed from: h */
    public final boolean f8787h;

    /* renamed from: i */
    public final JSONObject f8788i;

    /* renamed from: j */
    public final String f8789j;

    /* renamed from: k */
    public final boolean f8790k;

    /* renamed from: l */
    public final String f8791l;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0081  */
    public C0561k(JSONObject jSONObject) {
        boolean z;
        String optString;
        List list;
        this.f8785f = jSONObject.optString("url");
        this.f8781b = jSONObject.optString("base_uri");
        this.f8782c = jSONObject.optString("post_parameters");
        String optString2 = jSONObject.optString("drt_include");
        int i = 1;
        if (optString2 != null) {
            if (optString2.equals("1")) {
                z = true;
            } else if (optString2.equals("true")) {
                z = true;
            }
            this.f8783d = z;
            jSONObject.optString("request_id");
            jSONObject.optString("type");
            optString = jSONObject.optString("errors");
            if (optString == null) {
                list = Arrays.asList(optString.split(","));
            } else {
                list = null;
            }
            this.f8780a = list;
            this.f8786g = jSONObject.optInt("valid", 0) == 1 ? -2 : i;
            this.f8784e = jSONObject.optString("fetched_ad");
            this.f8787h = jSONObject.optBoolean("render_test_ad_label");
            JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
            this.f8788i = optJSONObject == null ? new JSONObject() : optJSONObject;
            this.f8789j = jSONObject.optString("analytics_query_ad_event_id");
            this.f8790k = jSONObject.optBoolean("is_analytics_logging_enabled");
            this.f8791l = jSONObject.optString("pool_key");
        }
        z = false;
        this.f8783d = z;
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        optString = jSONObject.optString("errors");
        if (optString == null) {
        }
        this.f8780a = list;
        this.f8786g = jSONObject.optInt("valid", 0) == 1 ? -2 : i;
        this.f8784e = jSONObject.optString("fetched_ad");
        this.f8787h = jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("preprocessor_flags");
        this.f8788i = optJSONObject2 == null ? new JSONObject() : optJSONObject2;
        this.f8789j = jSONObject.optString("analytics_query_ad_event_id");
        this.f8790k = jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f8791l = jSONObject.optString("pool_key");
    }
}
