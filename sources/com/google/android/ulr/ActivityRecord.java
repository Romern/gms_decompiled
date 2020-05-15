package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ActivityRecord extends sip {

    /* renamed from: a */
    private static final TreeMap f151585a;

    static {
        TreeMap treeMap = new TreeMap();
        f151585a = treeMap;
        treeMap.put("confidence", FastJsonResponse$Field.m22650a("confidence"));
        f151585a.put("type", FastJsonResponse$Field.m22665f("type"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151585a;
    }

    /* renamed from: b */
    public final Integer mo71460b() {
        return (Integer) this.f44540b.get("confidence");
    }

    /* renamed from: c */
    public final String mo71461c() {
        return (String) this.f44540b.get("type");
    }
}
