package p000;

/* renamed from: ciaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciaq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cibi f189678a;

    public ciaq(cibi cibi) {
        this.f189678a = cibi;
    }

    public final void run() {
        cibi cibi = this.f189678a;
        cibi.f189718i = null;
        cibi.f189713d.mo85552a(2, "CONNECTING after backoff");
        this.f189678a.mo85896a(chrg.CONNECTING);
        this.f189678a.mo85900c();
    }
}
