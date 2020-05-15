package p000;

/* renamed from: yzi */
final /* synthetic */ class yzi implements yzl {

    /* renamed from: a */
    private final yzp f54846a;

    public yzi(yzp yzp) {
        this.f54846a = yzp;
    }

    /* renamed from: a */
    public final Object mo30865a(String str) {
        yzp yzp = this.f54846a;
        yzp.m45080m("Can't init sqlite client in main thread");
        return new ztl(yzp.f54857c, yzp.f54858d, ztg.m46273a(yzp.f54857c, str, yzp.mo30887i()));
    }
}
