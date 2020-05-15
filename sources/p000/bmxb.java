package p000;

import java.util.Iterator;

/* renamed from: bmxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmxb implements Iterator {

    /* renamed from: a */
    final /* synthetic */ bmxc f131161a;

    /* renamed from: b */
    private final Iterator f131162b = this.f131161a.f131163a.iterator();

    public bmxb(bmxc bmxc) {
        this.f131161a = bmxc;
    }

    public final boolean hasNext() {
        return this.f131162b.hasNext();
    }

    public final Object next() {
        return this.f131161a.f131164b.mo66855c(this.f131162b.next());
    }

    public final void remove() {
        this.f131162b.remove();
    }
}
