package p000;

/* renamed from: yfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yfl {

    /* renamed from: a */
    public static final yfl f53726a = new yfl(yxy.f54800b);

    /* renamed from: b */
    public final bzzz f53727b;

    static {
        new yfl(yxy.f54799a);
        new yfl(yxy.f54801c);
    }

    public yfl(bzzz bzzz) {
        this.f53727b = bzzz;
    }

    /* renamed from: a */
    public final String mo30409a() {
        return this.f53727b.f172301b;
    }

    /* renamed from: b */
    public final boolean mo30410b() {
        return yxy.m44966b(mo30409a());
    }

    /* renamed from: c */
    public final boolean mo30411c() {
        return (mo30409a().isEmpty() && this.f53727b.f172304e.isEmpty()) || mo30410b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yfl) {
            return bmxi.m108538a(this.f53727b, ((yfl) obj).f53727b);
        }
        return false;
    }

    public final int hashCode() {
        bzzz bzzz = this.f53727b;
        if (bzzz == null) {
            return 0;
        }
        int i = bzzz.f164758ag;
        if (i != 0) {
            return i;
        }
        int a = bxxm.f165037a.mo74228a(bzzz).mo74216a(bzzz);
        bzzz.f164758ag = a;
        return a;
    }

    public final String toString() {
        bzzz bzzz = this.f53727b;
        return String.format("AnalysisApplication[packageName=%s, name=%s]", bzzz.f172301b, bzzz.f172304e);
    }
}
