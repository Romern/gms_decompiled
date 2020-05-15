package p000;

import com.google.android.gms.tapandpay.issuer.RequestDeleteTokenChimeraActivity;

/* renamed from: aszg */
public final /* synthetic */ class aszg implements aubq {

    /* renamed from: a */
    private final RequestDeleteTokenChimeraActivity f89914a;

    public aszg(RequestDeleteTokenChimeraActivity requestDeleteTokenChimeraActivity) {
        this.f89914a = requestDeleteTokenChimeraActivity;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        RequestDeleteTokenChimeraActivity requestDeleteTokenChimeraActivity = this.f89914a;
        if (aucb.mo50384b()) {
            requestDeleteTokenChimeraActivity.setResult(-1);
        } else {
            requestDeleteTokenChimeraActivity.setResult(0);
        }
        requestDeleteTokenChimeraActivity.finish();
    }
}
