package p000;

import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: aqmf */
public final /* synthetic */ class aqmf implements bmxj {

    /* renamed from: a */
    private final SignInChimeraActivity f86358a;

    public aqmf(SignInChimeraActivity signInChimeraActivity) {
        this.f86358a = signInChimeraActivity;
    }

    public final Object apply(Object obj) {
        SignInChimeraActivity signInChimeraActivity = this.f86358a;
        adak adak = (adak) obj;
        int i = adak.f61209a;
        if (i == -1) {
            return bmxv.m108566b(6);
        }
        signInChimeraActivity.mo58979a(i, adak.f61210b);
        return bmvz.f131120a;
    }
}
