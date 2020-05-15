package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GmmPlaceReportPayloadNotificationDetails extends sip {

    /* renamed from: a */
    private static final TreeMap f151662a;

    /* renamed from: c */
    private final HashMap f151663c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151662a = treeMap;
        treeMap.put("featureId", FastJsonResponse$Field.m22654a("featureId", FeatureIdProto.class));
        f151662a.put("notificationId", FastJsonResponse$Field.m22665f("notificationId"));
        f151662a.put("sourceIds", FastJsonResponse$Field.m22667g("sourceIds"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151662a;
    }

    /* renamed from: b */
    public final String mo71630b() {
        return (String) this.f44540b.get("notificationId");
    }

    /* renamed from: c */
    public final ArrayList mo71631c() {
        return (ArrayList) this.f44540b.get("sourceIds");
    }

    public FeatureIdProto getFeatureId() {
        return (FeatureIdProto) this.f151663c.get("featureId");
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151663c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151663c.containsKey(str);
    }
}
