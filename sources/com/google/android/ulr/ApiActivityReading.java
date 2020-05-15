package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiActivityReading extends sip {

    /* renamed from: a */
    private static final TreeMap f151589a;

    /* renamed from: c */
    private final HashMap f151590c = new HashMap();

    /* renamed from: d */
    private final HashMap f151591d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151589a = treeMap;
        treeMap.put("activities", FastJsonResponse$Field.m22658b("activities", ApiActivity.class));
        f151589a.put("extras", FastJsonResponse$Field.m22658b("extras", ApiActivityExtraRow.class));
        f151589a.put("readingInfo", FastJsonResponse$Field.m22654a("readingInfo", ApiReadingInfo.class));
        f151589a.put("timestampMs", FastJsonResponse$Field.m22655b("timestampMs"));
    }

    public ApiActivityReading() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151589a;
    }

    /* renamed from: b */
    public final Long mo71475b() {
        return (Long) this.f44540b.get("timestampMs");
    }

    public ArrayList getActivities() {
        return (ArrayList) this.f151591d.get("activities");
    }

    public ArrayList getExtras() {
        return (ArrayList) this.f151591d.get("extras");
    }

    public ApiReadingInfo getReadingInfo() {
        return (ApiReadingInfo) this.f151590c.get("readingInfo");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f151591d.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151590c.containsKey(str);
    }

    public ApiActivityReading(ArrayList arrayList, ArrayList arrayList2, Long l) {
        if (arrayList != null) {
            mo25595a("activities", arrayList);
        }
        if (arrayList2 != null) {
            mo25595a("extras", arrayList2);
        }
        mo25603a("timestampMs", l.longValue());
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151590c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f151591d.containsKey(str);
    }
}
