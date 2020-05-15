package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.p087ow.CreateWalletObjectsServiceRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awxb extends awpe {

    /* renamed from: b */
    final /* synthetic */ CreateWalletObjectsServiceRequest f95218b;

    /* renamed from: c */
    final /* synthetic */ BuyFlowConfig f95219c;

    /* renamed from: e */
    final /* synthetic */ awxc f95220e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awxb(awxc awxc, BuyFlowConfig buyFlowConfig, Account account, CreateWalletObjectsServiceRequest createWalletObjectsServiceRequest, BuyFlowConfig buyFlowConfig2) {
        super(buyFlowConfig, account);
        this.f95220e = awxc;
        this.f95218b = createWalletObjectsServiceRequest;
        this.f95219c = buyFlowConfig2;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        String str;
        CreateWalletObjectsServiceRequest createWalletObjectsServiceRequest = this.f95218b;
        if (createWalletObjectsServiceRequest.f110391b == null) {
            createWalletObjectsServiceRequest.f110391b = (btro) bjvp.m104733a(createWalletObjectsServiceRequest.f110392c, (bxxk) btro.f150127e.mo74142c(7));
        }
        btro btro = createWalletObjectsServiceRequest.f110391b;
        bxvd bxvd = (bxvd) btro.mo74142c(5);
        bxvd.mo73625a((bxvk) btro);
        btrn a = this.f95220e.f95222b.mo52470a(this.f95219c.f110419c);
        if (a == null) {
            return ServerResponse.f110426d;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        btro btro2 = btro.f150127e;
        a.getClass();
        ((btro) bxvd.f164949b).f150129a = a;
        awxi awxi = this.f95220e.f95221a;
        int i = this.f95219c.f110418b.f110406a;
        btro btro3 = (btro) bxvd.mo74062i();
        if (i == 0 || i == 2) {
            str = "https://sandbox.google.com";
        } else {
            str = i != 21 ? i != 22 ? "https://wallet.google.com" : "http://localhost:8889" : "https://wallet-web.sandbox.google.com/dev";
        }
        return (ServerResponse) awfs.m79870a(new awxh(awxi, str.concat("/payments/apis/instantbuy/android/v1/createWalletObjects"), bjev, btro3, i));
    }
}
