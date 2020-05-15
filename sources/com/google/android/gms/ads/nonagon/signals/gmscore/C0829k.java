package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C0341h;
import com.google.android.gms.ads.internal.request.service.C0568r;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.UsageInfo;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.k */
final /* synthetic */ class C0829k implements Callable {

    /* renamed from: a */
    private final C0830l f9311a;

    public C0829k(C0830l lVar) {
        this.f9311a = lVar;
    }

    public final Object call() {
        DocumentContents documentContents;
        C0830l lVar = this.f9311a;
        JSONObject jSONObject = new JSONObject();
        Context context = lVar.f9313b;
        String str = lVar.f9314c;
        if (C0341h.m5274a().mo6806a()) {
            C0633h.m5672d("Cannot invoke App indexing API on UI thread. Skipping this signal.");
        } else if (TextUtils.isEmpty(str)) {
            C0633h.m5664a("Fail to get package name, skipping App index signal.");
        } else {
            try {
                UsageInfo a = C0568r.m5570a(context, str);
                if (!(a == null || (documentContents = a.f9698e) == null)) {
                    String a2 = documentContents.mo7168a();
                    if (!TextUtils.isEmpty(a2)) {
                        try {
                            jSONObject.put("web_url", a2);
                        } catch (JSONException e) {
                            C0633h.m5664a("Could not put web url in content info.");
                        }
                    }
                    try {
                        DocumentSection a3 = documentContents.mo7167a("intent_data");
                        if (a3 != null && !TextUtils.isEmpty(a3.f9543c)) {
                            try {
                                jSONObject.put("app_uri", fuc.m12407a(str, Uri.parse(a3.f9543c)).toString());
                            } catch (JSONException e2) {
                                C0633h.m5664a("Could not put app uri into content info.");
                            }
                        }
                    } catch (IllegalArgumentException e3) {
                        C0633h.m5672d("Failed to parse the third-party Android App URI.");
                    }
                }
            } catch (RuntimeException e4) {
                C0633h.m5672d("Fail to add App indexing to content info.");
            }
        }
        return new C0831m(jSONObject);
    }
}
