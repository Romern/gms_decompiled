package p000;

/* renamed from: buis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buis {

    /* renamed from: a */
    private long f153969a = -1;

    /* renamed from: b */
    private int f153970b = 0;

    /* renamed from: a */
    public final void mo72707a(bgmk bgmk) {
        this.f153970b++;
        this.f153969a = bgmk.mo62776c();
    }

    /* renamed from: b */
    public final void mo72708b(bgmk bgmk) {
        if (this.f153969a != -1) {
            long c = bgmk.mo62776c() - this.f153969a;
            this.f153969a = -1;
            if (c < 0 || c <= 30000) {
            }
        }
    }
}
