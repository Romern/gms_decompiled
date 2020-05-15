package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.RttManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: bgkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bgkx {

    /* renamed from: g */
    public static final bgkx f116729g = new bgkw();

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    protected bgkx() {
    }

    /* renamed from: a */
    public int mo62945a(SensorManager sensorManager, int i) {
        throw null;
    }

    /* renamed from: a */
    public long mo62941a(Location location) {
        throw null;
    }

    /* renamed from: a */
    public bfnz mo62953a(RttManager.RttResult rttResult) {
        throw null;
    }

    /* renamed from: a */
    public bgis mo62949a() {
        throw null;
    }

    /* renamed from: a */
    public bgkf mo62951a(ScanResult scanResult) {
        throw null;
    }

    /* renamed from: a */
    public bgma mo62943a(BluetoothDevice bluetoothDevice) {
        throw null;
    }

    /* renamed from: a */
    public void mo62947a(Context context, bgkg bgkg, boolean z, bgmj bgmj, boolean z2, bfor bfor, Executor executor) {
        throw null;
    }

    /* renamed from: a */
    public boolean mo62952a(Context context, int i) {
        throw null;
    }

    /* renamed from: a */
    public boolean mo62944a(WifiManager wifiManager, Context context) {
        throw null;
    }

    /* renamed from: a */
    public void mo62946a(AlarmManager alarmManager, long j, PendingIntent pendingIntent, bgmj bgmj) {
        try {
            alarmManager.set(2, j, pendingIntent);
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public void mo62948a(Context context, String str, LocationListener locationListener, Looper looper) {
        ((LocationManager) context.getSystemService("location")).requestLocationUpdates(str, 0, 0.0f, locationListener);
    }
}
