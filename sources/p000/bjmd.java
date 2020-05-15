package p000;

import android.app.KeyguardManager;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: bjmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjmd extends bjhu {

    /* renamed from: m */
    boolean f122959m;

    /* renamed from: p */
    private bwpk f122960p;

    public bjmd(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        if (i == 2001) {
            int i2 = 0;
            this.f122959m = false;
            ContextWrapper contextWrapper = this.f122639a.f122692a.f122732i;
            int a = bwpj.m122184a(this.f122960p.f160562c);
            if (a == 0) {
                a = 1;
            }
            int i3 = a - 1;
            if (i3 != 1) {
                if (i3 != 2) {
                    i2 = -1;
                } else {
                    i2 = bjfv.m103325b(bjfd);
                }
            } else if (bjyw.m104941b(contextWrapper)) {
                i2 = -1;
            }
            if (i2 == -1) {
                mo65255r();
            } else if (i2 != 0) {
                mo65256s();
            } else {
                mo65254q();
            }
        } else {
            super.mo52014a(i, bjfd);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65258u() {
        Intent intent;
        if (!this.f122959m) {
            int i = 1;
            this.f122959m = true;
            bjfh n = mo65128n();
            int a = bwpj.m122184a(this.f122960p.f160562c);
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 == 1) {
                intent = new Intent("android.app.action.SET_NEW_PASSWORD");
            } else if (i2 != 2) {
                int a2 = bwpj.m122184a(this.f122960p.f160562c);
                if (a2 != 0) {
                    i = a2;
                }
                StringBuilder sb = new StringBuilder(46);
                sb.append("Does not support lock screen mode: ");
                sb.append(i - 1);
                mo65117c(sb.toString());
                intent = null;
            } else {
                bwpk bwpk = this.f122960p;
                intent = ((KeyguardManager) this.f122639a.f122692a.f122732i.getSystemService("keyguard")).createConfirmDeviceCredentialIntent(bwpk.f160560a, bwpk.f160561b);
            }
            n.mo65084a(2001, bjfv.m103324a(intent, this.f122639a.f122692a.f122724a));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        bundle.putBoolean("isRunning", this.f122959m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        super.mo65099a(bwny, bundle);
        if (bundle != null) {
            this.f122959m = bundle.getBoolean("isRunning");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwpk.f160558e;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122960p = (bwpk) b;
    }
}
