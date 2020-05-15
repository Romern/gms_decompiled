package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SemanticPlace extends sip {

    /* renamed from: a */
    private static final TreeMap f151688a;

    /* renamed from: c */
    private final HashMap f151689c = new HashMap();

    /* renamed from: d */
    private final HashMap f151690d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151688a = treeMap;
        treeMap.put("confidence", FastJsonResponse$Field.m22665f("confidence"));
        f151688a.put("featureId", FastJsonResponse$Field.m22654a("featureId", FeatureIdProto.class));
        f151688a.put("gconceptInstances", FastJsonResponse$Field.m22658b("gconceptInstances", SemanticPlaceGConceptInstanceProto.class));
        f151688a.put("score", FastJsonResponse$Field.m22659c("score"));
        f151688a.put("source", FastJsonResponse$Field.m22665f("source"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151688a;
    }

    /* renamed from: b */
    public final String mo71700b() {
        return (String) this.f44540b.get("confidence");
    }

    /* renamed from: c */
    public final Float mo71701c() {
        return (Float) this.f44540b.get("score");
    }

    /* renamed from: d */
    public final String mo71702d() {
        return (String) this.f44540b.get("source");
    }

    public FeatureIdProto getFeatureId() {
        return (FeatureIdProto) this.f151689c.get("featureId");
    }

    public ArrayList getGconceptInstances() {
        return (ArrayList) this.f151690d.get("gconceptInstances");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f151690d.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151689c.containsKey(str);
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151689c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f151690d.containsKey(str);
    }
}
