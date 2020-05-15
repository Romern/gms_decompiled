package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.ads.nonagon.signals.C0786c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.y */
final /* synthetic */ class C0843y implements C0786c {

    /* renamed from: a */
    private final C0844z f9339a;

    public C0843y(C0844z zVar) {
        this.f9339a = zVar;
    }

    /* renamed from: a */
    public final void mo7056a(Object obj) {
        try {
            ((JSONObject) obj).put("gms_sdk_env", this.f9339a.f9340a);
        } catch (JSONException e) {
        }
    }
}
