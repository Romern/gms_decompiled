package p000;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: egi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class egi {

    /* renamed from: a */
    private bnot f14860a = null;

    public egi() {
    }

    /* renamed from: a */
    public final synchronized void mo10086a(egg egg) {
        bnot bnot = this.f14860a;
        if (bnot != null) {
            for (dqb dqb : bnot.mo67316o()) {
                dqb.mo9435a(new egh(new LinkedHashSet(this.f14860a.mo67361a(dqb)), egg), dqy.m9123a("ListenerInvokerRunner"));
            }
        }
    }

    public egi(Object obj, dqb dqb) {
        mo10088a(obj, dqb);
    }

    /* renamed from: a */
    public final synchronized void mo10087a(Object obj) {
        Iterator it = this.f14860a.mo67316o().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dqb dqb = (dqb) it.next();
            if (this.f14860a.mo67309b(dqb, obj)) {
                this.f14860a.mo67310c(dqb, obj);
                break;
            }
        }
        if (this.f14860a.mo67314m()) {
            this.f14860a = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo10088a(Object obj, dqb dqb) {
        sdo.m34959a(obj);
        sdo.m34959a(dqb);
        if (this.f14860a == null) {
            this.f14860a = bnge.m109299s();
        }
        if (this.f14860a.mo67317p().contains(obj)) {
            mo10087a(obj);
        }
        this.f14860a.mo67268a(dqb, obj);
    }
}
