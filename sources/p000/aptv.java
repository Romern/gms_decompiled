package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.HarmfulAppsInfo;

/* renamed from: aptv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aptv extends aeaa {

    /* renamed from: a */
    final /* synthetic */ aptw f84884a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aptv(aptw aptw) {
        super("security");
        this.f84884a = aptw;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        aptw aptw = this.f84884a;
        if (!aptw.f84886b) {
            aptw.mo47610a(new Status(12004), (HarmfulAppsInfo) null);
        }
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        bjdo bjdo;
        aptw aptw = this.f84884a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.vending.verifier.IPackageVerificationApiService");
            bjdo = queryLocalInterface instanceof bjdo ? (bjdo) queryLocalInterface : new bjdo(iBinder);
        } else {
            bjdo = null;
        }
        try {
            Parcel bj = bjdo.mo8529bj();
            dcl.m8164a(bj, aptw);
            bjdo.mo8530c(1, bj);
        } catch (RemoteException e) {
            aptw.mo47610a(new Status(12004), (HarmfulAppsInfo) null);
        }
    }
}
