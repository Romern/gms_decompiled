package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: buqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buqo implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ buqu f154717a;

    public buqo(buqu buqu) {
        this.f154717a = buqu;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        busi busi;
        Log.w("AutoTestUiInjector", "onServiceConnected called");
        buqu buqu = this.f154717a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.location.nearby.common.fastpair.autotest.IAutoTestService");
            busi = queryLocalInterface instanceof busi ? (busi) queryLocalInterface : new busi(iBinder);
        } else {
            busi = null;
        }
        buqu.f154742d = busi;
        try {
            buqu buqu2 = this.f154717a;
            buqu2.f154742d.mo73082a(buqu2.f154741c);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("AutoTestUiInjector", valueOf.length() == 0 ? new String("Error! iAutoTestService.register meet exception! ") : "Error! iAutoTestService.register meet exception! ".concat(valueOf));
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Log.w("AutoTestUiInjector", "onServiceDisconnected called");
        this.f154717a.mo73003a();
    }
}
