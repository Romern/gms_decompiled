package p000;

/* renamed from: bflo */
final /* synthetic */ class bflo implements Runnable {

    /* renamed from: a */
    private final bflq f114355a;

    /* renamed from: b */
    private final boolean f114356b;

    /* renamed from: c */
    private final String f114357c;

    public bflo(bflq bflq, boolean z, String str) {
        this.f114355a = bflq;
        this.f114356b = z;
        this.f114357c = str;
    }

    public final void run() {
        bflq bflq = this.f114355a;
        boolean z = this.f114356b;
        String str = this.f114357c;
        if (ceub.m138249d()) {
            bflq.f114361c = z;
            bflq.f114362d = str != null ? bupz.m120219a(str) : 0;
            bflq.mo61894a(3);
            return;
        }
        bflq.mo61892b();
    }
}
