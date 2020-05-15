package p000;

import java.io.Serializable;

/* renamed from: bnoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnoa extends bnob implements Serializable, bmxz {

    /* renamed from: a */
    public static final bnoa f131890a = new bnoa(bney.f131550a, bnew.f131549a);
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    final bnfa f131891b;

    /* renamed from: c */
    final bnfa f131892c;

    private bnoa(bnfa bnfa, bnfa bnfa2) {
        bmxy.m108581a(bnfa);
        this.f131891b = bnfa;
        bmxy.m108581a(bnfa2);
        this.f131892c = bnfa2;
        if (bnfa.compareTo(bnfa2) > 0 || bnfa == bnew.f131549a || bnfa2 == bney.f131550a) {
            String valueOf = String.valueOf(m109933b(bnfa, bnfa2));
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid range: ") : "Invalid range: ".concat(valueOf));
        }
    }

    /* renamed from: a */
    static bnoa m109925a(bnfa bnfa, bnfa bnfa2) {
        return new bnoa(bnfa, bnfa2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnoa.a(bnfa, bnfa):bnoa
     arg types: [bnfa, bnew]
     candidates:
      bnoa.a(java.lang.Comparable, bndx):bnoa
      bnoa.a(java.lang.Comparable, java.lang.Comparable):bnoa
      bnoa.a(bnfa, bnfa):bnoa */
    /* renamed from: b */
    public static bnoa m109930b(Comparable comparable) {
        return m109925a(bnfa.m109222c(comparable), (bnfa) bnew.f131549a);
    }

    /* renamed from: c */
    static int m109934c(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* renamed from: d */
    public final boolean mo68175d() {
        return this.f131892c != bnew.f131549a;
    }

    /* renamed from: e */
    public final Comparable mo68176e() {
        return this.f131892c.mo67479a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnoa) {
            bnoa bnoa = (bnoa) obj;
            return this.f131891b.equals(bnoa.f131891b) && this.f131892c.equals(bnoa.f131892c);
        }
    }

    /* renamed from: f */
    public final boolean mo68177f() {
        return this.f131891b.equals(this.f131892c);
    }

    public final int hashCode() {
        return (this.f131891b.hashCode() * 31) + this.f131892c.hashCode();
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return equals(f131890a) ? f131890a : this;
    }

    public final String toString() {
        return m109933b(this.f131891b, this.f131892c);
    }

    /* renamed from: c */
    public final bndx mo68173c() {
        return this.f131891b.mo67482b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnoa.a(bnfa, bnfa):bnoa
     arg types: [bney, bnfa]
     candidates:
      bnoa.a(java.lang.Comparable, bndx):bnoa
      bnoa.a(java.lang.Comparable, java.lang.Comparable):bnoa
      bnoa.a(bnfa, bnfa):bnoa */
    /* renamed from: a */
    public static bnoa m109926a(Comparable comparable) {
        return m109925a((bnfa) bney.f131550a, bnfa.m109221b(comparable));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnoa.a(bnfa, bnfa):bnoa
     arg types: [bnfa, bnew]
     candidates:
      bnoa.a(java.lang.Comparable, bndx):bnoa
      bnoa.a(java.lang.Comparable, java.lang.Comparable):bnoa
      bnoa.a(bnfa, bnfa):bnoa */
    /* renamed from: b */
    public static bnoa m109931b(Comparable comparable, bndx bndx) {
        bndx bndx2 = bndx.OPEN;
        int ordinal = bndx.ordinal();
        if (ordinal == 0) {
            return m109930b(comparable);
        }
        if (ordinal == 1) {
            return m109925a(bnfa.m109221b(comparable), (bnfa) bnew.f131549a);
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    public final boolean mo6527a(Comparable comparable) {
        bmxy.m108581a(comparable);
        return this.f131891b.mo67481a(comparable) && !this.f131892c.mo67481a(comparable);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnoa.a(bnfa, bnfa):bnoa
     arg types: [bney, bnfa]
     candidates:
      bnoa.a(java.lang.Comparable, bndx):bnoa
      bnoa.a(java.lang.Comparable, java.lang.Comparable):bnoa
      bnoa.a(bnfa, bnfa):bnoa */
    /* renamed from: a */
    public static bnoa m109927a(Comparable comparable, bndx bndx) {
        bndx bndx2 = bndx.OPEN;
        int ordinal = bndx.ordinal();
        if (ordinal == 0) {
            return m109926a(comparable);
        }
        if (ordinal == 1) {
            return m109925a((bnfa) bney.f131550a, bnfa.m109222c(comparable));
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public static bnoa m109932b(Comparable comparable, Comparable comparable2) {
        return m109925a(bnfa.m109221b(comparable), bnfa.m109221b(comparable2));
    }

    /* renamed from: b */
    private static String m109933b(bnfa bnfa, bnfa bnfa2) {
        StringBuilder sb = new StringBuilder(16);
        bnfa.mo67480a(sb);
        sb.append("..");
        bnfa2.mo67483b(sb);
        return sb.toString();
    }

    /* renamed from: a */
    public static bnoa m109928a(Comparable comparable, bndx bndx, Comparable comparable2, bndx bndx2) {
        bmxy.m108581a(bndx);
        bmxy.m108581a(bndx2);
        return m109925a(bndx != bndx.OPEN ? bnfa.m109221b(comparable) : bnfa.m109222c(comparable), bndx2 != bndx.OPEN ? bnfa.m109222c(comparable2) : bnfa.m109221b(comparable2));
    }

    /* renamed from: b */
    public final bnoa mo68171b(bnoa bnoa) {
        int a = this.f131891b.compareTo(bnoa.f131891b);
        int a2 = this.f131892c.compareTo(bnoa.f131892c);
        if (a >= 0 && a2 <= 0) {
            return this;
        }
        if (a <= 0 && a2 >= 0) {
            return bnoa;
        }
        return m109925a(a < 0 ? bnoa.f131891b : this.f131891b, a2 > 0 ? bnoa.f131892c : this.f131892c);
    }

    /* renamed from: b */
    public final Comparable mo68172b() {
        return this.f131891b.mo67479a();
    }

    /* renamed from: a */
    public static bnoa m109929a(Comparable comparable, Comparable comparable2) {
        return m109925a(bnfa.m109221b(comparable), bnfa.m109222c(comparable2));
    }

    /* renamed from: a */
    public final boolean mo68169a() {
        return this.f131891b != bney.f131550a;
    }

    /* renamed from: a */
    public final boolean mo68170a(bnoa bnoa) {
        return this.f131891b.compareTo(bnoa.f131892c) <= 0 && bnoa.f131891b.compareTo(this.f131892c) <= 0;
    }
}
