package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bkvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkvv implements bkwk {
    /* renamed from: a */
    public final void mo66386a(bkwq bkwq, bkwq bkwq2) {
        blhg b = bkwq.mo66389b();
        blhg b2 = bkwq2.mo66389b();
        String str = b.f126523c;
        if (str.equals(b2.f126523c)) {
            bkwq2.mo66390c();
            return;
        }
        blhb b3 = b2.mo66531b();
        List<blhp> b4 = b3.mo66523b();
        for (blhp blhp : b4) {
            if (bkta.m106589a(str, blhp)) {
                ArrayList arrayList = new ArrayList(b4);
                bksz.m106580a(arrayList, str);
                bkwq2.mo66388a(bksz.m106567a(b2.f126523c, b3.f126493b, arrayList));
                return;
            }
        }
    }
}
