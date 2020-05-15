package p000;

/* renamed from: wsx */
final /* synthetic */ class wsx implements Runnable {

    /* renamed from: a */
    private final wtd f51271a;

    /* renamed from: b */
    private final boolean f51272b;

    public wsx(wtd wtd, boolean z) {
        this.f51271a = wtd;
        this.f51272b = z;
    }

    public final void run() {
        wtd wtd = this.f51271a;
        boolean z = this.f51272b;
        wtd.f51281d.setEnabled(true);
        wtd.f51281d.setChecked(z);
    }
}
