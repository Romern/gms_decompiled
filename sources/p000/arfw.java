package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;

/* renamed from: arfw */
final /* synthetic */ class arfw implements aubq {

    /* renamed from: a */
    private final arfx f87622a;

    public arfw(arfx arfx) {
        this.f87622a = arfx;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        arfx arfx = this.f87622a;
        if (!aucb.mo50384b()) {
            arge.f87642a.mo25410a((Throwable) aucb.mo50387e());
            try {
                arfx.f87623a.mo48599a(Status.f30109c, (ManagedAccountSetupInfo) null);
            } catch (RemoteException e) {
                arge.f87642a.mo25410a((Throwable) e);
            }
        } else {
            try {
                arfx.f87623a.mo48599a(Status.f30107a, (ManagedAccountSetupInfo) aucb.mo50386d());
            } catch (RemoteException e2) {
                arge.f87642a.mo25410a((Throwable) e2);
            }
        }
    }
}
