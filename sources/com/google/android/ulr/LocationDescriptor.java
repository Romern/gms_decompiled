package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LocationDescriptor extends sip {

    /* renamed from: a */
    private static final TreeMap f151677a;

    /* renamed from: c */
    private final HashMap f151678c = new HashMap();

    /* renamed from: d */
    private final HashMap f151679d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151677a = treeMap;
        treeMap.put("attributes", FastJsonResponse$Field.m22654a("attributes", LocationAttributesProto.class));
        f151677a.put("confidence", FastJsonResponse$Field.m22650a("confidence"));
        f151677a.put("diagnosticInfo", FastJsonResponse$Field.m22665f("diagnosticInfo"));
        f151677a.put("featureId", FastJsonResponse$Field.m22654a("featureId", FeatureIdProto.class));
        f151677a.put("historicalProducer", FastJsonResponse$Field.m22665f("historicalProducer"));
        f151677a.put("historicalProminence", FastJsonResponse$Field.m22650a("historicalProminence"));
        f151677a.put("historicalRole", FastJsonResponse$Field.m22665f("historicalRole"));
        f151677a.put("language", FastJsonResponse$Field.m22665f("language"));
        f151677a.put("latlng", FastJsonResponse$Field.m22654a("latlng", LatLng.class));
        f151677a.put("latlngSpan", FastJsonResponse$Field.m22654a("latlngSpan", LatLng.class));
        f151677a.put("levelFeatureId", FastJsonResponse$Field.m22654a("levelFeatureId", FeatureIdProto.class));
        f151677a.put("levelNumber", FastJsonResponse$Field.m22659c("levelNumber"));
        f151677a.put("loc", FastJsonResponse$Field.m22665f("loc"));
        f151677a.put("mid", FastJsonResponse$Field.m22665f("mid"));
        f151677a.put("presenceIntervals", FastJsonResponse$Field.m22658b("presenceIntervals", PresenceInterval.class));
        f151677a.put("producer", FastJsonResponse$Field.m22665f("producer"));
        f151677a.put("provenance", FastJsonResponse$Field.m22665f("provenance"));
        f151677a.put("radius", FastJsonResponse$Field.m22659c("radius"));
        f151677a.put("rect", FastJsonResponse$Field.m22654a("rect", LatLngRect.class));
        f151677a.put("role", FastJsonResponse$Field.m22665f("role"));
        f151677a.put("semanticPlaces", FastJsonResponse$Field.m22658b("semanticPlaces", SemanticPlace.class));
        f151677a.put("semantics", FastJsonResponse$Field.m22667g("semantics"));
        f151677a.put("timestamp", FastJsonResponse$Field.m22655b("timestamp"));
        f151677a.put("visibleNetworks", FastJsonResponse$Field.m22658b("visibleNetworks", VisibleNetwork.class));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151677a;
    }

    /* renamed from: b */
    public final Integer mo71663b() {
        return (Integer) this.f44540b.get("confidence");
    }

    /* renamed from: c */
    public final String mo71664c() {
        return (String) this.f44540b.get("diagnosticInfo");
    }

    /* renamed from: d */
    public final String mo71665d() {
        return (String) this.f44540b.get("historicalProducer");
    }

    /* renamed from: e */
    public final Integer mo71666e() {
        return (Integer) this.f44540b.get("historicalProminence");
    }

    /* renamed from: f */
    public final String mo71667f() {
        return (String) this.f44540b.get("historicalRole");
    }

    /* renamed from: g */
    public final String mo71668g() {
        return (String) this.f44540b.get("language");
    }

    public LocationAttributesProto getAttributes() {
        return (LocationAttributesProto) this.f151678c.get("attributes");
    }

    public FeatureIdProto getFeatureId() {
        return (FeatureIdProto) this.f151678c.get("featureId");
    }

    public LatLng getLatlng() {
        return (LatLng) this.f151678c.get("latlng");
    }

    public LatLng getLatlngSpan() {
        return (LatLng) this.f151678c.get("latlngSpan");
    }

    public FeatureIdProto getLevelFeatureId() {
        return (FeatureIdProto) this.f151678c.get("levelFeatureId");
    }

    public ArrayList getPresenceIntervals() {
        return (ArrayList) this.f151679d.get("presenceIntervals");
    }

    public LatLngRect getRect() {
        return (LatLngRect) this.f151678c.get("rect");
    }

    public ArrayList getSemanticPlaces() {
        return (ArrayList) this.f151679d.get("semanticPlaces");
    }

    public ArrayList getVisibleNetworks() {
        return (ArrayList) this.f151679d.get("visibleNetworks");
    }

    /* renamed from: h */
    public final Float mo71678h() {
        return (Float) this.f44540b.get("levelNumber");
    }

    /* renamed from: i */
    public final String mo71679i() {
        return (String) this.f44540b.get("loc");
    }

    /* renamed from: j */
    public final String mo71680j() {
        return (String) this.f44540b.get("mid");
    }

    /* renamed from: k */
    public final String mo71681k() {
        return (String) this.f44540b.get("producer");
    }

    /* renamed from: l */
    public final String mo71682l() {
        return (String) this.f44540b.get("provenance");
    }

    /* renamed from: m */
    public final Float mo71683m() {
        return (Float) this.f44540b.get("radius");
    }

    /* renamed from: n */
    public final String mo71684n() {
        return (String) this.f44540b.get("role");
    }

    /* renamed from: o */
    public final ArrayList mo71685o() {
        return (ArrayList) this.f44540b.get("semantics");
    }

    /* renamed from: p */
    public final Long mo71686p() {
        return (Long) this.f44540b.get("timestamp");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f151679d.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151678c.containsKey(str);
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151678c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f151679d.containsKey(str);
    }
}
