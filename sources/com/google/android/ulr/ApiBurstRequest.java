package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiBurstRequest extends sip {

    /* renamed from: a */
    private static final TreeMap f151601a;

    static {
        TreeMap treeMap = new TreeMap();
        f151601a = treeMap;
        treeMap.put("appSpecificKey", FastJsonResponse$Field.m22665f("appSpecificKey"));
        f151601a.put("durationMs", FastJsonResponse$Field.m22655b("durationMs"));
        f151601a.put("movingLatencyMs", FastJsonResponse$Field.m22655b("movingLatencyMs"));
        f151601a.put("reason", FastJsonResponse$Field.m22665f("reason"));
        f151601a.put("stationaryLatencyMs", FastJsonResponse$Field.m22655b("stationaryLatencyMs"));
        f151601a.put("timestampMs", FastJsonResponse$Field.m22655b("timestampMs"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151601a;
    }

    /* renamed from: b */
    public final String mo71502b() {
        return (String) this.f44540b.get("appSpecificKey");
    }

    /* renamed from: c */
    public final Long mo71503c() {
        return (Long) this.f44540b.get("durationMs");
    }

    /* renamed from: d */
    public final Long mo71504d() {
        return (Long) this.f44540b.get("movingLatencyMs");
    }

    /* renamed from: e */
    public final String mo71505e() {
        return (String) this.f44540b.get("reason");
    }

    /* renamed from: f */
    public final Long mo71506f() {
        return (Long) this.f44540b.get("stationaryLatencyMs");
    }

    /* renamed from: g */
    public final Long mo71507g() {
        return (Long) this.f44540b.get("timestampMs");
    }
}
