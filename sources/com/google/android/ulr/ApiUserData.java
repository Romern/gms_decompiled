package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiUserData extends sip {

    /* renamed from: a */
    private static final TreeMap f151638a;

    static {
        TreeMap treeMap = new TreeMap();
        f151638a = treeMap;
        treeMap.put("dataBinary", FastJsonResponse$Field.m22665f("dataBinary"));
        f151638a.put("dataEncoded", FastJsonResponse$Field.m22665f("dataEncoded"));
        f151638a.put("dataType", FastJsonResponse$Field.m22665f("dataType"));
        f151638a.put("timestampMs", FastJsonResponse$Field.m22655b("timestampMs"));
    }

    public ApiUserData() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151638a;
    }

    /* renamed from: b */
    public final String mo71597b() {
        return (String) this.f44540b.get("dataBinary");
    }

    /* renamed from: c */
    public final String mo71598c() {
        return (String) this.f44540b.get("dataEncoded");
    }

    /* renamed from: d */
    public final String mo71599d() {
        return (String) this.f44540b.get("dataType");
    }

    /* renamed from: e */
    public final Long mo71600e() {
        return (Long) this.f44540b.get("timestampMs");
    }

    public ApiUserData(String str, String str2, Long l) {
        if (str != null) {
            mo25604a("dataEncoded", str);
        }
        if (str2 != null) {
            mo25604a("dataType", str2);
        }
        mo25603a("timestampMs", l.longValue());
    }
}
