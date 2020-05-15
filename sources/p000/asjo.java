package p000;

import android.content.Context;
import java.io.File;
import java.util.Random;

/* renamed from: asjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asjo {

    /* renamed from: a */
    public static final Random f89077a = new Random();

    /* renamed from: a */
    public static btpm m74244a(Context context, btpm btpm) {
        bxvd bxvd = (bxvd) btpm.mo74142c(5);
        bxvd.mo73625a((bxvk) btpm);
        String a = asmd.m74371a(m74246a(context, ((btpm) bxvd.f164949b).f149864c));
        if (a != null) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            btpm btpm2 = btpm.f149860e;
            a.getClass();
            ((btpm) bxvd.f164949b).f149865d = a;
        } else {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            btpm btpm3 = btpm.f149860e;
            ((btpm) bxvd.f164949b).f149865d = btpm.f149860e.f149865d;
        }
        return (btpm) bxvd.mo74062i();
    }

    /* renamed from: a */
    public static File m74245a(Context context) {
        return new File(context.getCacheDir(), "android_pay_tap_doodles");
    }

    /* renamed from: a */
    public static File m74246a(Context context, String str) {
        return new File(m74245a(context), asmd.m74372a(str));
    }
}
