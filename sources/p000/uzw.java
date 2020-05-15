package p000;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: uzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uzw extends uzx {

    /* renamed from: a */
    public final boolean f48786a;

    public uzw(boolean z) {
        super(uzz.DRIVE);
        this.f48786a = z;
    }

    /* renamed from: a */
    public final String mo28138a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("foldersOnly", this.f48786a);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException("JSON encoding failed", e);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && obj.getClass() == getClass() && this.f48786a == ((uzw) obj).f48786a;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f48786a)});
    }
}
