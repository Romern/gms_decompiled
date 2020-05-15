package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;

/* renamed from: artz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class artz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bzws f88294a;

    /* renamed from: b */
    final /* synthetic */ arwd f88295b;

    /* renamed from: c */
    final /* synthetic */ aruc f88296c;

    public artz(aruc aruc, bzws bzws, arwd arwd) {
        this.f88296c = aruc;
        this.f88294a = bzws;
        this.f88295b = arwd;
    }

    public final void run() {
        Status status;
        Throwable th;
        Status status2 = new Status(13);
        Challenge[] challengeArr = null;
        try {
            aqzf aqzf = this.f88296c.f88308d;
            aqzk aqzk = (aqzk) aqzf;
            bzwt bzwt = (bzwt) new aqzg(aqzk, ((aqzk) aqzf).f87156d, ((aqzk) aqzf).f87157e, ((aqzk) aqzf).f87158f, this.f88294a).mo48298b();
            if (bzwt != null) {
                int i = bzwt.f171677a;
                if ((i & 2) == 0 && (i & 1) != 0) {
                    bsae bsae = bzwt.f171678b;
                    if (bsae == null) {
                        bsae = bsae.f143833b;
                    }
                    if (bsae.f143835a.size() == 0) {
                        status = new Status(10654);
                        try {
                            this.f88296c.f88309e.mo48203a(status.f30115i);
                            try {
                                this.f88295b.mo48867a(status, challengeArr);
                            } catch (RemoteException e) {
                                aruc.f88303a.mo25417e("Error executing callback", e, new Object[0]);
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        status = new Status(0);
                        bsae bsae2 = bzwt.f171678b;
                        if (bsae2 == null) {
                            bsae2 = bsae.f143833b;
                        }
                        Challenge[] challengeArr2 = new Challenge[bsae2.f143835a.size()];
                        for (int i2 = 0; i2 < bsae2.f143835a.size(); i2++) {
                            brzs brzs = (brzs) bsae2.f143835a.get(i2);
                            challengeArr2[i2] = new Challenge(brzs.f143781a, brzs.f143782b, brzs.f143783c, brzs.f143784d.mo73780k(), brzs.f143785e.mo73780k());
                        }
                        challengeArr = challengeArr2;
                        this.f88295b.mo48867a(status, challengeArr);
                    }
                }
            }
            status = new Status(10652);
            try {
                this.f88296c.f88309e.mo48203a(status.f30115i);
                this.f88295b.mo48867a(status, challengeArr);
            } catch (Throwable th3) {
                th = th3;
                try {
                    this.f88295b.mo48867a(status, (Challenge[]) null);
                } catch (RemoteException e2) {
                    aruc.f88303a.mo25417e("Error executing callback", e2, new Object[0]);
                }
                throw th;
            }
        } catch (Throwable th4) {
            status = status2;
            th = th4;
            this.f88295b.mo48867a(status, (Challenge[]) null);
            throw th;
        }
    }
}
