package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RttRangingProto extends sip {

    /* renamed from: a */
    private static final TreeMap f151687a;

    static {
        TreeMap treeMap = new TreeMap();
        f151687a = treeMap;
        treeMap.put("rttAttemptedMeasurementsNumber", FastJsonResponse$Field.m22650a("rttAttemptedMeasurementsNumber"));
        f151687a.put("rttChannelBandwidth", FastJsonResponse$Field.m22650a("rttChannelBandwidth"));
        f151687a.put("rttDistanceStdDevMm", FastJsonResponse$Field.m22650a("rttDistanceStdDevMm"));
        f151687a.put("rttEstimatedDistanceMm", FastJsonResponse$Field.m22650a("rttEstimatedDistanceMm"));
        f151687a.put("successfulRttMeasurements", FastJsonResponse$Field.m22650a("successfulRttMeasurements"));
    }

    public RttRangingProto() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151687a;
    }

    /* renamed from: b */
    public final Integer mo71695b() {
        return (Integer) this.f44540b.get("rttAttemptedMeasurementsNumber");
    }

    /* renamed from: c */
    public final Integer mo71696c() {
        return (Integer) this.f44540b.get("rttChannelBandwidth");
    }

    /* renamed from: d */
    public final Integer mo71697d() {
        return (Integer) this.f44540b.get("rttDistanceStdDevMm");
    }

    /* renamed from: e */
    public final Integer mo71698e() {
        return (Integer) this.f44540b.get("rttEstimatedDistanceMm");
    }

    /* renamed from: f */
    public final Integer mo71699f() {
        return (Integer) this.f44540b.get("successfulRttMeasurements");
    }

    public RttRangingProto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        mo25602a("rttAttemptedMeasurementsNumber", num.intValue());
        mo25602a("rttChannelBandwidth", num2.intValue());
        mo25602a("rttDistanceStdDevMm", num3.intValue());
        mo25602a("rttEstimatedDistanceMm", num4.intValue());
        mo25602a("successfulRttMeasurements", num5.intValue());
    }
}
