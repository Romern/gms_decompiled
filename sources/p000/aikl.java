package p000;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aikl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aikl extends airo {

    /* renamed from: a */
    private final AdvertiseSettings f69044a;

    /* renamed from: b */
    private final AdvertiseData f69045b;

    /* renamed from: c */
    private final AdvertiseData f69046c;

    /* renamed from: d */
    private ahga f69047d;

    /* renamed from: e */
    private AdvertiseCallback f69048e;

    public aikl(AdvertiseSettings advertiseSettings, AdvertiseData advertiseData, AdvertiseData advertiseData2) {
        super(31);
        this.f69044a = advertiseSettings;
        this.f69045b = advertiseData;
        this.f69046c = advertiseData2;
    }

    /* renamed from: a */
    public final void mo37566a() {
        AdvertiseCallback advertiseCallback;
        ahga ahga = this.f69047d;
        if (ahga == null || (advertiseCallback = this.f69048e) == null) {
            srn srn = ailf.f69111a;
            return;
        }
        ahga.mo36415a(advertiseCallback);
        this.f69048e = null;
        this.f69047d = null;
    }

    /* renamed from: b */
    public final int mo37568b() {
        ahga a = ahga.m55680a();
        if (a == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aikl", "b", 2496, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to start a BLE Legacy advertisement because Bluetooth is turned off or BLE advertising is not supported on this device.");
            return 4;
        }
        bqgy c = bqgy.m112818c();
        aikk aikk = new aikk(c);
        try {
            a.f67138a.startAdvertising(this.f69044a, this.f69045b, this.f69046c, aikk);
            try {
                c.get(cfnv.m140792p(), TimeUnit.SECONDS);
                this.f69047d = a;
                this.f69048e = aikk;
                srn srn = ailf.f69111a;
                return 2;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68432a("aikl", "b", 2542, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Interrupted while waiting to start BLE Legacy advertising.");
                return 3;
            } catch (ExecutionException e2) {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                bnsl3.mo68437a(e2);
                bnsl3.mo68432a("aikl", "b", 2545, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Failed to start BLE Legacy advertising.");
                return 4;
            } catch (TimeoutException e3) {
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
                bnsl4.mo68437a(e3);
                bnsl4.mo68432a("aikl", "b", 2547, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68415a("Failed to start BLE Legacy advertising in %d seconds.", cfnv.m140792p());
                return 4;
            }
        } catch (IllegalStateException | NullPointerException e4) {
            bnsl bnsl5 = (bnsl) ailf.f69111a.mo68387b();
            bnsl5.mo68432a("aikl", "b", 2524, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("Failed to start a BLE Legacy advertisement.");
            return 4;
        }
    }

    /* renamed from: a */
    public final void mo37567a(PrintWriter printWriter) {
        super.mo37567a(printWriter);
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.f69047d != null);
        printWriter.write(String.format("    Broadcasting: %s\n", objArr));
        printWriter.write(String.format("    Advertise Settings: %s\n", this.f69044a));
        printWriter.write(String.format("    Initial Legacy Advertisement Data: %s\n", this.f69045b));
        printWriter.write(String.format("    Legacy Scan Response: %s\n", this.f69046c));
        printWriter.flush();
    }
}
