package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiStepCountsEntry extends sip {

    /* renamed from: a */
    private static final TreeMap f151635a;

    static {
        TreeMap treeMap = new TreeMap();
        f151635a = treeMap;
        treeMap.put("stepCountStatus", FastJsonResponse$Field.m22665f("stepCountStatus"));
        f151635a.put("stepCounts", FastJsonResponse$Field.m22650a("stepCounts"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151635a;
    }

    /* renamed from: b */
    public final String mo71594b() {
        return (String) this.f44540b.get("stepCountStatus");
    }

    /* renamed from: c */
    public final Integer mo71595c() {
        return (Integer) this.f44540b.get("stepCounts");
    }
}
