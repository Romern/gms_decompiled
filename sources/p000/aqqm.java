package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aqqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqqm implements aqvr {

    /* renamed from: a */
    private boolean f86605a;

    /* renamed from: b */
    private aqwr f86606b;

    /* renamed from: c */
    private aqqw f86607c;

    /* renamed from: d */
    private final List f86608d = new ArrayList();

    /* renamed from: a */
    private final void m71976a() {
        if (m71977b()) {
            boolean c = m71978c();
            List list = this.f86608d;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((aqql) list.get(i)).mo48049a(c);
            }
        }
    }

    /* renamed from: b */
    private final boolean m71977b() {
        return this.f86605a && this.f86607c != null;
    }

    /* renamed from: c */
    private final boolean m71978c() {
        aqwr aqwr = this.f86606b;
        return aqwr != null && aqwr.f86998a != null && this.f86607c.mo48087c() && this.f86606b.f86998a.equals(this.f86607c.f86628d.f170197i);
    }

    /* renamed from: a */
    public final void mo48077a(aqql aqql) {
        this.f86608d.add(aqql);
        if (m71977b()) {
            aqql.mo48049a(m71978c());
        }
    }

    /* renamed from: a */
    public final void mo48038a(aqqw aqqw) {
        this.f86607c = aqqw;
        m71976a();
    }

    /* renamed from: a */
    public final void mo48078a(aqwr aqwr) {
        this.f86605a = true;
        this.f86606b = aqwr;
        m71976a();
    }
}
