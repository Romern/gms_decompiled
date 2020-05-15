package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiPlaceInference extends sip {

    /* renamed from: a */
    private static final TreeMap f151618a;

    static {
        TreeMap treeMap = new TreeMap();
        f151618a = treeMap;
        treeMap.put("likelihoodE4", FastJsonResponse$Field.m22650a("likelihoodE4"));
        f151618a.put("placeId", FastJsonResponse$Field.m22665f("placeId"));
    }

    public ApiPlaceInference() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151618a;
    }

    /* renamed from: b */
    public final Integer mo71562b() {
        return (Integer) this.f44540b.get("likelihoodE4");
    }

    /* renamed from: c */
    public final String mo71563c() {
        return (String) this.f44540b.get("placeId");
    }

    public ApiPlaceInference(Integer num, String str) {
        mo25602a("likelihoodE4", num.intValue());
        if (str != null) {
            mo25604a("placeId", str);
        }
    }
}
