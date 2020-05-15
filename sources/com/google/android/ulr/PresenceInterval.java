package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PresenceInterval extends sip {

    /* renamed from: a */
    private static final TreeMap f151681a;

    static {
        TreeMap treeMap = new TreeMap();
        f151681a = treeMap;
        treeMap.put("confidence", FastJsonResponse$Field.m22650a("confidence"));
        f151681a.put("durationSec", FastJsonResponse$Field.m22665f("durationSec"));
        f151681a.put("startOffsetSec", FastJsonResponse$Field.m22665f("startOffsetSec"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151681a;
    }

    /* renamed from: b */
    public final Integer mo71690b() {
        return (Integer) this.f44540b.get("confidence");
    }
}
