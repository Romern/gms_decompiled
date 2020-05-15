package p000;

import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertisingSetCallback;
import android.bluetooth.le.AdvertisingSetParameters;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aikb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aikb extends airo {

    /* renamed from: a */
    private final AdvertiseData f69012a;

    /* renamed from: b */
    private final AdvertisingSetParameters f69013b;

    /* renamed from: c */
    private ahga f69014c;

    /* renamed from: d */
    private AdvertisingSetCallback f69015d;

    public aikb(AdvertisingSetParameters advertisingSetParameters, AdvertiseData advertiseData) {
        super(31);
        this.f69013b = advertisingSetParameters;
        this.f69012a = advertiseData;
    }

    /* renamed from: a */
    public final void mo37566a() {
        AdvertisingSetCallback advertisingSetCallback;
        ahga ahga = this.f69014c;
        if (ahga == null || (advertisingSetCallback = this.f69015d) == null) {
            srn srn = ailf.f69111a;
            return;
        }
        try {
            ahga.f67138a.stopAdvertisingSet(advertisingSetCallback);
        } catch (IllegalStateException | NullPointerException e) {
        }
        this.f69015d = null;
        this.f69014c = null;
    }

    /* renamed from: b */
    public final int mo37568b() {
        ahga a = ahga.m55680a();
        if (a == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aikb", "b", 2613, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to start a BLE Extended advertisement because Bluetooth is turned off or BLE advertising is not supported on this device.");
            return 4;
        }
        bqgy c = bqgy.m112818c();
        aika aika = new aika(c);
        try {
            a.f67138a.startAdvertisingSet(this.f69013b, this.f69012a, null, null, null, aika);
            try {
                c.get(cfnv.m140792p(), TimeUnit.SECONDS);
                this.f69014c = a;
                this.f69015d = aika;
                srn srn = ailf.f69111a;
                return 2;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68432a("aikb", "b", 2662, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Interrupted while waiting to start BLE Extended advertising.");
                return 3;
            } catch (ExecutionException e2) {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                bnsl3.mo68437a(e2);
                bnsl3.mo68432a("aikb", "b", 2665, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Failed to start BLE Extended advertising.");
                return 4;
            } catch (TimeoutException e3) {
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
                bnsl4.mo68437a(e3);
                bnsl4.mo68432a("aikb", "b", 2667, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68415a("Failed to start BLE Extended advertising in %d seconds.", cfnv.m140792p());
                return 4;
            }
        } catch (IllegalStateException | NullPointerException e4) {
            bnsl bnsl5 = (bnsl) ailf.f69111a.mo68387b();
            bnsl5.mo68432a("aikb", "b", 2644, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("Failed to start a BLE Extended advertisement.");
            return 4;
        }
    }

    /* renamed from: a */
    public final void mo37567a(PrintWriter printWriter) {
        super.mo37567a(printWriter);
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.f69014c != null);
        printWriter.write(String.format("    Broadcasting: %s\n", objArr));
        printWriter.write(String.format("    Advertise Set Parameters: %s\n", this.f69013b));
        printWriter.write(String.format("    Initial Extended Advertisement Data: %s\n", this.f69012a));
        printWriter.flush();
    }
}
