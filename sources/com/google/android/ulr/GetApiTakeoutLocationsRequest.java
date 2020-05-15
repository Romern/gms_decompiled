package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetApiTakeoutLocationsRequest extends sip {

    /* renamed from: a */
    private static final TreeMap f151655a;

    /* renamed from: c */
    private final HashMap f151656c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151655a = treeMap;
        treeMap.put("clientInfo", FastJsonResponse$Field.m22654a("clientInfo", ApiClientInfo.class));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151655a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151656c.containsKey(str);
    }

    public ApiClientInfo getClientInfo() {
        return (ApiClientInfo) this.f151656c.get("clientInfo");
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151656c.put(str, sio);
    }
}
