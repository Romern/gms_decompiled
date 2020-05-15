package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.ads.internal.util.C0611ai;
import com.google.android.gms.ads.nonagon.signals.C0786c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.ad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0795ad implements C0786c {

    /* renamed from: a */
    private final String f9232a;

    /* renamed from: b */
    private final String f9233b;

    public C0795ad(String str, String str2) {
        this.f9232a = str;
        this.f9233b = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7056a(Object obj) {
        try {
            JSONObject a = C0611ai.m5616a((JSONObject) obj, "pii");
            a.put("doritos", this.f9232a);
            a.put("doritos_v2", this.f9233b);
        } catch (JSONException e) {
        }
    }
}
