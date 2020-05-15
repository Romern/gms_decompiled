package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LatLngRect extends sip {

    /* renamed from: a */
    private static final TreeMap f151672a;

    /* renamed from: c */
    private final HashMap f151673c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151672a = treeMap;
        treeMap.put("hi", FastJsonResponse$Field.m22654a("hi", LatLng.class));
        f151672a.put("lo", FastJsonResponse$Field.m22654a("lo", LatLng.class));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151672a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151673c.containsKey(str);
    }

    public LatLng getHi() {
        return (LatLng) this.f151673c.get("hi");
    }

    public LatLng getLo() {
        return (LatLng) this.f151673c.get("lo");
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151673c.put(str, sio);
    }
}
