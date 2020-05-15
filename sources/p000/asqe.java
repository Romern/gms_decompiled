package p000;

import android.service.quickaccesswallet.SelectWalletCardRequest;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest;

/* renamed from: asqe */
final /* synthetic */ class asqe implements Runnable {

    /* renamed from: a */
    private final asqi f89382a;

    /* renamed from: b */
    private final SelectWalletCardRequest f89383b;

    public asqe(asqi asqi, SelectWalletCardRequest selectWalletCardRequest) {
        this.f89382a = asqi;
        this.f89383b = selectWalletCardRequest;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, asqi], assign insn: 0x0000: IGET  (r0v0 ? I:asqi) = (r9v0 'this' asqe A[THIS]) asqe.a asqi */
    public final void run() {
        ? r0 = this.f89382a;
        SelectWalletCardRequest selectWalletCardRequest = this.f89383b;
        try {
            askf b = askg.m74283b(r0, null);
            String[] split = TextUtils.split(selectWalletCardRequest.getCardId(), "::");
            if (split.length == 2) {
                r0.f89389c.mo49357a(b, new SelectGlobalActionCardRequest(Integer.parseInt(split[0]), split[1], asqi.f89388b));
                return;
            }
            bnsl bnsl = (bnsl) asqi.f89387a.mo68388c();
            bnsl.mo68432a("asqi", "a", (int) MfiClientException.TYPE_NO_ACCOUNT_INFO, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("couldn't parse card id");
        } catch (asks | NumberFormatException e) {
            bnsl bnsl2 = (bnsl) asqi.f89387a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("asqi", "a", 164, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("onWalletCardSelected: error");
        }
    }
}
