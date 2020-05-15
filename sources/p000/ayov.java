package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.concurrent.CountDownLatch;

/* renamed from: ayov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayov implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ ayox f98138a;

    public ayov(ayox ayox) {
        this.f98138a = ayox;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ayqe ayqe;
        ayqj ayqj;
        bnsp bnsp = aypn.f98194a;
        ayox ayox = this.f98138a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.bluetooth.fastpair.IFastPairLoggingService");
            ayqe = queryLocalInterface instanceof ayqe ? (ayqe) queryLocalInterface : new ayqc(iBinder);
        } else {
            ayqe = null;
        }
        ayox.f98145e = ayqe;
        ayox ayox2 = this.f98138a;
        if (ayox2.f98143c == null || (ayqj = ayox2.f98144d) == null) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68388c();
            bnsl.mo68432a("ayov", "onServiceConnected", 71, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            ayox ayox3 = this.f98138a;
            bnsl.mo68424a("FastPair: No extra logging information (%s) or address (%s)", ayox3.f98144d, ayox3.f98143c);
        } else {
            try {
                ayox2.f98145e.mo54220a(ayqj.mo54278a(), this.f98138a.f98143c);
            } catch (RemoteException e) {
                bnsl bnsl2 = (bnsl) aypn.f98194a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("ayov", "onServiceConnected", 68, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("FastPair: Failed to initialize logging service.");
            }
        }
        CountDownLatch countDownLatch = this.f98138a.f98146f;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        bnsp bnsp = aypn.f98194a;
    }
}
