package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiActivationChange extends sip {

    /* renamed from: a */
    private static final TreeMap f151586a;

    static {
        TreeMap treeMap = new TreeMap();
        f151586a = treeMap;
        treeMap.put("change", FastJsonResponse$Field.m22665f("change"));
        f151586a.put("newReasons", FastJsonResponse$Field.m22667g("newReasons"));
        f151586a.put("oldReasons", FastJsonResponse$Field.m22667g("oldReasons"));
    }

    public ApiActivationChange() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151586a;
    }

    /* renamed from: b */
    public final String mo71462b() {
        return (String) this.f44540b.get("change");
    }

    /* renamed from: c */
    public final ArrayList mo71463c() {
        return (ArrayList) this.f44540b.get("newReasons");
    }

    /* renamed from: d */
    public final ArrayList mo71464d() {
        return (ArrayList) this.f44540b.get("oldReasons");
    }

    public ApiActivationChange(String str) {
        if (str != null) {
            mo25604a("change", str);
        }
    }
}
