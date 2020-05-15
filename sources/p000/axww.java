package p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: axww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axww {
    /* renamed from: a */
    public static Set m83442a(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            hashSet.add(new axwx(axwu.m83441c(jSONObject, "digest"), axwu.m83439a(jSONObject, "dataMissing")));
        }
        return hashSet;
    }

    /* renamed from: b */
    static Map m83444b(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        JSONArray optJSONArray = jSONObject.optJSONArray("syncEntry");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                String c = axwu.m83441c(jSONObject2, "nodeId");
                long b = axwu.m83440b(jSONObject2, "seqId");
                if (!"".equals(c) && b != 0) {
                    hashMap.put(c, Long.valueOf(b));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m83443a(JSONObject jSONObject) {
        List a = axwr.m83416a();
        if (!a.isEmpty()) {
            jSONObject.put("eid", new JSONArray((Collection) a));
        }
    }
}
