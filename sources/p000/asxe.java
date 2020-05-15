package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.DeleteTokenRequest;

/* renamed from: asxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asxe extends asio {

    /* renamed from: a */
    final /* synthetic */ String f89878a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asxe(rkb rkb, String str) {
        super(rkb);
        this.f89878a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        asxv asxv = new asxv(this);
        ((aswj) ((aswp) rjd).mo25289B()).mo49554a(new DeleteTokenRequest(this.f89878a), asxv);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return status;
    }
}
