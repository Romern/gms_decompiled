package p000;

/* renamed from: gdz */
final /* synthetic */ class gdz implements Runnable {

    /* renamed from: a */
    private final gec f17990a;

    /* renamed from: b */
    private final int f17991b;

    public gdz(gec gec, int i) {
        this.f17990a = gec;
        this.f17991b = i;
    }

    public final void run() {
        gec gec = this.f17990a;
        int i = this.f17991b;
        srn srn = gdv.f17985a;
        if (i == 0) {
            gec.f18016j = false;
            gec.mo11723c();
        } else if (i == 1 || i == 2) {
            gec.f18016j = true;
            gec.mo11723c();
        }
    }
}
