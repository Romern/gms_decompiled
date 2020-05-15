package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SemanticPlaceGConceptInstanceProto extends sip {

    /* renamed from: a */
    private static final TreeMap f151691a;

    static {
        TreeMap treeMap = new TreeMap();
        f151691a = treeMap;
        treeMap.put("gconceptId", FastJsonResponse$Field.m22665f("gconceptId"));
        f151691a.put("prominence", FastJsonResponse$Field.m22665f("prominence"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151691a;
    }

    /* renamed from: b */
    public final String mo71705b() {
        return (String) this.f44540b.get("gconceptId");
    }

    /* renamed from: c */
    public final String mo71706c() {
        return (String) this.f44540b.get("prominence");
    }
}
