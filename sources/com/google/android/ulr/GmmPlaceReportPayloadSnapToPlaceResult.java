package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GmmPlaceReportPayloadSnapToPlaceResult extends sip {

    /* renamed from: a */
    private static final TreeMap f151669a;

    /* renamed from: c */
    private final HashMap f151670c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151669a = treeMap;
        treeMap.put("confidence", FastJsonResponse$Field.m22650a("confidence"));
        f151669a.put("featureId", FastJsonResponse$Field.m22654a("featureId", FeatureIdProto.class));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151669a;
    }

    /* renamed from: b */
    public final Integer mo71636b() {
        return (Integer) this.f44540b.get("confidence");
    }

    public FeatureIdProto getFeatureId() {
        return (FeatureIdProto) this.f151670c.get("featureId");
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151670c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151670c.containsKey(str);
    }
}
