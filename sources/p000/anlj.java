package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.activity.AccountSignUpChimeraActivity;

/* renamed from: anlj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anlj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectionResult f77051a;

    /* renamed from: b */
    final /* synthetic */ anlk f77052b;

    public anlj(anlk anlk, ConnectionResult connectionResult) {
        this.f77052b = anlk;
        this.f77051a = connectionResult;
    }

    public final void run() {
        anky anky = this.f77052b.f77054b;
        ConnectionResult connectionResult = this.f77051a;
        anky.f77039b.f82218e = null;
        if (connectionResult.mo17671b()) {
            anky.f77039b.mo46535a();
        } else if (!connectionResult.mo17670a()) {
            int i = connectionResult.f30065c;
            if (i == 5) {
                AccountSignUpChimeraActivity accountSignUpChimeraActivity = anky.f77039b;
                accountSignUpChimeraActivity.mo46536a(accountSignUpChimeraActivity.getString(C0126R.string.plus_invalid_account));
            } else if (i == 7) {
                AccountSignUpChimeraActivity accountSignUpChimeraActivity2 = anky.f77039b;
                accountSignUpChimeraActivity2.mo46536a(accountSignUpChimeraActivity2.getString(C0126R.string.plus_network_unreliable));
            } else {
                AccountSignUpChimeraActivity accountSignUpChimeraActivity3 = anky.f77039b;
                accountSignUpChimeraActivity3.mo46536a(accountSignUpChimeraActivity3.getString(C0126R.string.plus_internal_error));
            }
        } else {
            AccountSignUpChimeraActivity accountSignUpChimeraActivity4 = anky.f77039b;
            accountSignUpChimeraActivity4.f82219f = connectionResult.f30066d;
            accountSignUpChimeraActivity4.mo46535a();
        }
    }
}
