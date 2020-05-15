package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.tapandpay.tokenization.AccountSetupChimeraActivity;

/* renamed from: atpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atpd implements atfd {

    /* renamed from: a */
    final /* synthetic */ AccountSetupChimeraActivity f90626a;

    public atpd(AccountSetupChimeraActivity accountSetupChimeraActivity) {
        this.f90626a = accountSetupChimeraActivity;
    }

    /* renamed from: a */
    public final void mo50097a(btla btla) {
        btkv btkv;
        btku btku;
        btkz btkz;
        btkx btkx;
        AccountSetupChimeraActivity accountSetupChimeraActivity = this.f90626a;
        accountSetupChimeraActivity.f108755g = null;
        byte[] k = btla.f149337c.getKey();
        srn srn = AccountSetupChimeraActivity.f108750b;
        accountSetupChimeraActivity.f108753e = k;
        if (btky.m116882a(btla.f149335a) == 3) {
            this.f90626a.mo59432a(btml.COMPLETE_RETURN_SETUP_STEP_TYPE, true, -1);
            AccountSetupChimeraActivity accountSetupChimeraActivity2 = this.f90626a;
            if (btla.f149335a == 2) {
                btkv = (btkv) btla.f149336b;
            } else {
                btkv = btkv.f149317b;
            }
            accountSetupChimeraActivity2.mo59429a(btkv);
        } else if (btky.m116882a(btla.f149335a) == 6) {
            this.f90626a.mo59432a(btml.BENDER_SETUP_STEP_TYPE, false, 0);
            AccountSetupChimeraActivity accountSetupChimeraActivity3 = this.f90626a;
            if (btla.f149335a == 5) {
                btku = (btku) btla.f149336b;
            } else {
                btku = btku.f149314b;
            }
            accountSetupChimeraActivity3.mo59428a(btku);
        } else if (btky.m116882a(btla.f149335a) == 5) {
            this.f90626a.mo59432a(btml.WEB_VIEW_SETUP_STEP_TYPE, false, 0);
            AccountSetupChimeraActivity accountSetupChimeraActivity4 = this.f90626a;
            if (btla.f149335a == 4) {
                btkz = (btkz) btla.f149336b;
            } else {
                btkz = btkz.f149330b;
            }
            accountSetupChimeraActivity4.mo59431a(btkz);
        } else if (btky.m116882a(btla.f149335a) != 4) {
            bnsl bnsl = (bnsl) AccountSetupChimeraActivity.f108750b.mo68388c();
            bnsl.mo68432a("atpd", "a", 363, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Received a GetNextSetupStepResponse without any known SetupStep");
        } else {
            this.f90626a.mo59432a(btml.COMPLETE_START_TOKENIZATION_SETUP_STEP_TYPE, false, 0);
            AccountSetupChimeraActivity accountSetupChimeraActivity5 = this.f90626a;
            if (btla.f149335a == 3) {
                btkx = (btkx) btla.f149336b;
            } else {
                btkx = btkx.f149323f;
            }
            accountSetupChimeraActivity5.mo59430a(btkx);
        }
    }

    public final void onErrorResponse(VolleyError volleyError) {
        AccountSetupChimeraActivity accountSetupChimeraActivity = this.f90626a;
        accountSetupChimeraActivity.f108755g = null;
        btnf a = atff.m75758a(volleyError);
        srn srn = AccountSetupChimeraActivity.f108750b;
        accountSetupChimeraActivity.mo59433a(a);
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        btkv btkv;
        btku btku;
        btkz btkz;
        btkx btkx;
        btla btla = (btla) obj;
        AccountSetupChimeraActivity accountSetupChimeraActivity = this.f90626a;
        accountSetupChimeraActivity.f108755g = null;
        byte[] k = btla.f149337c.getKey();
        srn srn = AccountSetupChimeraActivity.f108750b;
        accountSetupChimeraActivity.f108753e = k;
        if (btky.m116882a(btla.f149335a) == 3) {
            this.f90626a.mo59432a(btml.COMPLETE_RETURN_SETUP_STEP_TYPE, true, -1);
            AccountSetupChimeraActivity accountSetupChimeraActivity2 = this.f90626a;
            if (btla.f149335a == 2) {
                btkv = (btkv) btla.f149336b;
            } else {
                btkv = btkv.f149317b;
            }
            accountSetupChimeraActivity2.mo59429a(btkv);
        } else if (btky.m116882a(btla.f149335a) == 6) {
            this.f90626a.mo59432a(btml.BENDER_SETUP_STEP_TYPE, false, 0);
            AccountSetupChimeraActivity accountSetupChimeraActivity3 = this.f90626a;
            if (btla.f149335a == 5) {
                btku = (btku) btla.f149336b;
            } else {
                btku = btku.f149314b;
            }
            accountSetupChimeraActivity3.mo59428a(btku);
        } else if (btky.m116882a(btla.f149335a) == 5) {
            this.f90626a.mo59432a(btml.WEB_VIEW_SETUP_STEP_TYPE, false, 0);
            AccountSetupChimeraActivity accountSetupChimeraActivity4 = this.f90626a;
            if (btla.f149335a == 4) {
                btkz = (btkz) btla.f149336b;
            } else {
                btkz = btkz.f149330b;
            }
            accountSetupChimeraActivity4.mo59431a(btkz);
        } else if (btky.m116882a(btla.f149335a) != 4) {
            bnsl bnsl = (bnsl) AccountSetupChimeraActivity.f108750b.mo68388c();
            bnsl.mo68432a("atpd", "a", 363, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Received a GetNextSetupStepResponse without any known SetupStep");
        } else {
            this.f90626a.mo59432a(btml.COMPLETE_START_TOKENIZATION_SETUP_STEP_TYPE, false, 0);
            AccountSetupChimeraActivity accountSetupChimeraActivity5 = this.f90626a;
            if (btla.f149335a == 3) {
                btkx = (btkx) btla.f149336b;
            } else {
                btkx = btkx.f149323f;
            }
            accountSetupChimeraActivity5.mo59430a(btkx);
        }
    }
}
