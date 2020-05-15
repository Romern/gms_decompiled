package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: bndq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bndq extends bndd implements bnot {
    private static final long serialVersionUID = 7431625294878419160L;

    protected bndq(Map map) {
        super(map);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Collection mo67121a() {
        throw null;
    }

    /* renamed from: r */
    public final Set mo67315n() {
        return (Set) super.mo67315n();
    }

    /* renamed from: a */
    public Collection mo67122a(Object obj, Collection collection) {
        return new bndb(this, obj, (Set) collection);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Collection mo67125b() {
        return Collections.emptySet();
    }

    /* renamed from: a */
    public Collection mo67123a(Collection collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    /* renamed from: b */
    public final Set mo67272e(Object obj) {
        return (Set) super.mo67272e(obj);
    }

    /* renamed from: a */
    public final Set mo67127c(Object obj) {
        return (Set) super.mo67127c(obj);
    }

    /* renamed from: b */
    public final void mo67363b(Object obj, Iterable iterable) {
        Collection collection;
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            collection = mo67272e(obj);
        } else {
            Collection collection2 = (Collection) ((bndd) this).f131477a.get(obj);
            if (collection2 == null) {
                collection2 = mo67121a();
                ((bndd) this).f131477a.put(obj, collection2);
            }
            Collection a = mo67121a();
            a.addAll(collection2);
            ((bndd) this).f131478b -= collection2.size();
            collection2.clear();
            while (it.hasNext()) {
                if (collection2.add(it.next())) {
                    ((bndd) this).f131478b++;
                }
            }
            collection = mo67123a(a);
        }
        Set set = (Set) collection;
    }
}
