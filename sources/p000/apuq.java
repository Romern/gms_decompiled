package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: apuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apuq extends aeaa {

    /* renamed from: a */
    final /* synthetic */ apur f84943a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public apuq(apur apur) {
        super("security");
        this.f84943a = apur;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f84943a.f84944a.countDown();
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        bjdo bjdo;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.vending.verifier.IPackageVerificationApiService");
            bjdo = queryLocalInterface instanceof bjdo ? (bjdo) queryLocalInterface : new bjdo(iBinder);
        } else {
            bjdo = null;
        }
        try {
            apur apur = this.f84943a;
            int i = 3;
            if (apur.f84946c >= 80832200) {
                if (apur.f84947d) {
                    i = 7;
                }
            }
            if (bjdo != null) {
                long j = (long) i;
                Parcel bj = bjdo.mo8529bj();
                dcl.m8164a(bj, apur);
                bj.writeLong(j);
                bjdo.mo8530c(2, bj);
            }
        } catch (RemoteException e) {
            this.f84943a.f84944a.countDown();
        }
    }
}
