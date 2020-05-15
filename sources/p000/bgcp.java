package p000;

/* renamed from: bgcp */
public final /* synthetic */ class bgcp implements Runnable {

    /* renamed from: a */
    private final bgcz f116060a;

    /* renamed from: b */
    private final bugl f116061b;

    public bgcp(bgcz bgcz, bugl bugl) {
        this.f116060a = bgcz;
        this.f116061b = bugl;
    }

    public final void run() {
        bgcz bgcz = this.f116060a;
        bugl bugl = this.f116061b;
        bgcy bgcy = (bgcy) bgcz.f116086b.get(bugl);
        if (bgcy != null) {
            bgcz.f116085a.mo67310c(Long.valueOf(bgcy.f116080a), bgcy);
            bgcz.f116086b.remove(bugl);
            Object[] objArr = {"Manager:", Long.valueOf(bgcy.f116080a)};
        }
    }
}
