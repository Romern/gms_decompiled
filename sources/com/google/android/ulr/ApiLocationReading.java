package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiLocationReading extends sip {

    /* renamed from: a */
    private static final TreeMap f151610a;

    /* renamed from: c */
    private final HashMap f151611c = new HashMap();

    /* renamed from: d */
    private final HashMap f151612d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151610a = treeMap;
        treeMap.put("batchDeliveryTimestampMs", FastJsonResponse$Field.m22655b("batchDeliveryTimestampMs"));
        f151610a.put("experiments", FastJsonResponse$Field.m22658b("experiments", ApiExperiment.class));
        f151610a.put("isOversampled", FastJsonResponse$Field.m22663e("isOversampled"));
        f151610a.put("location", FastJsonResponse$Field.m22654a("location", ApiLocation.class));
        f151610a.put("readingInfo", FastJsonResponse$Field.m22654a("readingInfo", ApiReadingInfo.class));
        f151610a.put("rebootSequence", FastJsonResponse$Field.m22650a("rebootSequence"));
        f151610a.put("sequence", FastJsonResponse$Field.m22650a("sequence"));
        f151610a.put("timestampMs", FastJsonResponse$Field.m22655b("timestampMs"));
    }

    public ApiLocationReading() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151610a;
    }

    /* renamed from: b */
    public final Long mo71533b() {
        return (Long) this.f44540b.get("batchDeliveryTimestampMs");
    }

    /* renamed from: c */
    public final Boolean mo71534c() {
        return (Boolean) this.f44540b.get("isOversampled");
    }

    /* renamed from: d */
    public final Integer mo71535d() {
        return (Integer) this.f44540b.get("rebootSequence");
    }

    /* renamed from: e */
    public final Integer mo71536e() {
        return (Integer) this.f44540b.get("sequence");
    }

    /* renamed from: f */
    public final Long mo71537f() {
        return (Long) this.f44540b.get("timestampMs");
    }

    public ArrayList getExperiments() {
        return (ArrayList) this.f151612d.get("experiments");
    }

    public ApiLocation getLocation() {
        return (ApiLocation) this.f151611c.get("location");
    }

    public ApiReadingInfo getReadingInfo() {
        return (ApiReadingInfo) this.f151611c.get("readingInfo");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f151612d.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151611c.containsKey(str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sio.a(java.lang.String, sio):void
     arg types: [java.lang.String, com.google.android.ulr.ApiLocation]
     candidates:
      com.google.android.ulr.ApiLocationReading.a(java.lang.String, java.util.ArrayList):void
      sip.a(java.lang.String, double):void
      sip.a(java.lang.String, float):void
      sip.a(java.lang.String, int):void
      sip.a(java.lang.String, long):void
      sip.a(java.lang.String, java.lang.String):void
      sip.a(java.lang.String, java.math.BigDecimal):void
      sip.a(java.lang.String, java.math.BigInteger):void
      sip.a(java.lang.String, java.util.Map):void
      sip.a(java.lang.String, boolean):void
      sip.a(java.lang.String, byte[]):void
      sio.a(java.lang.String, java.lang.Object):boolean
      sio.a(com.google.android.gms.common.server.response.FastJsonResponse$Field, double):void
      sio.a(com.google.android.gms.common.server.response.FastJsonResponse$Field, java.lang.Object):void
      sio.a(com.google.android.gms.common.server.response.FastJsonResponse$Field, boolean):void
      sio.a(com.google.android.gms.common.server.response.FastJsonResponse$Field, byte[]):void
      sio.a(java.lang.String, double):void
      sio.a(java.lang.String, float):void
      sio.a(java.lang.String, int):void
      sio.a(java.lang.String, long):void
      sio.a(java.lang.String, java.lang.String):void
      sio.a(java.lang.String, java.math.BigDecimal):void
      sio.a(java.lang.String, java.math.BigInteger):void
      sio.a(java.lang.String, java.util.ArrayList):void
      sio.a(java.lang.String, java.util.Map):void
      sio.a(java.lang.String, boolean):void
      sio.a(java.lang.String, byte[]):void
      sio.a(java.lang.String, sio):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sio.a(java.lang.String, sio):void
     arg types: [java.lang.String, com.google.android.ulr.ApiReadingInfo]
     candidates:
      com.google.android.ulr.ApiLocationReading.a(java.lang.String, java.util.ArrayList):void
      sip.a(java.lang.String, double):void
      sip.a(java.lang.String, float):void
      sip.a(java.lang.String, int):void
      sip.a(java.lang.String, long):void
      sip.a(java.lang.String, java.lang.String):void
      sip.a(java.lang.String, java.math.BigDecimal):void
      sip.a(java.lang.String, java.math.BigInteger):void
      sip.a(java.lang.String, java.util.Map):void
      sip.a(java.lang.String, boolean):void
      sip.a(java.lang.String, byte[]):void
      sio.a(java.lang.String, java.lang.Object):boolean
      sio.a(com.google.android.gms.common.server.response.FastJsonResponse$Field, double):void
      sio.a(com.google.android.gms.common.server.response.FastJsonResponse$Field, java.lang.Object):void
      sio.a(com.google.android.gms.common.server.response.FastJsonResponse$Field, boolean):void
      sio.a(com.google.android.gms.common.server.response.FastJsonResponse$Field, byte[]):void
      sio.a(java.lang.String, double):void
      sio.a(java.lang.String, float):void
      sio.a(java.lang.String, int):void
      sio.a(java.lang.String, long):void
      sio.a(java.lang.String, java.lang.String):void
      sio.a(java.lang.String, java.math.BigDecimal):void
      sio.a(java.lang.String, java.math.BigInteger):void
      sio.a(java.lang.String, java.util.ArrayList):void
      sio.a(java.lang.String, java.util.Map):void
      sio.a(java.lang.String, boolean):void
      sio.a(java.lang.String, byte[]):void
      sio.a(java.lang.String, sio):void */
    public ApiLocationReading(Long l, ArrayList arrayList, ApiLocation apiLocation, ApiReadingInfo apiReadingInfo, Integer num, Integer num2, Long l2) {
        if (l != null) {
            mo25603a("batchDeliveryTimestampMs", l.longValue());
        }
        if (arrayList != null) {
            mo25595a("experiments", arrayList);
        }
        mo25598a("location", (sio) apiLocation);
        mo25598a("readingInfo", (sio) apiReadingInfo);
        mo25602a("rebootSequence", num.intValue());
        mo25602a("sequence", num2.intValue());
        if (l2 != null) {
            mo25603a("timestampMs", l2.longValue());
        }
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151611c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f151612d.containsKey(str);
    }
}
