package p000;

import android.graphics.Bitmap;
import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bcsj {
    /* renamed from: m */
    public static bcsi m89802m() {
        bcsi bcsi = new bcsi((byte[]) null);
        bcsi.mo57444a(false);
        bcsi.mo57440a(bngx.m109376e());
        bcsi.mo57445b(bngx.m109376e());
        return bcsi;
    }

    /* renamed from: a */
    public abstract ContactId mo57302a();

    /* renamed from: b */
    public abstract bmxv mo57303b();

    /* renamed from: c */
    public abstract bmxv mo57304c();

    /* renamed from: d */
    public abstract bmxv mo57305d();

    /* renamed from: e */
    public abstract bmxv mo57306e();

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcsj) {
            bcsj bcsj = (bcsj) obj;
            return mo57302a().equals(bcsj.mo57302a()) && mo57308g().equals(bcsj.mo57308g()) && mo57305d().equals(bcsj.mo57305d()) && mo57303b().equals(bcsj.mo57303b()) && mo57307f() == bcsj.mo57307f() && mo57312k().equals(bcsj.mo57312k());
        }
    }

    /* renamed from: f */
    public abstract boolean mo57307f();

    /* renamed from: g */
    public abstract Long mo57308g();

    /* renamed from: h */
    public abstract bngx mo57309h();

    public final int hashCode() {
        int i;
        int hashCode = (((mo57302a().hashCode() + 527) * 31) + mo57305d().hashCode()) * 31;
        int i2 = 1231;
        int i3 = 1237;
        if (!mo57306e().mo66813a()) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode2 = (((hashCode + i) * 31) + mo57303b().hashCode()) * 31;
        if (!mo57307f()) {
            i2 = 1237;
        }
        int hashCode3 = (((hashCode2 + i2) * 31) + mo57308g().hashCode()) * 31;
        if (mo57312k().mo66813a()) {
            i3 = ((bctd) mo57312k().mo66814b()).hashCode();
        }
        return hashCode3 + i3;
    }

    /* renamed from: i */
    public abstract bngx mo57310i();

    /* renamed from: j */
    public abstract bmxv mo57311j();

    /* renamed from: k */
    public abstract bmxv mo57312k();

    /* renamed from: l */
    public abstract bcsi mo57313l();

    /* renamed from: n */
    public final bmxv mo57449n() {
        bmxv bmxv;
        bmxv bmxv2;
        try {
            JSONObject jSONObject = new JSONObject();
            bmxv g = mo57302a().mo60552g();
            if (!g.mo66813a()) {
                return bmvz.f131120a;
            }
            jSONObject.put("CONTACT_ID", g.mo66814b());
            bmxv b = mo57303b();
            if (b.mo66813a()) {
                jSONObject.put("NAME", b.mo66814b());
            }
            bmxv c = mo57304c();
            if (c.mo66813a()) {
                jSONObject.put("A11Y_NAME", c.mo66814b());
            }
            bmxv d = mo57305d();
            if (d.mo66813a()) {
                jSONObject.put("IMAGE_URL", d.mo66814b());
            }
            bmxv e = mo57306e();
            if (e.mo66813a()) {
                jSONObject.put("IMAGE", Base64.encodeToString(bbqu.m88421a((Bitmap) e.mo66814b()), 2));
            }
            jSONObject.put("IS_IMAGE_STALE", mo57307f());
            jSONObject.put("EXPIRATION_TIME_MILLIS", mo57308g());
            JSONArray jSONArray = new JSONArray();
            bnre i = mo57309h().listIterator();
            while (i.hasNext()) {
                bmxv e2 = ((bctb) i.next()).mo57498e();
                if (e2.mo66813a()) {
                    jSONArray.put(e2.mo66814b());
                }
            }
            jSONObject.put("MENU_ITEMS", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            bnre i2 = mo57310i().listIterator();
            while (i2.hasNext()) {
                bmxv e3 = ((bctb) i2.next()).mo57498e();
                if (e3.mo66813a()) {
                    jSONArray2.put(e3.mo66814b());
                }
            }
            jSONObject.put("TOOLBAR_BUTTONS", jSONArray2);
            bmxv j = mo57311j();
            if (j.mo66813a() && ((bcsv) j.mo66814b()).mo57483b() == 1) {
                bcuq bcuq = (bcuq) j.mo66814b();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    bmxv d2 = bcuq.mo57402a().mo57568d();
                    if (!d2.mo66813a()) {
                        bbos.m88294d("RichTextContentModel", "Failed to convert RichText to JSONObject when encoding RichTextContentModel.");
                    }
                    jSONObject2.put("CONTENT", d2.mo66814b());
                    bmxv2 = bmxv.m108566b(jSONObject2);
                } catch (JSONException e4) {
                    bbos.m88292b("RichTextContentModel", "Failed to convert RichTextContentModel to JSONObject.", e4);
                    bmxv2 = bmvz.f131120a;
                }
                if (bmxv2.mo66813a()) {
                    jSONObject.put("CUSTOM_VIEW_CONTENT_MODEL_TYPE", 1);
                    jSONObject.put("CUSTOM_VIEW_CONTENT_MODEL", bmxv2.mo66814b());
                }
            }
            if (mo57312k().mo66813a()) {
                bctd bctd = (bctd) mo57312k().mo66814b();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("BADGE", bctd.mo57354a());
                    jSONObject3.put("PROFILE_LABEL_STYLE", bctd.mo57355b());
                    bmxv = bmxv.m108566b(jSONObject3);
                } catch (JSONException e5) {
                    bbos.m88294d("LitUiConfig", "failed to convert LighterUiConfigurations to JSONObject");
                    bmxv = bmvz.f131120a;
                }
                if (bmxv.mo66813a()) {
                    jSONObject.put("UI_CONFIGURATIONS", bmxv.mo66814b());
                }
            }
            return bmxv.m108566b(jSONObject);
        } catch (JSONException e6) {
            bbos.m88294d("Contact", "failed to convert Contact to JSONObject");
            return bmvz.f131120a;
        }
    }
}
