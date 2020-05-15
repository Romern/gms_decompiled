package com.google.android.gms.ads.cache.policy;

import com.google.android.gms.ads.internal.p012js.function.C0477e;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.cache.policy.h */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0225h implements C0477e {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ JSONObject mo6421a(Object obj) {
        C0226i iVar = (C0226i) obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sdk_version", iVar.f7926b);
        jSONObject.put("disk_total_bytes", iVar.f7927c);
        jSONObject.put("disk_used_bytes", iVar.f7928d);
        jSONObject.put("os_version", iVar.f7929e);
        jSONObject.put("device_model", iVar.f7930f);
        return jSONObject;
    }
}
