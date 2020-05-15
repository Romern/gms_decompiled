package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: uzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uzv extends uzx {

    /* renamed from: a */
    public final long f48784a;

    /* renamed from: b */
    public final Set f48785b;

    public uzv(long j, Set set) {
        super(uzz.CHANGELOG);
        sdo.m34974b(j >= 0);
        this.f48784a = j;
        this.f48785b = set;
    }

    /* renamed from: a */
    public final String mo28138a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sortedAppIds", new JSONArray((Collection) this.f48785b));
            jSONObject.put("changeStamp", this.f48784a);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException("JSON encoding failed", e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            uzv uzv = (uzv) obj;
            return this.f48784a == uzv.f48784a && this.f48785b.equals(uzv.f48785b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f48784a), this.f48785b});
    }
}
