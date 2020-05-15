package p000;

/* renamed from: bukr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bukr extends buas {

    /* renamed from: a */
    final /* synthetic */ buks f154101a;

    /* renamed from: b */
    private short[] f154102b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bukr(buks buks, buat buat) {
        super(buat);
        this.f154101a = buks;
    }

    /* renamed from: a */
    public final void mo72480a() {
        this.f154102b = this.f154101a.f154103a;
        super.mo72480a();
    }

    /* renamed from: b */
    public final int mo72482b(int i) {
        int a = this.f154101a.mo72792a(this.f154102b[i]);
        if (a < 0) {
            a ^= -1;
        }
        super.mo72585a(i, a);
        return a;
    }

    /* renamed from: c */
    public final int mo72484c(int i) {
        return this.f154101a.f154103a[i];
    }

    /* renamed from: a */
    public final void mo72481a(int i) {
        this.f154101a.f154103a = new short[i];
        super.mo72481a(i);
    }

    /* renamed from: b */
    public final void mo72483b() {
        this.f154102b = null;
        super.mo72483b();
    }
}
