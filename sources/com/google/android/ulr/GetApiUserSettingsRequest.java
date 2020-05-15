package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetApiUserSettingsRequest extends sip {

    /* renamed from: a */
    private static final TreeMap f151657a;

    /* renamed from: c */
    private final HashMap f151658c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151657a = treeMap;
        treeMap.put("clientInfo", FastJsonResponse$Field.m22654a("clientInfo", ApiClientInfo.class));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151657a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151658c.containsKey(str);
    }

    public ApiClientInfo getClientInfo() {
        return (ApiClientInfo) this.f151658c.get("clientInfo");
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151658c.put(str, sio);
    }
}
