package p000;

import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: bcxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcxl {
    /* renamed from: a */
    static bmxv m90209a(HashMap hashMap) {
        bmxv bmxv;
        bmxv bmxv2;
        bmxv bmxv3;
        bmxv bmxv4;
        try {
            bczz g = bdad.m90423g();
            g.mo57822c(((Integer) hashMap.get("PADDING_START")).intValue());
            g.mo57823d(((Integer) hashMap.get("PADDING_TOP")).intValue());
            g.mo57821b(((Integer) hashMap.get("PADDING_END")).intValue());
            g.mo57813a(((Integer) hashMap.get("PADDING_BOTTOM")).intValue());
            bdac bdac = bdac.RICH_TEXT;
            int ordinal = ((bdac) hashMap.get("TYPE")).ordinal();
            if (ordinal == 0) {
                g.mo57814a((bcuo) bccr.m88800a((HashMap) hashMap.get("RICH_TEXT")).mo66814b());
                return bmxv.m108566b(g.mo57812a());
            } else if (ordinal == 2) {
                HashMap hashMap2 = (HashMap) hashMap.get("STATUS_BADGE");
                try {
                    bczt d = bczu.m90391d();
                    d.mo57808a((String) hashMap2.get("TEXT"));
                    d.mo57807a(((Integer) hashMap2.get("BACKGROUND_COLOR")).intValue());
                    d.mo57809b(((Integer) hashMap2.get("TEXT_COLOR")).intValue());
                    bmxv = bmxv.m108566b(d.mo57806a());
                } catch (Exception e) {
                    bbos.m88292b("StatusBadgeConverters", "failed to convert HashMap to StatusBadge", e);
                    bmxv = bmvz.f131120a;
                }
                g.mo57819a((bczu) bmxv.mo66814b());
                return bmxv.m108566b(g.mo57812a());
            } else if (ordinal == 3) {
                HashMap hashMap3 = (HashMap) hashMap.get("RICH_CARD_BUTTONS");
                try {
                    bczl c = bczo.m90370c();
                    c.mo57790a(bbow.m88303c((ArrayList) hashMap3.get("BUTTONS"), bcxb.f105094a));
                    c.mo57789a(((Integer) hashMap3.get("ORIENTATION")).intValue());
                    bmxv2 = bmxv.m108566b(c.mo57788a());
                } catch (IllegalStateException | NullPointerException e2) {
                    bbos.m88292b("RCButtonsConverters", "failed to convert Map to RichCardButtons", e2);
                    bmxv2 = bmvz.f131120a;
                }
                g.mo57818a((bczo) bmxv2.mo66814b());
                return bmxv.m108566b(g.mo57812a());
            } else if (ordinal == 4) {
                HashMap hashMap4 = (HashMap) hashMap.get("HORIZONTAL_LINE");
                try {
                    bcze c2 = bczf.m90322c();
                    c2.mo57780a(((Integer) hashMap4.get("LINE_COLOR")).intValue());
                    c2.mo57779a(((Float) hashMap4.get("LINE_WIDTH")).floatValue());
                    bmxv3 = bmxv.m108566b(c2.mo57778a());
                } catch (Exception e3) {
                    bbos.m88292b("HrzntlLineConverters", "failed to convert HashMap to HorizontalLine", e3);
                    bmxv3 = bmvz.f131120a;
                }
                g.mo57816a((bczf) bmxv3.mo66814b());
                return bmxv.m108566b(g.mo57812a());
            } else if (ordinal == 5) {
                HashMap hashMap5 = (HashMap) hashMap.get("HORIZONTAL_LAYOUT_BUTTONS");
                try {
                    bcza b = bczd.m90317b();
                    b.mo57772a(bbow.m88303c((ArrayList) hashMap5.get("VERTICAL_LAYOUT_BUTTON"), bcwy.f105091a));
                    bmxv4 = bmxv.m108566b(b.mo57771a());
                } catch (IllegalStateException | NullPointerException e4) {
                    bbos.m88292b("HrzntlytBtnConverter", "failed to convert Map to RichCardButtons", e4);
                    bmxv4 = bmvz.f131120a;
                }
                g.mo57815a((bczd) bmxv4.mo66814b());
                return bmxv.m108566b(g.mo57812a());
            } else if (ordinal != 6) {
                String valueOf = String.valueOf(hashMap.get("TYPE"));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Unsupported UiElement type: ");
                sb.append(valueOf);
                bbos.m88294d("UiElementConverters", sb.toString());
                return bmvz.f131120a;
            } else {
                bmxv a = bczh.m90331a(new JSONObject((String) hashMap.get("IMAGE_ELEMENT")));
                if (a.mo66813a()) {
                    g.mo57817a((bczh) a.mo66814b());
                    return bmxv.m108566b(g.mo57812a());
                }
                bbos.m88294d("UiElementConverters", "failed to convert HashMap to UiElement");
                return bmvz.f131120a;
            }
        } catch (Exception e5) {
            bbos.m88292b("UiElementConverters", "failed to convert HashMap to UiElement", e5);
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    static HashMap m90210a(bdad bdad) {
        HashMap hashMap = new HashMap();
        hashMap.put("PADDING_START", Integer.valueOf(bdad.mo57759b()));
        hashMap.put("PADDING_TOP", Integer.valueOf(bdad.mo57760c()));
        hashMap.put("PADDING_END", Integer.valueOf(bdad.mo57761d()));
        hashMap.put("PADDING_BOTTOM", Integer.valueOf(bdad.mo57762e()));
        hashMap.put("TYPE", bdad.mo57824f());
        bdac bdac = bdac.RICH_TEXT;
        int ordinal = bdad.mo57824f().ordinal();
        if (ordinal == 0) {
            hashMap.put("RICH_TEXT", bccr.m88801a(bdad.mo57758a().mo57686f()));
        } else if (ordinal == 2) {
            bczu g = bdad.mo57758a().mo57690g();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("TEXT", g.mo57748a());
            hashMap2.put("BACKGROUND_COLOR", Integer.valueOf(g.mo57749b()));
            hashMap2.put("TEXT_COLOR", Integer.valueOf(g.mo57750c()));
            hashMap.put("STATUS_BADGE", hashMap2);
        } else if (ordinal == 3) {
            bczo e = bdad.mo57758a().mo57681e();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("ORIENTATION", Integer.valueOf(e.mo57725b()));
            hashMap3.put("BUTTONS", bbow.m88302b(e.mo57724a(), bcwz.f105092a));
            hashMap.put("RICH_CARD_BUTTONS", hashMap3);
        } else if (ordinal == 4) {
            bczf c = bdad.mo57758a().mo57673c();
            HashMap hashMap4 = new HashMap();
            hashMap4.put("LINE_COLOR", Integer.valueOf(c.mo57710a()));
            hashMap4.put("LINE_WIDTH", Float.valueOf(c.mo57711b()));
            hashMap.put("HORIZONTAL_LINE", hashMap4);
        } else if (ordinal == 5) {
            bczd b = bdad.mo57758a().mo57669b();
            HashMap hashMap5 = new HashMap();
            hashMap5.put("VERTICAL_LAYOUT_BUTTON", bbow.m88302b(b.mo57699a(), bcwx.f105090a));
            hashMap.put("HORIZONTAL_LAYOUT_BUTTONS", hashMap5);
        } else if (ordinal == 6) {
            bmxv h = bdad.mo57758a().mo57677d().mo57787h();
            if (h.mo66813a()) {
                hashMap.put("IMAGE_ELEMENT", ((JSONObject) h.mo66814b()).toString());
            } else {
                throw new IllegalArgumentException("Unable to convert image element to JSON.");
            }
        } else {
            int i = bdad.mo57824f().f105223i;
            StringBuilder sb = new StringBuilder(39);
            sb.append("Unsupported UiElement type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return hashMap;
    }
}
