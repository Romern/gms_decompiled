package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bkmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkmi {

    /* renamed from: a */
    public final Map f124881a = new HashMap();

    /* renamed from: b */
    public ubu f124882b;

    public bkmi(bkmz bkmz, Iterable iterable) {
        if (bkmz != null) {
            bkmz.mo66129a(bkvm.class, new bkmg(this));
            bkmz.mo66129a(bkvn.class, new bkmh(this));
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            bkvo bkvo = (bkvo) it.next();
            this.f124881a.put(bkvo.f125334a, bkvo);
        }
    }

    /* renamed from: a */
    public final Collection mo66112a() {
        ArrayList arrayList;
        synchronized (this.f124881a) {
            arrayList = new ArrayList(this.f124881a.values());
        }
        return arrayList;
    }
}
