package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiRate extends sip {

    /* renamed from: a */
    private static final TreeMap f151625a;

    /* renamed from: c */
    private final HashMap f151626c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151625a = treeMap;
        treeMap.put("bleRate", FastJsonResponse$Field.m22654a("bleRate", ApiBleRate.class));
        f151625a.put("description", FastJsonResponse$Field.m22665f("description"));
        f151625a.put("newRequest", FastJsonResponse$Field.m22663e("newRequest"));
        f151625a.put("samplePeriodMs", FastJsonResponse$Field.m22655b("samplePeriodMs"));
        f151625a.put("sampleReason", FastJsonResponse$Field.m22665f("sampleReason"));
        f151625a.put("sampleSource", FastJsonResponse$Field.m22665f("sampleSource"));
        f151625a.put("timestampMs", FastJsonResponse$Field.m22655b("timestampMs"));
        f151625a.put("uploadPeriodMs", FastJsonResponse$Field.m22655b("uploadPeriodMs"));
        f151625a.put("uploadReason", FastJsonResponse$Field.m22665f("uploadReason"));
        f151625a.put("uploadSource", FastJsonResponse$Field.m22665f("uploadSource"));
    }

    public ApiRate() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151625a;
    }

    /* renamed from: b */
    public final String mo71575b() {
        return (String) this.f44540b.get("description");
    }

    /* renamed from: c */
    public final Boolean mo71576c() {
        return (Boolean) this.f44540b.get("newRequest");
    }

    /* renamed from: d */
    public final Long mo71577d() {
        return (Long) this.f44540b.get("samplePeriodMs");
    }

    /* renamed from: e */
    public final String mo71578e() {
        return (String) this.f44540b.get("sampleReason");
    }

    /* renamed from: f */
    public final String mo71579f() {
        return (String) this.f44540b.get("sampleSource");
    }

    /* renamed from: g */
    public final Long mo71580g() {
        return (Long) this.f44540b.get("timestampMs");
    }

    public ApiBleRate getBleRate() {
        return (ApiBleRate) this.f151626c.get("bleRate");
    }

    /* renamed from: h */
    public final Long mo71582h() {
        return (Long) this.f44540b.get("uploadPeriodMs");
    }

    /* renamed from: i */
    public final String mo71583i() {
        return (String) this.f44540b.get("uploadReason");
    }

    /* renamed from: j */
    public final String mo71584j() {
        return (String) this.f44540b.get("uploadSource");
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151626c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151626c.containsKey(str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sio.a(java.lang.String, sio):void
     arg types: [java.lang.String, com.google.android.ulr.ApiBleRate]
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
    public ApiRate(ApiBleRate apiBleRate, String str, Boolean bool, Long l, String str2, String str3, Long l2, Long l3, String str4, String str5) {
        if (apiBleRate != null) {
            mo25598a("bleRate", (sio) apiBleRate);
        }
        if (str != null) {
            mo25604a("description", str);
        }
        if (bool != null) {
            mo25605a("newRequest", bool.booleanValue());
        }
        if (l != null) {
            mo25603a("samplePeriodMs", l.longValue());
        }
        if (str2 != null) {
            mo25604a("sampleReason", str2);
        }
        if (str3 != null) {
            mo25604a("sampleSource", str3);
        }
        if (l2 != null) {
            mo25603a("timestampMs", l2.longValue());
        }
        if (l3 != null) {
            mo25603a("uploadPeriodMs", l3.longValue());
        }
        if (str4 != null) {
            mo25604a("uploadReason", str4);
        }
        if (str5 != null) {
            mo25604a("uploadSource", str5);
        }
    }
}
