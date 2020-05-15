package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bcov {
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011d A[Catch:{ JSONException -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0128 A[Catch:{ JSONException -> 0x01e6 }] */
    /* renamed from: a */
    public static bmxv m89533a(JSONObject jSONObject) {
        bmxv bmxv;
        bmxv bmxv2;
        if (!jSONObject.has("ACTION_TYPE")) {
            bbos.m88294d("Action", "failed to convert JSONObject to Action, missing necessary properties");
            return bmvz.f131120a;
        }
        bcoo j = m89535j();
        try {
            j.mo57086a(jSONObject.getLong("ACTION_TRIGGERED_LOG_ID"));
            if (jSONObject.has("TRACE_ID")) {
                j.mo57099g(jSONObject.getString("TRACE_ID"));
            }
            if (jSONObject.has("MESSAGE_ID")) {
                j.mo57097e(jSONObject.getString("MESSAGE_ID"));
            }
            if (jSONObject.has("EVENT_CALLBACK_PAYLOAD")) {
                j.mo57096d(jSONObject.getString("EVENT_CALLBACK_PAYLOAD"));
            }
            if (jSONObject.has("EVENT_CALLBACK_DESTINATION")) {
                bmxv a = bcop.m89512a(jSONObject.getJSONObject("EVENT_CALLBACK_DESTINATION"));
                if (a.mo66813a()) {
                    j.mo57087a((bcop) a.mo66814b());
                }
            }
            switch (bcon.m89495a(jSONObject.getString("ACTION_TYPE")).ordinal()) {
                case 0:
                    bbos.m88294d("Action", "failed to convert JSONObject to Action encounter UNKNOWN Action type");
                    return bmvz.f131120a;
                case 1:
                    bmxv a2 = bcou.m89528a(jSONObject.getJSONObject("ACTION_PAYLOAD"));
                    if (a2.mo66813a()) {
                        j.mo57092b((bcou) a2.mo66814b());
                        break;
                    }
                    break;
                case 2:
                    bmxv a3 = bcou.m89528a(jSONObject.getJSONObject("ACTION_PAYLOAD"));
                    if (a3.mo66813a()) {
                        j.mo57089a((bcou) a3.mo66814b());
                        break;
                    }
                    break;
                case 3:
                    j.mo57093b(jSONObject.getString("ACTION_PAYLOAD"));
                    break;
                case 4:
                    j.mo57100h(jSONObject.getString("ACTION_PAYLOAD"));
                    break;
                case 5:
                    bmxv a4 = bctn.m89939a(jSONObject.getJSONObject("ACTION_PAYLOAD"));
                    if (a4.mo66813a()) {
                        bcor c = bcos.m89522c();
                        c.mo57106a((bctn) a4.mo66814b());
                        j.mo57088a(c.mo57104a());
                        break;
                    } else {
                        return bmvz.f131120a;
                    }
                case 6:
                    j.mo57094c();
                    break;
                case 7:
                    j.mo57090a(jSONObject.getString("ACTION_PAYLOAD"));
                    break;
                case 8:
                    j.mo57098f(jSONObject.getString("ACTION_PAYLOAD"));
                    break;
                case 9:
                    JSONObject jSONObject2 = jSONObject.getJSONObject("ACTION_PAYLOAD");
                    bcor c2 = bcos.m89522c();
                    try {
                        if (jSONObject2.has("REACTION_OVERLAY_HEADER")) {
                            bmxv a5 = bctn.m89939a(jSONObject2.getJSONObject("REACTION_OVERLAY_HEADER"));
                            if (a5.mo66813a()) {
                                c2.mo57106a((bctn) a5.mo66814b());
                            }
                            bmxv = bmvz.f131120a;
                            if (bmxv.mo66813a()) {
                                j.mo57088a((bcos) bmxv.mo66814b());
                                break;
                            } else {
                                return bmvz.f131120a;
                            }
                        }
                        if (jSONObject2.has("STACKED_REACTION_WEB_VIEW")) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("STACKED_REACTION_WEB_VIEW");
                            bcsw c3 = bcsx.m89862c();
                            try {
                                c3.mo57486a(jSONObject3.getString("URL"));
                                bmxv a6 = bctn.m89939a(jSONObject3.getJSONObject("WEB_VIEW_HEADER"));
                                if (a6.mo66813a()) {
                                    c3.mo57485a((bctn) a6.mo66814b());
                                    bmxv2 = bmxv.m108566b(c3.mo57484a());
                                } else {
                                    bmxv2 = bmvz.f131120a;
                                }
                            } catch (JSONException e) {
                                bbos.m88292b("CustomizedWebView", " Fail to convert customized web view from json object.", e);
                                bmxv2 = bmvz.f131120a;
                            }
                            if (bmxv2.mo66813a()) {
                                c2.mo57105a((bcsx) bmxv2.mo66814b());
                            }
                            bmxv = bmvz.f131120a;
                            if (bmxv.mo66813a()) {
                            }
                        }
                        bmxv = bmxv.m108566b(c2.mo57104a());
                    } catch (JSONException e2) {
                        bbos.m88292b("Action", "failed to convert JSONObject to OverlayActionPayload.", e2);
                        bmxv = bmvz.f131120a;
                    }
                    if (bmxv.mo66813a()) {
                    }
            }
            int ordinal = bcon.m89495a(jSONObject.getString("EVENT_CALLBACK_FAILURE_ACTION_TYPE")).ordinal();
            if (ordinal != 6) {
                if (ordinal != 8) {
                    bbos.m88294d("Action", "failed to convert JSONObject to Action, unsupported event callback failure action type");
                    return bmvz.f131120a;
                }
                j.mo57095c(jSONObject.getString("EVENT_CALLBACK_FAILURE_ACTION_PAYLOAD"));
            }
            return bmxv.m108566b(j.mo57085a());
        } catch (JSONException e3) {
            bbos.m88292b("Action", "failed to convert JSONObject to Action", e3);
            return bmvz.f131120a;
        }
    }

    /* renamed from: j */
    public static bcoo m89535j() {
        bcoo bcoo = new bcoo(null);
        bcoo.mo57086a(0);
        bcoo.mo57091b();
        return bcoo;
    }

    /* renamed from: a */
    public abstract bmxv mo57115a();

    /* renamed from: b */
    public abstract bmxv mo57116b();

    /* renamed from: c */
    public abstract bmxv mo57117c();

    /* renamed from: d */
    public abstract bmxv mo57118d();

    /* renamed from: e */
    public abstract long mo57119e();

    /* renamed from: f */
    public final bcon mo57120f() {
        return mo57121g().mo57076a();
    }

    /* renamed from: g */
    public abstract bcom mo57121g();

    /* renamed from: h */
    public final bcon mo57122h() {
        return mo57123i().mo57076a();
    }

    /* renamed from: i */
    public abstract bcom mo57123i();

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4 A[Catch:{ JSONException -> 0x011f }] */
    /* renamed from: k */
    public final bmxv mo57124k() {
        bmxv bmxv;
        JSONObject jSONObject = new JSONObject();
        try {
            if (mo57117c().mo66813a()) {
                jSONObject.put("EVENT_CALLBACK_PAYLOAD", mo57117c().mo66814b());
            }
            jSONObject.put("ACTION_TRIGGERED_LOG_ID", mo57119e());
            if (mo57118d().mo66813a()) {
                bcop bcop = (bcop) mo57118d().mo66814b();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    int c = bcop.mo57103c();
                    int i = c - 1;
                    if (c != 0) {
                        jSONObject2.put("EVENT_CALLBACK_DESTINATION_TYPE", i);
                        bcon bcon = bcon.UNKNOWN;
                        int c2 = bcop.mo57103c();
                        int i2 = c2 - 1;
                        if (c2 != 0) {
                            if (i2 == 1) {
                                bmxv g = bcop.mo57101a().mo60552g();
                                if (g.mo66813a()) {
                                    jSONObject2.put("EVENT_CALLBACK_DESTINATION", g.mo66814b());
                                } else {
                                    bbos.m88294d("Action", "failed to convert EventCallbackDestination to JSONObject, ContactId is not present");
                                    bmxv = bmvz.f131120a;
                                    if (bmxv.mo66813a()) {
                                    }
                                }
                            } else if (i2 == 2) {
                                bmxv d = bcop.mo57102b().mo60560d();
                                if (d.mo66813a()) {
                                    jSONObject2.put("EVENT_CALLBACK_DESTINATION", d.mo66814b());
                                } else {
                                    bbos.m88294d("Action", "failed to convert EventCallbackDestination to JSONObject, GroupId is not present");
                                    bmxv = bmvz.f131120a;
                                    if (bmxv.mo66813a()) {
                                        jSONObject.put("EVENT_CALLBACK_DESTINATION", bmxv.mo66814b());
                                    }
                                }
                            }
                            bmxv = bmxv.m108566b(jSONObject2);
                            if (bmxv.mo66813a()) {
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } catch (JSONException e) {
                    bbos.m88294d("Action", "failed to convert EventCallbackDestination to JSONObject");
                    bmxv = bmvz.f131120a;
                }
            }
            if (mo57115a().mo66813a()) {
                jSONObject.put("TRACE_ID", mo57115a().mo66814b());
            }
            if (mo57116b().mo66813a()) {
                jSONObject.put("MESSAGE_ID", mo57116b().mo66814b());
            }
            jSONObject.put("ACTION_TYPE", mo57120f());
            if (!m89534a(jSONObject, "ACTION_PAYLOAD", mo57121g())) {
                return bmvz.f131120a;
            }
            jSONObject.put("EVENT_CALLBACK_FAILURE_ACTION_TYPE", mo57122h());
            if (m89534a(jSONObject, "EVENT_CALLBACK_FAILURE_ACTION_PAYLOAD", mo57123i())) {
                return bmxv.m108566b(jSONObject);
            }
            return bmvz.f131120a;
        } catch (JSONException e2) {
            bbos.m88294d("Action", "failed to convert Action to JSONObject");
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    private static final boolean m89534a(JSONObject jSONObject, String str, bcom bcom) {
        bcon bcon = bcon.UNKNOWN;
        switch (bcom.mo57076a().ordinal()) {
            case 0:
                bbos.m88294d("Action", "failed to convert Action to JSONObject due to Unknown action type");
                return false;
            case 1:
                bmxv d = bcom.mo57077b().mo57114d();
                if (!d.mo66813a()) {
                    return true;
                }
                jSONObject.put(str, d.mo66814b());
                return true;
            case 2:
                bmxv d2 = bcom.mo57078c().mo57114d();
                if (!d2.mo66813a()) {
                    return true;
                }
                jSONObject.put(str, d2.mo66814b());
                return true;
            case 3:
                jSONObject.put(str, bcom.mo57079d());
                return true;
            case 4:
                jSONObject.put(str, bcom.mo57080e());
                return true;
            case 5:
                jSONObject.put("ACTION_TYPE", bcon.COMPOSED_OVERLAY_ACTION);
                bcor c = bcos.m89522c();
                c.mo57106a(bcom.mo57082g());
                bmxv a = bcos.m89521a(c.mo57104a());
                if (!a.mo66813a()) {
                    return false;
                }
                jSONObject.put(str, a.mo66814b());
                return true;
            case 6:
            default:
                return true;
            case 7:
                jSONObject.put(str, bcom.mo57083h());
                return true;
            case 8:
                jSONObject.put(str, bcom.mo57084i());
                return true;
            case 9:
                jSONObject.put("ACTION_TYPE", bcon.COMPOSED_OVERLAY_ACTION);
                bmxv a2 = bcos.m89521a(bcom.mo57081f());
                if (!a2.mo66813a()) {
                    return false;
                }
                jSONObject.put(str, a2.mo66814b());
                return true;
        }
    }
}
