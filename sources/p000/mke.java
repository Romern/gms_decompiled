package p000;

/* renamed from: mke */
final /* synthetic */ class mke implements Runnable {

    /* renamed from: a */
    private final mkh f33878a;

    public mke(mkh mkh) {
        this.f33878a = mkh;
    }

    public final void run() {
        mkh mkh = this.f33878a;
        lvn lvn = mkj.f33889a;
        sdo.m34970a(!mkh.f33885d);
        mkh.f33885d = true;
        mkj.f33889a.mo25416d("Something bad happened. Sending error over the wire.", new Object[0]);
        mkh.f33884c.mo20024a(2);
    }
}
