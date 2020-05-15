package p000;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: bjmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjmq extends bjhy {

    /* renamed from: p */
    boolean f122980p;

    /* renamed from: q */
    byte[] f122981q;

    /* renamed from: r */
    bwqm f122982r;

    public bjmq(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        if (i == 2000) {
            this.f122980p = false;
            if (bjfd.mo65080a() == 0) {
                Intent intent = bjfd.f122613a;
                this.f122981q = intent.getByteArrayExtra("cReqSessionKey");
                ((bjmr) ((bjhy) this).f122754m).mo65262a(intent.getStringExtra("cResSessionKey"));
                mo65255r();
                return;
            }
            mo65256s();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjmr bjmr = (bjmr) ((bjhy) this).f122754m;
        return bjmr == null ? new bjmr() : bjmr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65258u() {
        byte[] bArr;
        if (!this.f122980p) {
            this.f122980p = true;
            bjmu bjmu = (bjmu) this.f122639a.f122693b.mo65131a(this.f122982r.f160685c, bjmu.class);
            if (bjmu != null) {
                bArr = bjmu.f122987q;
            } else {
                bArr = null;
            }
            if (bArr == null) {
                mo65256s();
            }
            bwqm bwqm = this.f122982r;
            String str = bwqm.f160683a;
            String str2 = bwqm.f160684b;
            Intent a = bjfc.m103290a("EcdhKeyCalculationAction", this.f122639a.f122692a.f122724a);
            a.putExtra("ecdhPublicKey", str);
            a.putExtra("agreementPartyVInfo", str2);
            a.putExtra("ephemeralPrivateKey", bArr);
            mo65128n().mo65084a(2000, new bjfc(a));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        bundle.putByteArray("cReqSessionKey", this.f122981q);
        bundle.putBoolean("isWaitingForResponse", this.f122980p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        if (bundle != null) {
            this.f122981q = bundle.getByteArray("cReqSessionKey");
            this.f122980p = bundle.getBoolean("isWaitingForResponse");
        }
        super.mo65099a(bwny, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwqm.f160681e;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122982r = (bwqm) b;
    }
}
