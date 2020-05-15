package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.SetActiveAccountRequest;

/* renamed from: asxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asxg extends asio {

    /* renamed from: a */
    final /* synthetic */ String f89880a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asxg(rkb rkb, String str) {
        super(rkb);
        this.f89880a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        asxn asxn = new asxn(this);
        ((aswj) ((aswp) rjd).mo25289B()).mo49575a(new SetActiveAccountRequest(this.f89880a), asxn);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return status;
    }
}
