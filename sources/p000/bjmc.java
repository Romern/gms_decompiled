package p000;

import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: bjmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjmc extends bjhu {

    /* renamed from: m */
    bwph f122957m;

    /* renamed from: p */
    boolean f122958p;

    public bjmc(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        if (i == 2006) {
            this.f122958p = false;
            if (bjfd.mo65080a() == 0) {
                mo65255r();
                return;
            }
            switch (bjfd.mo65081b()) {
                case 1:
                case 2:
                case 3:
                case 7:
                    mo65252b(1);
                    return;
                case 4:
                case 9:
                case 11:
                case 12:
                case 14:
                    mo65252b(2);
                    return;
                case 5:
                case 10:
                case 13:
                    mo65254q();
                    return;
                case 6:
                default:
                    mo65256s();
                    return;
                case 8:
                    mo65252b(3);
                    return;
            }
        } else {
            super.mo52014a(i, bjfd);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65258u() {
        if (!this.f122958p) {
            boolean z = true;
            this.f122958p = true;
            if (!((KeyguardManager) this.f122639a.f122692a.f122732i.getSystemService("keyguard")).isDeviceSecure() || !this.f122957m.f160554f) {
                z = false;
            }
            bwph bwph = this.f122957m;
            String str = bwph.f160552d;
            String str2 = bwph.f160551c;
            String str3 = bwph.f160549a;
            String str4 = bwph.f160550b;
            boolean z2 = bwph.f160553e;
            Intent a = bjfc.m103290a("BiometricAction", this.f122639a.f122692a.f122724a);
            a.putExtra("biometricTitle", str);
            a.putExtra("biometricSubtitle", str2);
            a.putExtra("biometricDescription", str3);
            a.putExtra("biometricNegativeButtonText", str4);
            a.putExtra("biometricDeviceCredentialAllowed", z);
            a.putExtra("biometricConfirmationRequired", z2);
            mo65128n().mo65084a(2006, new bjfc(a));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        bundle.putBoolean("isRunning", this.f122958p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        if (bundle != null) {
            this.f122958p = bundle.getBoolean("isRunning");
        }
        super.mo65099a(bwny, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwph.f160547h;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122957m = (bwph) b;
    }
}
