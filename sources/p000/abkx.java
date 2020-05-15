package p000;

import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: abkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abkx {
    /* renamed from: a */
    public static JSONObject m47832a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            JSONArray jSONArray = bundle.get(str);
            if (jSONArray instanceof Bundle) {
                jSONArray = m47832a((Bundle) jSONArray);
            }
            if (jSONArray instanceof Bundle[]) {
                JSONArray jSONArray2 = new JSONArray();
                for (Bundle bundle2 : (Bundle[]) jSONArray) {
                    jSONArray2.put(m47832a(bundle2));
                }
                jSONArray = jSONArray2;
            }
            jSONObject.put(str, JSONObject.wrap(jSONArray));
        }
        return jSONObject;
    }
}
