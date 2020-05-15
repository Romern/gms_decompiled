package p000;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: bjmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjmu extends bjhy {

    /* renamed from: p */
    boolean f122986p;

    /* renamed from: q */
    byte[] f122987q;

    public bjmu(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        if (i == 2000) {
            this.f122986p = false;
            if (bjfd.mo65080a() == 0) {
                Intent intent = bjfd.f122613a;
                this.f122987q = intent.getByteArrayExtra("ephemeralPrivateKey");
                ((bjmv) ((bjhy) this).f122754m).mo65262a(intent.getStringExtra("ephemeralPublicKey"));
                mo65255r();
                return;
            }
            mo65256s();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjmv bjmv = (bjmv) ((bjhy) this).f122754m;
        return bjmv == null ? new bjmv() : bjmv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65258u() {
        if (!this.f122986p) {
            this.f122986p = true;
            mo65128n().mo65084a(2000, new bjfc(bjfc.m103290a("P256KeyPairGenerationAction", this.f122639a.f122692a.f122724a)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        bundle.putByteArray("ephemeralPrivateKey", this.f122987q);
        bundle.putBoolean("isWaitingForResponse", this.f122986p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        if (bundle != null) {
            this.f122987q = bundle.getByteArray("ephemeralPrivateKey");
            this.f122986p = bundle.getBoolean("isWaitingForResponse");
        }
        super.mo65099a(bwny, bundle);
    }
}
