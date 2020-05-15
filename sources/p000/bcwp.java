package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bcwp {
    /* renamed from: a */
    public static bmxv m90172a(JSONObject jSONObject) {
        try {
            bcwo c = m90173c();
            c.mo57635a(jSONObject.getString("RESOURCE_ID"));
            c.mo57634a(jSONObject.getInt("RESOURCE_REGION"));
            return bmxv.m108566b(c.mo57633a());
        } catch (Exception e) {
            bbos.m88292b("LighterMediaId", "failed to convert JSON to LighterMediaId", e);
            return bmvz.f131120a;
        }
    }

    /* renamed from: c */
    public static bcwo m90173c() {
        return new bcwo();
    }

    /* renamed from: a */
    public abstract String mo57617a();

    /* renamed from: b */
    public abstract int mo57618b();

    /* renamed from: d */
    public final bmxv mo57636d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("RESOURCE_ID", mo57617a());
            jSONObject.put("RESOURCE_REGION", mo57618b());
            return bmxv.m108566b(jSONObject);
        } catch (JSONException e) {
            bbos.m88292b("LighterMediaId", "failed to convert LighterMediaId to JSONObject", e);
            return bmvz.f131120a;
        }
    }
}
