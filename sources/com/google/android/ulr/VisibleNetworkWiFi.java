package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class VisibleNetworkWiFi extends sip {

    /* renamed from: a */
    private static final TreeMap f151699a;

    static {
        TreeMap treeMap = new TreeMap();
        f151699a = treeMap;
        treeMap.put("bssid", FastJsonResponse$Field.m22665f("bssid"));
        f151699a.put("levelDbm", FastJsonResponse$Field.m22650a("levelDbm"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151699a;
    }

    /* renamed from: b */
    public final String mo71721b() {
        return (String) this.f44540b.get("bssid");
    }

    /* renamed from: c */
    public final Integer mo71722c() {
        return (Integer) this.f44540b.get("levelDbm");
    }
}
