package p000;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: ahcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahcl extends AdvertiseCallback {

    /* renamed from: a */
    public final CountDownLatch f66993a = new CountDownLatch(1);

    /* renamed from: b */
    public boolean f66994b;

    /* renamed from: a */
    public final boolean mo36296a(long j) {
        try {
            if (this.f66993a.await(j, TimeUnit.MILLISECONDS)) {
                return this.f66994b;
            }
            return false;
        } catch (InterruptedException e) {
            bnsl bnsl = (bnsl) ahcn.f66999a.mo68388c();
            bnsl.mo68432a("ahcl", "a", 223, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BluetoothTargetDevice: Timed out waiting for BLE advertising to start");
            return false;
        }
    }

    public final void onStartFailure(int i) {
        bnsl bnsl = (bnsl) ahcn.f66999a.mo68387b();
        bnsl.mo68432a("ahcl", "onStartFailure", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("BluetoothTargetDevice: Failed to start BLE advertise: %d", i);
        this.f66994b = false;
        this.f66993a.countDown();
    }

    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        bnsp bnsp = ahcn.f66999a;
        this.f66994b = true;
        this.f66993a.countDown();
    }
}
