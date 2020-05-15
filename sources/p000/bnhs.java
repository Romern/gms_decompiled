package p000;

/* renamed from: bnhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnhs extends bngm {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final transient bnht f131641a;

    public bnhs(bnht bnht) {
        this.f131641a = bnht;
    }

    /* renamed from: a */
    public final int mo67630a(Object[] objArr, int i) {
        bnrd a = this.f131641a.f131642b.values().iterator();
        while (a.hasNext()) {
            i = ((bngm) a.next()).mo67630a(objArr, i);
        }
        return i;
    }

    public final boolean contains(Object obj) {
        return this.f131641a.mo67312f(obj);
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        throw null;
    }

    public final int size() {
        return this.f131641a.f131643c;
    }

    /* renamed from: a */
    public final bnrd iterator() {
        return new bnho(this.f131641a);
    }
}
