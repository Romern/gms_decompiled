package p000;

import java.util.Comparator;

/* renamed from: cto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cto implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ctp ctp = (ctp) obj;
        ctp ctp2 = (ctp) obj2;
        if (ctp.f12030a == null) {
            return ctp2.f12030a == null ? 0 : -1;
        }
        if (ctp2.f12030a == null) {
            return 1;
        }
        return Integer.compare(ctp.mo8289b(), ctp2.mo8289b());
    }
}
