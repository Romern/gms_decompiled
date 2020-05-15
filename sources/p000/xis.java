package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelUuid;
import com.google.android.gms.fido.communication.ble.BleScanner$1;
import java.util.Arrays;

/* renamed from: xis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xis {

    /* renamed from: e */
    public static final /* synthetic */ int f52369e = 0;

    /* renamed from: h */
    private static final Logger f52370h = new Logger(new String[]{"BleScanner"}, (short[]) null);

    /* renamed from: a */
    public final Handler f52371a = new adzt(Looper.getMainLooper());

    /* renamed from: b */
    public volatile xiq f52372b;

    /* renamed from: c */
    volatile boolean f52373c;

    /* renamed from: d */
    volatile boolean f52374d;

    /* renamed from: f */
    private final xip f52375f;

    /* renamed from: g */
    private final ScanCallback f52376g = new BleScanner$1(this, "fido", "BleScanner");

    public xis(BluetoothAdapter bluetoothAdapter) {
        this.f52375f = new xip(bluetoothAdapter.getBluetoothLeScanner());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo29814a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            f52370h.mo25414c("Skipping stopScan() because Bluetooth is not supported", new Object[0]);
        } else if (!defaultAdapter.isEnabled()) {
            f52370h.mo25414c("Skipping stopScan() because Bluetooth is not enabled", new Object[0]);
        } else if (!this.f52374d && this.f52373c) {
            f52370h.mo25414c("stopScan()", new Object[0]);
            this.f52374d = true;
            this.f52373c = false;
            xip xip = this.f52375f;
            xip.f52368a.stopScan(this.f52376g);
            this.f52372b = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo29815a(xiq xiq) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            f52370h.mo25414c("Skipping startScan() because Bluetooth is not supported", new Object[0]);
        } else if (!defaultAdapter.isEnabled()) {
            f52370h.mo25414c("Skipping startScan() because Bluetooth is not enabled", new Object[0]);
        } else {
            f52370h.mo25414c("startScan()", new Object[0]);
            if (this.f52373c) {
                f52370h.mo25412b("BleScanner is already scanning.", new Object[0]);
                return;
            }
            this.f52373c = true;
            this.f52374d = false;
            this.f52372b = xiq;
            xip xip = this.f52375f;
            ScanCallback scanCallback = this.f52376g;
            ScanFilter build = new ScanFilter.Builder().setServiceUuid(new ParcelUuid(xiv.f52382c)).build();
            ScanSettings build2 = new ScanSettings.Builder().setReportDelay(0).setScanMode(2).build();
            xip.f52368a.startScan(Arrays.asList(build), build2, scanCallback);
        }
    }
}
