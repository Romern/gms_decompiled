package p000;

/* renamed from: bfss */
final /* synthetic */ class bfss implements Runnable {

    /* renamed from: a */
    private final bfta f115161a;

    /* renamed from: b */
    private final boolean f115162b;

    /* renamed from: c */
    private final String f115163c;

    public bfss(bfta bfta, boolean z, String str) {
        this.f115161a = bfta;
        this.f115162b = z;
        this.f115163c = str;
    }

    public final void run() {
        bfta bfta = this.f115161a;
        bfta.f115172d.mo62221a(this.f115162b, this.f115163c);
    }
}
