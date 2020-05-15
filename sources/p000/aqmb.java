package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: aqmb */
public final /* synthetic */ class aqmb implements bmxj {

    /* renamed from: a */
    public static final bmxj f86354a = new aqmb();

    private aqmb() {
    }

    public final Object apply(Object obj) {
        Logger Logger = SignInChimeraActivity.f107676b;
        if (!((Status) obj).mo17710c()) {
            SignInChimeraActivity.f107676b.mo25416d("Failed to record the consent.", new Object[0]);
        }
        return bmxv.m108566b(4);
    }
}
