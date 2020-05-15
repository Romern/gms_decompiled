package p000;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bcyz {

    /* renamed from: a */
    private static final String f105165a = bcyz.class.getSimpleName();

    /* renamed from: a */
    public static bmxv m90299a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            bcyy d = m90300d();
            d.mo57767a(jSONObject.getInt("CARD_WIDTH"));
            d.mo57769a(jSONObject.getString("JSON_SOURCE"));
            bngs j = bngx.m109377j();
            JSONArray jSONArray = jSONObject.getJSONArray("CARDS");
            for (int i = 0; i < jSONArray.length(); i++) {
                bmxv a = bczq.m90375a(jSONArray.getJSONObject(i));
                if (!a.mo66813a()) {
                    bbos.m88294d(f105165a, "Failed to convert JSONObject to CardCarousel.");
                    return bmvz.f131120a;
                }
                j.mo67668c((bczq) a.mo66814b());
            }
            d.mo57768a(j.mo67664a());
            return bmxv.m108566b(d.mo57766a());
        } catch (JSONException e) {
            bbos.m88292b(f105165a, "Failed to convert JSONObject to CardCarousel.", e);
            return bmvz.f131120a;
        }
    }

    /* renamed from: d */
    public static bcyy m90300d() {
        return new bcyy();
    }

    /* renamed from: a */
    public abstract int mo57693a();

    /* renamed from: b */
    public abstract String mo57694b();

    /* renamed from: c */
    public abstract bngx mo57695c();

    /* renamed from: e */
    public final bmxv mo57770e() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("CARD_WIDTH", mo57693a());
            jSONObject.put("JSON_SOURCE", mo57694b());
            JSONArray jSONArray = new JSONArray();
            bnre i = mo57695c().listIterator();
            while (i.hasNext()) {
                bmxv c = ((bczq) i.next()).mo57801c();
                if (!c.mo66813a()) {
                    bbos.m88294d(f105165a, "Failed to convert CardCarousel to JSONObject.");
                    return bmvz.f131120a;
                }
                jSONArray.put(c.mo66814b());
            }
            jSONObject.put("CARDS", jSONArray);
            return bmxv.m108566b(jSONObject);
        } catch (JSONException e) {
            bbos.m88292b(f105165a, "Failed to convert CardCarousel to JSONObject.", e);
            return bmvz.f131120a;
        }
    }
}
