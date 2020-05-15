package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GmmPlaceReportPayloadSnapToPlaceRequest extends sip {

    /* renamed from: a */
    private static final TreeMap f151667a;

    /* renamed from: c */
    private final HashMap f151668c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151667a = treeMap;
        treeMap.put("queryLocation", FastJsonResponse$Field.m22654a("queryLocation", LocationDescriptor.class));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151667a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151668c.containsKey(str);
    }

    public LocationDescriptor getQueryLocation() {
        return (LocationDescriptor) this.f151668c.get("queryLocation");
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151668c.put(str, sio);
    }
}
