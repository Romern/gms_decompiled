package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialRequest;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;

/* renamed from: asxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asxa extends asio {

    /* renamed from: a */
    final /* synthetic */ RetrieveInAppPaymentCredentialRequest f89875a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asxa(rkb rkb, RetrieveInAppPaymentCredentialRequest retrieveInAppPaymentCredentialRequest) {
        super(rkb);
        this.f89875a = retrieveInAppPaymentCredentialRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((aswj) ((aswp) rjd).mo25289B()).mo49548a(this.f89875a, new asxu(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new asxw(status, new RetrieveInAppPaymentCredentialResponse());
    }
}
