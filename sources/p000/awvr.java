package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvr extends awpe {

    /* renamed from: b */
    final /* synthetic */ blxw f95177b;

    /* renamed from: c */
    final /* synthetic */ awvy f95178c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvr(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, blxw blxw) {
        super(buyFlowConfig, account);
        this.f95178c = awvy;
        this.f95177b = blxw;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        blzf blzf = this.f95177b.f128157d;
        if (blzf == null) {
            blzf = blzf.f128337k;
        }
        blzq blzq = blzf.f128346i;
        if (blzq == null) {
            blzq = blzq.f128364p;
        }
        if ((blzq.f128366a & 16) == 0) {
            return this.f95178c.mo52651a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/buyflowservice/initialize"), bjev, this.f95177b, 33);
        }
        awvy awvy = this.f95178c;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 62);
        sb.append(b);
        sb.append("/payments/apis-secure/buyflowservice/initialize?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95177b, awvy.f95194a, 33);
    }
}
