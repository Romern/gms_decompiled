package p000;

import android.content.Intent;
import android.nfc.NfcAdapter;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: attd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class attd extends atue {

    /* renamed from: a */
    final asvi f90868a;

    public attd(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
        this.f90868a = new asvi(tokenizePanChimeraActivity);
    }

    /* renamed from: d */
    private final boolean m76295d() {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this.f90898f);
        return defaultAdapter == null || !defaultAdapter.isEnabled();
    }

    /* renamed from: a */
    public final void mo50168a(int i, int i2, Intent intent, atsy atsy) {
        if (i == 1500) {
            mo50170b(atsy);
        }
    }

    /* renamed from: b */
    public final void mo50170b(atsy atsy) {
        mo50180a(30, atsy);
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        if (atsy.f90822N) {
            boolean z = atsy.f90852o;
            if (!m76295d() && !this.f90868a.mo49529a() && cgwn.m147257g()) {
                TokenizePanChimeraActivity tokenizePanChimeraActivity = this.f90898f;
                atrd atrd = new atrd();
                atrd.f90700a = new attc(this, atrd, atsy, tokenizePanChimeraActivity);
                atrd.show(tokenizePanChimeraActivity.getSupportFragmentManager(), "MonetDefaultApp");
                return;
            }
        }
        if (!this.f90868a.mo49529a()) {
            boolean z2 = atsy.f90852o;
            if (!m76295d()) {
                asvi.m74896a(this.f90898f, 1500);
                return;
            }
        }
        mo50170b(atsy);
    }
}
