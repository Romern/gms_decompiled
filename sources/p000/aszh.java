package p000;

import com.google.android.gms.tapandpay.issuer.RequestSelectTokenChimeraActivity;

/* renamed from: aszh */
public final /* synthetic */ class aszh implements aubq {

    /* renamed from: a */
    private final RequestSelectTokenChimeraActivity f89915a;

    public aszh(RequestSelectTokenChimeraActivity requestSelectTokenChimeraActivity) {
        this.f89915a = requestSelectTokenChimeraActivity;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        RequestSelectTokenChimeraActivity requestSelectTokenChimeraActivity = this.f89915a;
        if (aucb.mo50384b()) {
            requestSelectTokenChimeraActivity.setResult(-1);
        } else {
            requestSelectTokenChimeraActivity.setResult(0);
        }
        requestSelectTokenChimeraActivity.finish();
    }
}
