package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LocationAttributesProto extends sip {

    /* renamed from: a */
    private static final TreeMap f151674a;

    /* renamed from: c */
    private final HashMap f151675c = new HashMap();

    /* renamed from: d */
    private final HashMap f151676d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151674a = treeMap;
        treeMap.put("activityRecords", FastJsonResponse$Field.m22658b("activityRecords", ActivityRecord.class));
        f151674a.put("adsConfidence", FastJsonResponse$Field.m22659c("adsConfidence"));
        f151674a.put("altitudeMetersFromGround", FastJsonResponse$Field.m22661d("altitudeMetersFromGround"));
        f151674a.put("bearingAccuracyDegrees", FastJsonResponse$Field.m22650a("bearingAccuracyDegrees"));
        f151674a.put("bearingDegrees", FastJsonResponse$Field.m22650a("bearingDegrees"));
        f151674a.put("boardedTransitVehicleToken", FastJsonResponse$Field.m22665f("boardedTransitVehicleToken"));
        f151674a.put("carrierIpType", FastJsonResponse$Field.m22665f("carrierIpType"));
        f151674a.put("deviceLocationRatio", FastJsonResponse$Field.m22659c("deviceLocationRatio"));
        f151674a.put("fieldOfView", FastJsonResponse$Field.m22654a("fieldOfView", FieldOfView.class));
        f151674a.put("headingDegrees", FastJsonResponse$Field.m22650a("headingDegrees"));
        f151674a.put("inference", FastJsonResponse$Field.m22665f("inference"));
        f151674a.put("ipRangeConfidence", FastJsonResponse$Field.m22659c("ipRangeConfidence"));
        f151674a.put("manualEntry", FastJsonResponse$Field.m22665f("manualEntry"));
        f151674a.put("plmSourceLocationCount", FastJsonResponse$Field.m22650a("plmSourceLocationCount"));
        f151674a.put("plmType", FastJsonResponse$Field.m22665f("plmType"));
        f151674a.put("rollDegrees", FastJsonResponse$Field.m22650a("rollDegrees"));
        f151674a.put("speedAccuracyKph", FastJsonResponse$Field.m22650a("speedAccuracyKph"));
        f151674a.put("speedKph", FastJsonResponse$Field.m22650a("speedKph"));
        f151674a.put("tiltDegrees", FastJsonResponse$Field.m22650a("tiltDegrees"));
        f151674a.put("viewportSearchOptions", FastJsonResponse$Field.m22665f("viewportSearchOptions"));
        f151674a.put("weekSecondConfidence", FastJsonResponse$Field.m22659c("weekSecondConfidence"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151674a;
    }

    /* renamed from: b */
    public final Float mo71642b() {
        return (Float) this.f44540b.get("adsConfidence");
    }

    /* renamed from: c */
    public final Double mo71643c() {
        return (Double) this.f44540b.get("altitudeMetersFromGround");
    }

    /* renamed from: d */
    public final Integer mo71644d() {
        return (Integer) this.f44540b.get("bearingAccuracyDegrees");
    }

    /* renamed from: e */
    public final Integer mo71645e() {
        return (Integer) this.f44540b.get("bearingDegrees");
    }

    /* renamed from: f */
    public final String mo71646f() {
        return (String) this.f44540b.get("boardedTransitVehicleToken");
    }

    /* renamed from: g */
    public final String mo71647g() {
        return (String) this.f44540b.get("carrierIpType");
    }

    public ArrayList getActivityRecords() {
        return (ArrayList) this.f151676d.get("activityRecords");
    }

    public FieldOfView getFieldOfView() {
        return (FieldOfView) this.f151675c.get("fieldOfView");
    }

    /* renamed from: h */
    public final Float mo71650h() {
        return (Float) this.f44540b.get("deviceLocationRatio");
    }

    /* renamed from: i */
    public final Integer mo71651i() {
        return (Integer) this.f44540b.get("headingDegrees");
    }

    /* renamed from: j */
    public final String mo71652j() {
        return (String) this.f44540b.get("inference");
    }

    /* renamed from: k */
    public final Float mo71653k() {
        return (Float) this.f44540b.get("ipRangeConfidence");
    }

    /* renamed from: l */
    public final String mo71654l() {
        return (String) this.f44540b.get("manualEntry");
    }

    /* renamed from: m */
    public final Integer mo71655m() {
        return (Integer) this.f44540b.get("plmSourceLocationCount");
    }

    /* renamed from: n */
    public final String mo71656n() {
        return (String) this.f44540b.get("plmType");
    }

    /* renamed from: o */
    public final Integer mo71657o() {
        return (Integer) this.f44540b.get("rollDegrees");
    }

    /* renamed from: p */
    public final Integer mo71658p() {
        return (Integer) this.f44540b.get("speedAccuracyKph");
    }

    /* renamed from: q */
    public final Integer mo71659q() {
        return (Integer) this.f44540b.get("speedKph");
    }

    /* renamed from: r */
    public final Integer mo71660r() {
        return (Integer) this.f44540b.get("tiltDegrees");
    }

    /* renamed from: s */
    public final String mo71661s() {
        return (String) this.f44540b.get("viewportSearchOptions");
    }

    /* renamed from: t */
    public final Float mo71662t() {
        return (Float) this.f44540b.get("weekSecondConfidence");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f151676d.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151675c.containsKey(str);
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151675c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f151676d.containsKey(str);
    }
}
