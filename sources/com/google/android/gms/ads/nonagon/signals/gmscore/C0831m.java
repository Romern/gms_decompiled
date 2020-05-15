package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.ads.internal.util.C0611ai;
import com.google.android.gms.ads.nonagon.signals.C0786c;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.m */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0831m implements C0786c {

    /* renamed from: a */
    private final JSONObject f9316a;

    public C0831m(JSONObject jSONObject) {
        this.f9316a = jSONObject;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7056a(Object obj) {
        try {
            JSONObject a = C0611ai.m5616a((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.f9316a;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a.put(next, jSONObject.get(next));
            }
        } catch (JSONException e) {
        }
    }
}
