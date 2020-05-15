package p000;

/* renamed from: osn */
final /* synthetic */ class osn implements Runnable {

    /* renamed from: a */
    private final osq f38330a;

    /* renamed from: b */
    private final int f38331b;

    /* renamed from: c */
    private final int f38332c;

    /* renamed from: d */
    private final String f38333d;

    public osn(osq osq, int i, int i2, String str) {
        this.f38330a = osq;
        this.f38331b = i;
        this.f38332c = i2;
        this.f38333d = str;
    }

    public final void run() {
        osq osq = this.f38330a;
        int i = this.f38331b;
        int i2 = this.f38332c;
        osq.f38340d.mo17418b(bpdn.m111806a(i), bpdo.m111808a(i2), this.f38333d);
    }
}
