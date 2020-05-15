package p000;

import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;

/* renamed from: acso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acso {
    /* renamed from: a */
    public static void m49810a(abzo abzo, abqv abqv, NativeIndex nativeIndex) {
        bnrd a = abzo.mo32544d().iterator();
        while (a.hasNext()) {
            absr d = abzo.mo32543d((acak) a.next());
            if (d != null) {
                nativeIndex.mo43401a(d.f58144i, 0, Integer.MAX_VALUE);
            }
        }
        if (!nativeIndex.mo43414i()) {
            absg.m48191b("Unable to delete all usage reports");
        }
        bnrd a2 = abzo.mo32544d().iterator();
        while (a2.hasNext()) {
            absr d2 = abzo.mo32543d((acak) a2.next());
            if (d2 != null) {
                abqv.mo32286a(d2.f58140e, d2.f58138c);
            }
        }
    }

    /* renamed from: a */
    public static void m49811a(String str, Context context, abzo abzo, abqv abqv, NativeIndex nativeIndex, abym abym) {
        acsy acsy = new acsy(context);
        String string = acsy.mo33066a().getString("ActionsUploadPreviousAccount", "");
        if (!str.equals(string)) {
            acsy.mo33066a().edit().putString("ActionsUploadPreviousAccount", str).commit();
            if (!string.isEmpty()) {
                m49810a(abzo, abqv, nativeIndex);
                srj.m36120a(acsq.m49814a(context));
                abym.mo32453b(4111);
            }
        }
    }
}
