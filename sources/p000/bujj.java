package p000;

/* renamed from: bujj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bujj extends buat {

    /* renamed from: a */
    final /* synthetic */ bujk f154022a;

    /* renamed from: b */
    private int[] f154023b;

    /* renamed from: c */
    private byte[] f154024c;

    /* renamed from: d */
    private byte[] f154025d;

    /* renamed from: e */
    private short[] f154026e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bujj(bujk bujk) {
        super(null);
        this.f154022a = bujk;
    }

    /* renamed from: a */
    public final void mo61442a() {
        bujk bujk = this.f154022a;
        this.f154023b = bujk.f154027a;
        this.f154024c = bujk.f154028b;
        this.f154025d = bujk.f154029e;
        this.f154026e = bujk.f154030f;
    }

    /* renamed from: b */
    public final void mo61445b() {
        this.f154023b = null;
        this.f154024c = null;
        this.f154025d = null;
        this.f154026e = null;
    }

    /* renamed from: b */
    public final void mo61446b(int i) {
    }

    /* renamed from: a */
    public final void mo61443a(int i) {
        bujk bujk = this.f154022a;
        bujk.f154027a = new int[i];
        bujk.f154028b = new byte[i];
        bujk.f154029e = new byte[i];
        bujk.f154030f = new short[i];
    }

    /* renamed from: a */
    public final void mo61444a(int i, int i2) {
        bujk bujk = this.f154022a;
        bujk.f154027a[i2] = this.f154023b[i];
        bujk.f154028b[i2] = this.f154024c[i];
        bujk.f154029e[i2] = this.f154025d[i];
        bujk.f154030f[i2] = this.f154026e[i];
    }
}
