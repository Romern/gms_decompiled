package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.UserManagementSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvd extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwlh f95137b;

    /* renamed from: c */
    final /* synthetic */ UserManagementSubmitRequest f95138c;

    /* renamed from: e */
    final /* synthetic */ awvy f95139e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvd(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwlh bwlh, UserManagementSubmitRequest userManagementSubmitRequest) {
        super(buyFlowConfig, account);
        this.f95139e = awvy;
        this.f95137b = bwlh;
        this.f95138c = userManagementSubmitRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awvy awvy = this.f95139e;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 65);
        sb.append(b);
        sb.append("/payments/apis-secure/usermanagementservice/submit?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95137b, this.f95138c.f110329c, 67);
    }
}
