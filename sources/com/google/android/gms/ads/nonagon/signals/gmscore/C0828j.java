package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.ads.nonagon.signals.C0786c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.j */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0828j implements C0786c {

    /* renamed from: a */
    private final String f9310a;

    public C0828j(String str) {
        this.f9310a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7056a(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f9310a);
        } catch (JSONException e) {
        }
    }
}
