package p000;

/* renamed from: bnex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnex extends bnfa {
    private static final long serialVersionUID = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bnex(Comparable comparable) {
        super(comparable);
        bmxy.m108581a(comparable);
    }

    /* renamed from: a */
    public final void mo67480a(StringBuilder sb) {
        sb.append('(');
        sb.append(this.f131551b);
    }

    /* renamed from: b */
    public final bndx mo67482b() {
        return bndx.OPEN;
    }

    /* renamed from: c */
    public final bndx mo67484c() {
        return bndx.CLOSED;
    }

    public final int hashCode() {
        return this.f131551b.hashCode() ^ -1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131551b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb.append("/");
        sb.append(valueOf);
        sb.append("\\");
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo67481a(Comparable comparable) {
        return bnoa.m109934c(this.f131551b, comparable) < 0;
    }

    /* renamed from: b */
    public final void mo67483b(StringBuilder sb) {
        sb.append(this.f131551b);
        sb.append(']');
    }
}
