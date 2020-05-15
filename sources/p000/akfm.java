package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akfm */
final /* synthetic */ class akfm implements Runnable {

    /* renamed from: a */
    private final akgy f71806a;

    /* renamed from: b */
    private final ajud f71807b;

    /* renamed from: c */
    private final ShareTarget f71808c;

    public akfm(akgy akgy, ajud ajud, ShareTarget shareTarget) {
        this.f71806a = akgy;
        this.f71807b = ajud;
        this.f71808c = shareTarget;
    }

    public final void run() {
        akgy akgy = this.f71806a;
        ajud ajud = this.f71807b;
        ShareTarget shareTarget = this.f71808c;
        ajud.mo38711a(shareTarget, new ajub(7).mo38916a());
        akgy.f71950q.mo39242a(shareTarget);
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgy", "a", 1579, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Failed to connect to %s", shareTarget);
    }
}
