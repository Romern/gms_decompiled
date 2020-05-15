package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akfo */
final /* synthetic */ class akfo implements Runnable {

    /* renamed from: a */
    private final akgy f71816a;

    /* renamed from: b */
    private final boolean f71817b;

    /* renamed from: c */
    private final String f71818c;

    /* renamed from: d */
    private final ShareTarget f71819d;

    /* renamed from: e */
    private final ajud f71820e;

    public akfo(akgy akgy, boolean z, String str, ShareTarget shareTarget, ajud ajud) {
        this.f71816a = akgy;
        this.f71817b = z;
        this.f71818c = str;
        this.f71819d = shareTarget;
        this.f71820e = ajud;
    }

    public final void run() {
        akgy akgy = this.f71816a;
        boolean z = this.f71817b;
        String str = this.f71818c;
        ShareTarget shareTarget = this.f71819d;
        ajud ajud = this.f71820e;
        if (!z) {
            ajud.mo38711a(shareTarget, new ajub(7).mo38916a());
            akgy.f71950q.mo39242a(shareTarget);
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "a", 1475, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to connect to outdated %s, because failed to discover the share target.", shareTarget);
            return;
        }
        akgy.mo39402c(str, shareTarget, ajud);
    }
}
