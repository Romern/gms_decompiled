package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akfw */
final /* synthetic */ class akfw implements Runnable {

    /* renamed from: a */
    private final akgy f71837a;

    /* renamed from: b */
    private final ajud f71838b;

    /* renamed from: c */
    private final ShareTarget f71839c;

    public akfw(akgy akgy, ajud ajud, ShareTarget shareTarget) {
        this.f71837a = akgy;
        this.f71838b = ajud;
        this.f71839c = shareTarget;
    }

    public final void run() {
        akgy akgy = this.f71837a;
        ajud ajud = this.f71838b;
        ShareTarget shareTarget = this.f71839c;
        ajud.mo38711a(shareTarget, new ajub(4).mo38916a());
        akgy.mo39429s(shareTarget);
    }
}
