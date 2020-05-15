package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class VisibleNetwork extends sip {

    /* renamed from: a */
    private static final TreeMap f151696a;

    /* renamed from: c */
    private final HashMap f151697c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151696a = treeMap;
        treeMap.put("cell", FastJsonResponse$Field.m22654a("cell", VisibleNetworkCell.class));
        f151696a.put("connected", FastJsonResponse$Field.m22663e("connected"));
        f151696a.put("timestampMs", FastJsonResponse$Field.m22655b("timestampMs"));
        f151696a.put("wifi", FastJsonResponse$Field.m22654a("wifi", VisibleNetworkWiFi.class));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151696a;
    }

    /* renamed from: b */
    public final Boolean mo71709b() {
        return (Boolean) this.f44540b.get("connected");
    }

    /* renamed from: c */
    public final Long mo71710c() {
        return (Long) this.f44540b.get("timestampMs");
    }

    public VisibleNetworkCell getCell() {
        return (VisibleNetworkCell) this.f151697c.get("cell");
    }

    public VisibleNetworkWiFi getWifi() {
        return (VisibleNetworkWiFi) this.f151697c.get("wifi");
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151697c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151697c.containsKey(str);
    }
}
