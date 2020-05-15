package p000;

import java.util.List;
import java.util.ListIterator;

/* renamed from: bkwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkwo extends bkwp {

    /* renamed from: a */
    public blhg f125352a;

    /* renamed from: b */
    private final List f125353b;

    /* renamed from: c */
    private final ListIterator f125354c;

    public bkwo(List list) {
        this.f125353b = list;
        this.f125354c = list.listIterator();
        mo66391d();
    }

    /* renamed from: a */
    public final void mo66388a(blhg blhg) {
        boolean z;
        if (this.f125352a != null) {
            z = true;
        } else {
            z = false;
        }
        bkww.m106783b(z, "No current command.");
        this.f125352a = blhg;
        this.f125354c.set(blhg);
    }

    /* renamed from: b */
    public final blhg mo66389b() {
        return this.f125352a;
    }

    /* renamed from: c */
    public final void mo66390c() {
        mo66388a(bksz.m106563a());
    }

    /* renamed from: d */
    public final void mo66391d() {
        this.f125352a = this.f125354c.hasNext() ? (blhg) this.f125354c.next() : null;
    }

    /* renamed from: e */
    public final void mo66392e() {
        throw null;
    }
}
