package p000;

/* renamed from: bujs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bujs extends buas {

    /* renamed from: a */
    final /* synthetic */ bujt f154047a;

    /* renamed from: b */
    private long[] f154048b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bujs(bujt bujt, buat buat) {
        super(buat);
        this.f154047a = bujt;
    }

    /* renamed from: a */
    public final void mo72480a() {
        this.f154048b = this.f154047a.f154049a;
        super.mo72480a();
    }

    /* renamed from: b */
    public final int mo72482b(int i) {
        int d = this.f154047a.mo72745d(this.f154048b[i]);
        if (d < 0) {
            d ^= -1;
        }
        super.mo72585a(i, d);
        return d;
    }

    /* renamed from: c */
    public final int mo72484c(int i) {
        return bujt.m119655b(this.f154047a.f154049a[i]);
    }

    /* renamed from: a */
    public final void mo72481a(int i) {
        this.f154047a.f154049a = new long[i];
        super.mo72481a(i);
    }

    /* renamed from: b */
    public final void mo72483b() {
        this.f154048b = null;
        super.mo72483b();
    }
}
