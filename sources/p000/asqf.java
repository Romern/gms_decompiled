package p000;

import com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest;

/* renamed from: asqf */
final /* synthetic */ class asqf implements Runnable {

    /* renamed from: a */
    private final asqi f89384a;

    public asqf(asqi asqi) {
        this.f89384a = asqi;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, asqi], assign insn: 0x0000: IGET  (r0v0 ? I:asqi) = (r6v0 'this' asqf A[THIS]) asqf.a asqi */
    public final void run() {
        ? r0 = this.f89384a;
        try {
            r0.f89389c.mo49357a(askg.m74283b(r0, null), new SelectGlobalActionCardRequest(4, "", asqi.f89388b));
        } catch (asks e) {
            bnsl bnsl = (bnsl) asqi.f89387a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("asqi", "b", 175, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("onWalletCardSelected: error");
        }
    }
}
