package p000;

import android.os.RemoteException;
import android.os.WorkSource;
import com.google.android.gms.beacon.BleFilter;
import com.google.location.nearby.direct.client.internal.OperationRequest;
import com.google.location.nearby.direct.client.internal.OperationResponse;
import java.util.Set;

/* renamed from: buyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buyl implements buye {

    /* renamed from: a */
    private final bvba f155311a;

    public buyl(bvba bvba) {
        this.f155311a = bvba;
    }

    /* renamed from: a */
    private static final bvaa m120765a() {
        bxvd da = bvaa.f155448d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvaa bvaa = (bvaa) da.f164949b;
        "".getClass();
        bvaa.f155450a |= 1;
        bvaa.f155451b = "";
        bvac bvac = bvac.OPERATION_STATUS_UNKNOWN;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvaa bvaa2 = (bvaa) da.f164949b;
        bvaa2.f155452c = bvac.f155464j;
        bvaa2.f155450a |= 2;
        return (bvaa) da.mo74062i();
    }

    /* renamed from: a */
    private static final bvaa m120766a(OperationResponse operationResponse) {
        return operationResponse != null ? operationResponse.f191774b : m120765a();
    }

    /* renamed from: a */
    private final boolean m120767a(bvbb bvbb) {
        try {
            return this.f155311a.mo73271d(new OperationRequest(bvbb, new buyk()));
        } catch (RemoteException e) {
            return false;
        }
    }

    /* renamed from: a */
    public final bvaa mo73251a(buym buym, bvat bvat) {
        bxvd da = bvbb.f155510j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvbb bvbb = (bvbb) da.f164949b;
        bvbb.f155513b = 8;
        int i = bvbb.f155512a | 1;
        bvbb.f155512a = i;
        buym.getClass();
        bvbb.f155520i = buym;
        bvbb.f155512a = i | 128;
        try {
            return m120766a(this.f155311a.mo73267a(new OperationRequest((bvbb) da.mo74062i(), new buyf(bvat))));
        } catch (RemoteException e) {
            return m120765a();
        }
    }

    /* renamed from: a */
    public final bvaa mo73252a(buyq buyq, bvat bvat) {
        bxvd da = bvbb.f155510j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvbb bvbb = (bvbb) da.f164949b;
        bvbb.f155513b = 4;
        int i = bvbb.f155512a | 1;
        bvbb.f155512a = i;
        buyq.getClass();
        bvbb.f155516e = buyq;
        bvbb.f155512a = i | 8;
        try {
            return m120766a(this.f155311a.mo73267a(new OperationRequest((bvbb) da.mo74062i(), new buyi(bvat))));
        } catch (RemoteException e) {
            return m120765a();
        }
    }

    /* renamed from: a */
    public final bvaa mo73253a(buzk buzk, bvat bvat) {
        bxvd da = bvbb.f155510j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvbb bvbb = (bvbb) da.f164949b;
        bvbb.f155513b = 2;
        int i = bvbb.f155512a | 1;
        bvbb.f155512a = i;
        buzk.getClass();
        bvbb.f155514c = buzk;
        bvbb.f155512a = i | 2;
        try {
            return m120766a(this.f155311a.mo73267a(new OperationRequest((bvbb) da.mo74062i(), new buyh(bvat))));
        } catch (RemoteException e) {
            return m120765a();
        }
    }

    /* renamed from: a */
    public final bvaa mo73254a(bvad bvad, bvat bvat) {
        return mo73255a(bvad, bvat, null, null);
    }

    /* renamed from: a */
    public final bvaa mo73255a(bvad bvad, bvat bvat, WorkSource workSource, Set set) {
        BleFilter[] bleFilterArr;
        bxvd da = bvbb.f155510j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvbb bvbb = (bvbb) da.f164949b;
        bvbb.f155513b = 5;
        int i = bvbb.f155512a | 1;
        bvbb.f155512a = i;
        bvad.getClass();
        bvbb.f155517f = bvad;
        bvbb.f155512a = i | 16;
        bvbb bvbb2 = (bvbb) da.mo74062i();
        buyj buyj = new buyj(bvat);
        try {
            bvba bvba = this.f155311a;
            if (set != null) {
                bleFilterArr = (BleFilter[]) set.toArray(new BleFilter[0]);
            } else {
                bleFilterArr = null;
            }
            return m120766a(bvba.mo73267a(new OperationRequest(bvbb2, buyj, workSource, bleFilterArr)));
        } catch (RemoteException e) {
            return m120765a();
        }
    }

    /* renamed from: a */
    public final void mo73256a(bval bval, bvat bvat) {
        bxvd da = bvbb.f155510j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvbb bvbb = (bvbb) da.f164949b;
        bvbb.f155513b = 3;
        int i = bvbb.f155512a | 1;
        bvbb.f155512a = i;
        bval.getClass();
        bvbb.f155515d = bval;
        bvbb.f155512a = i | 4;
        try {
            m120766a(this.f155311a.mo73267a(new OperationRequest((bvbb) da.mo74062i(), new buyg(bvat))));
        } catch (RemoteException e) {
            m120765a();
        }
    }

    /* renamed from: a */
    public final void mo73257a(bvan bvan) {
        bxvd da = bvbb.f155510j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvbb bvbb = (bvbb) da.f164949b;
        bvbb.f155513b = 7;
        int i = bvbb.f155512a | 1;
        bvbb.f155512a = i;
        bvan.getClass();
        bvbb.f155519h = bvan;
        bvbb.f155512a = i | 64;
        try {
            this.f155311a.mo73270c(new OperationRequest((bvbb) da.mo74062i(), null));
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo73258a(bvaq bvaq) {
        bxvd da = bvbb.f155510j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvbb bvbb = (bvbb) da.f164949b;
        bvbb.f155513b = 6;
        bvbb.f155512a |= 1;
        bxvd da2 = bvbf.f155533d.mo74144da();
        int a = bvas.m120843a(bvaq.f155507b);
        if (a == 0) {
            a = 1;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvbf bvbf = (bvbf) da2.f164949b;
        bvbf.f155536b = a - 1;
        int i = bvbf.f155535a | 1;
        bvbf.f155535a = i;
        String str = bvaq.f155508c;
        str.getClass();
        bvbf.f155535a = i | 2;
        bvbf.f155537c = str;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvbb bvbb2 = (bvbb) da.f164949b;
        bvbf bvbf2 = (bvbf) da2.mo74062i();
        bvbf2.getClass();
        bvbb2.f155518g = bvbf2;
        bvbb2.f155512a |= 32;
        try {
            this.f155311a.mo73269b(new OperationRequest((bvbb) da.mo74062i(), null));
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo73259a(String str) {
        try {
            m120766a(this.f155311a.mo73268a(str));
        } catch (RemoteException e) {
            m120765a();
        }
    }

    /* renamed from: a */
    public final boolean mo73260a(buyq buyq) {
        bxvd da = bvbb.f155510j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvbb bvbb = (bvbb) da.f164949b;
        bvbb.f155513b = 4;
        int i = bvbb.f155512a | 1;
        bvbb.f155512a = i;
        buyq.getClass();
        bvbb.f155516e = buyq;
        bvbb.f155512a = i | 8;
        return m120767a((bvbb) da.mo74062i());
    }

    /* renamed from: a */
    public final boolean mo73261a(bvad bvad) {
        bxvd da = bvbb.f155510j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvbb bvbb = (bvbb) da.f164949b;
        bvbb.f155513b = 5;
        int i = bvbb.f155512a | 1;
        bvbb.f155512a = i;
        bvad.getClass();
        bvbb.f155517f = bvad;
        bvbb.f155512a = i | 16;
        return m120767a((bvbb) da.mo74062i());
    }
}
