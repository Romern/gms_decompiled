package p000;

import android.content.Intent;
import android.os.RemoteException;
import java.util.concurrent.CountDownLatch;

/* renamed from: awpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awpo implements bjex {

    /* renamed from: a */
    private final awpn f94813a;

    public awpo(awpn awpn) {
        this.f94813a = awpn;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final bjfd mo52450a(bjfc bjfc) {
        Intent intent;
        CountDownLatch countDownLatch;
        bjfs bjfs;
        try {
            awpn awpn = this.f94813a;
            sdo.m34973b("ActionsPaymentsServiceConnection.getService() called on main thread");
            synchronized (awpn) {
                sdo.m34971a(awpn.f94808a, (Object) "getService() should not be called before connect().");
                countDownLatch = awpn.f94809b;
            }
            countDownLatch.await();
            synchronized (awpn) {
                sdo.checkIfNull(awpn.f94810c, "Disconnected while trying to return action service.");
                bjfs = awpn.f94810c;
            }
            intent = bjfs.mo52452a(bjfc.f122612a);
        } catch (RemoteException | InterruptedException e) {
            intent = bjfd.m103295a(3);
        }
        return new bjfd(intent);
    }

    /* renamed from: b */
    public final boolean mo52451b(bjfc bjfc) {
        return true;
    }
}
