package p000;

/* renamed from: albd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class albd extends Thread {
    public final void run() {
        super.run();
        while (true) {
            try {
                albe albe = (albe) albe.f73255a.takeFirst();
                albe.f73257b.acquire();
                alcn alcn = albe.f73262g.f73297f;
                albe.f73259d = alcn.mo40129a(albe.f73260e, (alcn.f73474b - albe.f73261f) - 1).f73472a;
                albe.f73258c.mo40055a();
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
