package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetActiveCardsForAccountResponse;
import com.google.android.gms.tapandpay.internal.firstparty.GetActiveCardsForAccountRequest;

/* renamed from: asxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asxb extends asio {

    /* renamed from: a */
    final /* synthetic */ String f89876a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asxb(rkb rkb, String str) {
        super(rkb);
        this.f89876a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        asxo asxo = new asxo(this);
        ((aswj) ((aswp) rjd).mo25289B()).mo49559a(new GetActiveCardsForAccountRequest(this.f89876a), asxo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new asxj(status, new GetActiveCardsForAccountResponse(null));
    }
}
