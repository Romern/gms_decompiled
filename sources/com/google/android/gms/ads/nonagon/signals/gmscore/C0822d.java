package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.C0271c;
import com.google.android.gms.ads.internal.util.C0611ai;
import com.google.android.gms.ads.nonagon.signals.C0786c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0822d implements C0786c {

    /* renamed from: a */
    private final C0271c f9275a;

    /* renamed from: b */
    private final String f9276b;

    public C0822d(C0271c cVar, String str) {
        this.f9275a = cVar;
        this.f9276b = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7056a(Object obj) {
        try {
            JSONObject a = C0611ai.m5616a((JSONObject) obj, "pii");
            C0271c cVar = this.f9275a;
            if (cVar != null) {
                if (!TextUtils.isEmpty(cVar.f7985a)) {
                    a.put("rdid", this.f9275a.f7985a);
                    a.put("is_lat", this.f9275a.f7986b);
                    a.put("idtype", "adid");
                    return;
                }
            }
            a.put("pdid", this.f9276b);
            a.put("pdidtype", "ssaid");
        } catch (JSONException e) {
        }
    }
}
