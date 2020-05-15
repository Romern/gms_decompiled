package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.EnablePayOnWearRequest;

/* renamed from: asxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asxc extends asio {

    /* renamed from: a */
    final /* synthetic */ long f89877a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asxc(rkb rkb, long j) {
        super(rkb);
        this.f89877a = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        asxr asxr = new asxr(this);
        ((aswj) ((aswp) rjd).mo25289B()).mo49556a(new EnablePayOnWearRequest(this.f89877a), asxr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return status;
    }
}
