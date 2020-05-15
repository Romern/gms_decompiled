package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import java.util.Locale;

/* renamed from: bjnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjnc extends bjhy {

    /* renamed from: p */
    boolean f122994p;

    /* renamed from: q */
    bwrp f122995q;

    public bjnc(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: d */
    private final void m104013d(int i) {
        if (i == -1) {
            mo65255r();
        } else if (i != 0) {
            mo65256s();
        } else {
            mo65254q();
        }
        this.f122994p = false;
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        if (i == 1000) {
            bjfv.m103323a(bjfd);
            m104013d(bjfv.m103325b(bjfd));
        } else if (i == 100) {
            m104013d(bjfd.f122613a.getIntExtra("resultCode", -1));
        } else {
            super.mo52014a(i, bjfd);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjnd bjnd = (bjnd) ((bjhy) this).f122754m;
        return bjnd == null ? new bjnd() : bjnd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65258u() {
        bxtx bxtx;
        if (!this.f122994p) {
            int a = bwro.m122241a(this.f122995q.f160788a);
            int i = a - 1;
            if (a != 0) {
                if (i != 2) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    int a2 = bwro.m122241a(this.f122995q.f160788a);
                    int i2 = a2 - 1;
                    if (a2 != 0) {
                        objArr[0] = Integer.valueOf(i2);
                        mo65114b(String.format(locale, "MonetComponent does not support params of type: %d", objArr));
                    } else {
                        throw null;
                    }
                } else {
                    WidgetConfig widgetConfig = this.f122639a.f122692a.f122724a;
                    bwrp bwrp = this.f122995q;
                    if (bwrp.f160788a == 2) {
                        bxtx = (bxtx) bwrp.f160789b;
                    } else {
                        bxtx = bxtx.f164797b;
                    }
                    byte[] k = bxtx.mo73780k();
                    Intent a3 = bjfc.m103290a("tokenizeInstrument", widgetConfig);
                    a3.putExtra("tokenizationParams", k);
                    mo65128n().mo65084a(100, new bjfc(a3));
                }
                this.f122994p = true;
                return;
            }
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        bundle.putBoolean("isWaitingForResult", this.f122994p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        super.mo65099a(bwny, bundle);
        if (bundle != null) {
            this.f122994p = bundle.getBoolean("isWaitingForResult", false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwrp.f160786d;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122995q = (bwrp) b;
    }
}
