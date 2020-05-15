package p000;

import java.util.Map;

/* renamed from: akyi */
final /* synthetic */ class akyi implements Runnable {

    /* renamed from: a */
    private final akyn f73118a;

    /* renamed from: b */
    private final int f73119b;

    /* renamed from: c */
    private final Map f73120c;

    public akyi(akyn akyn, int i, Map map) {
        this.f73118a = akyn;
        this.f73119b = i;
        this.f73120c = map;
    }

    public final void run() {
        akyn akyn = this.f73118a;
        akyn.f73125a.mo39985a(this.f73119b, this.f73120c);
    }
}
