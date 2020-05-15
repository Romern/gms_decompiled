package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiDeleteHistoryOperation extends sip {

    /* renamed from: a */
    private static final TreeMap f151603a;

    static {
        TreeMap treeMap = new TreeMap();
        f151603a = treeMap;
        treeMap.put("firstTimestampMs", FastJsonResponse$Field.m22655b("firstTimestampMs"));
        f151603a.put("lastTimestampMs", FastJsonResponse$Field.m22655b("lastTimestampMs"));
        f151603a.put("operationTimestamp", FastJsonResponse$Field.m22655b("operationTimestamp"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151603a;
    }
}
