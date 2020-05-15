package com.google.android.gms.ads.cache;

import android.content.Context;
import com.google.android.gms.ads.cache.policy.C0219b;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.cache.j */
final /* synthetic */ class C0211j implements Callable {

    /* renamed from: a */
    private final Context f7884a;

    public C0211j(Context context) {
        this.f7884a = context;
    }

    public final Object call() {
        C0219b bVar;
        C0198d a = C0203i.m5055a(this.f7884a);
        if (a != null) {
            try {
                bVar = a.mo6388a();
            } catch (C0200f e) {
                C0633h.m5669b("Unable to obtain cache state.", e);
                return C0212k.f7885a;
            }
        } else {
            bVar = null;
        }
        JSONObject jSONObject = C0212k.f7885a;
        if (bVar != null) {
            try {
                return C0219b.f7919a.mo6421a(bVar);
            } catch (JSONException e2) {
                C0633h.m5669b("Unable to serialize cache state.", e2);
            }
        }
        return jSONObject;
    }
}
