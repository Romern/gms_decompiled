package p000;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.ShowSecurityPromptRequest;

/* renamed from: asxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asxf extends asio {

    /* renamed from: a */
    final /* synthetic */ Activity f89879a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asxf(rkb rkb, Activity activity) {
        super(rkb);
        this.f89879a = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((aswj) ((aswp) rjd).mo25289B()).mo49581a(new ShowSecurityPromptRequest(), new aswo(this.f89879a, 1400));
        mo17716a((rkk) Status.f30107a);
    }
}
