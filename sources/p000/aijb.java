package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.nearby.mediums.BluetoothClassic$AdvertisingOperation$1;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: aijb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aijb extends airo {

    /* renamed from: a */
    public final Context f68937a;

    /* renamed from: b */
    public final BluetoothAdapter f68938b;

    /* renamed from: c */
    private final String f68939c;

    /* renamed from: d */
    private int f68940d = -1;

    public aijb(Context context, BluetoothAdapter bluetoothAdapter, String str) {
        super(21);
        this.f68937a = context;
        this.f68938b = bluetoothAdapter;
        this.f68939c = str;
    }

    /* renamed from: c */
    private final void m57280c() {
        if (!m57281d(this.f68940d)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aijb", "c", 801, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("Failed to restore original Bluetooth scan mode to %d", this.f68940d);
        }
        this.f68940d = -1;
    }

    /* renamed from: d */
    private final boolean m57281d(int i) {
        return butl.m120434a(new aija(this, i), "SetBluetoothScanMode", new butj(cfnv.f184625a.mo6606a().mo81856x()).mo73110a());
    }

    /* renamed from: e */
    private final boolean m57282e(int i) {
        Context context;
        if (this.f68938b.getScanMode() == i) {
            return true;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        BluetoothClassic$AdvertisingOperation$1 bluetoothClassic$AdvertisingOperation$1 = new BluetoothClassic$AdvertisingOperation$1("nearby", i, countDownLatch);
        this.f68937a.registerReceiver(bluetoothClassic$AdvertisingOperation$1, new IntentFilter("android.bluetooth.adapter.action.SCAN_MODE_CHANGED"));
        try {
            if (((Boolean) ahft.m55666a(this.f68938b).mo36404a("setScanMode", Integer.TYPE).mo36403a(Integer.valueOf(i))).booleanValue()) {
                try {
                    countDownLatch.await(cfnv.m140789m(), TimeUnit.SECONDS);
                    ahhd.m55766a(this.f68937a, bluetoothClassic$AdvertisingOperation$1);
                    if (this.f68938b.getScanMode() == i) {
                        return true;
                    }
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                    bnsl.mo68432a("aijb", "e", 789, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68412a("Couldn't set scan mode to %d in %d seconds", i, cfnv.m140789m());
                    return false;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl2.mo68432a("aijb", "e", 780, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68409a("Interrupted while waiting to set Bluetooth scan mode to %d", i);
                    context = this.f68937a;
                } catch (Throwable th) {
                    ahhd.m55766a(this.f68937a, bluetoothClassic$AdvertisingOperation$1);
                    throw th;
                }
            } else {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                bnsl3.mo68432a("aijb", "e", 760, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68409a("Failed to set scan mode to %d", i);
                context = this.f68937a;
                ahhd.m55766a(context, bluetoothClassic$AdvertisingOperation$1);
                return false;
            }
        } catch (ahfu e2) {
            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
            bnsl4.mo68437a(e2);
            bnsl4.mo68432a("aijb", "e", 764, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68409a("Failed to use reflection to invoke setScanMode to %d", i);
            context = this.f68937a;
        }
    }

    /* renamed from: a */
    public final void mo37566a() {
        if (!m57281d(this.f68940d)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aijb", "c", 801, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("Failed to restore original Bluetooth scan mode to %d", this.f68940d);
        }
        this.f68940d = -1;
        aipd.m57627a().mo37795a(this.f68937a, this.f68938b);
    }

    /* renamed from: b */
    public final int mo37568b() {
        if (aipd.m57627a().mo37796a(this.f68937a, this.f68938b, this.f68939c)) {
            this.f68940d = this.f68938b.getScanMode();
            if (m57281d(23)) {
                return 2;
            }
            this.f68940d = -1;
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aijb", "b", 679, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("Failed to start Bluetooth Classic advertising because we couldn't set the scan mode to %d", 23);
            aipd.m57627a().mo37795a(this.f68937a, this.f68938b);
            return 4;
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
        bnsl2.mo68432a("aijb", "b", 671, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("Failed to start Bluetooth Classic advertising because we couldn't set the device name to %s", this.f68939c);
        return 4;
    }

    /* renamed from: a */
    public final void mo37567a(PrintWriter printWriter) {
        String str;
        super.mo37567a(printWriter);
        Object[] objArr = new Object[1];
        int i = this.f68940d;
        if (i == -1) {
            str = "UNINITIALIZED_SCAN_MODE";
        } else if (i == 23) {
            str = "SCAN_MODE_CONNECTABLE_DISCOVERABLE";
        } else if (i == 20) {
            str = "SCAN_MODE_NONE";
        } else if (i != 21) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Unrecognizable scan mode: ");
            sb.append(i);
            str = sb.toString();
        } else {
            str = "SCAN_MODE_CONNECTABLE";
        }
        objArr[0] = str;
        printWriter.write(String.format("    Scan Mode:%s\n", objArr));
        printWriter.write(String.format("    Device Name: %s\n", this.f68939c));
        printWriter.flush();
    }
}
