package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: bksh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bksh extends bksb implements bkqm {

    /* renamed from: c */
    public volatile List f125210c;

    /* renamed from: d */
    public int f125211d;

    private bksh(bksh bksh, bksl bksl) {
        super(bksh.f125188a, bksl, true);
        this.f125211d = 0;
        this.f125210c = bksh.f125210c;
        this.f125211d = bksh.f125211d;
    }

    /* renamed from: a */
    private final blhg m106432a(int i, Iterable iterable) {
        return bksz.m106567a(mo66247d(), i, iterable);
    }

    /* renamed from: b */
    private final blhg m106434b(int i, int i2) {
        return bksz.m106566a(mo66247d(), i, i2);
    }

    /* renamed from: g */
    public final blhg mo66250g() {
        return bksz.m106570a(mo66247d(), bksz.f125256b);
    }

    /* renamed from: i */
    public final blhg mo66252i() {
        if (mo66229a() > 0) {
            return m106434b(0, mo66229a());
        }
        return bksz.m106563a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bksh.a(int, java.lang.Iterable):blhg
     arg types: [int, java.util.List]
     candidates:
      bksh.a(int, int):bkqi
      bksh.a(int, java.util.Collection):bkqi
      bksh.a(int, java.util.List):bkqi
      bksh.a(bkrx, bkqo):boolean
      bksb.a(blhg, blhf):void
      bkqo.a(bkrx, bkqo):boolean
      bkqm.a(int, int):bkqi
      bkqm.a(int, java.util.Collection):bkqi
      bkqm.a(int, java.util.List):bkqi
      bkqo.a(bkrx, bkqo):boolean
      bksh.a(int, java.lang.Iterable):blhg */
    /* renamed from: k */
    public final List mo66254k() {
        if (mo66229a() == 0) {
            return Collections.emptyList();
        }
        return Collections.singletonList(m106432a(0, (Iterable) this.f125210c));
    }

    /* renamed from: l */
    public final int mo66255l() {
        return this.f125211d + 24;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Iterable mo66303o() {
        return this.f125210c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo66306r() {
        this.f125210c = new ArrayList(this.f125210c);
    }

    public bksh(bksl bksl, blhp blhp) {
        super(blhp, bksl, false);
        this.f125211d = 0;
        this.f125210c = new ArrayList();
    }

    /* renamed from: a */
    private final void m106433a(blgu blgu, bkqw bkqw, bksc bksc) {
        boolean z;
        int i = blgu.f126475b;
        int i2 = blgu.f126476c;
        int a = mo66229a();
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        bkww.m106782a(z, "Delete endIndex must be >= startIndex");
        if (i2 <= a) {
            List<blhp> subList = this.f125210c.subList(i, i2);
            if (bksc.f125195a) {
                bksc.mo66309a(new bkru(this, bkqw, bksc.mo66313d(), i, new ArrayList(subList), null, null));
            }
            for (blhp blhp : subList) {
                this.f125211d -= bkta.m106585a(blhp);
                mo66300b(blhp);
            }
            subList.clear();
            return;
        }
        StringBuilder sb = new StringBuilder(74);
        sb.append("Delete [");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append(") ends after end of list (size ");
        sb.append(a);
        sb.append(")");
        throw new bkrf(sb.toString());
    }

    /* renamed from: b */
    private final blhg m106435b(int i, Iterable iterable) {
        return bksz.m106582b(mo66247d(), i, iterable);
    }

    /* renamed from: b */
    public final String mo66246b(bkqr bkqr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        List list = this.f125210c;
        int size = list.size();
        boolean z = true;
        int i = 0;
        while (i < size) {
            blhp blhp = (blhp) list.get(i);
            if (!z) {
                sb.append(", ");
            }
            sb.append((String) bkqr.mo66261a(blhp));
            i++;
            z = false;
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public final List mo66234b() {
        return Collections.unmodifiableList(this.f125210c);
    }

    /* renamed from: a */
    public final int mo66229a() {
        return this.f125210c.size();
    }

    /* renamed from: a */
    public final int mo66243a(bkqr bkqr) {
        List list = this.f125210c;
        int size = list.size();
        int i = 17;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 37) + ((Integer) bkqr.mo66261a((blhp) list.get(i2))).intValue();
        }
        return i;
    }

    /* renamed from: a */
    public final bkqi mo66230a(int i, int i2) {
        return this.f125189b.mo66103a(m106434b(i, i2), bkqw.f125126d);
    }

    /* renamed from: a */
    public final bkqi mo66231a(int i, bkqm bkqm, int i2) {
        if (i < 0 || i >= mo66229a() || i2 > bkqm.mo66229a()) {
            int a = mo66229a();
            int a2 = bkqm.mo66229a();
            StringBuilder sb = new StringBuilder(85);
            sb.append("srcIndex: ");
            sb.append(i);
            sb.append(" srcSize: ");
            sb.append(a);
            sb.append("destIndex: ");
            sb.append(i2);
            sb.append("destSize: ");
            sb.append(a2);
            throw new bkrf(sb.toString());
        }
        return this.f125189b.mo66103a(bksz.m106569a(mo66247d(), i, bkqm.mo66247d(), i2), bkqw.f125126d);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bksh.a(int, java.lang.Iterable):blhg
     arg types: [int, java.util.Collection]
     candidates:
      bksh.a(int, int):bkqi
      bksh.a(int, java.util.Collection):bkqi
      bksh.a(int, java.util.List):bkqi
      bksh.a(bkrx, bkqo):boolean
      bksb.a(blhg, blhf):void
      bkqo.a(bkrx, bkqo):boolean
      bkqm.a(int, int):bkqi
      bkqm.a(int, java.util.Collection):bkqi
      bkqm.a(int, java.util.List):bkqi
      bkqo.a(bkrx, bkqo):boolean
      bksh.a(int, java.lang.Iterable):blhg */
    /* renamed from: a */
    public final bkqi mo66232a(int i, Collection collection) {
        if (!collection.isEmpty()) {
            return this.f125189b.mo66103a(m106432a(i, (Iterable) collection), bkqw.f125126d);
        }
        return bkqi.f125113a;
    }

    /* renamed from: a */
    public final bkqi mo66233a(int i, List list) {
        return this.f125189b.mo66103a(m106435b(i, list), bkqw.f125126d);
    }

    /* renamed from: a */
    public final bksb mo66294a(bksl bksl) {
        mo66304p();
        return new bksh(this, bksl);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bksh.a(int, java.lang.Iterable):blhg
     arg types: [int, java.util.List]
     candidates:
      bksh.a(int, int):bkqi
      bksh.a(int, java.util.Collection):bkqi
      bksh.a(int, java.util.List):bkqi
      bksh.a(bkrx, bkqo):boolean
      bksb.a(blhg, blhf):void
      bkqo.a(bkrx, bkqo):boolean
      bkqm.a(int, int):bkqi
      bkqm.a(int, java.util.Collection):bkqi
      bkqm.a(int, java.util.List):bkqi
      bkqo.a(bkrx, bkqo):boolean
      bksh.a(int, java.lang.Iterable):blhg */
    /* renamed from: a */
    public final blhg mo66244a(blhg blhg) {
        blhf blhf = blhf.KIND_NOT_SET;
        int ordinal = blhg.f126522b.ordinal();
        if (ordinal == 3) {
            blhb b = blhg.mo66531b();
            int i = b.f126493b;
            return m106434b(i, b.mo66522a() + i);
        } else if (ordinal == 5) {
            blgu c = blhg.mo66532c();
            int i2 = c.f126475b;
            return m106432a(i2, (Iterable) this.f125210c.subList(i2, c.f126476c));
        } else if (ordinal == 6) {
            blhv d = blhg.mo66533d();
            int i3 = d.f126584b;
            List list = this.f125210c;
            int i4 = d.f126584b;
            return m106435b(i3, list.subList(i4, d.mo66562a() + i4));
        } else {
            throw new IllegalStateException(blhg.toString());
        }
    }

    /* renamed from: a */
    public final blhp mo66327a(int i) {
        return (blhp) this.f125210c.get(i);
    }

    /* renamed from: a */
    public final void mo66295a(blhg blhg, bkqw bkqw, bksc bksc) {
        ArrayList arrayList;
        ArrayList arrayList2;
        mo66305q();
        blhf blhf = blhf.KIND_NOT_SET;
        int ordinal = blhg.f126522b.ordinal();
        if (ordinal == 3) {
            blhb b = blhg.mo66531b();
            int i = b.f126493b;
            int a = mo66229a();
            List<blhp> b2 = b.mo66523b();
            if (i <= a) {
                this.f125210c.addAll(i, b2);
                for (blhp blhp : b2) {
                    this.f125211d += bkta.m106585a(blhp);
                    mo66297a(blhp);
                }
                if (bksc.f125195a) {
                    bksc.mo66309a(new bkrt(this, bkqw, bksc.mo66313d(), i, b2, null, null));
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder(71);
            sb.append("Insert at index ");
            sb.append(i);
            sb.append(" starts after end of list (size ");
            sb.append(a);
            sb.append(")");
            throw new bkrf(sb.toString());
        } else if (ordinal == 5) {
            m106433a(blhg.mo66532c(), bkqw, bksc);
        } else if (ordinal != 6) {
            mo66299b(blhg);
        } else {
            blhv d = blhg.mo66533d();
            int i2 = d.f126584b;
            if (bksc.f125195a) {
                arrayList = new ArrayList();
            } else {
                arrayList = null;
            }
            if (bksc.f125195a) {
                arrayList2 = new ArrayList();
            } else {
                arrayList2 = null;
            }
            for (blhp blhp2 : d.mo66563b()) {
                blhp blhp3 = (blhp) this.f125210c.get(i2);
                this.f125210c.set(i2, blhp2);
                int a2 = this.f125211d - bkta.m106585a(blhp3);
                this.f125211d = a2;
                this.f125211d = a2 + bkta.m106585a(blhp2);
                mo66297a(blhp2);
                mo66300b(blhp3);
                if (!(arrayList2 == null || arrayList == null)) {
                    arrayList.add(blhp2);
                    arrayList2.add(blhp3);
                }
                i2++;
            }
            if (bksc.f125195a) {
                bksc.mo66309a(new bkrv(this, bkqw, bksc.mo66313d(), d.f126584b, arrayList, arrayList2));
            }
        }
    }

    /* renamed from: a */
    public final void mo66298a(String str, bkqw bkqw, bksc bksc) {
        Collection<bkqt> values = ((bksp) this.f125189b).f125231b.mo66335b(mo66247d()).values();
        int i = 0;
        while (i < this.f125210c.size()) {
            if (bkta.m106589a(str, (blhp) this.f125210c.get(i))) {
                blhg a = bksz.m106566a(mo66247d(), i, i + 1);
                if (!values.isEmpty()) {
                    for (bkqt bkqt : values) {
                        ((bksk) bkqt).mo66295a(a, bkqw, bksc);
                    }
                }
                m106433a(a.mo66532c(), bkqw, bksc);
                i--;
            }
            i++;
        }
    }

    /* renamed from: a */
    public final boolean mo66245a(bkrx bkrx, bkqo bkqo) {
        if (bkqo instanceof bksh) {
            bksh bksh = (bksh) bkqo;
            if (mo66229a() == bksh.mo66229a()) {
                for (int i = 0; i < mo66229a(); i++) {
                    if (!bkrx.mo66290a(mo66327a(i), bksh.mo66327a(i), this.f125189b, bksh.f125189b)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
