package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class VisibleNetworkCell extends sip {

    /* renamed from: a */
    private static final TreeMap f151698a;

    static {
        TreeMap treeMap = new TreeMap();
        f151698a = treeMap;
        treeMap.put("cellId", FastJsonResponse$Field.m22650a("cellId"));
        f151698a.put("locationAreaCode", FastJsonResponse$Field.m22650a("locationAreaCode"));
        f151698a.put("mobileCountryCode", FastJsonResponse$Field.m22650a("mobileCountryCode"));
        f151698a.put("mobileNetworkCode", FastJsonResponse$Field.m22650a("mobileNetworkCode"));
        f151698a.put("physicalCellId", FastJsonResponse$Field.m22650a("physicalCellId"));
        f151698a.put("primaryScramblingCode", FastJsonResponse$Field.m22650a("primaryScramblingCode"));
        f151698a.put("trackingAreaCode", FastJsonResponse$Field.m22650a("trackingAreaCode"));
        f151698a.put("type", FastJsonResponse$Field.m22665f("type"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151698a;
    }

    /* renamed from: b */
    public final Integer mo71713b() {
        return (Integer) this.f44540b.get("cellId");
    }

    /* renamed from: c */
    public final Integer mo71714c() {
        return (Integer) this.f44540b.get("locationAreaCode");
    }

    /* renamed from: d */
    public final Integer mo71715d() {
        return (Integer) this.f44540b.get("mobileCountryCode");
    }

    /* renamed from: e */
    public final Integer mo71716e() {
        return (Integer) this.f44540b.get("mobileNetworkCode");
    }

    /* renamed from: f */
    public final Integer mo71717f() {
        return (Integer) this.f44540b.get("physicalCellId");
    }

    /* renamed from: g */
    public final Integer mo71718g() {
        return (Integer) this.f44540b.get("primaryScramblingCode");
    }

    /* renamed from: h */
    public final Integer mo71719h() {
        return (Integer) this.f44540b.get("trackingAreaCode");
    }

    /* renamed from: i */
    public final String mo71720i() {
        return (String) this.f44540b.get("type");
    }
}
