package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.os.Bundle;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.util.C0611ai;
import com.google.android.gms.ads.nonagon.signals.C0786c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.ao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0806ao implements C0786c {

    /* renamed from: a */
    private final Bundle f9255a;

    public C0806ao(Bundle bundle) {
        this.f9255a = bundle;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7056a(Object obj) {
        if (this.f9255a != null) {
            try {
                C0611ai.m5616a(C0611ai.m5616a((JSONObject) obj, "device"), "play_store").put("parental_controls", C0387d.m5363a().mo6848a(this.f9255a));
            } catch (JSONException e) {
            }
        }
    }
}
