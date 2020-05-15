package p000;

import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;

/* renamed from: edu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class edu extends edp {

    /* renamed from: b */
    private final int f14752b;

    /* renamed from: c */
    private final PriorityQueue f14753c;

    /* renamed from: d */
    private final HashMap f14754d = new HashMap();

    public edu(int i, Comparator comparator, boolean z) {
        super(z);
        this.f14752b = i;
        this.f14753c = new PriorityQueue(i + 1, comparator);
    }

    /* renamed from: a */
    public final Collection mo10006a() {
        return this.f14753c;
    }

    public final Iterator iterator() {
        return this.f14753c.iterator();
    }

    /* renamed from: a */
    public final void mo10007a(ContextDataFilterImpl contextDataFilterImpl, boolean z) {
        Iterator it = this.f14753c.iterator();
        while (it.hasNext()) {
            edr edr = (edr) it.next();
            if (!z || !this.f14745a || it.hasNext()) {
                if (contextDataFilterImpl.mo18051a(edr.f14749a)) {
                    this.f14754d.remove(edr.f14749a.mo18014d());
                    it.remove();
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo10008a(edr edr) {
        super.mo10008a(edr);
        if (this.f14754d.containsKey(edr.f14749a.mo18014d())) {
            if (((Integer) this.f14754d.get(edr.f14749a.mo18014d())).intValue() < edr.f14749a.mo18015e().mo26584b()) {
                Iterator it = this.f14753c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((edr) it.next()).f14749a.mo18014d().equals(edr.f14749a.mo18014d())) {
                            it.remove();
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                return;
            }
        }
        this.f14754d.put(edr.f14749a.mo18014d(), Integer.valueOf(edr.f14749a.mo18015e().mo26584b()));
        this.f14753c.add(edr);
        if (this.f14753c.size() > this.f14752b) {
            this.f14754d.remove(((edr) this.f14753c.remove()).f14749a.mo18014d());
        }
    }
}
