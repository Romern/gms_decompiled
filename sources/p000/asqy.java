package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: asqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asqy implements asrx {

    /* renamed from: a */
    public final ctm f89470a;

    public asqy(JSONObject jSONObject) {
        try {
            this.f89470a = new ctm(jSONObject);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final byte[] mo3395a() {
        return this.f89470a.mo8273d();
    }

    /* renamed from: a */
    public final byte[] mo3396a(int i) {
        if (i != 24360) {
            return new byte[0];
        }
        return this.f89470a.mo8270b();
    }
}
