package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.ads.nonagon.signals.C0786c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.w */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0841w implements C0786c {

    /* renamed from: a */
    private final JSONObject f9337a;

    public C0841w(JSONObject jSONObject) {
        this.f9337a = jSONObject;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7056a(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f9337a);
        } catch (JSONException e) {
        }
    }
}
