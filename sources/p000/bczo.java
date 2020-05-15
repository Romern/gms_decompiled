package p000;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bczo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bczo {

    /* renamed from: a */
    public static final String f105195a = bczo.class.getSimpleName();

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c3 A[Catch:{ JSONException -> 0x00d3 }, LOOP:0: B:3:0x0011->B:25:0x00c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d0 A[SYNTHETIC] */
    /* renamed from: a */
    public static bmxv m90369a(JSONObject jSONObject) {
        bmxv bmxv;
        try {
            bczl c = m90370c();
            JSONArray jSONArray = jSONObject.getJSONArray("BUTTONS");
            bngs j = bngx.m109377j();
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                try {
                    bczm h = bczn.m90361h();
                    h.mo57795a(jSONObject2.getString("TEXT"));
                    if (jSONObject2.has("LIGHTER_ICON")) {
                        bmxv a = bcsz.m89871a(jSONObject2.getJSONObject("LIGHTER_ICON"));
                        if (a.mo66813a()) {
                            h.mo57794a((bcsz) a.mo66814b());
                        } else {
                            bbos.m88294d(f105195a, "failed to convert JSONObject to LighterIcon");
                            bmxv = bmvz.f131120a;
                            if (bmxv.mo66813a()) {
                                return bmvz.f131120a;
                            }
                            j.mo67668c((bczn) bmxv.mo66814b());
                            i++;
                        }
                    }
                    bmxv a2 = bcov.m89533a(jSONObject2.getJSONObject("ACTION"));
                    if (a2.mo66813a()) {
                        h.mo57793a((bcov) a2.mo66814b());
                        h.mo57798c(jSONObject2.getInt("TEXT_COLOR"));
                        h.mo57792a(jSONObject2.getInt("BACKGROUND_COLOR"));
                        h.mo57797b(jSONObject2.getInt("BORDER_COLOR"));
                        h.mo57796a(jSONObject2.getBoolean("ENABLED"));
                        bmxv = bmxv.m108566b(h.mo57791a());
                    } else {
                        bmxv = bmvz.f131120a;
                    }
                } catch (JSONException e) {
                    bbos.m88294d(f105195a, "failed to convert JSONObject to RichCardButton");
                    bmxv = bmvz.f131120a;
                }
                if (bmxv.mo66813a()) {
                }
            }
            c.mo57790a(j.mo67664a());
            c.mo57789a(jSONObject.getInt("ORIENTATION"));
            return bmxv.m108566b(c.mo57788a());
        } catch (JSONException e2) {
            bbos.m88294d(f105195a, "failed to convert JSONObject to RichCardButtons");
            return bmvz.f131120a;
        }
    }

    /* renamed from: c */
    public static bczl m90370c() {
        return new bczl();
    }

    /* renamed from: a */
    public abstract bngx mo57724a();

    /* renamed from: b */
    public abstract int mo57725b();
}
