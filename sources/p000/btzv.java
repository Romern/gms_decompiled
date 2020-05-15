package p000;

/* renamed from: btzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class btzv extends buas {

    /* renamed from: a */
    final /* synthetic */ btzw f153133a;

    /* renamed from: b */
    private Object[] f153134b = new Object[0];

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public btzv(btzw btzw, buat buat) {
        super(buat);
        this.f153133a = btzw;
    }

    /* renamed from: a */
    public final void mo72480a() {
        this.f153134b = this.f153133a.f153136b;
        super.mo72480a();
    }

    /* renamed from: b */
    public final int mo72482b(int i) {
        int b = this.f153133a.mo72525b(this.f153134b[i]);
        if (b < 0) {
            b ^= -1;
        }
        super.mo72585a(i, b);
        return b;
    }

    /* renamed from: c */
    public final int mo72484c(int i) {
        return this.f153133a.f153136b[i].hashCode();
    }

    /* renamed from: a */
    public final void mo72481a(int i) {
        this.f153133a.f153136b = new Object[i];
        super.mo72481a(i);
    }

    /* renamed from: b */
    public final void mo72483b() {
        this.f153134b = new Object[0];
        super.mo72483b();
    }
}
