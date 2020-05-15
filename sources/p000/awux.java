package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.EmbeddedLandingPageSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awux extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwjc f95122b;

    /* renamed from: c */
    final /* synthetic */ EmbeddedLandingPageSubmitRequest f95123c;

    /* renamed from: e */
    final /* synthetic */ awvy f95124e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awux(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwjc bwjc, EmbeddedLandingPageSubmitRequest embeddedLandingPageSubmitRequest) {
        super(buyFlowConfig, account);
        this.f95124e = awvy;
        this.f95122b = bwjc;
        this.f95123c = embeddedLandingPageSubmitRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awvy awvy = this.f95124e;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 70);
        sb.append(b);
        sb.append("/payments/apis-secure/embeddedlandingpageservice/submit?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95122b, this.f95123c.f110329c, 61);
    }
}
