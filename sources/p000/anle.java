package p000;

import android.content.IntentSender;
import android.util.Log;
import com.google.android.gms.plus.activity.AccountSignUpChimeraActivity;

/* renamed from: anle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anle extends anlg {

    /* renamed from: a */
    final /* synthetic */ AccountSignUpChimeraActivity f77045a;

    public anle(AccountSignUpChimeraActivity accountSignUpChimeraActivity) {
        this.f77045a = accountSignUpChimeraActivity;
    }

    /* renamed from: c */
    public final boolean mo41917c() {
        return this.f77045a.f82219f == null;
    }

    /* renamed from: d */
    public final void mo41918d() {
        try {
            AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.f77045a;
            accountSignUpChimeraActivity.startIntentSenderForResult(accountSignUpChimeraActivity.f82219f.getIntentSender(), 3, null, 0, 0, 0);
            AccountSignUpChimeraActivity accountSignUpChimeraActivity2 = this.f77045a;
            shz.m35338a(accountSignUpChimeraActivity2, accountSignUpChimeraActivity2.f82214a, riz.f43144b, riz.f43146d, this.f77045a.f82220g);
        } catch (IntentSender.SendIntentException e) {
            Log.e("AccountSignUpActivity", "Exception showing GMS Auth Activity.", e);
        }
    }
}
