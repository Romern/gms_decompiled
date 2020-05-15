package p000;

import java.util.Iterator;
import java.util.List;

/* renamed from: zdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zdi {

    /* renamed from: a */
    private static final srn f54954a = zvt.m46581a();

    /* renamed from: b */
    private final bnkd f54955b = bndu.m109109r();

    /* renamed from: c */
    private final zgf f54956c;

    public zdi(zgf zgf) {
        bmxy.m108581a(zgf);
        this.f54956c = zgf;
    }

    /* renamed from: a */
    private final void m45318a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zgg zgg = (zgg) it.next();
            if (!this.f54956c.mo19160a(zgg)) {
                ((bnsl) f54954a.mo68388c()).mo68424a("Could not unregister %s with sensor adapter %s", zgg, this.f54956c);
            }
        }
    }

    /* renamed from: c */
    private final synchronized void m45319c(Object obj, zgg zgg) {
        if (!this.f54955b.mo67310c(obj, zgg)) {
            ((bnsl) f54954a.mo68387b()).mo68424a("Underlying listener %s not found for: %s", zgg, obj);
        }
    }

    /* renamed from: b */
    public final void mo30955b(Object obj) {
        m45318a(mo30952a(obj));
    }

    /* renamed from: a */
    public final synchronized List mo30952a(Object obj) {
        List b;
        b = this.f54955b.mo67126b(obj);
        if (b.isEmpty()) {
            ((bnsl) f54954a.mo68388c()).mo68420a("No underlying listener found for: %s", obj);
        }
        return b;
    }

    /* renamed from: b */
    public final void mo30956b(Object obj, zgg zgg) {
        m45318a((List) bngx.m109356a(zgg));
        m45319c(obj, zgg);
    }

    /* renamed from: a */
    public final synchronized void mo30953a(Object obj, zgg zgg) {
        this.f54955b.mo67268a(obj, zgg);
    }

    /* renamed from: a */
    public final synchronized boolean mo30954a() {
        return this.f54955b.mo67314m();
    }
}
