package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bczh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bczh {
    /* renamed from: a */
    public static bmxv m90331a(JSONObject jSONObject) {
        try {
            bczg g = m90332g();
            bmxv a = bcwp.m90172a(jSONObject.getJSONObject("MEDIA_ID"));
            if (!a.mo66813a()) {
                return bmvz.f131120a;
            }
            g.mo57783a((bcwp) a.mo66814b());
            if (jSONObject.has("LOCAL_URI")) {
                g.f105173a = jSONObject.getString("LOCAL_URI");
            }
            if (jSONObject.has("THUMBNAIL")) {
                g.mo57785a(bbqu.m88423a(jSONObject.getString("THUMBNAIL")));
            }
            g.mo57786b(jSONObject.getInt("WIDTH"));
            g.mo57782a(jSONObject.getInt("HEIGHT"));
            g.mo57784a(jSONObject.getString("IMAGE_DESCRIPTION"));
            return bmxv.m108566b(g.mo57781a());
        } catch (JSONException e) {
            bbos.m88292b("ImageElement", "Failed to convert ImageElement from JSONObject.", e);
            return bmvz.f131120a;
        }
    }

    /* renamed from: g */
    public static bczg m90332g() {
        bczg bczg = new bczg();
        bczg.mo57785a(new byte[0]);
        return bczg;
    }

    /* renamed from: a */
    public abstract bcwp mo57715a();

    /* renamed from: b */
    public abstract String mo57716b();

    /* renamed from: c */
    public abstract bxtx mo57717c();

    /* renamed from: d */
    public abstract int mo57718d();

    /* renamed from: e */
    public abstract int mo57719e();

    /* renamed from: f */
    public abstract String mo57721f();

    /* renamed from: h */
    public final bmxv mo57787h() {
        try {
            JSONObject jSONObject = new JSONObject();
            bmxv d = mo57715a().mo57636d();
            if (d.mo66813a()) {
                jSONObject.put("MEDIA_ID", d.mo66814b());
                if (mo57716b() != null) {
                    jSONObject.put("LOCAL_URI", mo57716b());
                }
                if (mo57717c().mo73744a() > 0) {
                    jSONObject.put("THUMBNAIL", bbqu.m88426d(mo57717c().mo73780k()));
                }
                jSONObject.put("WIDTH", mo57718d());
                jSONObject.put("HEIGHT", mo57719e());
                jSONObject.put("IMAGE_DESCRIPTION", mo57721f());
                return bmxv.m108566b(jSONObject);
            }
            bbos.m88294d("ImageElement", "failed to convert ImageElement to JSONObject.");
            return bmvz.f131120a;
        } catch (JSONException e) {
            bbos.m88292b("ImageElement", "Failed to convert ImageElement to JSONObject.", e);
            return bmvz.f131120a;
        }
    }
}
