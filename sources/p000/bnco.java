package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bnco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnco implements Iterator {

    /* renamed from: a */
    final Iterator f131450a;

    /* renamed from: b */
    Object f131451b = null;

    /* renamed from: c */
    Collection f131452c = null;

    /* renamed from: d */
    Iterator f131453d = bnjn.INSTANCE;

    /* renamed from: e */
    final /* synthetic */ bndd f131454e;

    public bnco(bndd bndd) {
        this.f131454e = bndd;
        this.f131450a = bndd.f131477a.entrySet().iterator();
    }

    /* renamed from: a */
    public abstract Object mo67128a(Object obj, Object obj2);

    public final boolean hasNext() {
        return this.f131450a.hasNext() || this.f131453d.hasNext();
    }

    public final Object next() {
        if (!this.f131453d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f131450a.next();
            this.f131451b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f131452c = collection;
            this.f131453d = collection.iterator();
        }
        return mo67128a(this.f131451b, this.f131453d.next());
    }

    public final void remove() {
        this.f131453d.remove();
        if (this.f131452c.isEmpty()) {
            this.f131450a.remove();
        }
        bndd.m109028b(this.f131454e);
    }
}
