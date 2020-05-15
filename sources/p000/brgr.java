package p000;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: brgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brgr {

    /* renamed from: a */
    public final JSONObject f142831a;

    /* renamed from: b */
    private final Map f142832b;

    public brgr(JSONObject jSONObject, Map map) {
        this.f142831a = jSONObject;
        this.f142832b = map;
    }

    public final String toString() {
        JSONObject jSONObject = this.f142831a;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : this.f142832b.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append((String) entry.getValue());
            sb.append("&");
        }
        return sb.toString();
    }
}
