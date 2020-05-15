package p000;

/* renamed from: bumm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bumm extends buat {

    /* renamed from: a */
    final /* synthetic */ bumn f154247a;

    /* renamed from: b */
    private long[] f154248b;

    /* renamed from: c */
    private byte[][] f154249c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bumm(bumn bumn) {
        super(null);
        this.f154247a = bumn;
    }

    /* renamed from: a */
    public final void mo61442a() {
        bumn bumn = this.f154247a;
        this.f154248b = bumn.f154250a;
        this.f154249c = bumn.f154251b;
    }

    /* renamed from: b */
    public final void mo61445b() {
        this.f154248b = null;
        this.f154249c = null;
    }

    /* renamed from: a */
    public final void mo61443a(int i) {
        bumn bumn = this.f154247a;
        bumn.f154250a = new long[i];
        bumn.f154251b = new byte[i][];
    }

    /* renamed from: b */
    public final void mo61446b(int i) {
        this.f154247a.f154251b[i] = null;
    }

    /* renamed from: a */
    public final void mo61444a(int i, int i2) {
        bumn bumn = this.f154247a;
        bumn.f154250a[i2] = this.f154248b[i];
        bumn.f154251b[i2] = this.f154249c[i];
    }
}
