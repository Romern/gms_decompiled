package p000;

/* renamed from: bnns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnns {
    /* renamed from: a */
    static boolean m109873a(bnnn bnnn, Object obj) {
        if (obj == bnnn) {
            return true;
        }
        if (obj instanceof bnnn) {
            bnnn bnnn2 = (bnnn) obj;
            if (bnnn.size() == bnnn2.size() && bnnn.mo67324e().size() == bnnn2.mo67324e().size()) {
                for (bnno bnno : bnnn2.mo67324e()) {
                    if (bnnn.mo67285a(bnno.f131866a) != bnno.mo68118a()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
