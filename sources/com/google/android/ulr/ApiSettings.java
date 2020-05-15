package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiSettings extends sip {

    /* renamed from: a */
    private static final TreeMap f151632a;

    /* renamed from: c */
    private final HashMap f151633c = new HashMap();

    /* renamed from: d */
    private final HashMap f151634d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151632a = treeMap;
        treeMap.put("androidGcmRegistrationId", FastJsonResponse$Field.m22665f("androidGcmRegistrationId"));
        f151632a.put("concurrencyType", FastJsonResponse$Field.m22665f("concurrencyType"));
        f151632a.put("deleteOperations", FastJsonResponse$Field.m22658b("deleteOperations", ApiDeleteHistoryOperation.class));
        f151632a.put("historyEnabled", FastJsonResponse$Field.m22663e("historyEnabled"));
        f151632a.put("lastModifiedTimestampMs", FastJsonResponse$Field.m22655b("lastModifiedTimestampMs"));
        f151632a.put("legalCountryCode", FastJsonResponse$Field.m22665f("legalCountryCode"));
        f151632a.put("reportingEnabled", FastJsonResponse$Field.m22663e("reportingEnabled"));
        f151632a.put("source", FastJsonResponse$Field.m22665f("source"));
        f151632a.put("ulrRelatedGlobalSettings", FastJsonResponse$Field.m22654a("ulrRelatedGlobalSettings", ApiDeviceSetting.class));
        f151632a.put("userRestriction", FastJsonResponse$Field.m22665f("userRestriction"));
    }

    public ApiSettings() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151632a;
    }

    /* renamed from: b */
    public final String mo71591b() {
        return (String) this.f44540b.get("userRestriction");
    }

    public ArrayList getDeleteOperations() {
        return (ArrayList) this.f151634d.get("deleteOperations");
    }

    public ApiDeviceSetting getUlrRelatedGlobalSettings() {
        return (ApiDeviceSetting) this.f151633c.get("ulrRelatedGlobalSettings");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f151634d.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151633c.containsKey(str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sio.a(java.lang.String, sio):void
     arg types: [java.lang.String, com.google.android.ulr.ApiDeviceSetting]
     candidates:
      com.google.android.ulr.ApiSettings.a(java.lang.String, java.util.ArrayList):void
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
    public ApiSettings(Boolean bool, Long l, Boolean bool2, ApiDeviceSetting apiDeviceSetting) {
        if (bool != null) {
            mo25605a("historyEnabled", bool.booleanValue());
        }
        if (l != null) {
            mo25603a("lastModifiedTimestampMs", l.longValue());
        }
        if (bool2 != null) {
            mo25605a("reportingEnabled", bool2.booleanValue());
        }
        mo25598a("ulrRelatedGlobalSettings", (sio) apiDeviceSetting);
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151633c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f151634d.containsKey(str);
    }
}
