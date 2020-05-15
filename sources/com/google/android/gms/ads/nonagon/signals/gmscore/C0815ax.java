package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.ads.nonagon.signals.C0786c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.ax */
final /* synthetic */ class C0815ax implements C0786c {

    /* renamed from: a */
    static final C0786c f9266a = new C0815ax();

    private C0815ax() {
    }

    /* renamed from: a */
    public final void mo7056a(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 201515033);
        } catch (JSONException e) {
        }
    }
}
