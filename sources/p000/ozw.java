package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: ozw */
final /* synthetic */ class ozw implements Runnable {

    /* renamed from: a */
    private final pad f38685a;

    /* renamed from: b */
    private final IBinder f38686b;

    public ozw(pad pad, IBinder iBinder) {
        this.f38685a = pad;
        this.f38686b = iBinder;
    }

    public final void run() {
        omm omm;
        pad pad = this.f38685a;
        IBinder iBinder = this.f38686b;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.startup.IStartup");
            if (queryLocalInterface instanceof omm) {
                omm = (omm) queryLocalInterface;
            } else {
                omm = new omm(iBinder);
            }
        } else {
            omm = null;
        }
        pad.f38705m = omm;
        try {
            pad.f38705m.mo22300a(pad.f38695c, pad.f38693a);
        } catch (RemoteException e) {
            bnsi b = pam.f38717a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("pad", "b", 286, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Should never get a RemoteException when resuming a connection.");
            throw new RuntimeException(e);
        }
    }
}
