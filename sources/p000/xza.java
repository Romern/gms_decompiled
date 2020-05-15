package p000;

import com.google.android.gms.fido.common.Transport;
import java.util.Comparator;
import java.util.List;

/* renamed from: xza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xza implements Comparator {

    /* renamed from: a */
    private final Transport f53420a;

    public xza(Transport transport) {
        this.f53420a = transport;
    }

    /* renamed from: a */
    private final boolean m43671a(xfr xfr) {
        List list = xfr.f52138a.f31913d;
        if (list != null) {
            return list.contains(this.f53420a);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        List list;
        xfr xfr = (xfr) obj;
        xfr xfr2 = (xfr) obj2;
        boolean a = m43671a(xfr);
        boolean a2 = m43671a(xfr2);
        if (!a || a2) {
            if (!a && a2) {
                return 1;
            }
            if (a || ((list = xfr.f52138a.f31913d) == null && xfr2.f52138a.f31913d == null)) {
                return 0;
            }
            return list == null ? -1 : 1;
        }
    }
}
