package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiClientInfo extends sip {

    /* renamed from: a */
    private static final TreeMap f151602a;

    static {
        TreeMap treeMap = new TreeMap();
        f151602a = treeMap;
        treeMap.put("formFactor", FastJsonResponse$Field.m22665f("formFactor"));
    }

    public ApiClientInfo() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151602a;
    }

    public ApiClientInfo(String str) {
        mo25604a("formFactor", str);
    }
}
