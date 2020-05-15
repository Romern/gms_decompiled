package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiWifiConnectivityStatus extends sip {

    /* renamed from: a */
    private static final TreeMap f151642a;

    static {
        TreeMap treeMap = new TreeMap();
        f151642a = treeMap;
        treeMap.put("mac", FastJsonResponse$Field.m22655b("mac"));
        f151642a.put("wifiConnectionStatus", FastJsonResponse$Field.m22665f("wifiConnectionStatus"));
    }

    public ApiWifiConnectivityStatus() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151642a;
    }

    /* renamed from: b */
    public final Long mo71603b() {
        return (Long) this.f44540b.get("mac");
    }

    /* renamed from: c */
    public final String mo71604c() {
        return (String) this.f44540b.get("wifiConnectionStatus");
    }

    public ApiWifiConnectivityStatus(Long l, String str) {
        mo25603a("mac", l.longValue());
        if (str != null) {
            mo25604a("wifiConnectionStatus", str);
        }
    }
}
