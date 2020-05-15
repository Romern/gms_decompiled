package p000;

import java.security.InvalidParameterException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bdad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bdad {

    /* renamed from: a */
    private static final String f105224a = bdad.class.getSimpleName();

    /* renamed from: a */
    public static bmxv m90422a(JSONObject jSONObject) {
        bmxv bmxv;
        bmxv bmxv2;
        bmxv bmxv3;
        bmxv bmxv4;
        try {
            bczz g = m90423g();
            bdac bdac = (bdac) bnfi.m109237a(bdac.values()).mo67507c(new bdab(jSONObject.getInt("TYPE"))).mo66815c();
            if (bdac != null) {
                int ordinal = bdac.ordinal();
                if (ordinal != 0) {
                    switch (ordinal) {
                        case 2:
                            JSONObject jSONObject2 = jSONObject.getJSONObject("STATUS_BADGE");
                            bczt d = bczu.m90391d();
                            try {
                                d.mo57808a(jSONObject2.getString("TEXT"));
                                d.mo57807a(jSONObject2.getInt("BACKGROUND_COLOR"));
                                d.mo57809b(jSONObject2.getInt("TEXT_COLOR"));
                                bmxv = bmxv.m108566b(d.mo57806a());
                            } catch (JSONException e) {
                                bbos.m88292b("STATUS_BADGE", "Failed to get StatusBadge from JSONObject.", e);
                                bmxv = bmvz.f131120a;
                            }
                            if (bmxv.mo66813a()) {
                                g.mo57819a((bczu) bmxv.mo66814b());
                                break;
                            } else {
                                return bmvz.f131120a;
                            }
                        case 3:
                            bmxv a = bczo.m90369a(jSONObject.getJSONObject("RICH_CARD_BUTTONS"));
                            if (a.mo66813a()) {
                                g.mo57818a((bczo) a.mo66814b());
                                break;
                            } else {
                                return bmvz.f131120a;
                            }
                        case 4:
                            JSONObject jSONObject3 = jSONObject.getJSONObject("HORIZONTAL_LINE");
                            bcze c = bczf.m90322c();
                            try {
                                c.mo57780a(jSONObject3.getInt("LINE_COLOR"));
                                c.mo57779a((float) jSONObject3.getDouble("LINE_WIDTH"));
                                bmxv2 = bmxv.m108566b(c.mo57778a());
                            } catch (JSONException e2) {
                                bbos.m88292b("HORIZONTAL_LINE", "Failed to get Horizontal line from JSONObject.", e2);
                                bmxv2 = bmvz.f131120a;
                            }
                            if (bmxv2.mo66813a()) {
                                g.mo57816a((bczf) bmxv2.mo66814b());
                                break;
                            } else {
                                return bmvz.f131120a;
                            }
                        case 5:
                            JSONObject jSONObject4 = jSONObject.getJSONObject("HORIZONTAL_LAYOUT_BUTTONS");
                            bngs j = bngx.m109377j();
                            try {
                                JSONArray jSONArray = jSONObject4.getJSONArray("VERTICAL_LAYOUT_BUTTONS");
                                int i = 0;
                                while (true) {
                                    if (i >= jSONArray.length()) {
                                        bcza b = bczd.m90317b();
                                        b.mo57772a(j.mo67664a());
                                        bmxv3 = bmxv.m108566b(b.mo57771a());
                                    } else {
                                        JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                                        bczb e3 = bczc.m90312e();
                                        try {
                                            e3.mo57776a(jSONObject5.getString("DISPLAY_TEXT"));
                                            bmxv a2 = bcsz.m89871a(jSONObject5.getJSONObject("LIGHTER_ICON"));
                                            if (a2.mo66813a()) {
                                                e3.mo57775a((bcsz) a2.mo66814b());
                                                bmxv a3 = bcov.m89533a(jSONObject5.getJSONObject("ACTION"));
                                                if (a3.mo66813a()) {
                                                    e3.mo57774a((bcov) a3.mo66814b());
                                                    e3.mo57777a(bbqu.m88423a(jSONObject5.getString("ICON")));
                                                    bmxv4 = bmxv.m108566b(e3.mo57773a());
                                                } else {
                                                    bbos.m88294d("HorizontalButton", "Failed to get action from JSONObject in horizontal layout button.");
                                                    bmxv4 = bmvz.f131120a;
                                                }
                                            } else {
                                                bbos.m88294d("HorizontalButton", "Failed to get Lighter Icon from JSONObject in horizontal layout button.");
                                                bmxv4 = bmvz.f131120a;
                                            }
                                        } catch (JSONException e4) {
                                            bbos.m88292b("HorizontalButton", "Failed to get vertical layout button from JSONObject in horizontal layout button.", e4);
                                            bmxv4 = bmvz.f131120a;
                                        }
                                        if (!bmxv4.mo66813a()) {
                                            bbos.m88294d("HorizontalButton", "Failed to get Vertical layout button from JSONObject in Horizontal layout button.");
                                            bmxv3 = bmvz.f131120a;
                                        } else {
                                            j.mo67668c((bczc) bmxv4.mo66814b());
                                            i++;
                                        }
                                    }
                                }
                            } catch (JSONException e5) {
                                bbos.m88294d("HorizontalButton", "Failed to get Horizontal layout button from JSONObject.");
                                bmxv3 = bmvz.f131120a;
                            }
                            if (bmxv3.mo66813a()) {
                                g.mo57815a((bczd) bmxv3.mo66814b());
                                break;
                            } else {
                                return bmvz.f131120a;
                            }
                        case 6:
                            bmxv a4 = bczh.m90331a(jSONObject.getJSONObject("IMAGE_ELEMENT"));
                            if (a4.mo66813a()) {
                                g.mo57817a((bczh) a4.mo66814b());
                                break;
                            } else {
                                return bmvz.f131120a;
                            }
                        case 7:
                            g.mo57820b();
                            break;
                        default:
                            String str = f105224a;
                            String valueOf = String.valueOf(bdac);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 63);
                            sb.append("Failed to convert JSONObject to UiElement, unimplemented type: ");
                            sb.append(valueOf);
                            bbos.m88294d(str, sb.toString());
                            return bmvz.f131120a;
                    }
                } else {
                    bmxv a5 = bcuo.m90041a(jSONObject.getJSONObject("RICH_TEXT"));
                    if (!a5.mo66813a()) {
                        return bmvz.f131120a;
                    }
                    g.mo57814a((bcuo) a5.mo66814b());
                }
                g.mo57822c(jSONObject.getInt("PADDING_START"));
                g.mo57823d(jSONObject.getInt("PADDING_TOP"));
                g.mo57821b(jSONObject.getInt("PADDING_END"));
                g.mo57813a(jSONObject.getInt("PADDING_BOTTOM"));
                return bmxv.m108566b(g.mo57812a());
            }
            throw new InvalidParameterException("Invalid ElementType.");
        } catch (JSONException e6) {
            bbos.m88292b(f105224a, "Failed to convert JSONObject to UiElement.", e6);
            return bmvz.f131120a;
        }
    }

    /* renamed from: g */
    public static bczz m90423g() {
        bczz bczz = new bczz();
        bczz.mo57822c(0);
        bczz.mo57823d(0);
        bczz.mo57821b(0);
        bczz.mo57813a(0);
        return bczz;
    }

    /* renamed from: a */
    public abstract bdaa mo57758a();

    /* renamed from: b */
    public abstract int mo57759b();

    /* renamed from: c */
    public abstract int mo57760c();

    /* renamed from: d */
    public abstract int mo57761d();

    /* renamed from: e */
    public abstract int mo57762e();

    /* renamed from: f */
    public final bdac mo57824f() {
        return mo57758a().mo57665a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x024a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0241 A[Catch:{ JSONException -> 0x024d }, LOOP:1: B:67:0x0198->B:87:0x0241, LOOP_END] */
    /* renamed from: h */
    public final bmxv mo57825h() {
        bmxv bmxv;
        bmxv bmxv2;
        bmxv bmxv3;
        bmxv bmxv4;
        bmxv bmxv5;
        bmxv bmxv6;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("TYPE", mo57824f().f105223i);
            bdac bdac = bdac.RICH_TEXT;
            int ordinal = mo57824f().ordinal();
            if (ordinal != 0) {
                switch (ordinal) {
                    case 2:
                        bczu g = mo57758a().mo57690g();
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("TEXT", g.mo57748a());
                            jSONObject2.put("BACKGROUND_COLOR", g.mo57749b());
                            jSONObject2.put("TEXT_COLOR", g.mo57750c());
                            bmxv = bmxv.m108566b(jSONObject2);
                        } catch (JSONException e) {
                            bbos.m88292b("STATUS_BADGE", "Failed to convert StatusBadge to JSONObject", e);
                            bmxv = bmvz.f131120a;
                        }
                        if (bmxv.mo66813a()) {
                            jSONObject.put("STATUS_BADGE", bmxv.mo66814b());
                            break;
                        } else {
                            return bmvz.f131120a;
                        }
                    case 3:
                        bczo e2 = mo57758a().mo57681e();
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            bnre i = e2.mo57724a().listIterator();
                            while (true) {
                                if (!i.hasNext()) {
                                    jSONObject3.put("BUTTONS", jSONArray);
                                    jSONObject3.put("ORIENTATION", e2.mo57725b());
                                    bmxv2 = bmxv.m108566b(jSONObject3);
                                } else {
                                    bczn bczn = (bczn) i.next();
                                    try {
                                        JSONObject jSONObject4 = new JSONObject();
                                        jSONObject4.put("TEXT", bczn.mo57729a());
                                        if (bczn.mo57730b().mo66813a()) {
                                            bmxv g2 = ((bcsz) bczn.mo57730b().mo66814b()).mo57493g();
                                            if (g2.mo66813a()) {
                                                jSONObject4.put("LIGHTER_ICON", g2.mo66814b());
                                            } else {
                                                bbos.m88294d(bczo.f105195a, "failed to convert LighterIcon to JSONObject");
                                                bmxv3 = bmvz.f131120a;
                                                if (!bmxv3.mo66813a()) {
                                                    jSONArray.put(bmxv3.mo66814b());
                                                } else {
                                                    bmxv2 = bmvz.f131120a;
                                                }
                                            }
                                        }
                                        bmxv k = bczn.mo57731c().mo57124k();
                                        if (k.mo66813a()) {
                                            jSONObject4.put("ACTION", k.mo66814b());
                                            jSONObject4.put("TEXT_COLOR", bczn.mo57732d());
                                            jSONObject4.put("BACKGROUND_COLOR", bczn.mo57733e());
                                            jSONObject4.put("BORDER_COLOR", bczn.mo57735f());
                                            jSONObject4.put("ENABLED", bczn.mo57736g());
                                            bmxv3 = bmxv.m108566b(jSONObject4);
                                        } else {
                                            bmxv3 = bmvz.f131120a;
                                        }
                                    } catch (JSONException e3) {
                                        bbos.m88294d(bczo.f105195a, "failed to convert RichCardButton to JSONObject");
                                        bmxv3 = bmvz.f131120a;
                                    }
                                    if (!bmxv3.mo66813a()) {
                                    }
                                }
                            }
                        } catch (JSONException e4) {
                            bbos.m88294d(bczo.f105195a, "failed to convert RichCardButtons to JSONObject");
                            bmxv2 = bmvz.f131120a;
                        }
                        if (bmxv2.mo66813a()) {
                            jSONObject.put("RICH_CARD_BUTTONS", bmxv2.mo66814b());
                            break;
                        } else {
                            return bmvz.f131120a;
                        }
                    case 4:
                        bczf c = mo57758a().mo57673c();
                        JSONObject jSONObject5 = new JSONObject();
                        try {
                            jSONObject5.put("LINE_COLOR", c.mo57710a());
                            jSONObject5.put("LINE_WIDTH", (double) c.mo57711b());
                            bmxv4 = bmxv.m108566b(jSONObject5);
                        } catch (JSONException e5) {
                            bbos.m88292b("HORIZONTAL_LINE", "Failed to convert Horizontal line to JSONObject.", e5);
                            bmxv4 = bmvz.f131120a;
                        }
                        if (bmxv4.mo66813a()) {
                            jSONObject.put("HORIZONTAL_LINE", bmxv4.mo66814b());
                            break;
                        } else {
                            return bmvz.f131120a;
                        }
                    case 5:
                        bczd b = mo57758a().mo57669b();
                        JSONObject jSONObject6 = new JSONObject();
                        try {
                            JSONArray jSONArray2 = new JSONArray();
                            bnre i2 = b.mo57699a().listIterator();
                            while (true) {
                                if (i2.hasNext()) {
                                    bczc bczc = (bczc) i2.next();
                                    JSONObject jSONObject7 = new JSONObject();
                                    try {
                                        jSONObject7.put("DISPLAY_TEXT", bczc.mo57705c());
                                        bmxv g3 = bczc.mo57704b().mo57493g();
                                        if (g3.mo66813a()) {
                                            jSONObject7.put("LIGHTER_ICON", g3.mo66814b());
                                            bmxv k2 = bczc.mo57706d().mo57124k();
                                            if (k2.mo66813a()) {
                                                jSONObject7.put("ACTION", k2.mo66814b());
                                                jSONObject7.put("ICON", bbqu.m88426d(bczc.mo57703a()));
                                                bmxv6 = bmxv.m108566b(jSONObject7);
                                            } else {
                                                bbos.m88294d("HorizontalButton", "Failed to convert action to JSONObject in horizontal layout button.");
                                                bmxv6 = bmvz.f131120a;
                                            }
                                        } else {
                                            bbos.m88294d("HorizontalButton", "Failed to convert Lighter Icon to JSONObject in horizontal layout button.");
                                            bmxv6 = bmvz.f131120a;
                                        }
                                    } catch (JSONException e6) {
                                        bbos.m88292b("HorizontalButton", "Failed to convert vertical layout button to JSONObject in horizontal layout button.", e6);
                                        bmxv6 = bmvz.f131120a;
                                    }
                                    if (!bmxv6.mo66813a()) {
                                        bbos.m88294d("HorizontalButton", "Failed to get vertical layout button from JSONObject in horizontal layout Button");
                                        bmxv5 = bmvz.f131120a;
                                    } else {
                                        jSONArray2.put(bmxv6.mo66814b());
                                    }
                                } else {
                                    jSONObject6.put("VERTICAL_LAYOUT_BUTTONS", jSONArray2);
                                    bmxv5 = bmxv.m108566b(jSONObject6);
                                }
                            }
                        } catch (JSONException e7) {
                            bbos.m88294d("HorizontalButton", "Failed to convert Horizontal layout button to JSONObject.");
                            bmxv5 = bmvz.f131120a;
                        }
                        if (bmxv5.mo66813a()) {
                            jSONObject.put("HORIZONTAL_LAYOUT_BUTTONS", bmxv5.mo66814b());
                            break;
                        } else {
                            return bmvz.f131120a;
                        }
                    case 6:
                        bmxv h = mo57758a().mo57677d().mo57787h();
                        if (h.mo66813a()) {
                            jSONObject.put("IMAGE_ELEMENT", h.mo66814b());
                            break;
                        } else {
                            return bmvz.f131120a;
                        }
                    case 7:
                        break;
                    default:
                        String str = f105224a;
                        String valueOf = String.valueOf(mo57824f());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 63);
                        sb.append("Failed to convert UiElement to JSONObject, unimplemented type: ");
                        sb.append(valueOf);
                        bbos.m88294d(str, sb.toString());
                        return bmvz.f131120a;
                }
            } else {
                bmxv d = mo57758a().mo57686f().mo57568d();
                if (!d.mo66813a()) {
                    return bmvz.f131120a;
                }
                jSONObject.put("RICH_TEXT", d.mo66814b());
            }
            jSONObject.put("PADDING_START", mo57759b());
            jSONObject.put("PADDING_TOP", mo57760c());
            jSONObject.put("PADDING_BOTTOM", mo57762e());
            jSONObject.put("PADDING_END", mo57761d());
            return bmxv.m108566b(jSONObject);
        } catch (JSONException e8) {
            bbos.m88292b(f105224a, "Failed to convert UiElement to JSONObject.", e8);
            return bmvz.f131120a;
        }
    }
}
