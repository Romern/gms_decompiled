package p000;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcxm implements bcle {

    /* renamed from: a */
    private final Context f105103a;

    public bcxm(Context context) {
        this.f105103a = context;
    }

    /* renamed from: a */
    public final bcti mo56967a(bcoh bcoh, cbff cbff) {
        cbfr cbfr;
        bczk bczk;
        cbfu cbfu;
        cbfw cbfw;
        cbfm cbfm;
        Context context = this.f105103a;
        String str = cbff.f176900g;
        cbei a = cbei.m127772a(cbff.f176905l);
        if (a == null) {
            a = cbei.UNRECOGNIZED;
        }
        if (!a.equals(cbei.RICH_CARD) || cbff.f176896c != 107) {
            bbos.m88294d("RichCardMsgConv", "Attempted to convert non-rich card LighterMessage");
            return bcqa.m89618a(ByteString.f164797b);
        }
        bctg c = bcth.m89920c();
        if (cbff.f176896c == 107) {
            cbfr = (cbfr) cbff.f176897d;
        } else {
            cbfr = cbfr.f176955d;
        }
        bcfx a2 = bcfx.m88929a(context);
        bdac bdac = bdac.RICH_TEXT;
        bczv bczv = bczv.STACK_COMPONENT;
        bczj bczj = bczj.STACK_CARD;
        int i = cbfr.f176959c;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = i2 - 2;
        if (i3 == 1) {
            if (cbfr.f176957a == 101) {
                cbfu = (cbfu) cbfr.f176958b;
            } else {
                cbfu = cbfu.f176973b;
            }
            bczk = bczk.m90343a(bcxu.m90216a(bcoh, context, cbfu, str, a2));
        } else if (i3 == 2) {
            if (cbfr.f176957a == 102) {
                cbfw = (cbfw) cbfr.f176958b;
            } else {
                cbfw = cbfw.f176979c;
            }
            bczr c2 = bczs.m90383c();
            c2.mo57804a(cbfw.f176981a);
            cbfu cbfu2 = cbfw.f176982b;
            if (cbfu2 == null) {
                cbfu2 = cbfu.f176973b;
            }
            c2.mo57803a(bcxu.m90216a(bcoh, context, cbfu2, str, a2));
            bczk = bczk.m90344a(c2.mo57802a());
        } else if (i3 == 3) {
            if (cbfr.f176957a == 103) {
                cbfm = (cbfm) cbfr.f176958b;
            } else {
                cbfm = cbfm.f176935d;
            }
            bngs bngs = new bngs();
            bxwc bxwc = cbfm.f176939c;
            int size = bxwc.size();
            for (int i4 = 0; i4 < size; i4++) {
                bngs.mo67668c(bcxu.m90216a(bcoh, context, (cbfu) bxwc.get(i4), str, a2));
            }
            bcyy d = bcyz.m90300d();
            d.mo57769a(cbfm.f176937a);
            d.mo57767a(cbfm.f176938b);
            d.mo57768a(bngs.mo67664a());
            bczk = bczk.m90342a(d.mo57766a());
        } else {
            StringBuilder sb = new StringBuilder(39);
            sb.append("Got unknown rich card type: ");
            sb.append(i);
            throw new bcld(sb.toString(), 221);
        }
        c.mo57524a(bcwv.m90203a(bczk));
        c.mo57523a("rich_card");
        return bcqa.m89616a(c.mo57522a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cd A[Catch:{ JSONException -> 0x00de }] */
    /* renamed from: a */
    public final bmxv mo56968a(bcth bcth) {
        bmxv bmxv;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("TYPE", bcth.mo57379a());
            bmxv a = bcxi.m90208a(bbqu.m88424b(bcth.mo57380b()));
            if (a.mo66813a()) {
                bczk bczk = (bczk) a.mo66814b();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("TYPE", bczk.mo57644b().f105184d);
                    bczj bczj = bczj.STACK_CARD;
                    int ordinal = bczk.mo57644b().ordinal();
                    if (ordinal == 0) {
                        bmxv c = bczk.mo57648c().mo57801c();
                        if (c.mo66813a()) {
                            jSONObject2.put("STACK_CARD", c.mo66814b());
                        } else {
                            bbos.m88294d(bczk.f105185a, "Failed to convert StackCard to JSONObject.");
                            bmxv = bmvz.f131120a;
                            if (bmxv.mo66813a()) {
                            }
                        }
                    } else if (ordinal == 1) {
                        bmxv d = bczk.mo57652d().mo57805d();
                        if (d.mo66813a()) {
                            jSONObject2.put("STANDALONE_CARD", ((JSONObject) d.mo66814b()).toString());
                        } else {
                            bbos.m88294d(bczk.f105185a, "Failed to convert StandaloneCard to JSONObject.");
                            bmxv = bmvz.f131120a;
                            if (bmxv.mo66813a()) {
                            }
                        }
                    } else if (ordinal == 2) {
                        bmxv e = bczk.mo57643a().mo57770e();
                        if (e.mo66813a()) {
                            jSONObject2.put("CARD_CAROUSEL", ((JSONObject) e.mo66814b()).toString());
                        } else {
                            bbos.m88294d(bczk.f105185a, "Failed to convert CardCarousel to JSONObject.");
                            bmxv = bmvz.f131120a;
                            if (bmxv.mo66813a()) {
                                jSONObject.put("CONTENT", bmxv.mo66814b());
                                return bmxv.m108566b(jSONObject);
                            }
                        }
                    }
                    bmxv = bmxv.m108566b(jSONObject2);
                } catch (JSONException e2) {
                    bbos.m88292b(bczk.f105185a, "Failed to convert RichCard to JSONObject.", e2);
                    bmxv = bmvz.f131120a;
                }
                if (bmxv.mo66813a()) {
                }
            }
            return bmvz.f131120a;
        } catch (JSONException e3) {
            bbos.m88292b("RichCardMsgConv", "Fail to convert rich card to json object due to ", e3);
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public final bmxv mo56969a(JSONObject jSONObject) {
        bctg c = bcth.m89920c();
        try {
            c.mo57523a(jSONObject.getString("TYPE"));
            bmxv a = bczk.m90345a(jSONObject.getJSONObject("CONTENT"));
            if (a.mo66813a()) {
                c.mo57524a(bcwv.m90203a((bczk) a.mo66814b()));
                return bmxv.m108566b(c.mo57522a());
            }
            bbos.m88294d("RichCardMsgConv", "Fail to convert json object to rich card");
            return bmvz.f131120a;
        } catch (JSONException e) {
            bbos.m88292b("RichCardMsgConv", "Fail to convert json object to rich card due to ", e);
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public final bxvd mo56970a(bctr bctr) {
        bmxv bmxv;
        int a = bctr.mo57365f().mo57180a();
        if (a != 0) {
            if (a != 3 || !bctr.mo57365f().mo57184b().mo57379a().equals("rich_card")) {
                bmxv = bmvz.f131120a;
            } else {
                bmxv = bcxi.m90208a(bbqu.m88424b(bctr.mo57365f().mo57184b().mo57380b()));
            }
            if (!bmxv.mo66813a()) {
                bbos.m88294d("RichCardMsgConv", "Attempted to convert non-rich_card message");
                bxvd da = cbff.f176892t.mo74144da();
                cbei cbei = cbei.UNKNOWN;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((cbff) da.f164949b).f176905l = cbei.mo3214a();
                return da;
            }
            bczk bczk = (bczk) bmxv.mo66814b();
            bxvd da2 = cbff.f176892t.mo74144da();
            try {
                cbei cbei2 = cbei.RICH_CARD;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((cbff) da2.f164949b).f176905l = cbei2.mo3214a();
                bdac bdac = bdac.RICH_TEXT;
                bczv bczv = bczv.STACK_COMPONENT;
                bczj bczj = bczj.STACK_CARD;
                if (bczk.mo57644b().ordinal() == 0) {
                    bxvd da3 = cbfr.f176955d.mo74144da();
                    bczq c = bczk.mo57648c();
                    bxvd da4 = cbfu.f176973b.mo74144da();
                    bngx a2 = bbow.m88301a(c.mo57739a(), bcxn.f105104a);
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    cbfu cbfu = (cbfu) da4.f164949b;
                    if (!cbfu.f176975a.mo73666a()) {
                        cbfu.f176975a = GeneratedMessageLite.m124021a(cbfu.f176975a);
                    }
                    bxsy.m123078a(a2, cbfu.f176975a);
                    cbfu cbfu2 = (cbfu) da4.mo74062i();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    cbfr cbfr = (cbfr) da3.f164949b;
                    cbfu2.getClass();
                    cbfr.f176958b = cbfu2;
                    cbfr.f176957a = 101;
                    cbfr.f176959c = 1;
                    cbfr cbfr2 = (cbfr) da3.mo74062i();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    cbff cbff = (cbff) da2.f164949b;
                    cbfr2.getClass();
                    cbff.f176897d = cbfr2;
                    cbff.f176896c = 107;
                    return da2;
                }
                throw new IllegalArgumentException("Got unknown rich card model type");
            } catch (Exception e) {
                bbos.m88294d("RichCardMsgConv", "Failed to convert rich card model.");
                cbei cbei3 = cbei.UNKNOWN;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((cbff) da2.f164949b).f176905l = cbei3.mo3214a();
            }
        } else {
            throw null;
        }
    }
}
