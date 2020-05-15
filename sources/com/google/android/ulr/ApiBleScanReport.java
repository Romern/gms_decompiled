package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiBleScanReport extends sip {

    /* renamed from: a */
    private static final TreeMap f151599a;

    /* renamed from: c */
    private final HashMap f151600c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151599a = treeMap;
        treeMap.put("bleScans", FastJsonResponse$Field.m22658b("bleScans", BleStrengthProto.class));
        f151599a.put("bleSensorDatas", FastJsonResponse$Field.m22658b("bleSensorDatas", BleSensorData.class));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151599a;
    }

    public ArrayList getBleScans() {
        return (ArrayList) this.f151600c.get("bleScans");
    }

    public ArrayList getBleSensorDatas() {
        return (ArrayList) this.f151600c.get("bleSensorDatas");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f151600c.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f151600c.containsKey(str);
    }
}
