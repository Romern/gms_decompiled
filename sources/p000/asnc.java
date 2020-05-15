package p000;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.AddOtherPaymentOptionRequest;

/* renamed from: asnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asnc extends rpa {

    /* renamed from: a */
    final /* synthetic */ String f89267a;

    /* renamed from: b */
    final /* synthetic */ Activity f89268b;

    /* renamed from: c */
    final /* synthetic */ int f89269c;

    public asnc(String str, Activity activity, int i) {
        this.f89267a = str;
        this.f89268b = activity;
        this.f89269c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11798a(rjd rjd, aucf aucf) {
        ((aswj) ((aswp) rjd).mo25289B()).mo49553a(new AddOtherPaymentOptionRequest(2, this.f89267a), new aswo(this.f89268b, this.f89269c));
        rpc.m34201a(Status.f30107a, aucf);
    }
}
