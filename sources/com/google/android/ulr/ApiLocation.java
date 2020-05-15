package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiLocation extends sip {

    /* renamed from: a */
    private static final TreeMap f151609a;

    static {
        TreeMap treeMap = new TreeMap();
        f151609a = treeMap;
        treeMap.put("altitudeMetersAboveSeaLevel", FastJsonResponse$Field.m22650a("altitudeMetersAboveSeaLevel"));
        f151609a.put("approximatelyStationary", FastJsonResponse$Field.m22663e("approximatelyStationary"));
        f151609a.put("confidence", FastJsonResponse$Field.m22650a("confidence"));
        f151609a.put("headingDegreesEastOfTrueNorth", FastJsonResponse$Field.m22650a("headingDegreesEastOfTrueNorth"));
        f151609a.put("horizontalAccuracyMeters", FastJsonResponse$Field.m22650a("horizontalAccuracyMeters"));
        f151609a.put("indoorLevelE3", FastJsonResponse$Field.m22650a("indoorLevelE3"));
        f151609a.put("indoorLevelFeatureId", FastJsonResponse$Field.m22665f("indoorLevelFeatureId"));
        f151609a.put("latitudeE7", FastJsonResponse$Field.m22650a("latitudeE7"));
        f151609a.put("longitudeE7", FastJsonResponse$Field.m22650a("longitudeE7"));
        f151609a.put("speedMetersPerSecond", FastJsonResponse$Field.m22650a("speedMetersPerSecond"));
        f151609a.put("verticalAccuracyMeters", FastJsonResponse$Field.m22650a("verticalAccuracyMeters"));
    }

    public ApiLocation() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151609a;
    }

    /* renamed from: b */
    public final Integer mo71522b() {
        return (Integer) this.f44540b.get("altitudeMetersAboveSeaLevel");
    }

    /* renamed from: c */
    public final Boolean mo71523c() {
        return (Boolean) this.f44540b.get("approximatelyStationary");
    }

    /* renamed from: d */
    public final Integer mo71524d() {
        return (Integer) this.f44540b.get("confidence");
    }

    /* renamed from: e */
    public final Integer mo71525e() {
        return (Integer) this.f44540b.get("headingDegreesEastOfTrueNorth");
    }

    /* renamed from: f */
    public final Integer mo71526f() {
        return (Integer) this.f44540b.get("horizontalAccuracyMeters");
    }

    /* renamed from: g */
    public final Integer mo71527g() {
        return (Integer) this.f44540b.get("indoorLevelE3");
    }

    /* renamed from: h */
    public final String mo71528h() {
        return (String) this.f44540b.get("indoorLevelFeatureId");
    }

    /* renamed from: i */
    public final Integer mo71529i() {
        return (Integer) this.f44540b.get("latitudeE7");
    }

    /* renamed from: j */
    public final Integer mo71530j() {
        return (Integer) this.f44540b.get("longitudeE7");
    }

    /* renamed from: k */
    public final Integer mo71531k() {
        return (Integer) this.f44540b.get("speedMetersPerSecond");
    }

    /* renamed from: l */
    public final Integer mo71532l() {
        return (Integer) this.f44540b.get("verticalAccuracyMeters");
    }

    public ApiLocation(Integer num, Boolean bool, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, Integer num7, Integer num8) {
        if (num != null) {
            mo25602a("altitudeMetersAboveSeaLevel", num.intValue());
        }
        if (bool != null) {
            mo25605a("approximatelyStationary", bool.booleanValue());
        }
        if (num2 != null) {
            mo25602a("headingDegreesEastOfTrueNorth", num2.intValue());
        }
        if (num3 != null) {
            mo25602a("horizontalAccuracyMeters", num3.intValue());
        }
        if (num4 != null) {
            mo25602a("indoorLevelE3", num4.intValue());
        }
        if (str != null) {
            mo25604a("indoorLevelFeatureId", str);
        }
        if (num5 != null) {
            mo25602a("latitudeE7", num5.intValue());
        }
        if (num6 != null) {
            mo25602a("longitudeE7", num6.intValue());
        }
        if (num7 != null) {
            mo25602a("speedMetersPerSecond", num7.intValue());
        }
        if (num8 != null) {
            mo25602a("verticalAccuracyMeters", num8.intValue());
        }
    }
}
