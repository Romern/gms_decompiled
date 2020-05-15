package p000;

/* renamed from: nya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nya implements Runnable {

    /* renamed from: a */
    final /* synthetic */ nyh f36911a;

    public nya(nyh nyh) {
        this.f36911a = nyh;
    }

    public final void run() {
        if (this.f36911a.f36935k != 8) {
            bnsi d = nyh.f36925a.mo68390d();
            d.mo68432a("nya", "run", 1045, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68409a("Dropping delayed HFP connecting event. Current state: %d", this.f36911a.f36935k);
            return;
        }
        bnsi d2 = nyh.f36925a.mo68390d();
        d2.mo68432a("nya", "run", 1050, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68405a("Executing delayed HFP connecting event.");
        this.f36911a.mo21835a();
    }
}
