package p000;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* renamed from: idj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class idj implements C1085ip {

    /* renamed from: a */
    final /* synthetic */ SignInHubActivity f20756a;

    public idj(SignInHubActivity signInHubActivity) {
        this.f20756a = signInHubActivity;
    }

    /* renamed from: a */
    public final C1140ko mo8606a(int i, Bundle bundle) {
        return new ico(this.f20756a, rkb.m33818a());
    }

    /* renamed from: a */
    public final void mo8607a(C1140ko koVar) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8608a(C1140ko koVar, Object obj) {
        Void voidR = (Void) obj;
        SignInHubActivity signInHubActivity = this.f20756a;
        signInHubActivity.setResult(signInHubActivity.f10354k, signInHubActivity.f10355l);
        this.f20756a.finish();
    }
}
