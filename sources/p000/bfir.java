package p000;

/* renamed from: bfir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfir {

    /* renamed from: a */
    private final long f114034a;

    /* renamed from: b */
    private final bgmk f114035b;

    /* renamed from: c */
    private long f114036c = -1;

    protected bfir(bgmk bgmk, long j) {
        this.f114035b = bgmk;
        this.f114034a = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61740a(long j) {
        if ((j & this.f114034a) != 0) {
            this.f114036c = this.f114035b.mo62776c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo61742b() {
        this.f114036c = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo61741a() {
        return this.f114036c != -1 && this.f114035b.mo62776c() - this.f114036c < 10000;
    }
}
