package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiUserSettings extends sip {

    /* renamed from: a */
    private static final TreeMap f151639a;

    /* renamed from: c */
    private final HashMap f151640c = new HashMap();

    /* renamed from: d */
    private final HashMap f151641d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151639a = treeMap;
        treeMap.put("remoteDeviceInfos", FastJsonResponse$Field.m22658b("remoteDeviceInfos", RemoteDeviceInfo.class));
        f151639a.put("settings", FastJsonResponse$Field.m22654a("settings", ApiSettings.class));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151639a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151640c.containsKey(str);
    }

    public ArrayList getRemoteDeviceInfos() {
        return (ArrayList) this.f151641d.get("remoteDeviceInfos");
    }

    public ApiSettings getSettings() {
        return (ApiSettings) this.f151640c.get("settings");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f151641d.put(str, arrayList);
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151640c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f151641d.containsKey(str);
    }
}
