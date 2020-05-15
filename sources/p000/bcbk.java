package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: bcbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcbk {
    /* renamed from: a */
    public static bmxv m88752a(HashMap hashMap) {
        try {
            bcoo j = bcov.m89535j();
            m88757a(j, hashMap);
            bcon a = bcon.m89494a(((Integer) hashMap.get("ACTION_TYPE")).intValue());
            switch (a.ordinal()) {
                case 1:
                    bmxv a2 = bbot.m88295a(bbqu.m88420a(hashMap.get("ACTION_PAYLOAD")), bcbd.f103928a);
                    if (a2.mo66813a()) {
                        j.mo57092b((bcou) a2.mo66814b());
                        break;
                    }
                    break;
                case 2:
                    bmxv a3 = bbot.m88295a(bbqu.m88420a(hashMap.get("ACTION_PAYLOAD")), bcbe.f103929a);
                    if (a3.mo66813a()) {
                        j.mo57089a((bcou) a3.mo66814b());
                        break;
                    }
                    break;
                case 3:
                    j.mo57093b((String) hashMap.get("ACTION_PAYLOAD"));
                    break;
                case 4:
                    j.mo57100h((String) hashMap.get("ACTION_PAYLOAD"));
                    break;
                case 5:
                    bmxv a4 = bbot.m88295a(bbqu.m88420a(hashMap.get("ACTION_PAYLOAD")), bcbf.f103930a);
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
                    j.mo57090a((String) hashMap.get("ACTION_PAYLOAD"));
                    break;
                case 8:
                    j.mo57098f((String) hashMap.get("ACTION_PAYLOAD"));
                    break;
                case 9:
                    bmxv a5 = bbot.m88295a(bbqu.m88420a(hashMap.get("ACTION_PAYLOAD")), bcbg.f103931a);
                    if (a5.mo66813a()) {
                        j.mo57088a((bcos) a5.mo66814b());
                        break;
                    } else {
                        return bmvz.f131120a;
                    }
                default:
                    String valueOf = String.valueOf(a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                    sb.append("encountered unknown action type: ");
                    sb.append(valueOf);
                    bbos.m88294d("ActionConv", sb.toString());
                    return bmvz.f131120a;
            }
            if (hashMap.containsKey("EVENT_CALLBACK_FAILURE_ACTION_TYPE")) {
                if (bcon.m89494a(((Integer) hashMap.get("EVENT_CALLBACK_FAILURE_ACTION_TYPE")).intValue()).ordinal() == 8) {
                    j.mo57095c((String) hashMap.get("EVENT_CALLBACK_FAILURE_ACTION_PAYLOAD"));
                }
            }
            return bmxv.m108566b(j.mo57085a());
        } catch (IllegalStateException | NullPointerException e) {
            bbos.m88292b("ActionConv", "failed to convert Map to Action", e);
            return bmvz.f131120a;
        }
    }

    /* renamed from: b */
    public static bmxv m88759b(HashMap hashMap) {
        try {
            bctm h = bctn.m89940h();
            h.mo57532c(((Integer) hashMap.get("time_to_live_sec")).intValue());
            h.mo57531b(((Integer) hashMap.get("OVERLAY_STYLE")).intValue());
            if (hashMap.containsKey("dismiss_action")) {
                bmxv a = bbqu.m88420a(hashMap.get("dismiss_action"));
                bcov bcov = null;
                if (a.mo66813a()) {
                    HashMap hashMap2 = (HashMap) a.mo66814b();
                    if (bcon.m89494a(((Integer) hashMap2.get("ACTION_TYPE")).intValue()).equals(bcon.NO_OP_ACTION)) {
                        bcoo j = bcov.m89535j();
                        m88757a(j, hashMap2);
                        j.mo57094c();
                        bcov = j.mo57085a();
                    } else {
                        bbos.m88294d("ActionConv", "failed to convert Map to OverlayAction overlay action can only contain no op action");
                    }
                } else {
                    bbos.m88294d("ActionConv", "failed to deserialize Map");
                }
                if (bcov == null) {
                    return bmvz.f131120a;
                }
                h.mo57527a(bcov);
            }
            if (hashMap.containsKey("display_icon")) {
                h.mo57529a((bxtx) hashMap.get("display_icon"));
            }
            if (hashMap.containsKey("display_text")) {
                h.mo57530a((String) hashMap.get("display_text"));
            }
            if (hashMap.containsKey("overlay_expire_time")) {
                h.mo57526a(((Integer) hashMap.get("overlay_expire_time")).intValue());
            }
            if (hashMap.containsKey("overlay_lighter_icon")) {
                bmxv a2 = bccb.m88792a((HashMap) hashMap.get("overlay_lighter_icon"));
                if (!a2.mo66813a()) {
                    return bmvz.f131120a;
                }
                h.mo57528a((bcsz) a2.mo66814b());
            }
            return bmxv.m108566b(h.mo57525a());
        } catch (IllegalStateException | NullPointerException e) {
            bbos.m88292b("ActionConv", "failed to convert Map to OverlayAction", e);
            return bmvz.f131120a;
        }
    }

    /* renamed from: c */
    public static bmxv m88760c(HashMap hashMap) {
        try {
            bcot c = bcou.m89529c();
            c.mo57111b((String) hashMap.get("TEXT"));
            c.mo57110a((String) hashMap.get("MESSAGE_CALLBACK_PAYLOAD"));
            return bmxv.m108566b(c.mo57109a());
        } catch (IllegalStateException | NullPointerException e) {
            bbos.m88292b("ActionConv", "failed to convert Map to ReplyActionPayload", e);
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    private static HashMap m88753a(bcou bcou) {
        HashMap hashMap = new HashMap();
        hashMap.put("TEXT", bcou.mo57112a());
        hashMap.put("MESSAGE_CALLBACK_PAYLOAD", bcou.mo57113b());
        return hashMap;
    }

    /* renamed from: a */
    public static HashMap m88754a(bcov bcov) {
        HashMap hashMap = new HashMap();
        m88758a(bcov, hashMap);
        bcon bcon = bcon.UNKNOWN;
        switch (bcov.mo57120f().ordinal()) {
            case 1:
                hashMap.put("ACTION_PAYLOAD", m88753a(bcov.mo57121g().mo57077b()));
                break;
            case 2:
                hashMap.put("ACTION_PAYLOAD", m88753a(bcov.mo57121g().mo57078c()));
                break;
            case 3:
                hashMap.put("ACTION_PAYLOAD", bcov.mo57121g().mo57079d());
                break;
            case 4:
                hashMap.put("ACTION_PAYLOAD", bcov.mo57121g().mo57080e());
                break;
            case 5:
                hashMap.put("ACTION_TYPE", Integer.valueOf(bcon.COMPOSED_OVERLAY_ACTION.f104636k));
                bcor c = bcos.m89522c();
                c.mo57106a(bcov.mo57121g().mo57082g());
                hashMap.put("ACTION_PAYLOAD", m88756a(c.mo57104a()));
                break;
            case 7:
                hashMap.put("ACTION_PAYLOAD", bcov.mo57121g().mo57083h());
                break;
            case 8:
                hashMap.put("ACTION_PAYLOAD", bcov.mo57121g().mo57084i());
                break;
            case 9:
                hashMap.put("ACTION_PAYLOAD", m88756a(bcov.mo57121g().mo57081f()));
                break;
        }
        if (bcov.mo57122h().ordinal() == 8) {
            hashMap.put("EVENT_CALLBACK_FAILURE_ACTION_PAYLOAD", bcov.mo57123i().mo57084i());
        }
        return hashMap;
    }

    /* renamed from: a */
    private static HashMap m88755a(bctn bctn) {
        HashMap hashMap = new HashMap();
        if (bctn.mo57384a().mo66813a()) {
            if (((bcov) bctn.mo57384a().mo66814b()).mo57120f().equals(bcon.NO_OP_ACTION)) {
                HashMap hashMap2 = new HashMap();
                m88758a((bcov) bctn.mo57384a().mo66814b(), hashMap2);
                hashMap.put("dismiss_action", hashMap2);
            } else {
                bbos.m88294d("ActionConv", " Dismiss action can only be NoOp. Fail to convert overlay header to map.");
                return hashMap;
            }
        }
        hashMap.put("time_to_live_sec", Integer.valueOf(bctn.mo57388e()));
        hashMap.put("OVERLAY_STYLE", Integer.valueOf(bctn.mo57391g()));
        if (bctn.mo57385b().mo66813a()) {
            hashMap.put("display_icon", bctn.mo57385b().mo66814b());
        }
        if (bctn.mo57387d().mo66813a()) {
            hashMap.put("display_text", bctn.mo57387d().mo66814b());
        }
        if (bctn.mo57386c().mo66813a()) {
            hashMap.put("overlay_lighter_icon", bccb.m88793a((bcsz) bctn.mo57386c().mo66814b()));
        }
        if (bctn.mo57390f().mo66813a()) {
            hashMap.put("overlay_expire_time", bctn.mo57390f().mo66814b());
        }
        return hashMap;
    }

    /* renamed from: a */
    private static Map m88756a(bcos bcos) {
        HashMap hashMap = new HashMap();
        if (bcos.mo57107a().mo66813a()) {
            hashMap.put("REACTION_OVERLAY_HEADER", m88755a((bctn) bcos.mo57107a().mo66814b()));
        }
        if (bcos.mo57108b().mo66813a()) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("URL", ((bcsx) bcos.mo57108b().mo66814b()).mo57336b());
            hashMap2.put("WEB_VIEW_HEADER", m88755a(((bcsx) bcos.mo57108b().mo66814b()).mo57335a()));
            hashMap.put("STACKED_REACTION_WEB_VIEW", hashMap2);
        }
        return hashMap;
    }

    /* renamed from: a */
    private static void m88757a(bcoo bcoo, HashMap hashMap) {
        if (!hashMap.containsKey("ACTION_TRIGGERED_LOG_ID")) {
            bbos.m88294d("ActionConv", "Missing action triggered log id setting it to 0");
            bcoo.mo57086a(0);
        }
        bcoo.mo57086a(((Long) hashMap.get("ACTION_TRIGGERED_LOG_ID")).longValue());
        if (hashMap.containsKey("EVENT_CALLBACK_PAYLOAD")) {
            bcoo.mo57096d((String) hashMap.get("EVENT_CALLBACK_PAYLOAD"));
        }
        if (hashMap.containsKey("TRACE_ID")) {
            bcoo.mo57099g((String) hashMap.get("TRACE_ID"));
        }
        if (hashMap.containsKey("MESSAGE_ID")) {
            bcoo.mo57097e((String) hashMap.get("MESSAGE_ID"));
        }
        if (hashMap.containsKey("EVENT_CALLBACK_DESTINATION")) {
            bmxv a = bbot.m88295a(bbqu.m88420a(hashMap.get("EVENT_CALLBACK_DESTINATION")), bcbh.f103932a);
            if (a.mo66813a()) {
                bcoo.mo57087a((bcop) a.mo66814b());
            }
        }
    }

    /* renamed from: a */
    private static void m88758a(bcov bcov, HashMap hashMap) {
        hashMap.put("ACTION_TYPE", Integer.valueOf(bcov.mo57120f().f104636k));
        hashMap.put("EVENT_CALLBACK_FAILURE_ACTION_TYPE", Integer.valueOf(bcov.mo57122h().f104636k));
        hashMap.put("ACTION_TRIGGERED_LOG_ID", Long.valueOf(bcov.mo57119e()));
        if (bcov.mo57117c().mo66813a()) {
            hashMap.put("EVENT_CALLBACK_PAYLOAD", bcov.mo57117c().mo66814b());
        }
        if (bcov.mo57118d().mo66813a()) {
            bcop bcop = (bcop) bcov.mo57118d().mo66814b();
            HashMap hashMap2 = new HashMap();
            int c = bcop.mo57103c();
            int i = c - 1;
            if (c != 0) {
                if (i == 1) {
                    int c2 = bcop.mo57103c();
                    int i2 = c2 - 1;
                    if (c2 != 0) {
                        hashMap2.put("EVENT_CALLBACK_DESTINATION_TYPE", Integer.valueOf(i2));
                        hashMap2.put("EVENT_CALLBACK_DESTINATION", bcbw.m88777a(bcop.mo57101a()));
                    } else {
                        throw null;
                    }
                } else if (i == 2) {
                    int c3 = bcop.mo57103c();
                    int i3 = c3 - 1;
                    if (c3 != 0) {
                        hashMap2.put("EVENT_CALLBACK_DESTINATION_TYPE", Integer.valueOf(i3));
                        hashMap2.put("EVENT_CALLBACK_DESTINATION", bcca.m88791a(bcop.mo57102b()));
                    } else {
                        throw null;
                    }
                }
                hashMap.put("EVENT_CALLBACK_DESTINATION", hashMap2);
            } else {
                throw null;
            }
        }
        if (bcov.mo57115a().mo66813a()) {
            hashMap.put("TRACE_ID", bcov.mo57115a().mo66814b());
        }
        if (bcov.mo57116b().mo66813a()) {
            hashMap.put("MESSAGE_ID", bcov.mo57116b().mo66814b());
        }
    }
}
