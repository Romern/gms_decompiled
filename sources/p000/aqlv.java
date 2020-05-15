package p000;

import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

/* renamed from: aqlv */
public final /* synthetic */ class aqlv implements bmxj {

    /* renamed from: a */
    private final ConsentChimeraActivity f86348a;

    public aqlv(ConsentChimeraActivity consentChimeraActivity) {
        this.f86348a = consentChimeraActivity;
    }

    public final Object apply(Object obj) {
        ConsentChimeraActivity consentChimeraActivity = this.f86348a;
        bmxv bmxv = (bmxv) obj;
        if (bmxv.mo66813a()) {
            consentChimeraActivity.f107668l = new ConsentResult(izj.SUCCESS, iyb.GRANTED, (String) bmxv.mo66814b());
            return bmxv.m108566b(400);
        }
        consentChimeraActivity.mo58973a(4, "");
        return bmvz.f131120a;
    }
}
