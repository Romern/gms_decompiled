package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akgm */
final /* synthetic */ class akgm implements Runnable {

    /* renamed from: a */
    private final akgn f71880a;

    /* renamed from: b */
    private final long f71881b;

    /* renamed from: c */
    private final ajud f71882c;

    /* renamed from: d */
    private final ShareTarget f71883d;

    /* renamed from: e */
    private final akdd f71884e;

    public akgm(akgn akgn, long j, ajud ajud, ShareTarget shareTarget, akdd akdd) {
        this.f71880a = akgn;
        this.f71881b = j;
        this.f71882c = ajud;
        this.f71883d = shareTarget;
        this.f71884e = akdd;
    }

    public final void run() {
        akgn akgn = this.f71880a;
        long j = this.f71881b;
        ajud ajud = this.f71882c;
        ShareTarget shareTarget = this.f71883d;
        akdd akdd = this.f71884e;
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgn", "a", 4494, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68423a("%s alarm timed out after %d ms. Closing connection.", akgn.f71885a, j);
        ajud.mo38711a(shareTarget, new ajub(10).mo38916a());
        akdd.mo39253b();
    }
}
