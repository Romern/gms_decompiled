package p000;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: bcwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcwv {
    /* renamed from: a */
    public static byte[] m90203a(bczk bczk) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("TYPE", Integer.valueOf(bczk.mo57644b().f105184d));
            bczj bczj = bczj.STACK_CARD;
            int ordinal = bczk.mo57644b().ordinal();
            if (ordinal == 0) {
                bczq c = bczk.mo57648c();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("COMPONENTS", bbow.m88302b(c.mo57739a(), bcxh.f105100a));
                hashMap.put("STACK_CARD", hashMap2);
            } else if (ordinal == 1) {
                bbot.m88296a(bczk.mo57652d().mo57805d(), new bcxe(hashMap));
            } else if (ordinal == 2) {
                bbot.m88296a(bczk.mo57643a().mo57770e(), new bcxf(hashMap));
            }
            return bbqu.m88422a((Serializable) hashMap);
        } catch (IOException | IllegalArgumentException e) {
            bbos.m88292b("RichCardUtils", "Failed to serialize Rich Card", e);
            return new byte[0];
        }
    }
}
