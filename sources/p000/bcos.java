package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bcos {
    /* renamed from: a */
    public static bmxv m89521a(bcos bcos) {
        bmxv bmxv;
        JSONObject jSONObject = new JSONObject();
        try {
            if (bcos.mo57108b().mo66813a()) {
                bcsx bcsx = (bcsx) bcos.mo57108b().mo66814b();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    bmxv i = bcsx.mo57335a().mo57533i();
                    if (i.mo66813a()) {
                        jSONObject2.put("URL", bcsx.mo57336b());
                        jSONObject2.put("WEB_VIEW_HEADER", i.mo66814b());
                        bmxv = bmxv.m108566b(jSONObject2);
                    } else {
                        bmxv = bmvz.f131120a;
                    }
                } catch (JSONException e) {
                    bbos.m88292b("CustomizedWebView", " Fail to convert customized web view to json object.", e);
                    bmxv = bmvz.f131120a;
                }
                if (!bmxv.mo66813a()) {
                    return bmvz.f131120a;
                }
                jSONObject.put("STACKED_REACTION_WEB_VIEW", bmxv.mo66814b());
            }
            if (bcos.mo57107a().mo66813a()) {
                bmxv i2 = ((bctn) bcos.mo57107a().mo66814b()).mo57533i();
                if (!i2.mo66813a()) {
                    return bmvz.f131120a;
                }
                jSONObject.put("REACTION_OVERLAY_HEADER", i2.mo66814b());
            }
            return bmxv.m108566b(jSONObject);
        } catch (JSONException e2) {
            bbos.m88294d("Action", "failed to convert OverlayActionPayload to JSONObject.");
            return bmvz.f131120a;
        }
    }

    /* renamed from: c */
    public static bcor m89522c() {
        return new bcor(null);
    }

    /* renamed from: a */
    public abstract bmxv mo57107a();

    /* renamed from: b */
    public abstract bmxv mo57108b();
}
