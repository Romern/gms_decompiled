package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiModelState extends sip {

    /* renamed from: a */
    private static final TreeMap f151617a;

    static {
        TreeMap treeMap = new TreeMap();
        f151617a = treeMap;
        treeMap.put("stateId", FastJsonResponse$Field.m22650a("stateId"));
        f151617a.put("version", FastJsonResponse$Field.m22650a("version"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151617a;
    }

    /* renamed from: b */
    public final Integer mo71560b() {
        return (Integer) this.f44540b.get("stateId");
    }

    /* renamed from: c */
    public final Integer mo71561c() {
        return (Integer) this.f44540b.get("version");
    }
}
