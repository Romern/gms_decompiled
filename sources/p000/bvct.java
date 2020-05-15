package p000;

import android.os.RemoteException;
import com.google.location.nearby.direct.client.internal.OperationStatus;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bvct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bvct {

    /* renamed from: j */
    public static final bvcl f155604j = new bvck(new AtomicInteger());

    /* renamed from: k */
    public final int f155605k;

    /* renamed from: l */
    final String f155606l;

    /* renamed from: m */
    public bvcs f155607m;

    public bvct() {
        int intValue = ((bvck) f155604j).mo73314a().intValue();
        this.f155605k = intValue;
        this.f155606l = Integer.toString(intValue);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bvat mo73315a(Class cls) {
        if (cls == buyn.class) {
            return new bvcn(this);
        }
        if (cls == buzl.class) {
            return new bvco(this);
        }
        if (cls == bvam.class) {
            return new bvcp(this);
        }
        if (cls == buyr.class) {
            return new bvcq(this);
        }
        if (cls == bvai.class) {
            return new bvcr(this);
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("Unexpected status class for operation");
        sb.append(valueOf);
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    public abstract void mo73285a();

    /* renamed from: b */
    public abstract void mo73286b();

    /* renamed from: d */
    public abstract bvaa mo73288d();

    /* renamed from: a */
    public final void mo73316a(OperationStatus operationStatus) {
        bvaa bvaa;
        bvcs bvcs = this.f155607m;
        if (bvcs != null) {
            try {
                srn srn = bvcm.f155598a;
                ((bvec) bvcs).f155692a.mo73262a(operationStatus);
            } catch (RemoteException e) {
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
                bnsl.mo68432a("bvec", "a", 376, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("RemoteException: Failed to deliver status: %s", operationStatus);
                bvec bvec = (bvec) bvcs;
                bvec.f155694c.mo73268a(bvec.f155693b);
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
            bvec bvec2 = (bvec) bvcs;
            buqh buqh = bvec2.f155694c.f155697c;
            String valueOf = String.valueOf(bvaa.f155451b);
            buqh.mo72987c(new bveb(bvec2, valueOf.length() == 0 ? new String("UnregisterOperation: ") : "UnregisterOperation: ".concat(valueOf), bvaa));
        }
    }
}
