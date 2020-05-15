package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiBatch extends sip {

    /* renamed from: a */
    private static final TreeMap f151594a;

    /* renamed from: c */
    private final HashMap f151595c = new HashMap();

    /* renamed from: d */
    private final HashMap f151596d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151594a = treeMap;
        treeMap.put("activityReadings", FastJsonResponse$Field.m22658b("activityReadings", ApiActivityReading.class));
        f151594a.put("apiMetadatas", FastJsonResponse$Field.m22658b("apiMetadatas", ApiMetadata.class));
        f151594a.put("apiRates", FastJsonResponse$Field.m22658b("apiRates", ApiRate.class));
        f151594a.put("locationReadings", FastJsonResponse$Field.m22658b("locationReadings", ApiLocationReading.class));
        f151594a.put("phenotypeBeaconExperimentTokens", FastJsonResponse$Field.m22654a("phenotypeBeaconExperimentTokens", ApiExperimentTokens.class));
        f151594a.put("phenotypeFlpExperimentTokens", FastJsonResponse$Field.m22654a("phenotypeFlpExperimentTokens", ApiExperimentTokens.class));
        f151594a.put("phenotypeUlrExperimentTokens", FastJsonResponse$Field.m22654a("phenotypeUlrExperimentTokens", ApiExperimentTokens.class));
        f151594a.put("sensorData", FastJsonResponse$Field.m22654a("sensorData", ApiSensorData.class));
        f151594a.put("userDatas", FastJsonResponse$Field.m22658b("userDatas", ApiUserData.class));
    }

    public ApiBatch() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151594a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151595c.containsKey(str);
    }

    public ArrayList getActivityReadings() {
        return (ArrayList) this.f151596d.get("activityReadings");
    }

    public ArrayList getApiMetadatas() {
        return (ArrayList) this.f151596d.get("apiMetadatas");
    }

    public ArrayList getApiRates() {
        return (ArrayList) this.f151596d.get("apiRates");
    }

    public ArrayList getLocationReadings() {
        return (ArrayList) this.f151596d.get("locationReadings");
    }

    public ApiExperimentTokens getPhenotypeBeaconExperimentTokens() {
        return (ApiExperimentTokens) this.f151595c.get("phenotypeBeaconExperimentTokens");
    }

    public ApiExperimentTokens getPhenotypeFlpExperimentTokens() {
        return (ApiExperimentTokens) this.f151595c.get("phenotypeFlpExperimentTokens");
    }

    public ApiExperimentTokens getPhenotypeUlrExperimentTokens() {
        return (ApiExperimentTokens) this.f151595c.get("phenotypeUlrExperimentTokens");
    }

    public ApiSensorData getSensorData() {
        return (ApiSensorData) this.f151595c.get("sensorData");
    }

    public ArrayList getUserDatas() {
        return (ArrayList) this.f151596d.get("userDatas");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f151596d.put(str, arrayList);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sio.a(java.lang.String, sio):void
     arg types: [java.lang.String, com.google.android.ulr.ApiExperimentTokens]
     candidates:
      com.google.android.ulr.ApiBatch.a(java.lang.String, java.util.ArrayList):void
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
     arg types: [java.lang.String, com.google.android.ulr.ApiSensorData]
     candidates:
      com.google.android.ulr.ApiBatch.a(java.lang.String, java.util.ArrayList):void
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
    public ApiBatch(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ApiExperimentTokens apiExperimentTokens, ApiExperimentTokens apiExperimentTokens2, ApiExperimentTokens apiExperimentTokens3, ApiSensorData apiSensorData, ArrayList arrayList4) {
        if (arrayList != null) {
            mo25595a("activityReadings", arrayList);
        }
        mo25595a("apiMetadatas", arrayList2);
        if (arrayList3 != null) {
            mo25595a("locationReadings", arrayList3);
        }
        if (apiExperimentTokens != null) {
            mo25598a("phenotypeBeaconExperimentTokens", (sio) apiExperimentTokens);
        }
        if (apiExperimentTokens2 != null) {
            mo25598a("phenotypeFlpExperimentTokens", (sio) apiExperimentTokens2);
        }
        if (apiExperimentTokens3 != null) {
            mo25598a("phenotypeUlrExperimentTokens", (sio) apiExperimentTokens3);
        }
        mo25598a("sensorData", (sio) apiSensorData);
        mo25595a("userDatas", arrayList4);
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151595c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f151596d.containsKey(str);
    }
}
