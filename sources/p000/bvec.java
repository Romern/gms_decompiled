package p000;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: bvec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvec implements IBinder.DeathRecipient, bvcs {

    /* renamed from: a */
    public final bvax f155692a;

    /* renamed from: b */
    public final String f155693b;

    /* renamed from: c */
    public final /* synthetic */ bved f155694c;

    public bvec(bved bved, String str, bvax bvax) {
        this.f155694c = bved;
        this.f155693b = str;
        sdo.m34959a(bvax);
        this.f155692a = bvax;
        IBinder asBinder = bvax.asBinder();
        if (asBinder != null) {
            asBinder.linkToDeath(this, 0);
        }
    }

    /* renamed from: a */
    public final void mo73353a(OperationStatus operationStatus) {
        bvaa bvaa;
        try {
            srn srn = bvcm.f155598a;
            this.f155692a.mo73262a(operationStatus);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
            bnsl.mo68432a("bvec", "a", 376, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("RemoteException: Failed to deliver status: %s", operationStatus);
            this.f155694c.mo73268a(this.f155693b);
        }
        int a = bvbe.m120864a(operationStatus.f191776b.f155525b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 2) {
            buzl buzl = operationStatus.f191776b.f155526c;
            if (buzl == null) {
                buzl = buzl.f155397g;
            }
            bvaa = buzl.f155400b;
            if (bvaa == null) {
                bvaa = bvaa.f155448d;
            }
        } else if (i == 3) {
            bvam bvam = operationStatus.f191776b.f155527d;
            if (bvam == null) {
                bvam = bvam.f155493c;
            }
            bvaa = bvam.f155496b;
            if (bvaa == null) {
                bvaa = bvaa.f155448d;
            }
        } else if (i == 4) {
            buyr buyr = operationStatus.f191776b.f155528e;
            if (buyr == null) {
                buyr = buyr.f155331c;
            }
            bvaa = buyr.f155334b;
            if (bvaa == null) {
                bvaa = bvaa.f155448d;
            }
        } else if (i == 5) {
            bvai bvai = operationStatus.f191776b.f155529f;
            if (bvai == null) {
                bvai = bvai.f155480d;
            }
            bvaa = bvai.f155483b;
            if (bvaa == null) {
                bvaa = bvaa.f155448d;
            }
        } else if (i == 8) {
            buyn buyn = operationStatus.f191776b.f155530g;
            if (buyn == null) {
                buyn = buyn.f155316e;
            }
            bvaa = buyn.f155319b;
            if (bvaa == null) {
                bvaa = bvaa.f155448d;
            }
        } else {
            throw new RuntimeException("Cannot get operation from unknown OperationType");
        }
        bvac a2 = bvac.m120825a(bvaa.f155452c);
        if (a2 == null) {
            a2 = bvac.OPERATION_STATUS_UNKNOWN;
        }
        if (a2 != bvac.OPERATION_STATUS_FAILED) {
            bvac a3 = bvac.m120825a(bvaa.f155452c);
            if (a3 == null) {
                a3 = bvac.OPERATION_STATUS_UNKNOWN;
            }
            if (a3 != bvac.OPERATION_STATUS_FINISHED) {
                return;
            }
        }
        buqh buqh = this.f155694c.f155697c;
        String valueOf = String.valueOf(bvaa.f155451b);
        buqh.mo72987c(new bveb(this, valueOf.length() == 0 ? new String("UnregisterOperation: ") : "UnregisterOperation: ".concat(valueOf), bvaa));
    }

    public final void binderDied() {
        this.f155694c.mo73268a(this.f155693b);
        IBinder asBinder = this.f155692a.asBinder();
        if (asBinder != null) {
            asBinder.unlinkToDeath(this, 0);
        }
    }
}
