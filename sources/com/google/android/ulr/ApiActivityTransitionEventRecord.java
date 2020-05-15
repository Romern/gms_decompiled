package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiActivityTransitionEventRecord extends sip {

    /* renamed from: a */
    private static final TreeMap f151592a;

    static {
        TreeMap treeMap = new TreeMap();
        f151592a = treeMap;
        treeMap.put("activityType", FastJsonResponse$Field.m22665f("activityType"));
        f151592a.put("timestampMs", FastJsonResponse$Field.m22655b("timestampMs"));
        f151592a.put("type", FastJsonResponse$Field.m22665f("type"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151592a;
    }

    /* renamed from: b */
    public final String mo71479b() {
        return (String) this.f44540b.get("activityType");
    }

    /* renamed from: c */
    public final Long mo71480c() {
        return (Long) this.f44540b.get("timestampMs");
    }

    /* renamed from: d */
    public final String mo71481d() {
        return (String) this.f44540b.get("type");
    }
}
