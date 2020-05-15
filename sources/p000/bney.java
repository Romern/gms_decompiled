package p000;

/* renamed from: bney */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bney extends bnfa {

    /* renamed from: a */
    public static final bney f131550a = new bney();
    private static final long serialVersionUID = 0;

    private bney() {
        super(null);
    }

    private Object readResolve() {
        return f131550a;
    }

    /* renamed from: a */
    public final int mo67478a(bnfa bnfa) {
        return bnfa == this ? 0 : -1;
    }

    /* renamed from: a */
    public final boolean mo67481a(Comparable comparable) {
        return true;
    }

    /* renamed from: b */
    public final bndx mo67482b() {
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public final bndx mo67484c() {
        throw new AssertionError("this statement should be unreachable");
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((bnfa) obj);
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }

    /* renamed from: a */
    public final Comparable mo67479a() {
        throw new IllegalStateException("range unbounded on this side");
    }

    /* renamed from: b */
    public final void mo67483b(StringBuilder sb) {
        throw new AssertionError();
    }

    /* renamed from: a */
    public final void mo67480a(StringBuilder sb) {
        sb.append("(-∞");
    }
}
