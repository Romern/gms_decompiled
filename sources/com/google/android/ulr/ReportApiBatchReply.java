package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ReportApiBatchReply extends sip {

    /* renamed from: a */
    private static final TreeMap f151683a;

    /* renamed from: c */
    private final HashMap f151684c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151683a = treeMap;
        treeMap.put("historicalLocationsStored", FastJsonResponse$Field.m22650a("historicalLocationsStored"));
        f151683a.put("settings", FastJsonResponse$Field.m22654a("settings", ApiSettings.class));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151683a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151684c.containsKey(str);
    }

    public ApiSettings getSettings() {
        return (ApiSettings) this.f151684c.get("settings");
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151684c.put(str, sio);
    }
}
