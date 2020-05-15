package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.car.diagnostics.CriticalError;

/* renamed from: ouh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ouh extends dck implements oui {

    /* renamed from: a */
    final /* synthetic */ noj f38460a;

    public ouh() {
        super("com.google.android.gms.carsetup.IConnectionTransferCallbacks");
    }

    /* renamed from: a */
    public final void mo22653a() {
        ofd.m28611a(this.f38460a.f36219f, "com.google.android.gms.car.CONNECTION_TRANSFER", ofa.FAILED);
        this.f38460a.mo21310ao();
        noj noj = this.f38460a;
        bnsn bnsn = noj.f36155b;
        synchronized (noj.f36227n) {
            this.f38460a.mo21329b(CriticalError.m22086a(bpdn.CAR_SERVICE_INIT_ERROR, bpdo.CONNECTION_TRANSFER_ABORTED));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ouh(noj noj) {
        super("com.google.android.gms.carsetup.IConnectionTransferCallbacks");
        this.f38460a = noj;
    }

    /* renamed from: a */
    public final void mo22654a(Bundle bundle) {
        ofd.m28611a(this.f38460a.f36219f, "com.google.android.gms.car.CONNECTION_TRANSFER", ofa.COMPLETED);
        try {
            noj noj = this.f38460a;
            noj.f36165J = noj.f36173R.mo17433f();
            noj.f36218e.mo17320d();
            int i = noj.f36231r;
            Process.setThreadPriority(-8);
            synchronized (noj.f36227n) {
                noj.mo21250M();
                noj.mo21251N();
                noj.mo21252O();
                if (noj.f36231r == 1) {
                    noj.mo21253P();
                }
                noj.mo21254Q();
                noj.f36232s = noj.f36173R.mo17431d();
                noj.f36222i = noj.mo21326b(noj.f36231r, noj.f36218e.mo17317a());
                noj.f36233t = noj.mo21314as();
                noj.f36156A = noj.mo21315at();
                noj.f36235v = noj.mo21316au();
                int h = noj.f36173R.mo17435h();
                noj.f36228o = h;
                noj.f36178X = 1;
                if (h > 0) {
                    noj.f36229p = h;
                }
                noj.f36227n.notifyAll();
                noj.f36234u.f36066d = new npx(noj.f36220g, noj.f36219f, noj.f36222i, noj.f36161F);
                oha oha = noj.f36224k;
                ofn ofn = noj.f36169N;
                npd npd = noj.f36220g;
                ojk a = ojq.m28928a(bundle);
                a.f37764e = noj.f36219f;
                a.f37776q = noj.f36234u;
                a.f37766g = noj;
                a.f37774o = oha;
                a.f37767h = ofn;
                a.f37768i = npd.mo21396g();
                noj.f36157B = a.mo22211a();
                noj.f36157B.mo22218a(noj.f36233t, noj.f36156A);
                if (noj.mo21311ap()) {
                    if (ccql.m131269d()) {
                        ofd.m28611a(noj.f36219f, "com.google.android.gms.car.CAR_SERVICE_ENDPOINTS", ofa.STARTED);
                    }
                    noj.f36157B.mo22213a((ojl) new nnl(noj));
                }
                noj.f36173R = null;
            }
            noj.f36159D.mo22048a();
            noj.f36159D.mo22051a(noj);
            noj.f36172Q.mo22344a(noj, 1000);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo22654a((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo22653a();
        }
        parcel2.writeNoException();
        return true;
    }
}
