package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LatLng extends sip {

    /* renamed from: a */
    private static final TreeMap f151671a;

    static {
        TreeMap treeMap = new TreeMap();
        f151671a = treeMap;
        treeMap.put("latitudeE7", FastJsonResponse$Field.m22650a("latitudeE7"));
        f151671a.put("longitudeE7", FastJsonResponse$Field.m22650a("longitudeE7"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151671a;
    }

    /* renamed from: b */
    public final Integer mo71638b() {
        return (Integer) this.f44540b.get("latitudeE7");
    }

    /* renamed from: c */
    public final Integer mo71639c() {
        return (Integer) this.f44540b.get("longitudeE7");
    }
}
