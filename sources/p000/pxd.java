package p000;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: pxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pxd extends pwz {
    public pxd(pvd pvd, pwv pwv) {
        super("StopRemoteDisplayOperation", pvd, pwv);
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        pvd pvd = this.f40546a;
        pwv pwv = this.f40547b;
        pvd.f40336a.mo23670a("stopRemoteDisplay", new Object[0]);
        pvj pvj = pvd.f40342g;
        if (pvj != null) {
            pvd.f40347l = pwv;
            pvj.mo944e();
        } else if (pwv != null) {
            if (pvd.f40340e != null) {
                try {
                    pwv.mo23795a();
                    return;
                } catch (RemoteException e) {
                    pvd.f40336a.mo23670a("Unable to call stopCallback onDisconnected", new Object[0]);
                }
            }
            try {
                pwv.mo23796a(2206);
            } catch (RemoteException e2) {
                pvd.f40336a.mo23670a("Unable to call stopCallback onError", new Object[0]);
            }
        }
    }
}
