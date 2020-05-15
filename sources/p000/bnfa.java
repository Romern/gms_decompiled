package p000;

import java.io.Serializable;

/* renamed from: bnfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnfa implements Comparable, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    final Comparable f131551b;

    public bnfa(Comparable comparable) {
        this.f131551b = comparable;
    }

    /* renamed from: b */
    static bnfa m109221b(Comparable comparable) {
        return new bnez(comparable);
    }

    /* renamed from: c */
    static bnfa m109222c(Comparable comparable) {
        return new bnex(comparable);
    }

    /* renamed from: a */
    public Comparable mo67479a() {
        return this.f131551b;
    }

    /* renamed from: a */
    public abstract void mo67480a(StringBuilder sb);

    /* renamed from: a */
    public abstract boolean mo67481a(Comparable comparable);

    /* renamed from: b */
    public abstract bndx mo67482b();

    /* renamed from: b */
    public abstract void mo67483b(StringBuilder sb);

    /* renamed from: c */
    public abstract bndx mo67484c();

    public final boolean equals(Object obj) {
        if (obj instanceof bnfa) {
            try {
                if (compareTo((bnfa) obj) == 0) {
                    return true;
                }
                return false;
            } catch (ClassCastException e) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    /* renamed from: a */
    public int compareTo(bnfa bnfa) {
        if (bnfa == bney.f131550a) {
            return 1;
        }
        if (bnfa == bnew.f131549a) {
            return -1;
        }
        int c = bnoa.m109934c(this.f131551b, bnfa.f131551b);
        return c == 0 ? bqcc.m112556a(this instanceof bnex, bnfa instanceof bnex) : c;
    }
}
