package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

/* renamed from: aqlr */
public final /* synthetic */ class aqlr implements bmxj {

    /* renamed from: a */
    private final ConsentChimeraActivity f86344a;

    public aqlr(ConsentChimeraActivity consentChimeraActivity) {
        this.f86344a = consentChimeraActivity;
    }

    public final Object apply(Object obj) {
        ConsentChimeraActivity consentChimeraActivity = this.f86344a;
        TokenResponse tokenResponse = (TokenResponse) obj;
        consentChimeraActivity.f107662f.mo33293a((Object) 0);
        ConsentChimeraActivity.f107656b.mo25409a("Token response: %s.", tokenResponse.mo7647b().f22000ac);
        consentChimeraActivity.f107667k = tokenResponse;
        izj izj = izj.CLIENT_LOGIN_DISABLED;
        int ordinal = tokenResponse.mo7647b().ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                consentChimeraActivity.mo58976a(tokenResponse.f10727d);
                return bmvz.f131120a;
            } else if (ordinal == 5) {
                consentChimeraActivity.mo58973a(3, "Network error");
                return bmvz.f131120a;
            } else if (ordinal == 6) {
                consentChimeraActivity.mo58973a(4, "Service unavailable");
                return bmvz.f131120a;
            } else if (ordinal == 7) {
                consentChimeraActivity.mo58973a(4, "Internal error");
                return bmvz.f131120a;
            } else if (ordinal == 8) {
                return bmxv.m108566b(100);
            } else {
                if (ordinal == 20) {
                    return bmxv.m108566b(300);
                }
                if (ordinal == 21) {
                    return bmxv.m108566b(Integer.valueOf((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR));
                }
                switch (ordinal) {
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 35:
                        break;
                    case 34:
                        return bmxv.m108566b(501);
                    default:
                        consentChimeraActivity.mo58973a(4, "Unknown error");
                        return bmvz.f131120a;
                }
            }
        }
        return bmxv.m108566b(500);
    }
}
