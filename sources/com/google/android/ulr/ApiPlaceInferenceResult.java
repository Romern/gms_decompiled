package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiPlaceInferenceResult extends sip {

    /* renamed from: a */
    private static final TreeMap f151619a;

    /* renamed from: c */
    private final HashMap f151620c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151619a = treeMap;
        treeMap.put("inferences", FastJsonResponse$Field.m22658b("inferences", ApiPlaceInference.class));
        f151619a.put("personalized", FastJsonResponse$Field.m22663e("personalized"));
        f151619a.put("powerMode", FastJsonResponse$Field.m22665f("powerMode"));
    }

    public ApiPlaceInferenceResult() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151619a;
    }

    /* renamed from: b */
    public final Boolean mo71564b() {
        return (Boolean) this.f44540b.get("personalized");
    }

    /* renamed from: c */
    public final String mo71565c() {
        return (String) this.f44540b.get("powerMode");
    }

    public ArrayList getInferences() {
        return (ArrayList) this.f151620c.get("inferences");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f151620c.put(str, arrayList);
    }

    public ApiPlaceInferenceResult(ArrayList arrayList, Boolean bool, String str) {
        mo25595a("inferences", arrayList);
        mo25605a("personalized", bool.booleanValue());
        mo25604a("powerMode", str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f151620c.containsKey(str);
    }
}
