package p000;

import android.content.Intent;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: attb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class attb extends atue {
    public attb(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: b */
    private final void m76292b(atsy atsy) {
        mo50180a(18, atsy);
    }

    /* renamed from: a */
    public final void mo50168a(int i, int i2, Intent intent, atsy atsy) {
        if (i == 1) {
            m76292b(atsy);
        }
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
    public final void mo50169a(atsy atsy) {
        if (atsy.f90831W == 1) {
            Intent putExtra = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.tapandpay.ui.TokenizationSuccessActivity").putExtra("accountInfo", atsy.f90857t).putExtra("paymentCardInfo", atsy.f90811C);
            boolean z = atsy.f90852o;
            Intent putExtra2 = putExtra.putExtra("is_wear_tokenization_extra", false);
            boolean z2 = atsy.f90852o;
            if (!atsy.mo50166d() || atsy.f90862y) {
                m76292b(atsy);
            } else {
                mo50181a(putExtra2, 1);
            }
        } else {
            m76292b(atsy);
        }
    }
}
