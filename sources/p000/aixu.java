package p000;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: aixu */
final /* synthetic */ class aixu implements rkl {

    /* renamed from: a */
    private final aixw f70023a;

    /* renamed from: b */
    private final ajcg f70024b;

    /* renamed from: c */
    private final aixz f70025c;

    public aixu(aixw aixw, ajcg ajcg, aixz aixz) {
        this.f70023a = aixw;
        this.f70024b = ajcg;
        this.f70025c = aixz;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        aixw aixw = this.f70023a;
        ajcg ajcg = this.f70024b;
        aixz aixz = this.f70025c;
        Status status = (Status) rkk;
        int i = status.f30115i;
        Status status2 = new Status(i, aiyc.m58180a(i));
        if (ajcg != null) {
            try {
                ajcg.mo38481a(status2);
            } catch (RemoteException e) {
                srn srn = ahfq.f67120a;
            }
        }
        int i2 = aixz.f70047c - 1;
        if (i2 == 1) {
            aiya aiya = aixw.f70030d;
            bxvd da = bywm.f168613n.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bywm bywm = (bywm) da.f164949b;
            bywm.f168616b = 6;
            bywm.f168615a |= 1;
            int a = aixz.mo38239a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bywm bywm2 = (bywm) da.f164949b;
            bywm2.f168615a = 2 | bywm2.f168615a;
            bywm2.f168617c = a;
            bxvd da2 = bywb.f168551c.mo74144da();
            int i3 = status.f30115i;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bywb bywb = (bywb) da2.f164949b;
            bywb.f168553a = 1 | bywb.f168553a;
            bywb.f168554b = i3;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bywm bywm3 = (bywm) da.f164949b;
            bywb bywb2 = (bywb) da2.mo74062i();
            bywb2.getClass();
            bywm3.f168619e = bywb2;
            bywm3.f168615a = 8 | bywm3.f168615a;
            aiya.mo38243a(aixz, (bywm) da.mo74062i());
        } else if (i2 == 2) {
            aiya aiya2 = aixw.f70030d;
            bxvd da3 = bywm.f168613n.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bywm bywm4 = (bywm) da3.f164949b;
            bywm4.f168616b = 7;
            bywm4.f168615a |= 1;
            int a2 = aixz.mo38239a();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bywm bywm5 = (bywm) da3.f164949b;
            bywm5.f168615a = 2 | bywm5.f168615a;
            bywm5.f168617c = a2;
            bxvd da4 = bywh.f168574c.mo74144da();
            int i4 = status.f30115i;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bywh bywh = (bywh) da4.f164949b;
            bywh.f168576a = 1 | bywh.f168576a;
            bywh.f168577b = i4;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bywm bywm6 = (bywm) da3.f164949b;
            bywh bywh2 = (bywh) da4.mo74062i();
            bywh2.getClass();
            bywm6.f168621g = bywh2;
            bywm6.f168615a |= 32;
            aiya2.mo38243a(aixz, (bywm) da3.mo74062i());
        } else if (i2 == 3) {
            aiya aiya3 = aixw.f70030d;
            bxvd da5 = bywm.f168613n.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bywm bywm7 = (bywm) da5.f164949b;
            bywm7.f168616b = 8;
            bywm7.f168615a |= 1;
            int a3 = aixz.mo38239a();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bywm bywm8 = (bywm) da5.f164949b;
            bywm8.f168615a = 2 | bywm8.f168615a;
            bywm8.f168617c = a3;
            bxvd da6 = bywf.f168566c.mo74144da();
            int i5 = status.f30115i;
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bywf bywf = (bywf) da6.f164949b;
            bywf.f168568a = 1 | bywf.f168568a;
            bywf.f168569b = i5;
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bywm bywm9 = (bywm) da5.f164949b;
            bywf bywf2 = (bywf) da6.mo74062i();
            bywf2.getClass();
            bywm9.f168623i = bywf2;
            bywm9.f168615a |= 128;
            aiya3.mo38243a(aixz, (bywm) da5.mo74062i());
        } else if (i2 == 4) {
            aiya aiya4 = aixw.f70030d;
            bxvd da7 = bywm.f168613n.mo74144da();
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            bywm bywm10 = (bywm) da7.f164949b;
            bywm10.f168616b = 9;
            bywm10.f168615a |= 1;
            int a4 = aixz.mo38239a();
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            bywm bywm11 = (bywm) da7.f164949b;
            bywm11.f168615a = 2 | bywm11.f168615a;
            bywm11.f168617c = a4;
            bxvd da8 = bywj.f168580c.mo74144da();
            int i6 = status.f30115i;
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            bywj bywj = (bywj) da8.f164949b;
            bywj.f168582a = 1 | bywj.f168582a;
            bywj.f168583b = i6;
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            bywm bywm12 = (bywm) da7.f164949b;
            bywj bywj2 = (bywj) da8.mo74062i();
            bywj2.getClass();
            bywm12.f168625k = bywj2;
            bywm12.f168615a |= 512;
            aiya4.mo38243a(aixz, (bywm) da7.mo74062i());
        }
        Intent b = aiyb.m58179b(aixw.f70027a);
        b.setAction("com.google.android.gms.nearby.messages.service.STOP_SERVICE_IF_IDLE");
        aixw.f70027a.startService(b);
    }
}
