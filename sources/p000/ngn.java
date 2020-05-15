package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.beacon.scan.manager.BleStateReceiver$1;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ngn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ngn {

    /* renamed from: a */
    public final Context f35521a;

    /* renamed from: b */
    public final IntentFilter f35522b = new IntentFilter();

    /* renamed from: c */
    public final BluetoothAdapter f35523c;

    /* renamed from: d */
    public final Set f35524d = new HashSet();

    /* renamed from: e */
    boolean f35525e = false;

    /* renamed from: f */
    public boolean f35526f = false;

    /* renamed from: g */
    public final BroadcastReceiver f35527g = new BleStateReceiver$1(this, "beacon");

    /* renamed from: h */
    private final ReentrantLock f35528h = new ReentrantLock();

    public ngn(Context context) {
        BluetoothAdapter adapter = ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
        this.f35521a = context;
        this.f35523c = adapter;
        this.f35522b.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        int i = Build.VERSION.SDK_INT;
        this.f35522b.addAction("android.bluetooth.adapter.action.BLE_STATE_CHANGED");
        if (adapter == null) {
            nha.m26246c("Missing BluetoothAdapter");
        }
    }

    /* renamed from: a */
    public final void mo20602a(ngm ngm) {
        this.f35528h.lock();
        try {
            this.f35524d.add(ngm);
        } finally {
            this.f35528h.unlock();
        }
    }

    /* renamed from: b */
    public final boolean mo20604b() {
        return mo20603a() && !this.f35523c.isEnabled();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        if (mo20607e() != false) goto L_0x0016;
     */
    /* renamed from: c */
    public final synchronized void mo20605c() {
        if (this.f35525e) {
            try {
                if (this.f35523c != null) {
                    if (this.f35526f) {
                    }
                    boolean disableBLE = this.f35523c.disableBLE();
                    StringBuilder sb = new StringBuilder(27);
                    sb.append("disableBLE() returned ");
                    sb.append(disableBLE);
                    sb.toString();
                    if (disableBLE) {
                        this.f35526f = false;
                    } else {
                        return;
                    }
                }
                this.f35521a.unregisterReceiver(this.f35527g);
            } catch (IllegalArgumentException e) {
            }
            this.f35525e = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        return;
     */
    /* renamed from: d */
    public final synchronized void mo20606d() {
        if (this.f35523c != null && this.f35525e) {
            if (mo20607e()) {
                if (!this.f35526f) {
                    this.f35526f = this.f35523c.enableBLE();
                }
            }
            if (!mo20607e() && this.f35526f) {
                this.f35526f = !this.f35523c.disableBLE();
            }
        }
    }

    /* renamed from: e */
    public final boolean mo20607e() {
        BluetoothAdapter bluetoothAdapter;
        int i = Build.VERSION.SDK_INT;
        return ccos.f179648a.mo6606a().mo76554b() && (bluetoothAdapter = this.f35523c) != null && bluetoothAdapter.isBleScanAlwaysAvailable();
    }

    /* renamed from: f */
    public final int mo20608f() {
        if (this.f35523c != null) {
            int i = Build.VERSION.SDK_INT;
            Integer a = ngx.m26237a(this.f35523c, "getLeState");
            String valueOf = String.valueOf(a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Internal LE state: ");
            sb.append(valueOf);
            sb.toString();
            if (a == null) {
                nha.m26243a("Unable to invoke getLeState on MNC+");
            }
            return a == null ? this.f35523c.getState() : a.intValue();
        }
        nha.m26246c("Missing BluetoothAdapter");
        return 10;
    }

    /* renamed from: a */
    public final boolean mo20603a() {
        BluetoothAdapter bluetoothAdapter = this.f35523c;
        return bluetoothAdapter != null && (bluetoothAdapter.isEnabled() || mo20607e());
    }
}
