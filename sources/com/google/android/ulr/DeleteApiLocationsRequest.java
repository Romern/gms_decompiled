package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DeleteApiLocationsRequest extends sip {

    /* renamed from: a */
    private static final TreeMap f151647a;

    /* renamed from: c */
    private final HashMap f151648c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151647a = treeMap;
        treeMap.put("clientInfo", FastJsonResponse$Field.m22654a("clientInfo", ApiClientInfo.class));
        f151647a.put("firstTimestampMs", FastJsonResponse$Field.m22655b("firstTimestampMs"));
        f151647a.put("lastTimestampMs", FastJsonResponse$Field.m22655b("lastTimestampMs"));
        f151647a.put("settingsLastKnownTimestampMs", FastJsonResponse$Field.m22655b("settingsLastKnownTimestampMs"));
    }

    public DeleteApiLocationsRequest() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151647a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151648c.containsKey(str);
    }

    public ApiClientInfo getClientInfo() {
        return (ApiClientInfo) this.f151648c.get("clientInfo");
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151648c.put(str, sio);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sio.a(java.lang.String, sio):void
     arg types: [java.lang.String, com.google.android.ulr.ApiClientInfo]
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
    public DeleteApiLocationsRequest(ApiClientInfo apiClientInfo) {
        mo25598a("clientInfo", (sio) apiClientInfo);
    }
}
