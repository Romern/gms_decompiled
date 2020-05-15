package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akft */
final /* synthetic */ class akft implements Runnable {

    /* renamed from: a */
    private final akgy f71829a;

    /* renamed from: b */
    private final ajud f71830b;

    /* renamed from: c */
    private final ShareTarget f71831c;

    public akft(akgy akgy, ajud ajud, ShareTarget shareTarget) {
        this.f71829a = akgy;
        this.f71830b = ajud;
        this.f71831c = shareTarget;
    }

    public final void run() {
        akgy akgy = this.f71829a;
        ajud ajud = this.f71830b;
        ShareTarget shareTarget = this.f71831c;
        ajud.mo38711a(shareTarget, new ajub(7).mo38916a());
        akgy.mo39429s(shareTarget);
    }
}
