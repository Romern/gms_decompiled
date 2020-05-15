package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: arlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arlo extends aeaa {

    /* renamed from: a */
    final /* synthetic */ aucf f87849a;

    /* renamed from: b */
    final /* synthetic */ arls f87850b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arlo(arls arls, String str, aucf aucf) {
        super(str);
        this.f87850b = arls;
        this.f87849a = aucf;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        arls.f87856a.mo25409a("service disconnected %s", componentName);
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        scn scn;
        arls arls = this.f87850b;
        aucf aucf = this.f87849a;
        GetServiceRequest getServiceRequest = new GetServiceRequest(sgj.SMARTDEVICE_SETUP_ACCOUNTS_BOOTSTRAP.mo3214a());
        getServiceRequest.f30230d = arls.f87857b.getPackageName();
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            scn = (queryLocalInterface == null || !(queryLocalInterface instanceof scn)) ? new scl(iBinder) : (scn) queryLocalInterface;
        } else {
            scn = null;
        }
        arls.f87859d = scn;
        scn scn2 = arls.f87859d;
        if (scn2 == null) {
            aucf.mo50392b((Exception) new IllegalStateException("Service broker is null"));
            return;
        }
        try {
            scn2.mo25273a(new arlr(arls.f87858c, arls), getServiceRequest);
        } catch (RemoteException e) {
            arls.f87856a.mo25410a((Throwable) e);
            aucf.mo50392b((Exception) e);
        }
    }
}
