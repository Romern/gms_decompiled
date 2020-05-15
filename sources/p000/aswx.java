package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.IsDeviceUnlockedForInAppPaymentRequest;

/* renamed from: aswx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aswx extends asio {

    /* renamed from: a */
    final /* synthetic */ String f89872a;

    /* renamed from: b */
    final /* synthetic */ String f89873b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aswx(rkb rkb, String str, String str2) {
        super(rkb);
        this.f89872a = str;
        this.f89873b = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        asxq asxq = new asxq(this);
        ((aswj) ((aswp) rjd).mo25289B()).mo49567a(new IsDeviceUnlockedForInAppPaymentRequest(this.f89872a, this.f89873b), asxq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new rjr(status, false);
    }
}
