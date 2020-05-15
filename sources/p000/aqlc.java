package p000;

import com.google.android.gms.signin.activity.ConsentChimeraActivity;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;

/* renamed from: aqlc */
public final /* synthetic */ class aqlc implements bmxj {

    /* renamed from: a */
    private final ConsentChimeraActivity f86325a;

    public aqlc(ConsentChimeraActivity consentChimeraActivity) {
        this.f86325a = consentChimeraActivity;
    }

    public final Object apply(Object obj) {
        ConsentChimeraActivity consentChimeraActivity = this.f86325a;
        String str = ((RecordConsentByConsentResultResponse) obj).f107703b;
        bmxy.m108581a(str);
        consentChimeraActivity.mo58976a(str);
        return bmvz.f131120a;
    }
}
