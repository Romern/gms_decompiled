package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WifiStrengthProto extends sip {

    /* renamed from: a */
    private static final TreeMap f151706a;

    /* renamed from: c */
    private final HashMap f151707c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151706a = treeMap;
        treeMap.put("collectionPoint", FastJsonResponse$Field.m22665f("collectionPoint"));
        f151706a.put("frequencyMhz", FastJsonResponse$Field.m22650a("frequencyMhz"));
        f151706a.put("isConnected", FastJsonResponse$Field.m22663e("isConnected"));
        f151706a.put("mac", FastJsonResponse$Field.m22655b("mac"));
        f151706a.put("rttRanging", FastJsonResponse$Field.m22654a("rttRanging", RttRangingProto.class));
        f151706a.put("ssid", FastJsonResponse$Field.m22665f("ssid"));
        f151706a.put("strength", FastJsonResponse$Field.m22650a("strength"));
        f151706a.put("wifiAuthType", FastJsonResponse$Field.m22665f("wifiAuthType"));
    }

    public WifiStrengthProto() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151706a;
    }

    /* renamed from: b */
    public final String mo71731b() {
        return (String) this.f44540b.get("collectionPoint");
    }

    /* renamed from: c */
    public final Integer mo71732c() {
        return (Integer) this.f44540b.get("frequencyMhz");
    }

    /* renamed from: d */
    public final Boolean mo71733d() {
        return (Boolean) this.f44540b.get("isConnected");
    }

    /* renamed from: e */
    public final Long mo71734e() {
        return (Long) this.f44540b.get("mac");
    }

    /* renamed from: f */
    public final String mo71735f() {
        return (String) this.f44540b.get("ssid");
    }

    /* renamed from: g */
    public final Integer mo71736g() {
        return (Integer) this.f44540b.get("strength");
    }

    public RttRangingProto getRttRanging() {
        return (RttRangingProto) this.f151707c.get("rttRanging");
    }

    /* renamed from: h */
    public final String mo71738h() {
        return (String) this.f44540b.get("wifiAuthType");
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151707c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151707c.containsKey(str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sio.a(java.lang.String, sio):void
     arg types: [java.lang.String, com.google.android.ulr.RttRangingProto]
     candidates:
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
    public WifiStrengthProto(Integer num, Boolean bool, Long l, RttRangingProto rttRangingProto, String str, Integer num2, String str2) {
        mo25602a("frequencyMhz", num.intValue());
        if (bool != null) {
            mo25605a("isConnected", bool.booleanValue());
        }
        mo25603a("mac", l.longValue());
        if (rttRangingProto != null) {
            mo25598a("rttRanging", (sio) rttRangingProto);
        }
        if (str != null) {
            mo25604a("ssid", str);
        }
        mo25602a("strength", num2.intValue());
        if (str2 != null) {
            mo25604a("wifiAuthType", str2);
        }
    }
}
