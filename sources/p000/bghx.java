package p000;

/* renamed from: bghx */
final /* synthetic */ class bghx {

    /* renamed from: a */
    private final bghz f116470a;

    public bghx(bghz bghz) {
        this.f116470a = bghz;
    }

    /* renamed from: a */
    public final void mo62834a(bfmn[] bfmnArr, int i) {
        bghz bghz = this.f116470a;
        if (bfmnArr == null || bfmnArr.length == 0) {
            bgfx.m98779a(bghz.f116471a.f116481b, null, i);
            bghz.f116471a.f116491l.mo61023a((bfmn) null);
            return;
        }
        bfmn bfmn = bfmnArr[0];
        bgfx.m98779a(bghz.f116471a.f116481b, bfmn, i);
        bghz.f116471a.f116491l.mo61023a(bfmn);
    }
}
