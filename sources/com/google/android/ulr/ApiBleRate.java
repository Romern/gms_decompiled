package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiBleRate extends sip {

    /* renamed from: a */
    private static final TreeMap f151598a;

    static {
        TreeMap treeMap = new TreeMap();
        f151598a = treeMap;
        treeMap.put("activeTimeMs", FastJsonResponse$Field.m22655b("activeTimeMs"));
        f151598a.put("bluetoothEnabled", FastJsonResponse$Field.m22663e("bluetoothEnabled"));
        f151598a.put("maxDelayMs", FastJsonResponse$Field.m22655b("maxDelayMs"));
        f151598a.put("minDelayMs", FastJsonResponse$Field.m22655b("minDelayMs"));
        f151598a.put("strategy", FastJsonResponse$Field.m22665f("strategy"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151598a;
    }

    /* renamed from: b */
    public final Long mo71495b() {
        return (Long) this.f44540b.get("activeTimeMs");
    }

    /* renamed from: c */
    public final Boolean mo71496c() {
        return (Boolean) this.f44540b.get("bluetoothEnabled");
    }

    /* renamed from: d */
    public final Long mo71497d() {
        return (Long) this.f44540b.get("maxDelayMs");
    }

    /* renamed from: e */
    public final Long mo71498e() {
        return (Long) this.f44540b.get("minDelayMs");
    }

    /* renamed from: f */
    public final String mo71499f() {
        return (String) this.f44540b.get("strategy");
    }
}
