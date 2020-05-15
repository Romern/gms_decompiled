package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: burd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class burd implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ burf f154759a;

    public burd(burf burf) {
        this.f154759a = burf;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        busa busa;
        burf burf = this.f154759a;
        if (burf.f154762c != null) {
            if (iBinder != null) {
                try {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.location.nearby.common.fastpair.IDiscoveryService");
                    busa = !(queryLocalInterface instanceof busa) ? new bury(iBinder) : (busa) queryLocalInterface;
                } catch (RemoteException e) {
                    bnsl bnsl = (bnsl) busr.f154819a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("burd", "onServiceConnected", 64, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("DevicesListFragment failed to register with Service");
                    return;
                }
            } else {
                busa = null;
            }
            burf.f154760a = busa;
            burf burf2 = this.f154759a;
            burf2.f154760a.mo73074a(burf2.f154762c);
            Context context = this.f154759a.f154761b;
            context.startService(butb.m120417b(context).setAction("com.google.android.gms.nearby.discovery.ACTION_LIST_ACTIVITY_REQUEST_DATA"));
            return;
        }
        bnsl bnsl2 = (bnsl) busr.f154819a.mo68387b();
        bnsl2.mo68432a("burd", "onServiceConnected", 53, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Ignoring onServiceConnected because we have no serviceCallback");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        try {
            burf burf = this.f154759a;
            burf.f154760a.mo73075b(burf.f154762c);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("burd", "onServiceDisconnected", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DevicesListChimeraActivity failed to unregister from the discovery service");
        }
        this.f154759a.f154760a = null;
    }
}
