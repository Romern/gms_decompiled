package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

/* renamed from: bjme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjme extends bjhy {

    /* renamed from: p */
    bwpl f122961p;

    public bjme(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        if (i != 2000) {
            super.mo52014a(i, bjfd);
        } else if (bjfd.mo65080a() == 0) {
            mo65255r();
        } else {
            mo65252b(bjfd.mo65081b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjmf bjmf = (bjmf) ((bjhy) this).f122754m;
        return bjmf == null ? new bjmf() : bjmf;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65258u() {
        bwpl bwpl = this.f122961p;
        int i = bwpl.f160569c;
        int i2 = ((bjmf) ((bjhy) this).f122754m).f122962d;
        if ((bwpl.f160567a & 2) != 0 && i2 >= i) {
            mo65252b(2);
        } else {
            bjgv bjgv = this.f122639a;
            WidgetConfig widgetConfig = bjgv.f122692a.f122724a;
            String str = ((bjhw) ((bjhy) ((bjqc) bjgv.f122693b.mo65131a(bwpl.f160568b, bjqc.class))).f122754m).f122753d;
            int i3 = ((bjmf) ((bjhy) this).f122754m).f122962d;
            Intent a = bjfc.m103292a("reauthAction", widgetConfig, new Intent());
            a.putExtra("extra_reauth_account", widgetConfig.f151760a);
            a.putExtra("extra_reauth_credential", str);
            a.putExtra("extra_reauth_credential_type", 2);
            a.putExtra("extra_reauth_retryCount", i3);
            mo65128n().mo65084a(2000, new bjfc(a));
        }
        bjmf bjmf = (bjmf) ((bjhy) this).f122754m;
        bjmf.f122962d++;
        bjmf.mo65244a((bjgf) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwpl.f160565e;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122961p = (bwpl) b;
    }
}
