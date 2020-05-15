package p000;

import com.google.android.gms.signin.activity.SignInChimeraActivity;
import com.google.android.gms.signin.internal.RecordConsentRequest;

/* renamed from: aqmx */
public final /* synthetic */ class aqmx implements bmzi {

    /* renamed from: a */
    private final SignInChimeraActivity f86380a;

    /* renamed from: b */
    private final RecordConsentRequest f86381b;

    public aqmx(SignInChimeraActivity signInChimeraActivity, RecordConsentRequest recordConsentRequest) {
        this.f86380a = signInChimeraActivity;
        this.f86381b = recordConsentRequest;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        SignInChimeraActivity signInChimeraActivity = this.f86380a;
        RecordConsentRequest recordConsentRequest = this.f86381b;
        rkb rkb = signInChimeraActivity.f107688l;
        return adbb.m50102a(rkb.mo24787a((rle) new aqni(rkb, recordConsentRequest)));
    }
}
