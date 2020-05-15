package p000;

import java.util.HashMap;

/* renamed from: bccb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bccb {
    /* renamed from: a */
    public static bmxv m88792a(HashMap hashMap) {
        bcsy f = bcsz.m89872f();
        try {
            f.mo57490a((byte[]) hashMap.get("ICON"));
            f.mo57492c(((Integer) hashMap.get("ICON_WIDTH")).intValue());
            f.mo57491b(((Integer) hashMap.get("ICON_HEIGHT")).intValue());
            f.mo57489a((String) hashMap.get("TALK_BACK_DESCRIPTION"));
            if (hashMap.containsKey("ICON_COLOR")) {
                f.mo57488a(((Integer) hashMap.get("ICON_COLOR")).intValue());
            }
            return bmxv.m108566b(f.mo57487a());
        } catch (NullPointerException e) {
            bbos.m88292b("LitIconConv", "failed to convert Map to LighterIcon", e);
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public static HashMap m88793a(bcsz bcsz) {
        HashMap hashMap = new HashMap();
        hashMap.put("ICON", bcsz.mo57340a());
        hashMap.put("ICON_WIDTH", Integer.valueOf(bcsz.mo57341b()));
        hashMap.put("ICON_HEIGHT", Integer.valueOf(bcsz.mo57342c()));
        hashMap.put("TALK_BACK_DESCRIPTION", bcsz.mo57344e());
        if (bcsz.mo57343d().mo66813a()) {
            hashMap.put("ICON_COLOR", bcsz.mo57343d().mo66814b());
        }
        return hashMap;
    }
}
