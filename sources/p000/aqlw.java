package p000;

import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

/* renamed from: aqlw */
public final /* synthetic */ class aqlw implements bmxj {

    /* renamed from: a */
    private final ConsentChimeraActivity f86349a;

    public aqlw(ConsentChimeraActivity consentChimeraActivity) {
        this.f86349a = consentChimeraActivity;
    }

    public final Object apply(Object obj) {
        ConsentChimeraActivity consentChimeraActivity = this.f86349a;
        adak adak = (adak) obj;
        if (adak.f61209a == -1) {
            if (adak.f61210b.hasExtra(ConsentResult.f10615a)) {
                adak.f61210b.setExtrasClassLoader(ConsentResult.class.getClassLoader());
                consentChimeraActivity.f107668l = (ConsentResult) adak.f61210b.getParcelableExtra(ConsentResult.f10615a);
            } else if (adak.f61210b.hasExtra("consent")) {
                String stringExtra = adak.f61210b.getStringExtra("consent");
                bmxy.m108581a(stringExtra);
                iyb a = iyb.m16329a(stringExtra);
                consentChimeraActivity.f107668l = new ConsentResult(a != iyb.GRANTED ? izj.PERMISSION_DENIED : izj.SUCCESS, null, null, a, consentChimeraActivity.f107665i.f10721q);
            } else {
                String stringExtra2 = adak.f61210b.getStringExtra("com.google.android.gsf.notouch.GrantCredentialsWithAclNoTouchActivity.consent");
                bmxy.m108581a(stringExtra2);
                iyb a2 = iyb.m16329a(stringExtra2);
                consentChimeraActivity.f107668l = new ConsentResult(a2 != iyb.GRANTED ? izj.PERMISSION_DENIED : izj.SUCCESS, adak.f61210b.getStringExtra("com.google.android.gsf.notouch.GrantCredentialsWithAclNoTouchActivity.pacl"), (FACLConfig) adak.f61210b.getParcelableExtra("com.google.android.gsf.notouch.GrantCredentialsWithAclNoTouchActivity.facl"), a2, consentChimeraActivity.f107665i.f10721q);
            }
            return bmxv.m108566b(400);
        }
        consentChimeraActivity.mo58973a(4, "");
        return bmvz.f131120a;
    }
}
