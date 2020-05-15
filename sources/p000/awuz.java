package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.TimelineViewSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awuz extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwkt f95127b;

    /* renamed from: c */
    final /* synthetic */ TimelineViewSubmitRequest f95128c;

    /* renamed from: e */
    final /* synthetic */ awvy f95129e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awuz(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwkt bwkt, TimelineViewSubmitRequest timelineViewSubmitRequest) {
        super(buyFlowConfig, account);
        this.f95129e = awvy;
        this.f95127b = bwkt;
        this.f95128c = timelineViewSubmitRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awvy awvy = this.f95129e;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 56);
        sb.append(b);
        sb.append("/payments/apis-secure/timelineview/submit?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95127b, this.f95128c.f110329c, 63);
    }
}
