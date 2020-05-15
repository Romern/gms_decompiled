package p000;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.ParcelUuid;
import com.google.android.gms.auth.proximity.BleBackgroundAdvertiser$WakeUpBroadcastReceiver;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: jiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jiu {

    /* renamed from: a */
    public static final sek f22568a = jsy.m17256a("BleBackgroundAdvertiser");

    /* renamed from: b */
    public static final long f22569b = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: c */
    public static final ParcelUuid f22570c = new ParcelUuid(UUID.fromString("0000fe50-0000-1000-8000-00805f9b34fb"));

    /* renamed from: d */
    public final jla f22571d;

    /* renamed from: e */
    public String f22572e;

    /* renamed from: f */
    public AdvertiseCallback f22573f;

    /* renamed from: g */
    public boolean f22574g = false;

    /* renamed from: h */
    public jis f22575h;

    /* renamed from: i */
    private final Context f22576i;

    /* renamed from: j */
    private final BluetoothAdapter f22577j;

    /* renamed from: k */
    private final jmh f22578k;

    /* renamed from: l */
    private final skc f22579l;

    /* renamed from: m */
    private BleBackgroundAdvertiser$WakeUpBroadcastReceiver f22580m;

    public jiu(Context context) {
        Context applicationContext = context.getApplicationContext();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        jla jla = new jla();
        jle jle = new jle();
        skc skc = new skc(context.getApplicationContext());
        this.f22576i = applicationContext;
        this.f22577j = defaultAdapter;
        this.f22571d = jla;
        this.f22578k = jle;
        this.f22579l = skc;
    }

    /* renamed from: d */
    private final PendingIntent m16774d() {
        return PendingIntent.getBroadcast(this.f22576i, 0, new Intent("com.google.android.gms.auth.proximity.BleBackgroundAdvertiser.ALARM").setPackage(this.f22576i.getPackageName()), 134217728);
    }

    /* renamed from: b */
    public final BluetoothLeAdvertiser mo13771b() {
        BluetoothAdapter bluetoothAdapter = this.f22577j;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.getBluetoothLeAdvertiser();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo13772c() {
        if (this.f22580m == null) {
            BleBackgroundAdvertiser$WakeUpBroadcastReceiver bleBackgroundAdvertiser$WakeUpBroadcastReceiver = new BleBackgroundAdvertiser$WakeUpBroadcastReceiver(this);
            this.f22580m = bleBackgroundAdvertiser$WakeUpBroadcastReceiver;
            this.f22576i.registerReceiver(bleBackgroundAdvertiser$WakeUpBroadcastReceiver, new IntentFilter("com.google.android.gms.auth.proximity.BleBackgroundAdvertiser.ALARM"));
        }
        long d = cchi.m129672d();
        long currentTimeMillis = System.currentTimeMillis();
        int i = Build.VERSION.SDK_INT;
        this.f22579l.mo25673a("BleBackgroundAdvertiser", 0, currentTimeMillis + d, m16774d());
    }

    /* renamed from: a */
    public final void mo13769a() {
        AdvertiseCallback advertiseCallback;
        if (this.f22574g) {
            BleBackgroundAdvertiser$WakeUpBroadcastReceiver bleBackgroundAdvertiser$WakeUpBroadcastReceiver = this.f22580m;
            if (bleBackgroundAdvertiser$WakeUpBroadcastReceiver == null) {
                f22568a.mo25416d("BroadcastReceiver not registered.", new Object[0]);
            } else {
                this.f22576i.unregisterReceiver(bleBackgroundAdvertiser$WakeUpBroadcastReceiver);
                this.f22580m = null;
            }
            this.f22579l.mo25668a(m16774d());
            BluetoothLeAdvertiser b = mo13771b();
            if (!(b == null || (advertiseCallback = this.f22573f) == null)) {
                b.stopAdvertising(advertiseCallback);
            }
            this.f22574g = false;
            this.f22572e = null;
            this.f22573f = null;
        }
    }

    /* renamed from: a */
    public final void mo13770a(jir jir) {
        if (!this.f22574g) {
            this.f22574g = true;
            this.f22578k.mo13848a(new jiq(this, jsz.m17257a(), jir));
            return;
        }
        jir.mo13767a();
    }
}
