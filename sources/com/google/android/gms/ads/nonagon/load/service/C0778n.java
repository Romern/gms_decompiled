package com.google.android.gms.ads.nonagon.load.service;

import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.p012js.function.C0477e;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.load.service.n */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0778n implements C0477e {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ JSONObject mo6421a(Object obj) {
        C0779o oVar = (C0779o) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", oVar.f9200c.f8781b);
        jSONObject2.put("signals", oVar.f9199b);
        jSONObject3.put("body", oVar.f9198a.f9210c);
        jSONObject3.put("headers", C0387d.m5363a().mo6849a(oVar.f9198a.f9209b));
        jSONObject3.put("response_code", oVar.f9198a.f9208a);
        jSONObject3.put("latency", oVar.f9198a.f9211d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", oVar.f9200c.f8788i);
        return jSONObject;
    }
}
