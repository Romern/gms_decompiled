package com.google.android.gms.ads.cache.policy;

import com.google.android.gms.ads.internal.p012js.function.C0477e;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.cache.policy.j */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0227j implements C0477e {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ JSONObject mo6421a(Object obj) {
        C0228k kVar = (C0228k) obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cache", C0219b.f7919a.mo6421a(kVar.f7933c));
        jSONObject.put("environment", C0226i.f7925a.mo6421a(kVar.f7932b));
        return jSONObject;
    }
}
