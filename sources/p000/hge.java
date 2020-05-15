package p000;

import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hge */
final /* synthetic */ class hge implements Runnable {

    /* renamed from: a */
    private final hgj f19698a;

    public hge(hgj hgj) {
        this.f19698a = hgj;
    }

    public final void run() {
        this.f19698a.mo12455a(new hgk(Status.f30107a, bmxv.m108566b(new SaveAccountLinkingTokenResult(null))));
    }
}
