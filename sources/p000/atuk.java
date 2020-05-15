package p000;

import android.accounts.Account;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atuk extends atue {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atuk(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, java.lang.String, boolean, boolean):void
     arg types: [?[OBJECT, ARRAY], java.lang.String, int, int]
     candidates:
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean, int, long):void
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, java.lang.String, boolean, boolean):void */
    /* renamed from: a */
    public final void mo50168a(int i, int i2, Intent intent, atsy atsy) {
        if (i2 == -1) {
            mo50188c(atsy).mo49746a((CardInfo) null, atsy.f90849l, true, false);
            atsy.f90815G = String.valueOf(intent.getLongExtra("com.google.android.gms.wallet.f1InstrumentId", -1));
            if (intent.hasExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN")) {
                atsy.f90816H = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
            } else if (intent.hasExtra("com.google.android.gms.wallet.cvc")) {
                atsy.f90842e = intent.getStringExtra("com.google.android.gms.wallet.cvc");
            }
            mo50180a(9, atsy);
            return;
        }
        mo50188c(atsy).mo49746a((CardInfo) null, atsy.f90849l, false, false);
        mo50187b(i2, 11);
        mo50178a();
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        byte[] bArr = atsy.f90814F;
        if (bArr == null) {
            mo50180a(10, atsy);
        } else if (bArr.length != 0) {
            asjl.m74236a(this.f90898f, "Verify CVC");
            awle awle = new awle(this.f90898f);
            awle.mo52187a(askc.m74269a());
            awle.mo52188a(new Account(atsy.f90857t.f108326b, "com.google"));
            awle.mo52234a(atsy.f90814F);
            boolean z = atsy.f90852o;
            awle.mo52190a(atvh.m76455a(this.f90898f));
            awle.mo52192b(3);
            Intent a = awle.mo52186a();
            a.addFlags(603979776);
            mo50181a(a, 2);
            mo50188c(atsy).mo49758b(atsy.f90849l);
        } else {
            mo50184a(mo50186b(C0126R.string.tp_unsupported_user_title), mo50186b(C0126R.string.tp_unsupported_user_text));
        }
    }
}
