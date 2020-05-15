package p000;

/* renamed from: akdu */
final /* synthetic */ class akdu implements Runnable {

    /* renamed from: a */
    private final akdv f71676a;

    /* renamed from: b */
    private final long f71677b;

    public akdu(akdv akdv, long j) {
        this.f71676a = akdv;
        this.f71677b = j;
    }

    public final void run() {
        akdv akdv = this.f71676a;
        long j = this.f71677b;
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akdv", "a", 851, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68425a("%s timed out for endpoint %s after %d ms.", "TransferManagerTimeoutAlarm", akdv.f71678a, Long.valueOf(j));
        akdv.mo39276b();
    }
}
