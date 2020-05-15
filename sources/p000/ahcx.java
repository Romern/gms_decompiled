package p000;

import android.os.RemoteException;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: ahcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahcx implements bvat {

    /* renamed from: a */
    final /* synthetic */ ahcy f67019a;

    public ahcx(ahcy ahcy) {
        this.f67019a = ahcy;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36284a(bxxc bxxc) {
        buzl buzl = (buzl) bxxc;
        bnsp bnsp = ahcy.f67020b;
        bvaa bvaa = buzl.f155400b;
        if (bvaa == null) {
            bvaa = bvaa.f155448d;
        }
        String str = bvaa.f155451b;
        bvaa bvaa2 = buzl.f155400b;
        if (bvaa2 == null) {
            bvaa2 = bvaa.f155448d;
        }
        if ((bvaa2.f155450a & 2) != 0) {
            bvaa bvaa3 = buzl.f155400b;
            if (bvaa3 == null) {
                bvaa3 = bvaa.f155448d;
            }
            int i = bvaa3.f155452c;
            bvac bvac = bvac.OPERATION_STATUS_UNKNOWN;
        }
        bvac bvac2 = bvac.OPERATION_STATUS_UNKNOWN;
        int a = buzn.m120810a(buzl.f155401c);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 2) {
            ahcy ahcy = this.f67019a;
            if (!ahcy.f67025g) {
                buzo buzo = buzl.f155402d;
                if (buzo == null) {
                    buzo = buzo.f155407d;
                }
                ahcy.f67023e = buzo;
                ahcy ahcy2 = this.f67019a;
                ahcy2.f67025g = true;
                ahcy2.f67026h = true;
                try {
                    SystemClock.elapsedRealtime();
                    if (ahcy.m55502a(ahcy2.f67034p)) {
                        ahcy2.f67036r.mo72973a(12, ahcy2);
                        ahcy2.f67034p.mo36345a(ahcy2.f67029k, null);
                    }
                    ahcy2.f67033o.mo36313b();
                } catch (RemoteException e) {
                    bnsl bnsl = (bnsl) ahcy.f67020b.mo68388c();
                    bnsl.mo68432a("ahcy", "f", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("SocketDevice: fail to call ConnectionListener.onConnected");
                }
            }
        } else if (i2 == 3) {
            buzq buzq = buzl.f155403e;
            if (buzq == null) {
                buzq = buzq.f155418c;
            }
            if ((buzq.f155420a & 1) != 0) {
                buzq buzq2 = buzl.f155403e;
                if (buzq2 == null) {
                    buzq2 = buzq.f155418c;
                }
                byte[] k = buzq2.f155421b.getKey();
                ahcy ahcy3 = this.f67019a;
                try {
                    SystemClock.elapsedRealtime();
                    if (ahcy.m55502a(ahcy3.f67035q)) {
                        ahcy3.f67035q.mo36349a(k);
                    }
                } catch (RemoteException e2) {
                    bnsl bnsl2 = (bnsl) ahcy.f67020b.mo68388c();
                    bnsl2.mo68432a("ahcy", "a", 139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("SocketDevice: fail to call DataListener.onDataReceived");
                }
            }
        } else if (i2 == 4) {
            ahcy ahcy4 = this.f67019a;
            ahcy4.f67023e = null;
            ahcy4.mo36328d();
        } else if (i2 == 5) {
            ahcy ahcy5 = this.f67019a;
            String str2 = buzl.f155404f;
            try {
                SystemClock.elapsedRealtime();
                if (ahcy.m55502a(ahcy5.f67034p)) {
                    ahcy5.f67034p.mo36347b(str2);
                }
            } catch (RemoteException e3) {
                bnsl bnsl3 = (bnsl) ahcy.f67020b.mo68388c();
                bnsl3.mo68432a("ahcy", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("SocketDevice: fail to call DataListener.onDataReceived");
            }
        }
        bvaa bvaa4 = buzl.f155400b;
        if (bvaa4 == null) {
            bvaa4 = bvaa.f155448d;
        }
        bvac a2 = bvac.m120825a(bvaa4.f155452c);
        if (a2 == null) {
            a2 = bvac.OPERATION_STATUS_UNKNOWN;
        }
        int ordinal = a2.ordinal();
        if (ordinal == 3) {
            ahcy ahcy6 = this.f67019a;
            ahcy6.f67025g = false;
            ahcy6.f67023e = null;
            if (ahcy6.f67026h) {
                ahcy6.mo36331g();
            } else if (ahcy6.f67027i) {
                try {
                    if (ahcy.m55502a(ahcy6.f67034p)) {
                        ahcy6.f67034p.mo36344a(16);
                    }
                    ahcy6.f67033o.mo36313b();
                } catch (RemoteException e4) {
                    bnsl bnsl4 = (bnsl) ahcy.f67020b.mo68388c();
                    bnsl4.mo68432a("ahcy", "i", 177, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("SocketDevice: fail to call ConnectionListener.onError(CANCELED)");
                }
            } else {
                ahcy6.mo36332h();
            }
        } else if (ordinal == 4) {
            ahcy ahcy7 = this.f67019a;
            ahcy7.f67025g = false;
            ahcy7.f67023e = null;
            ahcy7.mo36332h();
        }
    }
}
