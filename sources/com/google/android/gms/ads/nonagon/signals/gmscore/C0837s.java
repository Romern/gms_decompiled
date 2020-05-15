package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C0611ai;
import com.google.android.gms.ads.nonagon.signals.C0786c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.s */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0837s implements C0786c {

    /* renamed from: a */
    private final String f9328a;

    public C0837s(String str) {
        this.f9328a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7056a(Object obj) {
        try {
            JSONObject a = C0611ai.m5616a((JSONObject) obj, "pii");
            if (!TextUtils.isEmpty(this.f9328a)) {
                a.put("attok", this.f9328a);
            }
        } catch (JSONException e) {
        }
    }
}
