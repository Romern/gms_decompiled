package p000;

import android.content.Context;

/* renamed from: anii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anii {
    /* renamed from: a */
    public static cafx m64473a(Context context) {
        int e = spn.m35881e(context);
        cafx a = spn.m35846a(context, true, null, 0, e != -1 ? Integer.valueOf(e) : null, null, null);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        bxvf bxvf = (bxvf) bxvd;
        String a2 = stn.m36304a("ro.oem.key1", "");
        if (!a2.isEmpty()) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cafx cafx = (cafx) bxvf.f164949b;
            cafx cafx2 = cafx.f173026C;
            a2.getClass();
            cafx.f173031a |= 67108864;
            cafx.f173028A = a2;
        }
        return (cafx) bxvf.mo74062i();
    }
}
