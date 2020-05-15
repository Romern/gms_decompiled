package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: qev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qev {

    /* renamed from: a */
    public static final qgc f41093a = new qet();

    /* renamed from: b */
    private static final sek f41094b = qgn.m32143a("CallbackManager");

    /* renamed from: c */
    private final Object f41095c = new Object();

    /* renamed from: d */
    private final Map f41096d = new HashMap();

    /* renamed from: d */
    private final bnic m32033d(long j) {
        bnia j2 = bnic.m109500j();
        synchronized (this.f41095c) {
            Iterator it = this.f41096d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Long) entry.getValue()).longValue() <= j) {
                    j2.mo67629b((qeu) entry.getKey());
                    it.remove();
                }
            }
        }
        f41094b.mo25412b("%d callbacks for checkin started at: %d for manager %s", Integer.valueOf(j2.mo67751a().mo67639g().size()), Long.valueOf(j), toString());
        return j2.mo67751a();
    }

    /* renamed from: a */
    public final void mo23995a(long j) {
        f41094b.mo25412b("onCheckinSuccess %s", toString());
        bnrd a = m32033d(j).iterator();
        while (a.hasNext()) {
            ((qeu) a.next()).mo23992a();
        }
    }

    /* renamed from: b */
    public final void mo23997b(long j) {
        f41094b.mo25412b("onCheckinFailure %s", toString());
        bnrd a = m32033d(j).iterator();
        while (a.hasNext()) {
            ((qeu) a.next()).mo23993b();
        }
    }

    /* renamed from: c */
    public final void mo23998c(long j) {
        f41094b.mo25412b("onCheckinRescheduled %s", toString());
        bnrd a = m32033d(j).iterator();
        while (a.hasNext()) {
            ((qeu) a.next()).mo23994c();
        }
    }

    /* renamed from: a */
    public final void mo23996a(qeu qeu, long j) {
        sek sek = f41094b;
        Long valueOf = Long.valueOf(j);
        sek.mo25412b("Callback added for checkin started after: %d for manager %s", valueOf, toString());
        synchronized (this.f41095c) {
            this.f41096d.put(qeu, valueOf);
        }
    }
}
