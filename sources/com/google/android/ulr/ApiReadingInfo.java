package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiReadingInfo extends sip {

    /* renamed from: a */
    private static final TreeMap f151627a;

    /* renamed from: c */
    private final HashMap f151628c = new HashMap();

    /* renamed from: d */
    private final HashMap f151629d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151627a = treeMap;
        treeMap.put("batteryCharging", FastJsonResponse$Field.m22663e("batteryCharging"));
        f151627a.put("batteryCondition", FastJsonResponse$Field.m22654a("batteryCondition", ApiBatteryCondition.class));
        f151627a.put("batteryLevel", FastJsonResponse$Field.m22650a("batteryLevel"));
        f151627a.put("source", FastJsonResponse$Field.m22665f("source"));
        f151627a.put("wifiScans", FastJsonResponse$Field.m22658b("wifiScans", WifiStrengthProto.class));
    }

    public ApiReadingInfo() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151627a;
    }

    /* renamed from: b */
    public final Boolean mo71585b() {
        return (Boolean) this.f44540b.get("batteryCharging");
    }

    /* renamed from: c */
    public final Integer mo71586c() {
        return (Integer) this.f44540b.get("batteryLevel");
    }

    /* renamed from: d */
    public final String mo71587d() {
        return (String) this.f44540b.get("source");
    }

    public ApiBatteryCondition getBatteryCondition() {
        return (ApiBatteryCondition) this.f151628c.get("batteryCondition");
    }

    public ArrayList getWifiScans() {
        return (ArrayList) this.f151629d.get("wifiScans");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f151629d.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151628c.containsKey(str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sio.a(java.lang.String, sio):void
     arg types: [java.lang.String, com.google.android.ulr.ApiBatteryCondition]
     candidates:
      com.google.android.ulr.ApiReadingInfo.a(java.lang.String, java.util.ArrayList):void
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
    public ApiReadingInfo(Boolean bool, ApiBatteryCondition apiBatteryCondition, String str, ArrayList arrayList) {
        if (bool != null) {
            mo25605a("batteryCharging", bool.booleanValue());
        }
        if (apiBatteryCondition != null) {
            mo25598a("batteryCondition", (sio) apiBatteryCondition);
        }
        if (str != null) {
            mo25604a("source", str);
        }
        if (arrayList != null) {
            mo25595a("wifiScans", arrayList);
        }
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151628c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f151629d.containsKey(str);
    }
}
