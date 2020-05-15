package p000;

import android.content.Intent;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atum extends atue {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atum(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: b */
    private final void m76391b(atsy atsy) {
        if (atsy.f90811C.mo59217a()) {
            mo50180a(26, atsy);
            return;
        }
        atsy.f90831W = 1;
        mo50180a(23, atsy);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public final void mo50168a(int i, int i2, Intent intent, atsy atsy) {
        if (i2 == -1) {
            m76391b(atsy);
        } else if (intent != null) {
            TokenStatus tokenStatus = (TokenStatus) intent.getParcelableExtra("token_status");
            if (tokenStatus != null && tokenStatus.f108459b == 1) {
                mo50179a(444, new Intent().putExtra("token_deleted_extra", true).putExtra("tokenization_result_code", 13));
                mo50178a();
                return;
            }
            mo50187b(i2, 2);
            mo50178a();
        } else {
            mo50187b(i2, 12);
            mo50178a();
        }
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        if (atsy.f90811C.f108345f.f108459b != 3) {
            m76391b(atsy);
        } else if (!cgwn.f187872a.mo6606a().mo84625f() || !atsy.f90823O) {
            Intent putExtra = new Intent().setClassName(this.f90898f, "com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodActivity").putExtra("extra_account_info", atsy.f90857t).putExtra("extra_calling_package", atsy.f90861x).putExtra("EXTRA_USE_SUW_UI", atsy.f90824P).putExtra("card_info", atsy.f90811C).putExtra("session_id", atsy.f90849l).putExtra("wallet_id", atsy.f90854q);
            byte[] bArr = atsy.f90817I;
            if (bArr != null) {
                putExtra.putExtra("activaton_receipt", bArr);
            }
            mo50181a(putExtra, 7);
            atam c = mo50188c(atsy);
            CardInfo cardInfo = atsy.f90811C;
            c.mo49742a(c.mo49735a(14, cardInfo), atsy.f90849l);
        } else {
            mo50181a(new Intent("com.google.android.gms.tapandpay.settings.PROMPT_DEFERRED_YELLOW_PATH").setClassName(this.f90898f, "com.google.android.gms.tapandpay.settings.TapAndPaySettingsActivity").putExtra("extra_card_info", atsy.f90811C), 7);
        }
    }
}
