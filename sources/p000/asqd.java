package p000;

import android.graphics.drawable.Icon;
import android.service.quickaccesswallet.GetWalletCardsCallback;
import android.service.quickaccesswallet.GetWalletCardsError;
import android.service.quickaccesswallet.GetWalletCardsRequest;
import android.service.quickaccesswallet.GetWalletCardsResponse;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.globalactions.GlobalActionCard;
import java.util.Arrays;

/* renamed from: asqd */
final /* synthetic */ class asqd implements Runnable {

    /* renamed from: a */
    private final asqi f89379a;

    /* renamed from: b */
    private final GetWalletCardsRequest f89380b;

    /* renamed from: c */
    private final GetWalletCardsCallback f89381c;

    public asqd(asqi asqi, GetWalletCardsRequest getWalletCardsRequest, GetWalletCardsCallback getWalletCardsCallback) {
        this.f89379a = asqi;
        this.f89380b = getWalletCardsRequest;
        this.f89381c = getWalletCardsCallback;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, asqi], assign insn: 0x0000: IGET  (r0v0 ? I:asqi) = (r13v0 'this' asqd A[THIS]) asqd.a asqi */
    public final void run() {
        ? r0 = this.f89379a;
        GetWalletCardsRequest getWalletCardsRequest = this.f89380b;
        asqh asqh = new asqh(this.f89381c);
        try {
            GetGlobalActionCardsResponse a = r0.f89389c.mo49358a(askg.m74283b(r0, null), getWalletCardsRequest.getCardWidthPx(), getWalletCardsRequest.getCardHeightPx(), getWalletCardsRequest.getIconSizePx(), getWalletCardsRequest.getMaxCards());
            GlobalActionCard[] globalActionCardArr = a.f108504a;
            if (globalActionCardArr.length == 0) {
                bnsl bnsl = (bnsl) asqi.f89387a.mo68388c();
                bnsl.mo68432a("asqi", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("getWalletCards: feature disabled");
                asqh.mo49368a(new GetWalletCardsError((Icon) null, r0.f89389c.mo49363f()));
                return;
            }
            asqh.f89386a.onSuccess(new GetWalletCardsResponse(bnkn.m109668a(Arrays.asList(globalActionCardArr), asqg.f89385a), a.f108505b));
        } catch (Exception e) {
            bnsl bnsl2 = (bnsl) asqi.f89387a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("asqi", "a", 133, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("getWalletCards: error");
            asqh.mo49368a(new GetWalletCardsError((Icon) null, r0.f89389c.mo49363f()));
        }
    }
}
