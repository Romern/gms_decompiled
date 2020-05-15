package p000;

import android.content.Intent;
import com.google.android.gms.smartdevice.setup.p066ui.AccountChallengeChimeraActivity;

/* renamed from: arwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arwn implements aubq {

    /* renamed from: a */
    final /* synthetic */ Intent f88370a;

    /* renamed from: b */
    final /* synthetic */ AccountChallengeChimeraActivity f88371b;

    public arwn(AccountChallengeChimeraActivity accountChallengeChimeraActivity, Intent intent) {
        this.f88371b = accountChallengeChimeraActivity;
        this.f88370a = intent;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        this.f88371b.setResult(-1, this.f88370a);
        asbv.m73762a(this.f88371b);
    }
}
