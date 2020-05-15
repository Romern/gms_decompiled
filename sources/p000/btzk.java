package p000;

/* renamed from: btzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class btzk extends buas {

    /* renamed from: a */
    final /* synthetic */ btzl f153120a;

    /* renamed from: b */
    private long[] f153121b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public btzk(btzl btzl, buat buat) {
        super(buat);
        this.f153120a = btzl;
    }

    /* renamed from: a */
    public final void mo72480a() {
        this.f153121b = this.f153120a.f153122a;
        super.mo72480a();
    }

    /* renamed from: b */
    public final int mo72482b(int i) {
        int b = this.f153120a.mo72492b(this.f153121b[i]);
        if (b < 0) {
            b ^= -1;
        }
        super.mo72585a(i, b);
        return b;
    }

    /* renamed from: c */
    public final int mo72484c(int i) {
        return btzl.m119053d(this.f153120a.f153122a[i]);
    }

    /* renamed from: a */
    public final void mo72481a(int i) {
        this.f153120a.f153122a = new long[i];
        super.mo72481a(i);
    }

    /* renamed from: b */
    public final void mo72483b() {
        this.f153121b = null;
        super.mo72483b();
    }
}
