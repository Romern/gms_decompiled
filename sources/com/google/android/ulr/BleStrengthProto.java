package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BleStrengthProto extends sip {

    /* renamed from: a */
    private static final TreeMap f151644a;

    static {
        TreeMap treeMap = new TreeMap();
        f151644a = treeMap;
        treeMap.put("id", FastJsonResponse$Field.m22665f("id"));
        f151644a.put("mac", FastJsonResponse$Field.m22655b("mac"));
        f151644a.put("rssiDbm", FastJsonResponse$Field.m22650a("rssiDbm"));
        f151644a.put("txPowerDbm", FastJsonResponse$Field.m22650a("txPowerDbm"));
        f151644a.put("type", FastJsonResponse$Field.m22665f("type"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151644a;
    }

    /* renamed from: b */
    public final String mo71608b() {
        return (String) this.f44540b.get("id");
    }

    /* renamed from: c */
    public final Long mo71609c() {
        return (Long) this.f44540b.get("mac");
    }

    /* renamed from: d */
    public final Integer mo71610d() {
        return (Integer) this.f44540b.get("rssiDbm");
    }

    /* renamed from: e */
    public final Integer mo71611e() {
        return (Integer) this.f44540b.get("txPowerDbm");
    }

    /* renamed from: f */
    public final String mo71612f() {
        return (String) this.f44540b.get("type");
    }
}
