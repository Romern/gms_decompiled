package p000;

/* renamed from: bluz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bluz implements blva {

    /* renamed from: a */
    public final bluv f127838a = new bluv();

    /* renamed from: b */
    private final bluq f127839b;

    /* renamed from: c */
    private boolean f127840c = false;

    public bluz(bluq bluq) {
        this.f127839b = bluq;
    }

    /* renamed from: a */
    public final bluq mo66734a(int i) {
        if (!this.f127840c) {
            this.f127840c = true;
            return this.f127839b;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final boolean mo66735a() {
        return this.f127840c;
    }

    /* renamed from: b */
    public final boolean mo66736b() {
        return this.f127840c;
    }

    /* renamed from: c */
    public final void mo66737c() {
        this.f127840c = false;
    }

    /* renamed from: d */
    public final bluv mo66738d() {
        return this.f127838a;
    }
}
