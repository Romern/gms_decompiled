package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WalletPlaceReportPayloadPlaceIdLikelihood extends sip {

    /* renamed from: a */
    private static final TreeMap f151704a;

    static {
        TreeMap treeMap = new TreeMap();
        f151704a = treeMap;
        treeMap.put("likelihood", FastJsonResponse$Field.m22659c("likelihood"));
        f151704a.put("placeId", FastJsonResponse$Field.m22665f("placeId"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151704a;
    }

    /* renamed from: b */
    public final Float mo71728b() {
        return (Float) this.f44540b.get("likelihood");
    }

    /* renamed from: c */
    public final String mo71729c() {
        return (String) this.f44540b.get("placeId");
    }
}
