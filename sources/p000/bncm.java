package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bncm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bncm implements Iterator {

    /* renamed from: a */
    final Iterator f131445a = this.f131447c.f131448a.entrySet().iterator();

    /* renamed from: b */
    Collection f131446b;

    /* renamed from: c */
    final /* synthetic */ bncn f131447c;

    public bncm(bncn bncn) {
        this.f131447c = bncn;
    }

    public final boolean hasNext() {
        return this.f131445a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f131445a.next();
        this.f131446b = (Collection) entry.getValue();
        return this.f131447c.mo67136a(entry);
    }

    public final void remove() {
        bndz.m109115a(this.f131446b != null);
        this.f131445a.remove();
        bndd.m109029b(this.f131447c.f131449b, this.f131446b.size());
        this.f131446b.clear();
        this.f131446b = null;
    }
}
