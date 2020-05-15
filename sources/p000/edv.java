package p000;

import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: edv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class edv extends edp {

    /* renamed from: b */
    private final List f14755b = new ArrayList();

    public edv(boolean z) {
        super(z);
    }

    /* renamed from: a */
    public final Collection mo10006a() {
        return this.f14755b;
    }

    public final Iterator iterator() {
        return this.f14755b.iterator();
    }

    /* renamed from: a */
    public final void mo10007a(ContextDataFilterImpl contextDataFilterImpl, boolean z) {
        Iterator it = this.f14755b.iterator();
        while (it.hasNext()) {
            edr edr = (edr) it.next();
            if (!z || !this.f14745a || it.hasNext()) {
                if (contextDataFilterImpl.mo18051a(edr.f14749a)) {
                    it.remove();
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo10008a(edr edr) {
        super.mo10008a(edr);
        Iterator it = this.f14755b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            edr edr2 = (edr) it.next();
            if (edr2.f14749a.mo18014d().equals(edr.f14749a.mo18014d())) {
                if (edr2.f14749a.mo18015e().mo26584b() <= edr.f14749a.mo18015e().mo26584b()) {
                    it.remove();
                } else {
                    return;
                }
            }
        }
        if (edr.f14749a.mo18022j().mo26616b()) {
            this.f14755b.add(edr);
        }
    }
}
