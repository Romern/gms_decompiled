package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.nonagon.signals.C0786c;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.ba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0819ba implements C0786c {

    /* renamed from: a */
    private final Map f9270a;

    public C0819ba(Map map) {
        this.f9270a = map;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7056a(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", C0387d.m5363a().mo6849a(this.f9270a));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
                new String("Could not encode video decoder properties: ");
            } else {
                "Could not encode video decoder properties: ".concat(valueOf);
            }
        }
    }
}
