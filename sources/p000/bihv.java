package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bihv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bihv extends bihy {

    /* renamed from: a */
    final /* synthetic */ biij f120640a;

    /* renamed from: b */
    private final Map f120641b;

    public bihv(biij biij, Map map) {
        this.f120640a = biij;
        this.f120641b = map;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo64637b(rkk rkk) {
        aeli aeli = (aeli) rkk;
        if (this.f120640a.f120660g == null) {
            return;
        }
        if (!aeli.f63490b.mo17710c()) {
            this.f120640a.f120660g.mo64645d();
            return;
        }
        C1223np npVar = new C1223np(aeli.mo24660a());
        Iterator it = aeli.iterator();
        while (it.hasNext()) {
            aelh aelh = (aelh) it.next();
            npVar.put(aelh.mo8007a(), (aelh) aelh.mo7556bF());
        }
        C1223np npVar2 = new C1223np(((C1245ok) this.f120641b).f26809h);
        for (Map.Entry entry : this.f120641b.entrySet()) {
            aelh aelh2 = (aelh) npVar.get(entry.getValue());
            if (aelh2 != null) {
                npVar2.put((String) entry.getKey(), aelh2);
            } else {
                this.f120640a.f120660g.mo64645d();
                return;
            }
        }
        this.f120640a.f120660g.mo64644a(npVar2);
    }
}
