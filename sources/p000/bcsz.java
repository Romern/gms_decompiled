package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bcsz {

    /* renamed from: a */
    private static final String f104835a = bcsz.class.getSimpleName();

    /* renamed from: a */
    public static bmxv m89871a(JSONObject jSONObject) {
        bcsy f = m89872f();
        try {
            f.mo57491b(jSONObject.getInt("ICON_HEIGHT"));
            f.mo57492c(jSONObject.getInt("ICON_WIDTH"));
            f.mo57490a(bbqu.m88423a(jSONObject.getString("ICON")));
            f.mo57489a(jSONObject.getString("TALK_BACK_DESCRIPTION"));
            if (jSONObject.has("ICON_COLOR")) {
                f.mo57488a(jSONObject.getInt("ICON_COLOR"));
            }
            return bmxv.m108566b(f.mo57487a());
        } catch (NullPointerException | JSONException e) {
            return bmvz.f131120a;
        }
    }

    /* renamed from: f */
    public static bcsy m89872f() {
        bcsy bcsy = new bcsy(null);
        bcsy.mo57492c(0);
        bcsy.mo57491b(0);
        bcsy.mo57489a("");
        return bcsy;
    }

    /* renamed from: h */
    public static bcsz m89873h() {
        bcsy f = m89872f();
        f.mo57490a(new byte[0]);
        f.mo57491b(0);
        f.mo57492c(0);
        f.mo57489a("");
        return f.mo57487a();
    }

    /* renamed from: a */
    public abstract byte[] mo57340a();

    /* renamed from: b */
    public abstract int mo57341b();

    /* renamed from: c */
    public abstract int mo57342c();

    /* renamed from: d */
    public abstract bmxv mo57343d();

    /* renamed from: e */
    public abstract String mo57344e();

    /* renamed from: g */
    public final bmxv mo57493g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ICON", bbqu.m88426d(mo57340a()));
            jSONObject.put("ICON_WIDTH", mo57341b());
            jSONObject.put("ICON_HEIGHT", mo57342c());
            jSONObject.put("TALK_BACK_DESCRIPTION", mo57344e());
            if (mo57343d().mo66813a()) {
                jSONObject.put("ICON_COLOR", mo57343d().mo66814b());
            }
            return bmxv.m108566b(jSONObject);
        } catch (JSONException e) {
            bbos.m88294d(f104835a, "failed to convert LighterIcon to JSONObject");
            return bmvz.f131120a;
        }
    }
}
