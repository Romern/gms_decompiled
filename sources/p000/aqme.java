package p000;

import android.content.Intent;
import com.google.android.gms.signin.activity.SignInChimeraActivity;
import com.google.android.gms.signin.internal.AuthAccountResult;

/* renamed from: aqme */
public final /* synthetic */ class aqme implements bmxj {

    /* renamed from: a */
    private final SignInChimeraActivity f86357a;

    public aqme(SignInChimeraActivity signInChimeraActivity) {
        this.f86357a = signInChimeraActivity;
    }

    public final Object apply(Object obj) {
        SignInChimeraActivity signInChimeraActivity = this.f86357a;
        AuthAccountResult authAccountResult = (AuthAccountResult) obj;
        if (authAccountResult.mo7183bo().mo17710c()) {
            return bmxv.m108566b(6);
        }
        Intent intent = authAccountResult.f107697c;
        if (intent != null) {
            signInChimeraActivity.f107687k = intent;
            return bmxv.m108566b(5);
        }
        Intent intent2 = new Intent();
        intent2.putExtra("<<ResolutionFailureErrorDetail>>", authAccountResult.f107696b);
        signInChimeraActivity.mo58979a(0, intent2);
        return bmvz.f131120a;
    }
}
