package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: aqmk */
public final /* synthetic */ class aqmk implements bmxj {

    /* renamed from: a */
    private final SignInChimeraActivity f86365a;

    public aqmk(SignInChimeraActivity signInChimeraActivity) {
        this.f86365a = signInChimeraActivity;
    }

    public final Object apply(Object obj) {
        SignInChimeraActivity signInChimeraActivity = this.f86365a;
        if (!((Status) obj).mo17710c()) {
            SignInChimeraActivity.f107676b.mo25416d("Saving selected account failed. User probably need to re-select.", new Object[0]);
        }
        signInChimeraActivity.mo58979a(-1, null);
        return bmvz.f131120a;
    }
}
