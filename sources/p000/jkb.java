package p000;

/* renamed from: jkb */
final /* synthetic */ class jkb implements Runnable {

    /* renamed from: a */
    private final jkc f22669a;

    /* renamed from: b */
    private final jke f22670b;

    /* renamed from: c */
    private final bluu f22671c;

    public jkb(jkc jkc, jke jke, bluu bluu) {
        this.f22669a = jkc;
        this.f22670b = jke;
        this.f22671c = bluu;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        return;
     */
    public final void run() {
        jkc jkc = this.f22669a;
        jke jke = this.f22670b;
        bluu bluu = this.f22671c;
        synchronized (jke.f22683e) {
            jke.mo13828h();
            jta a = jsz.m17257a();
            if (jke.f22691m == 0) {
                jke.f22679a.mo25418e("Channel was disconnected when write finished; cannot proceed.", new Object[0]);
                a.mo14052h(2);
            } else if (bluu.mo66725b()) {
                a.mo14052h(0);
                a.mo14044a(jkc.f22675d);
                Runnable runnable = jkc.f22673b;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                a.mo14052h(1);
                jke.f22679a.mo25417e(jkc.f22672a, bluu.f127832a, new Object[0]);
                jke.mo13827g();
                if (jke.mo13825e() != 3) {
                    if (!jkc.f22674c) {
                        a.mo14049e(6);
                    } else {
                        a.mo14050f(7);
                    }
                }
            }
        }
    }
}
