package p000;

import com.google.android.gms.signin.activity.SignInChimeraActivity;
import com.google.android.gms.signin.internal.RecordConsentRequest;

/* renamed from: aqmu */
public final /* synthetic */ class aqmu implements bmzi {

    /* renamed from: a */
    private final SignInChimeraActivity f86376a;

    /* renamed from: b */
    private final RecordConsentRequest f86377b;

    public aqmu(SignInChimeraActivity signInChimeraActivity, RecordConsentRequest recordConsentRequest) {
        this.f86376a = signInChimeraActivity;
        this.f86377b = recordConsentRequest;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        SignInChimeraActivity signInChimeraActivity = this.f86376a;
        RecordConsentRequest recordConsentRequest = this.f86377b;
        aqnv aqnv = signInChimeraActivity.f107691p;
        roz b = rpa.m34196b();
        b.f43472a = new aqno(recordConsentRequest);
        return adbb.m50100a(aqnv.mo24732b(b.mo24977a()));
    }
}
