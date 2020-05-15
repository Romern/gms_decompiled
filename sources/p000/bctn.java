package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bctn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bctn {
    /* renamed from: a */
    public static bmxv m89939a(JSONObject jSONObject) {
        bctm h = m89940h();
        try {
            h.mo57531b(jSONObject.getInt("OVERLAY_STYLE"));
            h.mo57532c(jSONObject.getInt("time_to_live_sec"));
            if (jSONObject.has("dismiss_action")) {
                bmxv a = bcov.m89533a(jSONObject.getJSONObject("dismiss_action"));
                if (!a.mo66813a()) {
                    bbos.m88294d("Message", "Failed to get dismiss action from JSONObject in Overlay.");
                    return bmvz.f131120a;
                }
                h.mo57527a((bcov) a.mo66814b());
            }
            if (jSONObject.has("overlay_lighter_icon")) {
                bmxv a2 = bcsz.m89871a(jSONObject.getJSONObject("overlay_lighter_icon"));
                if (!a2.mo66813a()) {
                    bbos.m88294d("Message", "Failed to get lighter icon from JSONObject in Overlay.");
                    return bmvz.f131120a;
                }
                h.mo57528a((bcsz) a2.mo66814b());
            }
            if (jSONObject.has("display_text")) {
                h.mo57530a(jSONObject.getString("display_text"));
            }
            if (jSONObject.has("OVERLAY_EXPIRETIME_STAMP")) {
                h.mo57526a(jSONObject.getInt("OVERLAY_EXPIRETIME_STAMP"));
            }
            if (jSONObject.has("display_icon")) {
                h.mo57529a(bxtx.m123261a(bbqu.m88423a(jSONObject.optString("display_icon"))));
            }
            return bmxv.m108566b(h.mo57525a());
        } catch (JSONException e) {
            bbos.m88292b("Message", "Failed to decode Overlay", e);
            return bmvz.f131120a;
        }
    }

    /* renamed from: h */
    public static bctm m89940h() {
        return new bctm(null);
    }

    /* renamed from: a */
    public abstract bmxv mo57384a();

    @Deprecated
    /* renamed from: b */
    public abstract bmxv mo57385b();

    /* renamed from: c */
    public abstract bmxv mo57386c();

    /* renamed from: d */
    public abstract bmxv mo57387d();

    /* renamed from: e */
    public abstract int mo57388e();

    /* renamed from: f */
    public abstract bmxv mo57390f();

    /* renamed from: g */
    public abstract int mo57391g();

    /* renamed from: i */
    public final bmxv mo57533i() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (mo57384a().mo66813a()) {
                bmxv k = ((bcov) mo57384a().mo66814b()).mo57124k();
                if (k.mo66813a()) {
                    jSONObject.put("dismiss_action", k.mo66814b());
                } else {
                    bbos.m88294d("Message", "Failed to convert dismiss action to JSONObject in Overlay.");
                    return bmvz.f131120a;
                }
            }
            if (mo57386c().mo66813a()) {
                bmxv g = ((bcsz) mo57386c().mo66814b()).mo57493g();
                if (g.mo66813a()) {
                    jSONObject.put("overlay_lighter_icon", g.mo66814b());
                } else {
                    bbos.m88294d("Message", "Failed to convert lighter icon to JSONObject in Overlay.");
                    return bmvz.f131120a;
                }
            }
            if (mo57387d().mo66813a()) {
                jSONObject.put("display_text", mo57387d().mo66814b());
            }
            jSONObject.put("time_to_live_sec", mo57388e());
            if (mo57390f().mo66813a()) {
                jSONObject.put("OVERLAY_EXPIRETIME_STAMP", mo57390f().mo66814b());
            }
            jSONObject.put("OVERLAY_STYLE", mo57391g());
            if (mo57385b().mo66813a()) {
                jSONObject.putOpt("display_icon", bbqu.m88426d(((bxtx) mo57385b().mo66814b()).mo73780k()));
            }
            return bmxv.m108566b(jSONObject);
        } catch (JSONException e) {
            bbos.m88292b("Message", "Failed to encode Overlay", e);
            return bmvz.f131120a;
        }
    }
}
