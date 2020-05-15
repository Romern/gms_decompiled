package p000;

import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atsz extends atue {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atsz(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, java.lang.String, boolean, boolean):void
     arg types: [?[OBJECT, ARRAY], java.lang.String, int, int]
     candidates:
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean, int, long):void
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, java.lang.String, boolean, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, java.lang.String, boolean, boolean):void
     arg types: [com.google.android.gms.tapandpay.firstparty.CardInfo, java.lang.String, int, int]
     candidates:
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean, int, long):void
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, java.lang.String, boolean, boolean):void */
    /* renamed from: a */
    public final void mo50168a(int i, int i2, Intent intent, atsy atsy) {
        if (i2 == -1) {
            if (intent.hasExtra("output_integrator_callback_data")) {
                atsy.f90816H = intent.getByteArrayExtra("output_integrator_callback_data");
            }
            mo50188c(atsy).mo49746a((CardInfo) null, atsy.f90849l, true, true);
            mo50180a(9, atsy);
        } else if (i2 == 3) {
            mo50188c(atsy).mo49746a(atsy.f90811C, atsy.f90849l, false, true);
            TokenizePanChimeraActivity tokenizePanChimeraActivity = this.f90898f;
            tokenizePanChimeraActivity.f108910g = true;
            tokenizePanChimeraActivity.f108909f = true;
        } else {
            mo50187b(i2, 3);
            mo50178a();
        }
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        if (atsy.f90812D == null && atsy.f90811C == null) {
            byte[] bArr = atsy.f90813E;
            if (bArr == null || bArr.length == 0) {
                mo50184a(mo50186b(C0126R.string.tp_unsupported_user_title), mo50186b(C0126R.string.tp_unsupported_user_text));
                return;
            }
            atsy.f90848k = true;
            Intent className = new Intent().setClassName(this.f90898f, "com.google.android.gms.tapandpay.tokenization.AddNewCardForTokenizationActivity");
            className.putExtra("extra_orchestration_add_token", atsy.f90813E);
            className.putExtra("extra_account_info", atsy.f90857t);
            mo50181a(className, 3);
            mo50188c(atsy).mo49758b(atsy.f90849l);
            return;
        }
        mo50180a(8, atsy);
    }
}
