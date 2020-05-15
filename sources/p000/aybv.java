package p000;

import android.bluetooth.BluetoothManager;
import android.bluetooth.le.ScanCallback;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aybv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aybv {

    /* renamed from: a */
    public String f97076a;

    /* renamed from: b */
    public ScanCallback f97077b;

    /* renamed from: c */
    public final BluetoothManager f97078c;

    /* renamed from: d */
    public final asfb f97079d;

    /* renamed from: e */
    public final AtomicBoolean f97080e = new AtomicBoolean(false);

    static {
        chnj.f188812a.mo6606a().mo85424aw();
    }

    public aybv(BluetoothManager bluetoothManager, asfb asfb) {
        this.f97078c = bluetoothManager;
        this.f97079d = asfb;
        asfb.mo49115a(false);
    }

    /* renamed from: a */
    public static void m83784a(String str) {
        if (Log.isLoggable("BleScanHelper", 3)) {
            Log.d("BleScanHelper", str);
        }
    }
}
