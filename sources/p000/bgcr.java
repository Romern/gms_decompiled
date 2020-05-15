package p000;

import java.util.Set;

/* renamed from: bgcr */
final /* synthetic */ class bgcr implements Runnable {

    /* renamed from: a */
    private final bgcz f116065a;

    /* renamed from: b */
    private final Set f116066b;

    public bgcr(bgcz bgcz, Set set) {
        this.f116065a = bgcz;
        this.f116066b = set;
    }

    public final void run() {
        bgcz bgcz = this.f116065a;
        bgcz.mo62660a(this.f116066b);
        bgcz.f116088d = true;
    }
}
