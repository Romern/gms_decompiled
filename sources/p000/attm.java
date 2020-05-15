package p000;

import android.content.Intent;
import android.nfc.NfcAdapter;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: attm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class attm extends atue {
    public attm(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: b */
    private final void m76318b(atsy atsy) {
        mo50180a(17, atsy);
    }

    /* renamed from: a */
    public final void mo50168a(int i, int i2, Intent intent, atsy atsy) {
        m76318b(atsy);
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        boolean z = atsy.f90852o;
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this.f90898f);
        if (defaultAdapter == null || defaultAdapter.isEnabled()) {
            m76318b(atsy);
            return;
        }
        if (!cgwn.m147257g() || !atsy.f90822N) {
            TokenizePanChimeraActivity tokenizePanChimeraActivity = this.f90898f;
            if (tokenizePanChimeraActivity.getPackageManager().resolveActivity(new Intent("com.google.commerce.tapandpay.android.cardlist.START_GOOGLE_PAY"), 0) != null) {
                atam c = mo50188c(atsy);
                c.mo49741a(c.mo49734a(75));
                m76318b(atsy);
                return;
            }
        }
        atam c2 = mo50188c(atsy);
        c2.mo49741a(c2.mo49734a(74));
        mo50181a(new Intent().setClassName(this.f90898f, "com.google.android.gms.tapandpay.tokenization.EnableNfcActivity").putExtra("EXTRA_MONET_ONBOARDING", atsy.f90822N).putExtra("extra_account_info", atsy.f90857t), 7);
    }
}
