package com.google.android.gms.ads.cache.policy;

import com.google.android.gms.ads.cache.C0217p;
import com.google.android.gms.ads.internal.p012js.function.C0478f;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.cache.policy.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0218a implements C0478f {
    /* renamed from: b */
    public static final C0219b m5079b(JSONObject jSONObject) {
        C1223np npVar = new C1223np();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            C0224g gVar = new C0224g(next);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(next);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(gVar.mo6420a(jSONArray.getJSONObject(i)));
            }
            npVar.put(next, arrayList);
        }
        return new C0219b(npVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6420a(JSONObject jSONObject) {
        return m5079b(jSONObject);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ JSONObject mo6421a(Object obj) {
        C0219b bVar = (C0219b) obj;
        JSONObject jSONObject = new JSONObject();
        for (String str : bVar.mo6423a()) {
            C0224g gVar = new C0224g(str);
            JSONArray jSONArray = new JSONArray();
            for (C0217p pVar : bVar.mo6422a(str)) {
                jSONArray.put(gVar.mo6421a(pVar));
            }
            jSONObject.put(str, jSONArray);
        }
        return jSONObject;
    }
}
