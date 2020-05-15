package p000;

/* renamed from: buqi */
final /* synthetic */ class buqi implements Runnable {

    /* renamed from: a */
    private final buqm f154704a;

    /* renamed from: b */
    private final buqn f154705b;

    public buqi(buqm buqm, buqn buqn) {
        this.f154704a = buqm;
        this.f154705b = buqn;
    }

    public final void run() {
        buqm buqm = this.f154704a;
        buqm.f154713c.getLooper().getQueue().addIdleHandler(new buqj(buqm, this.f154705b));
    }
}
