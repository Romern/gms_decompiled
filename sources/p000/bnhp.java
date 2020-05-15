package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bnhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bnhp {

    /* renamed from: a */
    final Map f131637a = bnel.m109127a();

    /* renamed from: a */
    public final void mo67728a(Object obj, Iterable iterable) {
        if (obj == null) {
            String valueOf = String.valueOf(bnjd.m109578a(iterable));
            throw new NullPointerException(valueOf.length() == 0 ? new String("null key in entry: null=") : "null key in entry: null=".concat(valueOf));
        }
        Collection collection = (Collection) this.f131637a.get(obj);
        if (collection != null) {
            for (Object obj2 : iterable) {
                bndz.m109114a(obj, obj2);
                collection.add(obj2);
            }
            return;
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Collection b = mo67729b();
            while (it.hasNext()) {
                Object next = it.next();
                bndz.m109114a(obj, next);
                b.add(next);
            }
            this.f131637a.put(obj, b);
        }
    }

    /* renamed from: b */
    public Collection mo67729b() {
        return new ArrayList();
    }

    /* renamed from: c */
    public final bnht mo67731c() {
        return bngz.m109388a((Collection) this.f131637a.entrySet());
    }

    /* renamed from: b */
    public final void mo67730b(Object obj, Object obj2) {
        bndz.m109114a(obj, obj2);
        Collection collection = (Collection) this.f131637a.get(obj);
        if (collection == null) {
            Map map = this.f131637a;
            Collection b = mo67729b();
            map.put(obj, b);
            collection = b;
        }
        collection.add(obj2);
    }
}
