package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BleSensorData extends sip {

    /* renamed from: a */
    private static final TreeMap f151643a;

    static {
        TreeMap treeMap = new TreeMap();
        f151643a = treeMap;
        treeMap.put("data", FastJsonResponse$Field.m22665f("data"));
        f151643a.put("mac", FastJsonResponse$Field.m22655b("mac"));
        f151643a.put("type", FastJsonResponse$Field.m22665f("type"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151643a;
    }

    /* renamed from: b */
    public final String mo71605b() {
        return (String) this.f44540b.get("data");
    }

    /* renamed from: c */
    public final Long mo71606c() {
        return (Long) this.f44540b.get("mac");
    }

    /* renamed from: d */
    public final String mo71607d() {
        return (String) this.f44540b.get("type");
    }
}
