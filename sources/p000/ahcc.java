package p000;

import android.os.RemoteException;
import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: ahcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahcc implements bvat {

    /* renamed from: a */
    final /* synthetic */ ahcd f66973a;

    public ahcc(ahcd ahcd) {
        this.f66973a = ahcd;
    }

    /* renamed from: a */
    public final void mo36283a(bvai bvai) {
        ahcd ahcd = this.f66973a;
        bnsp bnsp = ahcd.f66974a;
        Device a = ahcd.mo36285a(bvai);
        if (a != null && this.f66973a.mo36288b()) {
            try {
                ahcd ahcd2 = this.f66973a;
                ahcd2.f66978e.mo72972a(6, ahcd2);
                this.f66973a.f66975b.mo36362a(a);
            } catch (RemoteException | NullPointerException e) {
                bnsl bnsl = (bnsl) ahcd.f66974a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ahcc", "a", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("BleScanner: Fail to update scan listener");
            }
        }
        if ((bvai.f155482a & 1) != 0) {
            bvaa bvaa = bvai.f155483b;
            if (bvaa == null) {
                bvaa = bvaa.f155448d;
            }
            bvac a2 = bvac.m120825a(bvaa.f155452c);
            if (a2 == null) {
                a2 = bvac.OPERATION_STATUS_UNKNOWN;
            }
            if (a2 != bvac.OPERATION_STATUS_FINISHED) {
                bvaa bvaa2 = bvai.f155483b;
                if (bvaa2 == null) {
                    bvaa2 = bvaa.f155448d;
                }
                bvac a3 = bvac.m120825a(bvaa2.f155452c);
                if (a3 == null) {
                    a3 = bvac.OPERATION_STATUS_UNKNOWN;
                }
                if (a3 != bvac.OPERATION_STATUS_FAILED) {
                    return;
                }
            }
            bvaa bvaa3 = bvai.f155483b;
            if (bvaa3 == null) {
                bvaa3 = bvaa.f155448d;
            }
            if ((bvaa3.f155450a & 2) != 0) {
                bvaa bvaa4 = bvai.f155483b;
                if (bvaa4 == null) {
                    bvaa4 = bvaa.f155448d;
                }
                int i = bvaa4.f155452c;
            }
            if (this.f66973a.mo36288b()) {
                ahcd ahcd3 = this.f66973a;
                if (ahcd3.f66976c) {
                    try {
                        ahcd3.f66975b.mo36361a();
                    } catch (RemoteException | NullPointerException e2) {
                        bnsl bnsl2 = (bnsl) ahcd.f66974a.mo68388c();
                        bnsl2.mo68437a(e2);
                        bnsl2.mo68432a("ahcc", "a", 72, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("BleScanner: Fail to call onScanStopped");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36284a(bxxc bxxc) {
        bvai bvai = (bvai) bxxc;
        ahcd ahcd = this.f66973a;
        bnsp bnsp = ahcd.f66974a;
        Device a = ahcd.mo36285a(bvai);
        if (a != null && this.f66973a.mo36288b()) {
            try {
                ahcd ahcd2 = this.f66973a;
                ahcd2.f66978e.mo72972a(6, ahcd2);
                this.f66973a.f66975b.mo36362a(a);
            } catch (RemoteException | NullPointerException e) {
                bnsl bnsl = (bnsl) ahcd.f66974a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ahcc", "a", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("BleScanner: Fail to update scan listener");
            }
        }
        if ((bvai.f155482a & 1) != 0) {
            bvaa bvaa = bvai.f155483b;
            if (bvaa == null) {
                bvaa = bvaa.f155448d;
            }
            bvac a2 = bvac.m120825a(bvaa.f155452c);
            if (a2 == null) {
                a2 = bvac.OPERATION_STATUS_UNKNOWN;
            }
            if (a2 != bvac.OPERATION_STATUS_FINISHED) {
                bvaa bvaa2 = bvai.f155483b;
                if (bvaa2 == null) {
                    bvaa2 = bvaa.f155448d;
                }
                bvac a3 = bvac.m120825a(bvaa2.f155452c);
                if (a3 == null) {
                    a3 = bvac.OPERATION_STATUS_UNKNOWN;
                }
                if (a3 != bvac.OPERATION_STATUS_FAILED) {
                    return;
                }
            }
            bvaa bvaa3 = bvai.f155483b;
            if (bvaa3 == null) {
                bvaa3 = bvaa.f155448d;
            }
            if ((bvaa3.f155450a & 2) != 0) {
                bvaa bvaa4 = bvai.f155483b;
                if (bvaa4 == null) {
                    bvaa4 = bvaa.f155448d;
                }
                int i = bvaa4.f155452c;
            }
            if (this.f66973a.mo36288b()) {
                ahcd ahcd3 = this.f66973a;
                if (ahcd3.f66976c) {
                    try {
                        ahcd3.f66975b.mo36361a();
                    } catch (RemoteException | NullPointerException e2) {
                        bnsl bnsl2 = (bnsl) ahcd.f66974a.mo68388c();
                        bnsl2.mo68437a(e2);
                        bnsl2.mo68432a("ahcc", "a", 72, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("BleScanner: Fail to call onScanStopped");
                    }
                }
            }
        }
    }
}
