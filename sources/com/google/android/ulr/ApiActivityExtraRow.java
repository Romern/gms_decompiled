package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiActivityExtraRow extends sip {

    /* renamed from: a */
    private static final TreeMap f151588a;

    static {
        TreeMap treeMap = new TreeMap();
        f151588a = treeMap;
        treeMap.put("booleanVal", FastJsonResponse$Field.m22663e("booleanVal"));
        f151588a.put("doubleVal", FastJsonResponse$Field.m22661d("doubleVal"));
        f151588a.put("floatVal", FastJsonResponse$Field.m22659c("floatVal"));
        f151588a.put("intVal", FastJsonResponse$Field.m22650a("intVal"));
        f151588a.put("longVal", FastJsonResponse$Field.m22655b("longVal"));
        f151588a.put("name", FastJsonResponse$Field.m22665f("name"));
        f151588a.put("stringVal", FastJsonResponse$Field.m22665f("stringVal"));
        f151588a.put("type", FastJsonResponse$Field.m22665f("type"));
    }

    public ApiActivityExtraRow() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151588a;
    }

    /* renamed from: b */
    public final Boolean mo71467b() {
        return (Boolean) this.f44540b.get("booleanVal");
    }

    /* renamed from: c */
    public final Double mo71468c() {
        return (Double) this.f44540b.get("doubleVal");
    }

    /* renamed from: d */
    public final Float mo71469d() {
        return (Float) this.f44540b.get("floatVal");
    }

    /* renamed from: e */
    public final Integer mo71470e() {
        return (Integer) this.f44540b.get("intVal");
    }

    /* renamed from: f */
    public final Long mo71471f() {
        return (Long) this.f44540b.get("longVal");
    }

    /* renamed from: g */
    public final String mo71472g() {
        return (String) this.f44540b.get("name");
    }

    /* renamed from: h */
    public final String mo71473h() {
        return (String) this.f44540b.get("stringVal");
    }

    /* renamed from: i */
    public final String mo71474i() {
        return (String) this.f44540b.get("type");
    }

    public ApiActivityExtraRow(Boolean bool, Double d, Float f, Integer num, Long l, String str, String str2, String str3) {
        if (bool != null) {
            mo25605a("booleanVal", bool.booleanValue());
        }
        if (d != null) {
            mo25600a("doubleVal", d.doubleValue());
        }
        if (f != null) {
            mo25601a("floatVal", f.floatValue());
        }
        if (num != null) {
            mo25602a("intVal", num.intValue());
        }
        if (l != null) {
            mo25603a("longVal", l.longValue());
        }
        if (str != null) {
            mo25604a("name", str);
        }
        if (str2 != null) {
            mo25604a("stringVal", str2);
        }
        mo25604a("type", str3);
    }
}
