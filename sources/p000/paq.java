package p000;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.Callable;

/* renamed from: paq */
final /* synthetic */ class paq implements Callable {

    /* renamed from: a */
    private final pbm f38726a;

    /* renamed from: b */
    private final boolean f38727b;

    /* renamed from: c */
    private final boolean f38728c;

    public paq(pbm pbm, boolean z, boolean z2) {
        this.f38726a = pbm;
        this.f38727b = z;
        this.f38728c = z2;
    }

    public final Object call() {
        boolean z;
        pbm pbm = this.f38726a;
        boolean z2 = this.f38727b;
        boolean z3 = this.f38728c;
        omm omm = pbm.f38787m.f38774g;
        bmxy.m108581a(omm);
        try {
            Parcel bj = omm.mo8529bj();
            dcl.m8166a(bj, z2);
            dcl.m8166a(bj, z3);
            omm.mo8528b(22, bj);
            z = true;
        } catch (RemoteException e) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
