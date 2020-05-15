package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bczs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bczs {

    /* renamed from: a */
    private static final String f105200a = bczs.class.getSimpleName();

    /* renamed from: a */
    public static bmxv m90382a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            bczr c = m90383c();
            c.mo57804a(jSONObject.getString("JSON_SOURCE"));
            bmxv a = bczq.m90375a(jSONObject.getJSONObject("STACK_CARD"));
            if (a.mo66813a()) {
                c.mo57803a((bczq) a.mo66814b());
                return bmxv.m108566b(c.mo57802a());
            }
            bbos.m88294d(f105200a, "Failed to convert JSONObject to StandaloneCard.");
            return bmvz.f131120a;
        } catch (JSONException e) {
            bbos.m88292b(f105200a, "Failed to convert JSONObject to StandaloneCard.", e);
            return bmvz.f131120a;
        }
    }

    /* renamed from: c */
    public static bczr m90383c() {
        return new bczr();
    }

    /* renamed from: a */
    public abstract String mo57743a();

    /* renamed from: b */
    public abstract bczq mo57744b();

    /* renamed from: d */
    public final bmxv mo57805d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("JSON_SOURCE", mo57743a());
            bmxv c = mo57744b().mo57801c();
            if (c.mo66813a()) {
                jSONObject.put("STACK_CARD", c.mo66814b());
                return bmxv.m108566b(jSONObject);
            }
            bbos.m88294d(f105200a, "Failed to convert StandaloneCard to JSONObject.");
            return bmvz.f131120a;
        } catch (JSONException e) {
            bbos.m88292b(f105200a, "Failed to convert StandaloneCard to JSONObject.", e);
            return bmvz.f131120a;
        }
    }
}
