package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiSensorData extends sip {

    /* renamed from: a */
    private static final TreeMap f151630a;

    /* renamed from: c */
    private final HashMap f151631c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151630a = treeMap;
        treeMap.put("barometerDatas", FastJsonResponse$Field.m22658b("barometerDatas", ApiBarometerData.class));
    }

    public ApiSensorData() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151630a;
    }

    public ArrayList getBarometerDatas() {
        return (ArrayList) this.f151631c.get("barometerDatas");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f151631c.put(str, arrayList);
    }

    public ApiSensorData(ArrayList arrayList) {
        mo25595a("barometerDatas", arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f151631c.containsKey(str);
    }
}
