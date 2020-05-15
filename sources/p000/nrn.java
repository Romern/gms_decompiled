package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: nrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nrn extends dcj implements nrp {
    public nrn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarGalMonitor");
    }

    /* renamed from: a */
    public final void mo21487a(nrm nrm) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, nrm);
        mo8528b(5, bj);
    }

    /* renamed from: b */
    public final void mo21489b(nrm nrm) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, nrm);
        mo8528b(6, bj);
    }

    /* renamed from: c */
    public final void mo21491c(nrm nrm, int i) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, nrm);
        bj.writeInt(i);
        mo8528b(3, bj);
    }

    /* renamed from: d */
    public final void mo21492d(nrm nrm, int i) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, nrm);
        bj.writeInt(i);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo21488a(nrm nrm, int i) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, nrm);
        bj.writeInt(i);
        mo8528b(1, bj);
    }

    /* renamed from: b */
    public final void mo21490b(nrm nrm, int i) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, nrm);
        bj.writeInt(i);
        mo8528b(2, bj);
    }
}
