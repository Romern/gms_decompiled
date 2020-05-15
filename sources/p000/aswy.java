package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.ReportInAppTransactionCompletedRequest;

/* renamed from: aswy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aswy extends asio {
    public aswy(rkb rkb) {
        super(rkb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        asxm asxm = new asxm(this);
        ((aswj) ((aswp) rjd).mo25289B()).mo49572a(new ReportInAppTransactionCompletedRequest(), asxm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return status;
    }
}
