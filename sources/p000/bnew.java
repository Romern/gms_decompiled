package p000;

/* renamed from: bnew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnew extends bnfa {

    /* renamed from: a */
    public static final bnew f131549a = new bnew();
    private static final long serialVersionUID = 0;

    private bnew() {
        super(null);
    }

    private Object readResolve() {
        return f131549a;
    }

    /* renamed from: a */
    public final int mo67478a(bnfa bnfa) {
        return bnfa == this ? 0 : 1;
    }

    /* renamed from: a */
    public final boolean mo67481a(Comparable comparable) {
        return false;
    }

    /* renamed from: b */
    public final bndx mo67482b() {
        throw new AssertionError("this statement should be unreachable");
    }

    /* renamed from: c */
    public final bndx mo67484c() {
        throw new IllegalStateException();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((bnfa) obj);
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }

    /* renamed from: a */
    public final Comparable mo67479a() {
        throw new IllegalStateException("range unbounded on this side");
    }

    /* renamed from: b */
    public final void mo67483b(StringBuilder sb) {
        sb.append("+∞)");
    }

    /* renamed from: a */
    public final void mo67480a(StringBuilder sb) {
        throw new AssertionError();
    }
}
