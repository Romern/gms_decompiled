package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GmmPlaceReportPayload extends sip {

    /* renamed from: a */
    private static final TreeMap f151659a;

    /* renamed from: c */
    private final HashMap f151660c = new HashMap();

    /* renamed from: d */
    private final HashMap f151661d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151659a = treeMap;
        treeMap.put("context", FastJsonResponse$Field.m22665f("context"));
        f151659a.put("eventId", FastJsonResponse$Field.m22665f("eventId"));
        f151659a.put("experimentInfo", FastJsonResponse$Field.m22665f("experimentInfo"));
        f151659a.put("notificationInfo", FastJsonResponse$Field.m22654a("notificationInfo", GmmPlaceReportPayloadNotificationInfo.class));
        f151659a.put("snapToPlaceRequest", FastJsonResponse$Field.m22654a("snapToPlaceRequest", GmmPlaceReportPayloadSnapToPlaceRequest.class));
        f151659a.put("snapToPlaceResults", FastJsonResponse$Field.m22658b("snapToPlaceResults", GmmPlaceReportPayloadSnapToPlaceResult.class));
        f151659a.put("userEvent", FastJsonResponse$Field.m22665f("userEvent"));
        f151659a.put("veType", FastJsonResponse$Field.m22650a("veType"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151659a;
    }

    /* renamed from: b */
    public final String mo71622b() {
        return (String) this.f44540b.get("context");
    }

    /* renamed from: c */
    public final String mo71623c() {
        return (String) this.f44540b.get("eventId");
    }

    /* renamed from: d */
    public final String mo71624d() {
        return (String) this.f44540b.get("experimentInfo");
    }

    /* renamed from: e */
    public final String mo71625e() {
        return (String) this.f44540b.get("userEvent");
    }

    /* renamed from: f */
    public final Integer mo71626f() {
        return (Integer) this.f44540b.get("veType");
    }

    public GmmPlaceReportPayloadNotificationInfo getNotificationInfo() {
        return (GmmPlaceReportPayloadNotificationInfo) this.f151660c.get("notificationInfo");
    }

    public GmmPlaceReportPayloadSnapToPlaceRequest getSnapToPlaceRequest() {
        return (GmmPlaceReportPayloadSnapToPlaceRequest) this.f151660c.get("snapToPlaceRequest");
    }

    public ArrayList getSnapToPlaceResults() {
        return (ArrayList) this.f151661d.get("snapToPlaceResults");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f151661d.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151660c.containsKey(str);
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151660c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f151661d.containsKey(str);
    }
}
