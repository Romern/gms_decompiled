package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelUuid;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xsz {

    /* renamed from: k */
    public static final Logger f53015k = new Logger(new String[]{"CableAuthenticatorScan"}, (short[]) null);

    /* renamed from: a */
    public final xwj f53016a;

    /* renamed from: b */
    public final xto f53017b;

    /* renamed from: c */
    public final Handler f53018c;

    /* renamed from: d */
    public final BluetoothAdapter f53019d = BluetoothAdapter.getDefaultAdapter();

    /* renamed from: e */
    public final BluetoothLeScanner f53020e;

    /* renamed from: f */
    public final AtomicReference f53021f;

    /* renamed from: g */
    public final xwn f53022g;

    /* renamed from: h */
    public ScanCallback f53023h;

    /* renamed from: i */
    public Runnable f53024i;

    /* renamed from: j */
    public final xta f53025j;

    public xsz(xwj xwj, xto xto, xta xta, BluetoothLeScanner bluetoothLeScanner, xwn xwn) {
        this.f53016a = xwj;
        this.f53017b = xto;
        this.f53025j = xta;
        this.f53020e = bluetoothLeScanner;
        this.f53018c = new adzt(Looper.myLooper());
        this.f53021f = new AtomicReference(xsy.NOT_STARTED);
        this.f53022g = xwn;
    }

    /* renamed from: b */
    public static ParcelUuid m43376b() {
        return new ParcelUuid(UUID.fromString((String) xmn.f52766p.mo58455c()));
    }

    /* renamed from: a */
    public final void mo30114a() {
        if (!((xsy) this.f53021f.get()).equals(xsy.NOT_STARTED)) {
            f53015k.mo25414c("Stopping scan...", new Object[0]);
            this.f53021f.set(xsy.TERMINATED);
            this.f53018c.removeCallbacks(this.f53024i);
            if (this.f53020e != null && this.f53019d.isEnabled()) {
                try {
                    this.f53020e.stopScan(this.f53023h);
                } catch (Exception e) {
                }
            }
            xta xta = this.f53025j;
            if (xta.f53026a.f53052f == xtj.SCANNING_FOR_CLIENT) {
                xtk.f53046k.mo25414c("  Scan timed out...", new Object[0]);
                xta.f53026a.f53061p = null;
                xta.f53026a.mo30122b();
            }
        }
    }
}
