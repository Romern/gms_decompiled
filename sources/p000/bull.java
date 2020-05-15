package p000;

/* renamed from: bull */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bull extends buas {

    /* renamed from: a */
    final /* synthetic */ bulm f154157a;

    /* renamed from: b */
    private int[] f154158b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bull(bulm bulm, buat buat) {
        super(buat);
        this.f154157a = bulm;
    }

    /* renamed from: a */
    public final void mo72480a() {
        this.f154158b = this.f154157a.f154159a;
        super.mo72480a();
    }

    /* renamed from: b */
    public final int mo72482b(int i) {
        int a = this.f154157a.mo72814a(this.f154158b[i]);
        if (a < 0) {
            a ^= -1;
        }
        super.mo72585a(i, a);
        return a;
    }

    /* renamed from: c */
    public final int mo72484c(int i) {
        return this.f154157a.f154159a[i];
    }

    /* renamed from: a */
    public final void mo72481a(int i) {
        this.f154157a.f154159a = new int[i];
        super.mo72481a(i);
    }

    /* renamed from: b */
    public final void mo72483b() {
        this.f154158b = null;
        super.mo72483b();
    }
}
