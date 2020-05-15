package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: azub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class azub {
    /* renamed from: e */
    public static azua m86259e() {
        return new azua(null);
    }

    /* renamed from: a */
    public abstract String mo55234a();

    /* renamed from: b */
    public abstract boolean mo55235b();

    /* renamed from: c */
    public abstract bmxv mo55236c();

    /* renamed from: d */
    public abstract bmxv mo55237d();

    /* renamed from: f */
    public final bmxv mo55298f() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("callToken", mo55234a());
            jSONObject.put("isProcessingAsync", mo55235b());
            if (mo55237d().mo66813a()) {
                jSONObject.put("error", mo55237d().mo66814b());
            } else if (mo55236c().mo66813a()) {
                jSONObject.put("data", mo55236c().mo66814b());
            }
            return bmxv.m108566b(jSONObject);
        } catch (JSONException e) {
            return bmvz.f131120a;
        }
    }
}
