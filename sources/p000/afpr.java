package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: afpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afpr implements bqfp {

    /* renamed from: a */
    final /* synthetic */ afps f64523a;

    public afpr(afps afps) {
        this.f64523a = afps;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        try {
            this.f64523a.f64524a.mo11797a(Status.f30107a);
        } catch (RemoteException e) {
            bbev.m87911b(e, "Client died during MaintenanceOperation", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bbev.m87907a(th, "MaintenanceOperation failed");
        try {
            this.f64523a.f64524a.mo11797a(Status.f30109c);
        } catch (RemoteException e) {
            bbev.m87911b(e, "Client died during MaintenanceOperation", new Object[0]);
        }
    }
}
