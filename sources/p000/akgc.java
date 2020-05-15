package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akgc */
final /* synthetic */ class akgc implements Runnable {

    /* renamed from: a */
    private final akgy f71852a;

    /* renamed from: b */
    private final String f71853b;

    public akgc(akgy akgy, String str) {
        this.f71852a = akgy;
        this.f71853b = str;
    }

    public final void run() {
        akgy akgy = this.f71852a;
        String str = this.f71853b;
        if (!akgy.mo39412i()) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "g", 1070, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Ignoring lost endpoint %s because we're no longer scanning", str);
            return;
        }
        ajsn ajsn = akgy.f71941h;
        akgy.f71934a.remove(str);
        ShareTarget d = akgy.mo39403d(str);
        if (d == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akgy", "g", 1079, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Ignoring lost endpoint %s because we don't have an associated ShareTarget", str);
            return;
        }
        ajsn.mo38709b(d);
        akgy.f71950q.mo39242a(d);
        bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl3.mo68432a("akgy", "g", 1086, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68420a("Reported onShareTargetLost for %s", d);
    }
}
