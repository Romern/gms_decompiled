package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiLocationStatus extends sip {

    /* renamed from: a */
    private static final TreeMap f151613a;

    static {
        TreeMap treeMap = new TreeMap();
        f151613a = treeMap;
        treeMap.put("cellStatus", FastJsonResponse$Field.m22665f("cellStatus"));
        f151613a.put("changed", FastJsonResponse$Field.m22663e("changed"));
        f151613a.put("wifiStatus", FastJsonResponse$Field.m22665f("wifiStatus"));
    }

    public ApiLocationStatus() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151613a;
    }

    /* renamed from: b */
    public final String mo71541b() {
        return (String) this.f44540b.get("cellStatus");
    }

    /* renamed from: c */
    public final Boolean mo71542c() {
        return (Boolean) this.f44540b.get("changed");
    }

    /* renamed from: d */
    public final String mo71543d() {
        return (String) this.f44540b.get("wifiStatus");
    }

    public ApiLocationStatus(String str, Boolean bool, String str2) {
        mo25604a("cellStatus", str);
        mo25605a("changed", bool.booleanValue());
        mo25604a("wifiStatus", str2);
    }
}
