package p000;

/* renamed from: nka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nka implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f35878a;

    /* renamed from: b */
    final /* synthetic */ nkq f35879b;

    public nka(nkq nkq, Runnable runnable) {
        this.f35879b = nkq;
        this.f35878a = runnable;
    }

    public final void run() {
        bnsn bnsn = nkq.f35898a;
        nkq nkq = this.f35879b;
        if (nkq.f35907i) {
            return;
        }
        if (nkq.f35905g == null) {
            bnsi b = nkq.f35898a.mo68387b();
            b.mo68432a("nka", "run", 336, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("handleIncomingMessage: Channel not established yet");
        } else if (nkq.f35900b != 0) {
            bnsi b2 = nkq.f35898a.mo68387b();
            b2.mo68432a("nka", "run", 340, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68405a("handleIncomingMessage: Service not initialized");
        } else {
            this.f35878a.run();
        }
    }
}
