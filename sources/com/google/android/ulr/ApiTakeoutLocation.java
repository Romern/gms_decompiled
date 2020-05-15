package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiTakeoutLocation extends sip {

    /* renamed from: a */
    private static final TreeMap f151636a;

    /* renamed from: c */
    private final HashMap f151637c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151636a = treeMap;
        treeMap.put("accuracy", FastJsonResponse$Field.m22650a("accuracy"));
        f151636a.put("activitys", FastJsonResponse$Field.m22658b("activitys", ApiActivityReading.class));
        f151636a.put("altitude", FastJsonResponse$Field.m22650a("altitude"));
        f151636a.put("heading", FastJsonResponse$Field.m22650a("heading"));
        f151636a.put("latitudeE7", FastJsonResponse$Field.m22650a("latitudeE7"));
        f151636a.put("longitudeE7", FastJsonResponse$Field.m22650a("longitudeE7"));
        f151636a.put("timestampMs", FastJsonResponse$Field.m22655b("timestampMs"));
        f151636a.put("velocity", FastJsonResponse$Field.m22650a("velocity"));
        f151636a.put("verticalAccuracy", FastJsonResponse$Field.m22650a("verticalAccuracy"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151636a;
    }

    public ArrayList getActivitys() {
        return (ArrayList) this.f151637c.get("activitys");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f151637c.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f151637c.containsKey(str);
    }
}
