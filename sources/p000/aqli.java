package p000;

import com.google.android.gms.signin.activity.ConsentChimeraActivity;

/* renamed from: aqli */
final /* synthetic */ class aqli implements bmxj {

    /* renamed from: a */
    private final ConsentChimeraActivity f86334a;

    public aqli(ConsentChimeraActivity consentChimeraActivity) {
        this.f86334a = consentChimeraActivity;
    }

    public final Object apply(Object obj) {
        ConsentChimeraActivity consentChimeraActivity = this.f86334a;
        consentChimeraActivity.f107662f.mo33293a((Object) 500);
        switch (((adak) obj).f61209a) {
            case 2:
            case 7:
            case 8:
                consentChimeraActivity.mo58973a(5, "Unexpected server error");
                return bmvz.f131120a;
            case 3:
                consentChimeraActivity.mo58973a(3, "Network error");
                return bmvz.f131120a;
            case 4:
                consentChimeraActivity.mo58973a(3, "App installation failure");
                return bmvz.f131120a;
            case 5:
            case 9:
                consentChimeraActivity.mo58973a(6, "Device management not supported");
                return bmvz.f131120a;
            case 6:
            case 10:
                consentChimeraActivity.mo58973a(4, "User canceled");
                return bmvz.f131120a;
            default:
                return bmxv.m108566b(0);
        }
    }
}
