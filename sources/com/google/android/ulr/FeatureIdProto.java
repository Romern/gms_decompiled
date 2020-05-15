package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FeatureIdProto extends sip {

    /* renamed from: a */
    private static final TreeMap f151649a;

    static {
        TreeMap treeMap = new TreeMap();
        f151649a = treeMap;
        treeMap.put("cellId", FastJsonResponse$Field.m22665f("cellId"));
        f151649a.put("fprint", FastJsonResponse$Field.m22665f("fprint"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151649a;
    }
}
