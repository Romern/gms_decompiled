package p000;

import java.util.Locale;

/* renamed from: bjka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjka {

    /* renamed from: a */
    bjka f122845a;

    /* renamed from: b */
    final C1246ol f122846b;

    /* renamed from: c */
    final C1246ol f122847c = new C1246ol();

    /* renamed from: d */
    public final bjjp f122848d;

    public bjka(bxxc bxxc, bjka bjka) {
        bjjp[] bjjpArr = bjjw.f122837a;
        int length = bjjpArr.length;
        for (int i = 0; i < 8; i++) {
            bjjp bjjp = bjjpArr[i];
            if (bjjp.f122834a.getClass().isAssignableFrom(bxxc.getClass())) {
                this.f122848d = bjjp;
                this.f122845a = bjka;
                this.f122846b = bjjp.f122836c.length > 0 ? new C1246ol() : null;
                return;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Unsupported proto type: %s", bxxc.getClass()));
    }

    /* renamed from: b */
    private final bjka m103749b(int i) {
        bjka bjka = this.f122845a;
        if (bjka != null) {
            return bjka.mo65323a(i);
        }
        return null;
    }

    /* renamed from: a */
    public final bjka mo65323a(int i) {
        bjka bjka = (bjka) this.f122846b.mo15646f(i);
        return bjka == null ? m103749b(i) : bjka;
    }

    /* renamed from: c */
    public final int mo65330c(int i, int i2) {
        return this.f122848d.mo65314c(mo65331d(i, i2), i);
    }

    /* renamed from: d */
    public final bxxc mo65331d(int i, int i2) {
        bjka bjka;
        bjkd bjkd = (bjkd) this.f122847c.mo15646f(i);
        bxxc bxxc = null;
        if (bjkd != null) {
            int size = bjkd.f122855a.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                bjkc bjkc = (bjkc) bjkd.f122855a.get(size);
                if (bjkc.mo65336a(i2)) {
                    bxxc = bjkc.f122854b;
                    break;
                }
                size--;
            }
        }
        if (bxxc == null && (bjka = this.f122845a) != null) {
            bxxc = bjka.mo65331d(i, i2);
        }
        return bxxc == null ? this.f122848d.f122834a : bxxc;
    }

    /* renamed from: b */
    public final float mo65328b(int i, int i2) {
        return this.f122848d.mo65312b(mo65331d(i, i2), i);
    }

    /* renamed from: b */
    public final Object mo65329b(int i, int i2, Class cls) {
        Object e = this.f122848d.mo65316e(mo65331d(i, i2), i);
        if (e != null) {
            return cls.cast(e);
        }
        return null;
    }

    /* renamed from: a */
    public final bxxc mo65324a(int i, int i2, Class cls) {
        bxxc d = this.f122848d.mo65315d(mo65331d(i, i2), i);
        if (d != null) {
            return (bxxc) cls.cast(d);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65325a(bjka bjka) {
        int i;
        this.f122845a = bjka;
        C1246ol olVar = this.f122846b;
        if (olVar != null) {
            i = olVar.mo15640c();
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            ((bjka) this.f122846b.mo15641c(i2)).mo65325a(m103749b(this.f122846b.mo15638b(i2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65326a(bxxc bxxc, int i) {
        int[] iArr = this.f122848d.f122836c;
        for (int i2 : iArr) {
            if (this.f122848d.mo65310a(bxxc, i2)) {
                bxxc f = this.f122848d.mo65317f(bxxc, i2);
                bjka bjka = (bjka) this.f122846b.mo15646f(i2);
                if (bjka == null) {
                    bjka = new bjka(f, m103749b(i2));
                    this.f122846b.mo15637a(i2, bjka);
                }
                bjka.mo65326a(f, i);
            }
        }
        int[] iArr2 = this.f122848d.f122835b;
        for (int i3 : iArr2) {
            if (this.f122848d.mo65310a(bxxc, i3)) {
                bjkd bjkd = (bjkd) this.f122847c.mo15646f(i3);
                if (bjkd == null) {
                    bjkd = new bjkd();
                    this.f122847c.mo15637a(i3, bjkd);
                }
                bjkc bjkc = new bjkc(bxxc, i);
                for (int size = bjkd.f122855a.size() - 1; size >= 0; size--) {
                    if (bjkc.mo65336a(((bjkc) bjkd.f122855a.get(size)).f122853a)) {
                        bjkd.f122855a.remove(size);
                    }
                }
                bjkd.f122855a.add(bjkc);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo65327a(int i, int i2) {
        return this.f122848d.mo65310a(mo65331d(i, i2), i);
    }
}
