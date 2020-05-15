package p000;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bczq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bczq {

    /* renamed from: a */
    private static final String f105197a = bczq.class.getSimpleName();

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r9.mo57811a(r10.mo67664a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r8 = p000.bmxv.m108566b(r9.mo57810a());
     */
    /* renamed from: a */
    public static bmxv m90375a(JSONObject jSONObject) {
        bmxv bmxv;
        bmxv bmxv2;
        try {
            bczp b = m90376b();
            bngs j = bngx.m109377j();
            JSONArray jSONArray = jSONObject.getJSONArray("COMPONENTS");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                try {
                    if (!jSONObject2.has("UI_ELEMENT")) {
                        if (jSONObject2.has("STACK_COMPONENT")) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("STACK_COMPONENT");
                            bczw b2 = bczx.m90397b();
                            bngs j2 = bngx.m109377j();
                            try {
                                JSONArray jSONArray2 = jSONObject3.getJSONArray("UI_ELEMENTS");
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= jSONArray2.length()) {
                                        break;
                                    }
                                    bmxv a = bdad.m90422a(jSONArray2.getJSONObject(i2));
                                    if (!a.mo66813a()) {
                                        bbos.m88294d("UI_COMPONENT", "Failed to get UiElement from JSON when decoding StackComponent.");
                                        bmxv2 = bmvz.f131120a;
                                        break;
                                    }
                                    j2.mo67668c((bdad) a.mo66814b());
                                    i2++;
                                }
                            } catch (JSONException e) {
                                bbos.m88292b("UI_COMPONENT", "Failed to get LineStyle from JSONObject.", e);
                                bmxv2 = bmvz.f131120a;
                            }
                            if (bmxv2.mo66813a()) {
                                bmxv = bmxv.m108566b(bcyd.m90237a((bczx) bmxv2.mo66814b()));
                            } else {
                                bbos.m88294d("UI_COMPONENT", "Failed to get StackComponent from JSON when decoding UiComponent.");
                                bmxv = bmvz.f131120a;
                            }
                        }
                        bmxv = bmvz.f131120a;
                    } else {
                        bmxv a2 = bdad.m90422a(jSONObject2.getJSONObject("UI_ELEMENT"));
                        if (a2.mo66813a()) {
                            bmxv = bmxv.m108566b(bcyd.m90238a((bdad) a2.mo66814b()));
                        } else {
                            bbos.m88294d("UI_COMPONENT", "Failed to get UiElement from JSON when decoding UiComponent.");
                            bmxv = bmvz.f131120a;
                        }
                    }
                } catch (JSONException e2) {
                    bbos.m88292b("UI_COMPONENT", "Failed to get UiComponent from JSONObject", e2);
                }
                if (!bmxv.mo66813a()) {
                    bbos.m88294d(f105197a, "Failed to convert JSONObject to StackCard.");
                    return bmvz.f131120a;
                }
                j.mo67668c((bczy) bmxv.mo66814b());
            }
            b.mo57800a(j.mo67664a());
            return bmxv.m108566b(b.mo57799a());
        } catch (JSONException e3) {
            bbos.m88292b(f105197a, "Failed to convert JSONObject to StackCard.", e3);
            return bmvz.f131120a;
        }
    }

    /* renamed from: b */
    public static bczp m90376b() {
        return new bczp();
    }

    /* renamed from: a */
    public abstract bngx mo57739a();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        r7.put("UI_ELEMENTS", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r5 = p000.bmxv.m108566b(r7);
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d9 A[Catch:{ JSONException -> 0x00ec }, LOOP:0: B:3:0x0016->B:46:0x00d9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d1 A[SYNTHETIC] */
    /* renamed from: c */
    public final bmxv mo57801c() {
        bmxv bmxv;
        bmxv bmxv2;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            bnre i = mo57739a().listIterator();
            while (i.hasNext()) {
                bczy bczy = (bczy) i.next();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    bczv bczv = bczv.STACK_COMPONENT;
                    int ordinal = bczy.mo57657b().ordinal();
                    if (ordinal == 0) {
                        bczx a = bczy.mo57656a();
                        JSONObject jSONObject3 = new JSONObject();
                        JSONArray jSONArray2 = new JSONArray();
                        try {
                            bnre i2 = a.mo57754a().listIterator();
                            while (true) {
                                if (!i2.hasNext()) {
                                    break;
                                }
                                bmxv h = ((bdad) i2.next()).mo57825h();
                                if (!h.mo66813a()) {
                                    bbos.m88294d("UI_COMPONENT", "Failed to convert UiElement to JSON when encoding StackComponent.");
                                    bmxv2 = bmvz.f131120a;
                                    break;
                                }
                                jSONArray2.put(h.mo66814b());
                            }
                        } catch (JSONException e) {
                            bbos.m88292b("UI_COMPONENT", "Failed to convert StackComponent to JSONObject", e);
                            bmxv2 = bmvz.f131120a;
                        }
                        if (bmxv2.mo66813a()) {
                            jSONObject2.put("STACK_COMPONENT", bmxv2.mo66814b());
                        } else {
                            bbos.m88294d("UI_COMPONENT", "Failed to convert stackComponent to JSON when encoding UiComponent.");
                            bmxv = bmvz.f131120a;
                            if (!bmxv.mo66813a()) {
                            }
                        }
                    } else if (ordinal == 1) {
                        bmxv h2 = bczy.mo57661c().mo57825h();
                        if (h2.mo66813a()) {
                            jSONObject2.put("UI_ELEMENT", h2.mo66814b());
                        } else {
                            bbos.m88294d("UI_COMPONENT", "Failed to convert UiElement to JSON when encoding UiComponent.");
                            bmxv = bmvz.f131120a;
                            if (!bmxv.mo66813a()) {
                                bbos.m88294d(f105197a, "Failed to convert StackCard to JSONObject.");
                                return bmvz.f131120a;
                            }
                            jSONArray.put(bmxv.mo66814b());
                        }
                    }
                    bmxv = bmxv.m108566b(jSONObject2);
                } catch (JSONException e2) {
                    bbos.m88292b("UI_COMPONENT", "Failed to convert UiComponent to JSONObject", e2);
                    bmxv = bmvz.f131120a;
                }
                if (!bmxv.mo66813a()) {
                }
            }
            jSONObject.put("COMPONENTS", jSONArray);
            return bmxv.m108566b(jSONObject);
        } catch (JSONException e3) {
            bbos.m88292b(f105197a, "Failed to convert StackCard to JSONObject.", e3);
            return bmvz.f131120a;
        }
    }
}
