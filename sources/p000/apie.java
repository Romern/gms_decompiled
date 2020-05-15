package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: apie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apie {

    /* renamed from: a */
    private final Set f84450a = new C1225nr();

    /* renamed from: a */
    public final synchronized apid mo47285a(aeco aeco) {
        for (apid apid : this.f84450a) {
            if (aeco.mo6527a(apid.mo47281r())) {
                return apid;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final synchronized List mo47288b(aeco aeco) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (apid apid : this.f84450a) {
            if (aeco.mo6527a(apid.mo47281r())) {
                arrayList.add(apid);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized apid mo47289c(aeco aeco) {
        Iterator it = this.f84450a.iterator();
        if (aeco != null) {
            while (it.hasNext()) {
                apid apid = (apid) it.next();
                if (aeco.mo6527a(apid.mo47281r())) {
                    it.remove();
                    return apid;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public final synchronized List mo47290d(aeco aeco) {
        ArrayList arrayList;
        arrayList = new ArrayList(((C1225nr) this.f84450a).f26758b);
        if (aeco != null) {
            Iterator it = this.f84450a.iterator();
            while (it.hasNext()) {
                apid apid = (apid) it.next();
                if (aeco.mo6527a(apid.mo47281r())) {
                    it.remove();
                    arrayList.add(apid);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized Collection mo47286a() {
        return Collections.unmodifiableCollection(this.f84450a);
    }

    /* renamed from: a */
    public final synchronized void mo47287a(apid apid, apid apid2) {
        if (apid != null) {
            this.f84450a.remove(apid);
        }
        this.f84450a.add(apid2);
    }
}
