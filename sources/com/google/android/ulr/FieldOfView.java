package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FieldOfView extends sip {

    /* renamed from: a */
    private static final TreeMap f151650a;

    static {
        TreeMap treeMap = new TreeMap();
        f151650a = treeMap;
        treeMap.put("fieldOfViewXDegrees", FastJsonResponse$Field.m22659c("fieldOfViewXDegrees"));
        f151650a.put("fieldOfViewYDegrees", FastJsonResponse$Field.m22659c("fieldOfViewYDegrees"));
        f151650a.put("screenWidthPixels", FastJsonResponse$Field.m22650a("screenWidthPixels"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151650a;
    }

    /* renamed from: b */
    public final Float mo71615b() {
        return (Float) this.f44540b.get("fieldOfViewXDegrees");
    }

    /* renamed from: c */
    public final Float mo71616c() {
        return (Float) this.f44540b.get("fieldOfViewYDegrees");
    }

    /* renamed from: d */
    public final Integer mo71617d() {
        return (Integer) this.f44540b.get("screenWidthPixels");
    }
}
