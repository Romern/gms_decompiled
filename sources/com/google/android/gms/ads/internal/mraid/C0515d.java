package com.google.android.gms.ads.internal.mraid;

import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.webview.C0699i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.mraid.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0515d {

    /* renamed from: h */
    public final C0699i f8532h;

    /* renamed from: a */
    public final void mo6699a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f8532h.mo6641a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            C0633h.m5669b("Error occurred while obtaining screen information.", e);
        }
    }

    public C0515d(C0699i iVar) {
        this.f8532h = iVar;
    }
}
