package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: brvl */
final /* synthetic */ class brvl implements Runnable {

    /* renamed from: a */
    private final brvn f143454a;

    public brvl(brvn brvn) {
        this.f143454a = brvn;
    }

    public final void run() {
        brvn brvn = this.f143454a;
        try {
            for (String str : brvn.f143463f.mo85653b()) {
                if (!brvn.f143468k.contains(str)) {
                    if (str.endsWith("-bin")) {
                        brvn.f143463f.mo85656d(chtn.m149536a(str, chtr.f189133a));
                    } else {
                        brvn.f143463f.mo85656d(chtn.m149535a(str, chtr.f189134b));
                    }
                }
            }
            brvp brvp = brvn.f143462e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            brvp.mo70021c();
        } catch (Throwable th) {
            bnsl bnsl = (bnsl) brvn.f143457a.mo68387b();
            bnsl.mo68437a(th);
            bnsl.mo68432a("brvn", "a", 334, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Could not write to cache");
        }
    }
}
