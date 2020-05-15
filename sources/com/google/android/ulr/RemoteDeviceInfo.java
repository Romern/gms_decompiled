package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RemoteDeviceInfo extends sip {

    /* renamed from: a */
    private static final TreeMap f151682a;

    static {
        TreeMap treeMap = new TreeMap();
        f151682a = treeMap;
        treeMap.put("devicePrettyName", FastJsonResponse$Field.m22665f("devicePrettyName"));
        f151682a.put("deviceTag", FastJsonResponse$Field.m22650a("deviceTag"));
        f151682a.put("isRestricted", FastJsonResponse$Field.m22663e("isRestricted"));
        f151682a.put("lastModifiedTimestampMs", FastJsonResponse$Field.m22655b("lastModifiedTimestampMs"));
        f151682a.put("lastReportTimestampMs", FastJsonResponse$Field.m22655b("lastReportTimestampMs"));
        f151682a.put("reportingEnabled", FastJsonResponse$Field.m22663e("reportingEnabled"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151682a;
    }

    /* renamed from: b */
    public final Boolean mo71691b() {
        return (Boolean) this.f44540b.get("reportingEnabled");
    }
}
