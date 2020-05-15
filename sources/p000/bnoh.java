package p000;

/* renamed from: bnoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnoh extends bnic {

    /* renamed from: a */
    private final transient bnhe f131907a;

    /* renamed from: b */
    private final transient bngx f131908b;

    public bnoh(bnhe bnhe, bngx bngx) {
        this.f131907a = bnhe;
        this.f131908b = bngx;
    }

    /* renamed from: a */
    public final int mo67630a(Object[] objArr, int i) {
        return this.f131908b.mo67630a(objArr, i);
    }

    public final boolean contains(Object obj) {
        return this.f131907a.get(obj) != null;
    }

    /* renamed from: g */
    public final bngx mo67639g() {
        return this.f131908b;
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        return true;
    }

    public final int size() {
        return this.f131907a.size();
    }

    /* renamed from: a */
    public final bnrd iterator() {
        return this.f131908b.listIterator();
    }
}
