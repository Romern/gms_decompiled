package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiPlaceReport extends sip {

    /* renamed from: a */
    private static final TreeMap f151621a;

    /* renamed from: c */
    private final HashMap f151622c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151621a = treeMap;
        treeMap.put("appSpecificTag", FastJsonResponse$Field.m22665f("appSpecificTag"));
        f151621a.put("callingAppPackageName", FastJsonResponse$Field.m22665f("callingAppPackageName"));
        f151621a.put("payload", FastJsonResponse$Field.m22654a("payload", ApiPlaceReportPayload.class));
        f151621a.put("placeId", FastJsonResponse$Field.m22665f("placeId"));
        f151621a.put("source", FastJsonResponse$Field.m22665f("source"));
        f151621a.put("type", FastJsonResponse$Field.m22665f("type"));
    }

    public ApiPlaceReport() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151621a;
    }

    /* renamed from: b */
    public final String mo71567b() {
        return (String) this.f44540b.get("appSpecificTag");
    }

    /* renamed from: c */
    public final String mo71568c() {
        return (String) this.f44540b.get("callingAppPackageName");
    }

    /* renamed from: d */
    public final String mo71569d() {
        return (String) this.f44540b.get("placeId");
    }

    /* renamed from: e */
    public final String mo71570e() {
        return (String) this.f44540b.get("source");
    }

    /* renamed from: f */
    public final String mo71571f() {
        return (String) this.f44540b.get("type");
    }

    public ApiPlaceReportPayload getPayload() {
        return (ApiPlaceReportPayload) this.f151622c.get("payload");
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151622c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151622c.containsKey(str);
    }

    public ApiPlaceReport(String str, String str2, String str3, String str4) {
        if (str != null) {
            mo25604a("appSpecificTag", str);
        }
        mo25604a("callingAppPackageName", str2);
        if (str3 != null) {
            mo25604a("placeId", str3);
        }
        if (str4 != null) {
            mo25604a("source", str4);
        }
    }
}
