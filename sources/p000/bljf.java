package p000;

import java.util.Iterator;
import java.util.Set;

/* renamed from: bljf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bljf {

    /* renamed from: a */
    private final bljf f126669a;

    /* renamed from: b */
    public final C1245ok f126670b;

    /* renamed from: c */
    public boolean f126671c = false;

    public bljf(bljf bljf, C1245ok okVar) {
        if (bljf != null) {
            bmxy.m108588a(bljf.f126671c);
        }
        this.f126669a = bljf;
        this.f126670b = okVar;
    }

    /* renamed from: a */
    public static bljc m107236a(bljd bljd, bljf bljf, blki blki) {
        bmxy.m108581a(blki);
        Object b = bljf.mo66592b(bljd);
        if (b == null) {
            return bljc.m107233a(3);
        }
        bmxy.m108581a(b);
        return new bljc(1, b, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object mo66592b(bljd bljd) {
        bljf bljf;
        bmxy.m108600b(this.f126671c);
        Object obj = this.f126670b.get(bljd);
        return (obj != null || (bljf = this.f126669a) == null) ? obj : bljf.mo66592b(bljd);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo66593b() {
        return this == blje.f126668a;
    }

    /* renamed from: a */
    public static bljf m107237a(bljf bljf, bljf bljf2) {
        if (!bljf.mo66593b()) {
            return !bljf2.mo66593b() ? m107238a(bnic.m109490a(bljf, bljf2)) : bljf;
        }
        return bljf2;
    }

    /* renamed from: a */
    static bljf m107238a(Set set) {
        boolean z;
        if (set.isEmpty()) {
            return blje.f126668a;
        }
        if (set.size() == 1) {
            return (bljf) set.iterator().next();
        }
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            bljf bljf = (bljf) it.next();
            do {
                i += bljf.f126670b.f26809h;
                bljf = bljf.f126669a;
            } while (bljf != null);
        }
        if (i == 0) {
            return blje.f126668a;
        }
        C1245ok okVar = new C1245ok(i);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            bljf bljf2 = (bljf) it2.next();
            do {
                int i2 = 0;
                while (true) {
                    C1245ok okVar2 = bljf2.f126670b;
                    if (i2 >= okVar2.f26809h) {
                        break;
                    }
                    if (okVar.put((bljd) okVar2.mo15620b(i2), bljf2.f126670b.mo15621c(i2)) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bmxy.m108596a(z, "Duplicate bindings: %s", bljf2.f126670b.mo15620b(i2));
                    i2++;
                }
                bljf2 = bljf2.f126669a;
            } while (bljf2 != null);
        }
        return new blje(null, okVar).mo66590a();
    }

    /* renamed from: a */
    public final bljf mo66590a() {
        if (!this.f126671c) {
            this.f126671c = true;
            return (this.f126669a == null || !this.f126670b.isEmpty()) ? this : this.f126669a;
        }
        throw new IllegalStateException("Already frozen");
    }

    /* renamed from: a */
    public final boolean mo66591a(bljd bljd) {
        bljf bljf;
        return this.f126670b.containsKey(bljd) || ((bljf = this.f126669a) != null && bljf.mo66591a(bljd));
    }
}
