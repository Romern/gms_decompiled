package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WalletUserEventId extends sip {

    /* renamed from: a */
    private static final TreeMap f151705a;

    static {
        TreeMap treeMap = new TreeMap();
        f151705a = treeMap;
        treeMap.put("eventUuid", FastJsonResponse$Field.m22665f("eventUuid"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151705a;
    }

    /* renamed from: b */
    public final String mo71730b() {
        return (String) this.f44540b.get("eventUuid");
    }
}
