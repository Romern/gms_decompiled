package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SetApiRemoteDeviceSettingsReply extends sip {

    /* renamed from: a */
    private static final TreeMap f151692a;

    /* renamed from: c */
    private final HashMap f151693c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151692a = treeMap;
        treeMap.put("remoteDeviceInfoSource", FastJsonResponse$Field.m22665f("remoteDeviceInfoSource"));
        f151692a.put("userSettings", FastJsonResponse$Field.m22654a("userSettings", ApiUserSettings.class));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151692a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151693c.containsKey(str);
    }

    public ApiUserSettings getUserSettings() {
        return (ApiUserSettings) this.f151693c.get("userSettings");
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151693c.put(str, sio);
    }
}
