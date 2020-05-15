package p000;

/* renamed from: akya */
final /* synthetic */ class akya implements aubt {

    /* renamed from: a */
    private final akyf f73094a;

    /* renamed from: b */
    private final int f73095b;

    public akya(akyf akyf, int i) {
        this.f73094a = akyf;
        this.f73095b = i;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        akyf akyf = this.f73094a;
        int i = this.f73095b;
        akyf.f73106d.mo25418e("Connection failed: %s", exc.getMessage());
        akyf.m60676a(akyf.f73109b, i);
    }
}
