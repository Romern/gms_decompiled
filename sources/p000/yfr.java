package p000;

/* renamed from: yfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yfr {

    /* renamed from: a */
    public final caae f53734a;

    public yfr(caae caae) {
        bmxy.m108581a(caae);
        this.f53734a = caae;
    }

    /* renamed from: a */
    public static yfq m43986a() {
        return new yfq();
    }

    /* renamed from: b */
    public final yfl mo30422b() {
        bzzz bzzz = this.f53734a.f172332h;
        if (bzzz == null) {
            bzzz = bzzz.f172298f;
        }
        return new yfl(bzzz);
    }

    /* renamed from: c */
    public final String mo30423c() {
        caah caah = this.f53734a.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        return caah.f172336b;
    }

    /* renamed from: d */
    public final caah mo30424d() {
        caah caah = this.f53734a.f172330f;
        return caah == null ? caah.f172333d : caah;
    }

    /* renamed from: e */
    public final String mo30425e() {
        return this.f53734a.f172326b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yfr) {
            return this.f53734a.equals(((yfr) obj).f53734a);
        }
        return false;
    }

    /* renamed from: f */
    public final String mo30427f() {
        return this.f53734a.f172328d;
    }

    /* renamed from: g */
    public final caaq mo30428g() {
        caae caae = this.f53734a;
        if ((caae.f172325a & 32) == 0) {
            return null;
        }
        caaq caaq = caae.f172331g;
        return caaq == null ? caaq.f172356h : caaq;
    }

    /* renamed from: h */
    public final int mo30429h() {
        caad caad = caad.RAW;
        caad a = caad.m126389a(this.f53734a.f172329e);
        if (a == null) {
            a = caad.RAW;
        }
        int ordinal = a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 1;
            }
            if (!(ordinal == 2 || ordinal == 3)) {
                throw new AssertionError();
            }
        }
        return 2;
    }

    public final int hashCode() {
        caae caae = this.f53734a;
        int i = caae.f164758ag;
        if (i != 0) {
            return i;
        }
        int a = bxxm.f165037a.mo74228a(caae).mo74216a(caae);
        caae.f164758ag = a;
        return a;
    }

    public final String toString() {
        return String.format("AnalysisDataSource[%s]", this.f53734a.f172326b);
    }

    public yfr(yfq yfq) {
        caae caae = (caae) yfq.f53732a.mo74062i();
        bmxy.m108581a(caae);
        this.f53734a = caae;
    }
}
