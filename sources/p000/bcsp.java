package p000;

import android.graphics.Bitmap;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bcsp {
    /* renamed from: n */
    public static bcso m89835n() {
        bcso bcso = new bcso((byte[]) null);
        bcso.mo57468b(false);
        bcso.mo57460a(bngx.m109356a(Integer.valueOf((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR)));
        bcso.mo57466b((Long) -1L);
        bcso.f104811a = 0L;
        bcso.mo57464a(new HashMap());
        return bcso;
    }

    /* renamed from: a */
    public abstract ConversationId mo57317a();

    /* renamed from: b */
    public abstract bmxv mo57318b();

    /* renamed from: c */
    public abstract bmxv mo57319c();

    /* renamed from: d */
    public abstract bmxv mo57320d();

    /* renamed from: e */
    public abstract boolean mo57321e();

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcsp) {
            bcsp bcsp = (bcsp) obj;
            if (mo57317a().equals(bcsp.mo57317a()) && mo57318b().equals(bcsp.mo57318b()) && mo57319c().equals(bcsp.mo57319c()) && mo57320d().mo66813a() == bcsp.mo57320d().mo66813a() && ((!mo57320d().mo66813a() || !bcsp.mo57320d().mo66813a() || ((Bitmap) mo57320d().mo66814b()).sameAs((Bitmap) bcsp.mo57320d().mo66814b())) && mo57321e() == bcsp.mo57321e() && mo57322f().equals(bcsp.mo57322f()) && mo57324h() == bcsp.mo57324h() && mo57325i().keySet().equals(bcsp.mo57325i().keySet()) && mo57326j().equals(bcsp.mo57326j()))) {
                return bnjd.m109596d(bnfi.m109235a(mo57325i().keySet()).mo67504a(), new bcsn(this, bcsp)) && bnkn.m109669a(mo57327k(), bcsp.mo57327k()) && mo57328l().equals(bcsp.mo57328l());
            }
        }
    }

    /* renamed from: f */
    public abstract Long mo57322f();

    /* renamed from: g */
    public abstract Long mo57323g();

    /* renamed from: h */
    public abstract boolean mo57324h();

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (((((mo57317a().hashCode() + 527) * 31) + mo57318b().hashCode()) * 31) + mo57319c().hashCode()) * 31;
        int i3 = 1237;
        if (!mo57320d().mo66813a()) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i4 = (hashCode + i) * 31;
        if (!mo57321e()) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int hashCode2 = (((i4 + i2) * 31) + mo57322f().hashCode()) * 31;
        if (mo57324h()) {
            i3 = 1231;
        }
        int hashCode3 = ((((hashCode2 + i3) * 31) + mo57325i().keySet().hashCode()) * 31) + mo57326j().hashCode();
        for (byte[] bArr : mo57325i().values()) {
            hashCode3 = (hashCode3 * 31) + Arrays.hashCode(bArr);
        }
        return (((hashCode3 * 31) + mo57327k().hashCode()) * 31) + mo57328l().hashCode();
    }

    /* renamed from: i */
    public abstract Map mo57325i();

    /* renamed from: j */
    public abstract bmxv mo57326j();

    /* renamed from: k */
    public abstract bngx mo57327k();

    /* renamed from: l */
    public abstract Long mo57328l();

    /* renamed from: m */
    public abstract bcso mo57329m();

    /* renamed from: o */
    public final bmxv mo57471o() {
        bmxv bmxv;
        bmxv bmxv2;
        try {
            JSONObject jSONObject = new JSONObject();
            bmxv g = mo57317a().mo60559g();
            if (!g.mo66813a()) {
                return bmvz.f131120a;
            }
            jSONObject.put("CONVERSATION_ID", g.mo66814b());
            bmxv b = mo57318b();
            if (b.mo66813a()) {
                jSONObject.put("TITLE", b.mo66814b());
            }
            bmxv c = mo57319c();
            if (c.mo66813a()) {
                jSONObject.put("IMAGE_URL", c.mo66814b());
            }
            bmxv d = mo57320d();
            if (d.mo66813a()) {
                jSONObject.put("IMAGE", bbqu.m88426d(bbqu.m88421a((Bitmap) d.mo66814b())));
            }
            jSONObject.put("IS_IMAGE_STALE", mo57321e());
            jSONObject.put("EXPIRATION_TIME_MILLIS", mo57322f());
            JSONObject jSONObject2 = new JSONObject();
            for (String str : mo57325i().keySet()) {
                jSONObject2.put(str, bbqu.m88426d((byte[]) mo57325i().get(str)));
            }
            jSONObject.put("APP_DATA", jSONObject2);
            if (mo57326j().mo66813a()) {
                bcuu bcuu = (bcuu) mo57326j().mo66814b();
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("ID", bcuu.mo57416a());
                    jSONObject3.put("MESSAGE_ID", bcuu.mo57417b());
                    jSONObject3.put("RENDER_STYLE", bcuu.mo57419d());
                    JSONArray jSONArray = new JSONArray();
                    bnre i = bcuu.mo57418c().listIterator();
                    while (true) {
                        if (i.hasNext()) {
                            bcus bcus = (bcus) i.next();
                            try {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("ID", bcus.mo57408a());
                                jSONObject4.put("TEXT", bcus.mo57409b());
                                bmxv k = bcus.mo57411d().mo57124k();
                                if (k.mo66813a()) {
                                    jSONObject4.put("ACTION", k.mo66814b());
                                    if (bcus.mo57410c().mo66813a()) {
                                        bmxv g2 = ((bcsz) bcus.mo57410c().mo66814b()).mo57493g();
                                        if (g2.mo66813a()) {
                                            jSONObject4.put("LIGHTER_ICON", g2.mo66814b());
                                        }
                                    }
                                    jSONObject4.put("SECONDARY_TEXT", bcus.mo57412e());
                                    bmxv2 = bmxv.m108566b(jSONObject4);
                                } else {
                                    bbos.m88294d(bcus.f104960a, "failed to convert Suggestion to JSONObject");
                                    bmxv2 = bmvz.f131120a;
                                }
                            } catch (JSONException e) {
                                bbos.m88292b(bcus.f104960a, "failed to convert Suggestion to JSONObject", e);
                                bmxv2 = bmvz.f131120a;
                            }
                            if (!bmxv2.mo66813a()) {
                                bmxv = bmvz.f131120a;
                                break;
                            }
                            jSONArray.put(bmxv2.mo66814b());
                        } else {
                            jSONObject3.put("SUGGESTIONS", jSONArray);
                            jSONObject3.put("HINT_TEXT", bcuu.mo57420e());
                            bmxv = bmxv.m108566b(jSONObject3);
                            break;
                        }
                    }
                } catch (JSONException e2) {
                    bbos.m88294d(bcuu.f104966a, "failed to convert SuggestionList to JSONObject");
                    bmxv = bmvz.f131120a;
                }
                if (bmxv.mo66813a()) {
                    jSONObject.put("SUGGESTION_LIST", bmxv.mo66814b());
                } else {
                    bbos.m88294d("Conversation", "failed to convert SuggestionList to JSONObject");
                }
            }
            jSONObject.put("BLOCKABLE", mo57324h());
            JSONArray jSONArray2 = new JSONArray();
            bnre i2 = mo57327k().listIterator();
            while (i2.hasNext()) {
                jSONArray2.put(((Integer) i2.next()).intValue());
            }
            jSONObject.put("CAPABILITIES", jSONArray2);
            jSONObject.put("PROPERTIES_EXPIRATION_TIME_MS", mo57328l());
            return bmxv.m108566b(jSONObject);
        } catch (JSONException e3) {
            bbos.m88294d("Conversation", "failed to convert Conversation to JSONObject");
            return bmvz.f131120a;
        }
    }
}
