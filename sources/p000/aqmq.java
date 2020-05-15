package p000;

import com.google.android.gms.signin.activity.SignInChimeraActivity;
import java.io.IOException;

/* renamed from: aqmq */
public final /* synthetic */ class aqmq implements bmxj {

    /* renamed from: a */
    private final SignInChimeraActivity f86371a;

    public aqmq(SignInChimeraActivity signInChimeraActivity) {
        this.f86371a = signInChimeraActivity;
    }

    public final Object apply(Object obj) {
        SignInChimeraActivity signInChimeraActivity = this.f86371a;
        IOException iOException = (IOException) obj;
        if (((Boolean) aqnw.f86405f.mo58455c()).booleanValue()) {
            SignInChimeraActivity.f107676b.mo25414c("Couldn't fetch app's branding information, but continuing without it.", new Object[0]);
            return bmxv.m108566b(2);
        }
        SignInChimeraActivity.f107676b.mo25417e("Errors encountered when trying to fetch app's branding information", iOException, new Object[0]);
        signInChimeraActivity.mo58979a(0, null);
        return bmvz.f131120a;
    }
}
