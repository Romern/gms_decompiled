package p000;

import java.util.Iterator;
import java.util.List;

/* renamed from: adre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adre implements bmxj {

    /* renamed from: a */
    final /* synthetic */ adqt f62542a;

    public adre(adqt adqt) {
        this.f62542a = adqt;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        boolean z;
        int i;
        Iterator it = ((List) obj).iterator();
        while (true) {
            if (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            i = 4;
        } else {
            i = 3;
        }
        adqt adqt = this.f62542a;
        adqt.mo33727b();
        adqt.mo33733e(i);
        return Boolean.valueOf(z);
    }
}
