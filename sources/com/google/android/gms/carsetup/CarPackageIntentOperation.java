package com.google.android.gms.carsetup;

import android.content.Intent;
import android.os.RemoteException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarPackageIntentOperation extends qlg {

    /* renamed from: a */
    private static final bnsn f29555a = odk.m28481a("CAR.SETUP");

    /* renamed from: b */
    private ord f29556b;

    /* renamed from: c */
    private nvu f29557c;

    public CarPackageIntentOperation() {
        super(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17405a(String str, Intent intent) {
        otz otz;
        if ("com.google.android.projection.gearhead".equals(str)) {
            bnsi d = f29555a.mo68390d();
            d.mo68432a("com.google.android.gms.carsetup.CarPackageIntentOperation", "a", 37, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Gearhead uninstalled");
            if (this.f29556b == null) {
                this.f29556b = new ord(this);
            }
            if (this.f29557c == null) {
                this.f29557c = new nvu(this);
            }
            try {
                this.f29556b.mo22533a();
                otz = this.f29556b.f38270b;
                if (otz != null) {
                    otz.mo22646a(true);
                    otz.mo22642a();
                    otz.mo22650f();
                    otz.mo22647c();
                }
            } catch (RemoteException e) {
                bnsi b = f29555a.mo68387b();
                b.mo68437a(e);
                b.mo68432a("com.google.android.gms.carsetup.CarPackageIntentOperation", "a", 58, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Error connecting to ICarData");
            } catch (Throwable th) {
                otz.mo22647c();
                throw th;
            }
            this.f29556b.mo22534b();
            nvu nvu = this.f29557c;
            bpdi bpdi = bpdi.PLAY_STORE;
            bpdh bpdh = bpdh.UNINSTALL;
            bxvd da = bpdj.f136247f.mo74144da();
            int i = bpdi.f136246K;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpdj bpdj = (bpdj) da.f164949b;
            int i2 = 1 | bpdj.f136249a;
            bpdj.f136249a = i2;
            bpdj.f136250b = i;
            int i3 = bpdh.f136208em;
            bpdj.f136249a = i2 | 2;
            bpdj.f136251c = i3;
            bpcl a = nvu.f36694a.mo22311a();
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a);
            bpdj bpdj2 = (bpdj) da.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpcl bpcl = (bpcl) bxvd.f164949b;
            bpcl bpcl2 = bpcl.f135759L;
            bpdj2.getClass();
            bpcl.f135785m = bpdj2;
            bpcl.f135773a |= 8192;
            nvu.f36694a.mo22313a((bpcl) bxvd.mo74062i(), 38);
        }
    }

    CarPackageIntentOperation(ord ord, nvu nvu) {
        super(false);
        this.f29556b = ord;
        this.f29557c = nvu;
    }
}
