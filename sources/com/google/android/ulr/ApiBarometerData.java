package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiBarometerData extends sip {

    /* renamed from: a */
    private static final TreeMap f151593a;

    static {
        TreeMap treeMap = new TreeMap();
        f151593a = treeMap;
        treeMap.put("pressureHpaE3", FastJsonResponse$Field.m22650a("pressureHpaE3"));
        f151593a.put("timestampMs", FastJsonResponse$Field.m22655b("timestampMs"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151593a;
    }
}
