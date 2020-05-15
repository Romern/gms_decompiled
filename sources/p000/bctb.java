package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bctb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bctb {
    /* renamed from: d */
    public static bcta m89884d() {
        return new bcta(null);
    }

    /* renamed from: a */
    public abstract String mo57348a();

    /* renamed from: b */
    public abstract bcov mo57349b();

    /* renamed from: c */
    public abstract bmxv mo57350c();

    /* renamed from: e */
    public final bmxv mo57498e() {
        if (mo57348a() == null || mo57349b() == null) {
            bbos.m88294d("LighterMenuItem", "Missing necessary properties.");
            return bmvz.f131120a;
        }
        bmxv k = mo57349b().mo57124k();
        if (!k.mo66813a()) {
            return bmvz.f131120a;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ACTION", k.mo66814b());
            jSONObject.put("MENU_NAME", mo57348a());
            if (mo57350c().mo66813a()) {
                jSONObject.put("ICON", bbqu.m88426d((byte[]) mo57350c().mo66814b()));
            }
            return bmxv.m108566b(jSONObject);
        } catch (JSONException e) {
            bbos.m88294d("LighterMenuItem", "failed to convert LighterMenuItem to JSONObject");
            return bmvz.f131120a;
        }
    }
}
