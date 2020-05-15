package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiInternalState extends sip {

    /* renamed from: a */
    private static final TreeMap f151608a;

    static {
        TreeMap treeMap = new TreeMap();
        f151608a = treeMap;
        treeMap.put("internalStateId", FastJsonResponse$Field.m22650a("internalStateId"));
    }

    public ApiInternalState() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151608a;
    }

    /* renamed from: b */
    public final Integer mo71521b() {
        return (Integer) this.f44540b.get("internalStateId");
    }

    public ApiInternalState(Integer num) {
        mo25602a("internalStateId", num.intValue());
    }
}
