package com.google.android.gms.ads.cache.policy;

import com.google.android.gms.ads.cache.C0213l;
import com.google.android.gms.ads.cache.C0214m;
import com.google.android.gms.ads.cache.C0215n;
import com.google.android.gms.ads.cache.C0216o;
import com.google.android.gms.ads.cache.C0217p;
import com.google.android.gms.ads.internal.p012js.function.C0478f;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.cache.policy.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0224g implements C0478f {

    /* renamed from: a */
    private final String f7924a;

    public C0224g(String str) {
        this.f7924a = str;
    }

    /* renamed from: b */
    public final C0217p mo6420a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("key");
        JSONObject jSONObject3 = jSONObject.getJSONObject("meta_data");
        JSONObject jSONObject4 = jSONObject.getJSONObject("source");
        JSONObject optJSONObject = jSONObject3.optJSONObject("tags");
        bxvd da = C0215n.f7897h.mo74144da();
        long optLong = jSONObject3.optLong("last_access_time", 0);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        C0215n nVar = (C0215n) da.f164949b;
        nVar.f7899a |= 1;
        nVar.f7901c = optLong;
        long optLong2 = jSONObject3.optLong("creation_time", 0);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        C0215n nVar2 = (C0215n) da.f164949b;
        nVar2.f7899a |= 2;
        nVar2.f7902d = optLong2;
        long optLong3 = jSONObject3.optLong("bytes_on_disk", 0);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        C0215n nVar3 = (C0215n) da.f164949b;
        nVar3.f7899a |= 4;
        nVar3.f7903e = optLong3;
        int optInt = jSONObject3.optInt("download_attempts", 0);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        C0215n nVar4 = (C0215n) da.f164949b;
        nVar4.f7899a |= 16;
        nVar4.f7905g = optInt;
        boolean optBoolean = jSONObject3.optBoolean("download_complete", false);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        C0215n nVar5 = (C0215n) da.f164949b;
        nVar5.f7899a |= 8;
        nVar5.f7904f = optBoolean;
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = optJSONObject.optString(next, null);
                if (optString != null) {
                    bxvd da2 = C0214m.f7892d.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    C0214m mVar = (C0214m) da2.f164949b;
                    next.getClass();
                    int i = mVar.f7894a | 1;
                    mVar.f7894a = i;
                    mVar.f7895b = next;
                    optString.getClass();
                    mVar.f7894a = i | 2;
                    mVar.f7896c = optString;
                    da.mo74038c(da2);
                }
            }
        }
        bxvd da3 = C0217p.f7911g.mo74144da();
        String str = this.f7924a;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        C0217p pVar = (C0217p) da3.f164949b;
        str.getClass();
        pVar.f7913a |= 1;
        pVar.f7914b = str;
        String string = jSONObject.getString("filename");
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        C0217p pVar2 = (C0217p) da3.f164949b;
        string.getClass();
        pVar2.f7913a |= 16;
        pVar2.f7918f = string;
        bxvd da4 = C0213l.f7887d.mo74144da();
        String string2 = jSONObject2.getString("id");
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        C0213l lVar = (C0213l) da4.f164949b;
        string2.getClass();
        lVar.f7889a |= 2;
        lVar.f7891c = string2;
        String string3 = jSONObject2.getString("namespace");
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        C0213l lVar2 = (C0213l) da4.f164949b;
        string3.getClass();
        lVar2.f7889a |= 1;
        lVar2.f7890b = string3;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        C0217p pVar3 = (C0217p) da3.f164949b;
        C0213l lVar3 = (C0213l) da4.mo74062i();
        lVar3.getClass();
        pVar3.f7915c = lVar3;
        pVar3.f7913a |= 2;
        bxvd da5 = C0216o.f7906d.mo74144da();
        String optString2 = jSONObject4.optString("url");
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        C0216o oVar = (C0216o) da5.f164949b;
        optString2.getClass();
        oVar.f7908a |= 1;
        oVar.f7909b = optString2;
        long optLong4 = jSONObject4.optLong("expiration_time", 0);
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        C0216o oVar2 = (C0216o) da5.f164949b;
        oVar2.f7908a |= 2;
        oVar2.f7910c = optLong4;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        C0217p pVar4 = (C0217p) da3.f164949b;
        C0216o oVar3 = (C0216o) da5.mo74062i();
        oVar3.getClass();
        pVar4.f7916d = oVar3;
        pVar4.f7913a |= 4;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        C0217p pVar5 = (C0217p) da3.f164949b;
        C0215n nVar6 = (C0215n) da.mo74062i();
        nVar6.getClass();
        pVar5.f7917e = nVar6;
        pVar5.f7913a |= 8;
        return (C0217p) da3.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ JSONObject mo6421a(Object obj) {
        C0217p pVar = (C0217p) obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("filename", pVar.f7918f);
        JSONObject jSONObject2 = new JSONObject();
        C0213l lVar = pVar.f7915c;
        if (lVar == null) {
            lVar = C0213l.f7887d;
        }
        jSONObject2.put("namespace", lVar.f7890b);
        C0213l lVar2 = pVar.f7915c;
        if (lVar2 == null) {
            lVar2 = C0213l.f7887d;
        }
        jSONObject2.put("id", lVar2.f7891c);
        jSONObject.put("key", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C0216o oVar = pVar.f7916d;
        if (oVar == null) {
            oVar = C0216o.f7906d;
        }
        jSONObject3.put("url", oVar.f7909b);
        C0216o oVar2 = pVar.f7916d;
        if (oVar2 == null) {
            oVar2 = C0216o.f7906d;
        }
        jSONObject3.put("expiration_time", oVar2.f7910c);
        jSONObject.put("source", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C0215n nVar = pVar.f7917e;
        if (nVar == null) {
            nVar = C0215n.f7897h;
        }
        jSONObject4.put("last_access_time", nVar.f7901c);
        C0215n nVar2 = pVar.f7917e;
        if (nVar2 == null) {
            nVar2 = C0215n.f7897h;
        }
        jSONObject4.put("creation_time", nVar2.f7902d);
        C0215n nVar3 = pVar.f7917e;
        if (nVar3 == null) {
            nVar3 = C0215n.f7897h;
        }
        jSONObject4.put("bytes_on_disk", nVar3.f7903e);
        C0215n nVar4 = pVar.f7917e;
        if (nVar4 == null) {
            nVar4 = C0215n.f7897h;
        }
        jSONObject4.put("download_attempts", nVar4.f7905g);
        C0215n nVar5 = pVar.f7917e;
        if (nVar5 == null) {
            nVar5 = C0215n.f7897h;
        }
        jSONObject4.put("download_complete", nVar5.f7904f);
        JSONObject jSONObject5 = new JSONObject();
        C0215n nVar6 = pVar.f7917e;
        if (nVar6 == null) {
            nVar6 = C0215n.f7897h;
        }
        bxwc bxwc = nVar6.f7900b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            C0214m mVar = (C0214m) bxwc.get(i);
            jSONObject5.put(mVar.f7895b, mVar.f7896c);
        }
        jSONObject4.put("tags", jSONObject5);
        jSONObject.put("meta_data", jSONObject4);
        return jSONObject;
    }
}
