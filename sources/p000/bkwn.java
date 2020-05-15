package p000;

import java.util.List;
import java.util.ListIterator;

/* renamed from: bkwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkwn extends bkwp {

    /* renamed from: a */
    private final List f125349a;

    /* renamed from: b */
    private final ListIterator f125350b;

    /* renamed from: c */
    private bkpv f125351c;

    public bkwn(List list) {
        this.f125349a = list;
        this.f125350b = list.listIterator();
        mo66391d();
    }

    /* renamed from: a */
    public final void mo66388a(blhg blhg) {
        boolean z;
        if (this.f125351c != null) {
            z = true;
        } else {
            z = false;
        }
        bkww.m106783b(z, "No current command.");
        bkpv bkpv = this.f125351c;
        bkpv bkpv2 = new bkpv(bkpv.f125096a, blhg, bkpv.f125098c);
        this.f125351c = bkpv2;
        this.f125350b.set(bkpv2);
    }

    /* renamed from: b */
    public final blhg mo66389b() {
        bkpv bkpv = this.f125351c;
        if (bkpv != null) {
            return bkpv.f125097b;
        }
        return null;
    }

    /* renamed from: c */
    public final void mo66390c() {
        mo66388a(bksz.m106563a());
    }

    /* renamed from: d */
    public final void mo66391d() {
        this.f125351c = this.f125350b.hasNext() ? (bkpv) this.f125350b.next() : null;
    }

    /* renamed from: e */
    public final void mo66392e() {
        throw null;
    }
}
