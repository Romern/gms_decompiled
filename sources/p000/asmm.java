package p000;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.FirstPartyTokenizePanRequest;

/* renamed from: asmm */
public final /* synthetic */ class asmm implements roo {

    /* renamed from: a */
    private final String f89250a;

    /* renamed from: b */
    private final Activity f89251b;

    public asmm(String str, Activity activity) {
        this.f89250a = str;
        this.f89251b = activity;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        String str = this.f89250a;
        Activity activity = this.f89251b;
        asxx asxx = new asxx();
        asxx.mo49647a(str);
        FirstPartyTokenizePanRequest firstPartyTokenizePanRequest = asxx.f89900a;
        firstPartyTokenizePanRequest.f108528b = false;
        firstPartyTokenizePanRequest.f108529c = null;
        asxx.mo49649a((byte[]) null);
        asxx.mo49648a(false);
        FirstPartyTokenizePanRequest firstPartyTokenizePanRequest2 = asxx.f89900a;
        firstPartyTokenizePanRequest2.f108532f = null;
        firstPartyTokenizePanRequest2.f108533g = false;
        asxx.mo49651b(false);
        ((aswj) ((aswp) obj).mo25289B()).mo49557a(asxx.f89900a, new aswo(activity, 1300));
        rpc.m34201a(Status.f30107a, (aucf) obj2);
    }
}
