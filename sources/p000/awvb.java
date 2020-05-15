package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.EmbeddedSettingsSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvb extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwji f95132b;

    /* renamed from: c */
    final /* synthetic */ EmbeddedSettingsSubmitRequest f95133c;

    /* renamed from: e */
    final /* synthetic */ awvy f95134e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvb(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwji bwji, EmbeddedSettingsSubmitRequest embeddedSettingsSubmitRequest) {
        super(buyFlowConfig, account);
        this.f95134e = awvy;
        this.f95132b = bwji;
        this.f95133c = embeddedSettingsSubmitRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awvy awvy = this.f95134e;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 67);
        sb.append(b);
        sb.append("/payments/apis-secure/embeddedsettingsservice/submit?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95132b, this.f95133c.f110329c, 65);
    }
}
