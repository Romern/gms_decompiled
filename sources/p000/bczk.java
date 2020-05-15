package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bczk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bczk {

    /* renamed from: a */
    public static final String f105185a = bczk.class.getSimpleName();

    /* renamed from: a */
    public static bczk m90342a(bcyz bcyz) {
        return bcxz.m90228a(bcyz);
    }

    /* renamed from: a */
    public abstract bcyz mo57643a();

    /* renamed from: b */
    public abstract bczj mo57644b();

    /* renamed from: c */
    public abstract bczq mo57648c();

    /* renamed from: d */
    public abstract bczs mo57652d();

    /* renamed from: a */
    public static bczk m90343a(bczq bczq) {
        return bcxz.m90229a(bczq);
    }

    /* renamed from: a */
    public static bczk m90344a(bczs bczs) {
        return bcxz.m90230a(bczs);
    }

    /* renamed from: a */
    public static bmxv m90345a(JSONObject jSONObject) {
        try {
            bczj a = bczj.m90341a(jSONObject.getInt("TYPE"));
            int ordinal = a.ordinal();
            if (ordinal == 0) {
                bmxv a2 = bczq.m90375a(jSONObject.getJSONObject("STACK_CARD"));
                if (a2.mo66813a()) {
                    return bmxv.m108566b(bcxz.m90229a((bczq) a2.mo66814b()));
                }
                bbos.m88294d(f105185a, "Failed to convert JSONObject to RichCard.");
                return bmvz.f131120a;
            } else if (ordinal == 1) {
                bmxv a3 = bczs.m90382a(jSONObject.getString("STANDALONE_CARD"));
                if (a3.mo66813a()) {
                    return bmxv.m108566b(bcxz.m90230a((bczs) a3.mo66814b()));
                }
                bbos.m88294d(f105185a, "Failed to convert JSONObject to RichCard.");
                return bmvz.f131120a;
            } else if (ordinal != 2) {
                String str = f105185a;
                String valueOf = String.valueOf(a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 60);
                sb.append("Failed to convert JSONObject to RichCard, unsupported type: ");
                sb.append(valueOf);
                bbos.m88294d(str, sb.toString());
                return bmvz.f131120a;
            } else {
                bmxv a4 = bcyz.m90299a(jSONObject.getString("CARD_CAROUSEL"));
                if (a4.mo66813a()) {
                    return bmxv.m108566b(bcxz.m90228a((bcyz) a4.mo66814b()));
                }
                bbos.m88294d(f105185a, "Failed to convert JSONObject to RichCard.");
                return bmvz.f131120a;
            }
        } catch (JSONException e) {
            bbos.m88292b(f105185a, "Failed to convert JSONObject to RichCard.", e);
            return bmvz.f131120a;
        }
    }
}
