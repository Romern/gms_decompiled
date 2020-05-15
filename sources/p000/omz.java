package p000;

/* renamed from: omz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class omz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ona f37984a;

    public omz(ona ona) {
        this.f37984a = ona;
    }

    public final void run() {
        ona ona = this.f37984a;
        bnsn bnsn = ona.f37985a;
        if (!ona.f37990f) {
            bnsi d = ona.f37985a.mo68390d();
            d.mo68432a("omz", "run", 28, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Detected charge only");
            ofd.m28611a(this.f37984a.f37986b, "com.google.android.gms.car.USB_ISSUE_FOUND", ofb.CHARGE_ONLY_DETECTED);
            this.f37984a.f37989e = true;
        }
    }
}
