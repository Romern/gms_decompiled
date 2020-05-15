package p000;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/* renamed from: bksn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bksn extends bkss {

    /* renamed from: f */
    private final List f125225f = new ArrayList(1);

    /* renamed from: g */
    private final LinkedList f125226g = new LinkedList();

    /* renamed from: h */
    private Deque f125227h;

    /* renamed from: i */
    private final List f125228i = new ArrayList();

    /* renamed from: j */
    private boolean f125229j = true;

    public bksn(bksm bksm, bkqy bkqy, bkqw bkqw, boolean z) {
        super(bksm, bkqy, bkqw);
        ((bkss) this).f125241e = z;
    }

    /* renamed from: f */
    private final bkqi m106507f() {
        mo66323d();
        blhg a = bksz.m106578a(this.f125225f);
        bkqi a2 = this.f125204b.mo66275a(this.f125205c, bksz.m106578a(this.f125226g));
        this.f125228i.add(a2.f125117e);
        bkra bkra = bkra.f125144a;
        List list = this.f125228i;
        int size = list.size();
        bkra bkra2 = bkra;
        for (int i = 0; i < size; i++) {
            bkra2 = bkra2.mo66280a((bkra) list.get(i));
        }
        return new bkqi(this.f125206d.mo66308a(), this.f125206d.mo66311b(), mo66342e(), a, bkra2, null, a2.f125120h);
    }

    /* renamed from: a */
    public final bkqi mo66314a() {
        bkww.m106783b(mo66320b(), "No compound operation to end.");
        this.f125206d.mo66312c();
        blgn blgn = (blgn) this.f125227h.pop();
        if (!blgn.f126449c || this.f125203a.mo66268c() != null) {
            mo66322c(bksz.m106564a(blgn));
            if (mo66320b()) {
                return bkqi.f125113a;
            }
            return m106507f();
        }
        throw new bkri();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo66319b(blhg blhg) {
        if (!this.f125229j) {
            this.f125228i.add(this.f125204b.mo66276a(blhg));
        } else {
            this.f125226g.push(bksy.m106559a(this.f125203a, blhg));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo66322c(blhg blhg) {
        if (mo66320b()) {
            ((blgn) this.f125227h.peek()).mo66498a(blhg);
        } else {
            this.f125225f.add(blhg);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo66325e(blhg blhg) {
        blgu c = blhg.mo66532c();
        for (bkqt bkqt : this.f125203a.mo66335b(blhg.f126523c).values()) {
            int b = bkqt.mo66265b();
            int i = c.f126475b;
            int i2 = c.f126476c;
            if (b >= i && b < i2) {
                mo66326f(bksz.m106576a(bkqt.mo66247d(), bkqt.mo66263a(), bkqu.m106334a(b, c, bkqt.mo66267n(), 1), bkqt.mo66267n()));
            }
        }
        mo66326f(blhg);
    }

    /* renamed from: b */
    public final boolean mo66320b() {
        Deque deque = this.f125227h;
        return deque != null && !deque.isEmpty();
    }

    /* renamed from: a */
    public final bkqi mo66315a(blhg blhg) {
        mo66321c();
        mo66324d(blhg);
        if (!mo66320b()) {
            return m106507f();
        }
        return bkqi.m106291a(mo66342e(), null);
    }

    /* renamed from: a */
    public final void mo66317a(String str, bksd bksd) {
        boolean z;
        mo66321c();
        this.f125206d.mo66310a(str);
        boolean z2 = false;
        if (bksd != bksd.CREATION || !mo66320b()) {
            z = true;
        } else {
            z = false;
        }
        bkww.m106783b(z, "Creation compound operations cannot be nested inside another compound operation.");
        if (!mo66320b()) {
            this.f125229j = bksd.f125202d;
        } else if (this.f125229j) {
            bkww.m106783b(bksd.f125202d, "A non-undoable compound operation cannot be nested in an undoable compound operation");
        }
        if (this.f125227h == null) {
            this.f125227h = new LinkedList();
        }
        blgn b = blgo.m107143b();
        bkww.m106781a(str, "Compound operation name cannot be null.");
        b.f126448b = str;
        if (bksd == bksd.CREATION) {
            z2 = true;
        }
        b.f126449c = z2;
        this.f125227h.push(b);
    }
}
