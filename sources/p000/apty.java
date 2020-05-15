package p000;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.HarmfulAppsInfo;

/* renamed from: apty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apty extends aeaa {

    /* renamed from: a */
    final /* synthetic */ aptz f84894a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public apty(aptz aptz) {
        super("security");
        this.f84894a = aptz;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        aptz aptz = this.f84894a;
        if (!aptz.f84896b) {
            aptz.mo47612a(new Status(12004), (HarmfulAppsInfo) null);
        }
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        bjdo bjdo;
        aptz aptz = this.f84894a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.vending.verifier.IPackageVerificationApiService");
            bjdo = queryLocalInterface instanceof bjdo ? (bjdo) queryLocalInterface : new bjdo(iBinder);
        } else {
            bjdo = null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putLong("verify_apps_data_flags", 1);
            bundle.putLong("verify_apps_data_autoscan_stale_ms", aptz.f84895a);
            Parcel bj = bjdo.mo8529bj();
            dcl.m8164a(bj, aptz);
            dcl.m8165a(bj, bundle);
            bjdo.mo8530c(3, bj);
        } catch (RemoteException e) {
            aptz.mo47612a(new Status(12004), (HarmfulAppsInfo) null);
        }
    }
}
