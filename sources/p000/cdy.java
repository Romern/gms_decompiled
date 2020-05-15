package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdy {

    /* renamed from: b */
    private static final cdu f6588b = new cdw();

    /* renamed from: a */
    private final Map f6589a = new HashMap();

    /* renamed from: a */
    public final synchronized cdv mo3767a(Object obj) {
        cdu cdu;
        crb.m7382a(obj);
        cdu = (cdu) this.f6589a.get(obj.getClass());
        if (cdu == null) {
            Iterator it = this.f6589a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cdu cdu2 = (cdu) it.next();
                if (cdu2.mo3764a().isAssignableFrom(obj.getClass())) {
                    cdu = cdu2;
                    break;
                }
            }
        }
        if (cdu == null) {
            cdu = f6588b;
        }
        return cdu.mo3763a(obj);
    }

    /* renamed from: a */
    public final synchronized void mo3768a(cdu cdu) {
        this.f6589a.put(cdu.mo3764a(), cdu);
    }
}
