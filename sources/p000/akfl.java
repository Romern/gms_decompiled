package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akfl */
final /* synthetic */ class akfl implements Runnable {

    /* renamed from: a */
    private final akgy f71802a;

    /* renamed from: b */
    private final akgq f71803b;

    /* renamed from: c */
    private final ajud f71804c;

    /* renamed from: d */
    private final ShareTarget f71805d;

    public akfl(akgy akgy, akgq akgq, ajud ajud, ShareTarget shareTarget) {
        this.f71802a = akgy;
        this.f71803b = akgq;
        this.f71804c = ajud;
        this.f71805d = shareTarget;
    }

    public final void run() {
        akgy akgy = this.f71802a;
        akgq akgq = this.f71803b;
        ajud ajud = this.f71804c;
        ShareTarget shareTarget = this.f71805d;
        akgq.f71900g = false;
        ajud.mo38711a(shareTarget, new ajub(4).mo38916a());
        akgy.mo39429s(shareTarget);
    }
}
