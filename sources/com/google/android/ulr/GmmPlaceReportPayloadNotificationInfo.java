package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GmmPlaceReportPayloadNotificationInfo extends sip {

    /* renamed from: a */
    private static final TreeMap f151664a;

    /* renamed from: c */
    private final HashMap f151665c = new HashMap();

    /* renamed from: d */
    private final HashMap f151666d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151664a = treeMap;
        treeMap.put("location", FastJsonResponse$Field.m22654a("location", LocationDescriptor.class));
        f151664a.put("notificationDetails", FastJsonResponse$Field.m22658b("notificationDetails", GmmPlaceReportPayloadNotificationDetails.class));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151664a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151665c.containsKey(str);
    }

    public LocationDescriptor getLocation() {
        return (LocationDescriptor) this.f151665c.get("location");
    }

    public ArrayList getNotificationDetails() {
        return (ArrayList) this.f151666d.get("notificationDetails");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f151666d.put(str, arrayList);
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151665c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f151666d.containsKey(str);
    }
}
