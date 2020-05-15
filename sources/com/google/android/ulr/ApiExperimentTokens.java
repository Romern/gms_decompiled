package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiExperimentTokens extends sip {

    /* renamed from: a */
    private static final TreeMap f151607a;

    static {
        TreeMap treeMap = new TreeMap();
        f151607a = treeMap;
        treeMap.put("additionalDirectExperimentTokens", FastJsonResponse$Field.m22667g("additionalDirectExperimentTokens"));
        f151607a.put("alwaysCrossExperimentTokens", FastJsonResponse$Field.m22667g("alwaysCrossExperimentTokens"));
        f151607a.put("directExperimentToken", FastJsonResponse$Field.m22665f("directExperimentToken"));
        f151607a.put("gaiaCrossExperimentTokens", FastJsonResponse$Field.m22667g("gaiaCrossExperimentTokens"));
        f151607a.put("otherCrossExperimentTokens", FastJsonResponse$Field.m22667g("otherCrossExperimentTokens"));
        f151607a.put("pseudonymousCrossExperimentTokens", FastJsonResponse$Field.m22667g("pseudonymousCrossExperimentTokens"));
    }

    public ApiExperimentTokens() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151607a;
    }

    /* renamed from: b */
    public final ArrayList mo71515b() {
        return (ArrayList) this.f44540b.get("additionalDirectExperimentTokens");
    }

    /* renamed from: c */
    public final ArrayList mo71516c() {
        return (ArrayList) this.f44540b.get("alwaysCrossExperimentTokens");
    }

    /* renamed from: d */
    public final String mo71517d() {
        return (String) this.f44540b.get("directExperimentToken");
    }

    /* renamed from: e */
    public final ArrayList mo71518e() {
        return (ArrayList) this.f44540b.get("gaiaCrossExperimentTokens");
    }

    /* renamed from: f */
    public final ArrayList mo71519f() {
        return (ArrayList) this.f44540b.get("otherCrossExperimentTokens");
    }

    /* renamed from: g */
    public final ArrayList mo71520g() {
        return (ArrayList) this.f44540b.get("pseudonymousCrossExperimentTokens");
    }

    public ApiExperimentTokens(ArrayList arrayList, ArrayList arrayList2, String str, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        if (arrayList != null) {
            mo25622i("additionalDirectExperimentTokens", arrayList);
        }
        if (arrayList2 != null) {
            mo25622i("alwaysCrossExperimentTokens", arrayList2);
        }
        if (str != null) {
            mo25604a("directExperimentToken", str);
        }
        if (arrayList3 != null) {
            mo25622i("gaiaCrossExperimentTokens", arrayList3);
        }
        if (arrayList4 != null) {
            mo25622i("otherCrossExperimentTokens", arrayList4);
        }
        if (arrayList5 != null) {
            mo25622i("pseudonymousCrossExperimentTokens", arrayList5);
        }
    }
}
