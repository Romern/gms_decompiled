package p000;

/* renamed from: cias */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cias implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cibi f189680a;

    public cias(cibi cibi) {
        this.f189680a = cibi;
    }

    public final void run() {
        if (this.f189680a.f189723n.f189033a == chrg.TRANSIENT_FAILURE) {
            this.f189680a.mo85902e();
            this.f189680a.f189713d.mo85552a(2, "CONNECTING; backoff interrupted");
            this.f189680a.mo85896a(chrg.CONNECTING);
            this.f189680a.mo85900c();
        }
    }
}
