package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiExperiment extends sip {

    /* renamed from: a */
    private static final TreeMap f151606a;

    static {
        TreeMap treeMap = new TreeMap();
        f151606a = treeMap;
        treeMap.put("group", FastJsonResponse$Field.m22665f("group"));
        f151606a.put("id", FastJsonResponse$Field.m22650a("id"));
        f151606a.put("subgroup", FastJsonResponse$Field.m22650a("subgroup"));
        f151606a.put("type", FastJsonResponse$Field.m22665f("type"));
    }

    public ApiExperiment() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151606a;
    }

    /* renamed from: b */
    public final String mo71511b() {
        return (String) this.f44540b.get("group");
    }

    /* renamed from: c */
    public final Integer mo71512c() {
        return (Integer) this.f44540b.get("id");
    }

    /* renamed from: d */
    public final Integer mo71513d() {
        return (Integer) this.f44540b.get("subgroup");
    }

    /* renamed from: e */
    public final String mo71514e() {
        return (String) this.f44540b.get("type");
    }

    public ApiExperiment(String str, Integer num, Integer num2) {
        if (str != null) {
            mo25604a("group", str);
        }
        mo25602a("id", num.intValue());
        if (num2 != null) {
            mo25602a("subgroup", num2.intValue());
        }
    }
}
