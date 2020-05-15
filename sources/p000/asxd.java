package p000;

import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.android.gms.tapandpay.internal.firstparty.GetAllCardsRequest;

/* renamed from: asxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asxd extends asio {
    public asxd(rkb rkb) {
        super(rkb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        asxp asxp = new asxp(this);
        ((aswj) ((aswp) rjd).mo25289B()).mo49561a(new GetAllCardsRequest(true, null), asxp);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new asxk(status, new GetAllCardsResponse(null, null, null, null, new SparseArray(0)));
    }
}
