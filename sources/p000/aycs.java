package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.node.bluetooth.BluetoothServer$1;
import java.io.Closeable;

/* renamed from: aycs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aycs implements Closeable, ayjm {

    /* renamed from: a */
    private final BluetoothAdapter f97175a = BluetoothAdapter.getDefaultAdapter();

    /* renamed from: b */
    private final Context f97176b;

    /* renamed from: c */
    private ConnectionConfiguration f97177c;

    /* renamed from: d */
    private aycr f97178d;

    /* renamed from: e */
    private boolean f97179e;

    /* renamed from: f */
    private final BroadcastReceiver f97180f = new BluetoothServer$1(this, "wearable");

    public aycs(Context context) {
        sdo.m34967a("BluetoothServer.constructor");
        this.f97176b = context;
        context.registerReceiver(this.f97180f, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    /* renamed from: a */
    public final void mo53910a() {
        if (!this.f97179e) {
            BluetoothAdapter bluetoothAdapter = this.f97175a;
            if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
                if (this.f97178d == null) {
                    aycr aycr = new aycr(this, this.f97177c);
                    this.f97178d = aycr;
                    aycr.start();
                } else if (Log.isLoggable("WearableBluetooth", 3)) {
                    Log.d("WearableBluetooth", "Bluetooth thread already started. Ignoring duplicate start attempt.");
                }
            } else if (Log.isLoggable("WearableBluetooth", 3)) {
                Log.d("WearableBluetooth", "Waiting for Bluetooth adapter to enable before starting connection.");
            }
        } else if (Log.isLoggable("WearableBluetooth", 3)) {
            Log.d("WearableBluetooth", "Not starting connection after object is disposed.");
        }
    }

    /* renamed from: b */
    public final void mo53912b() {
        aycr aycr = this.f97178d;
        if (aycr != null) {
            aycr.close();
            this.f97178d = null;
        }
    }

    public final void close() {
        sdo.m34967a("close");
        this.f97179e = true;
        this.f97176b.unregisterReceiver(this.f97180f);
        mo53912b();
    }

    /* renamed from: b */
    public final void mo53913b(ConnectionConfiguration connectionConfiguration) {
        sdo.m34967a("removeConfiguration");
        sdo.m34974b(connectionConfiguration.equals(this.f97177c));
        mo53912b();
    }

    /* renamed from: a */
    public final void mo53911a(ConnectionConfiguration connectionConfiguration) {
        sdo.m34967a("addConfiguration");
        this.f97177c = connectionConfiguration;
        mo53910a();
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        sdo.m34967a("dump");
        boolean isEnabled = this.f97175a.isEnabled();
        StringBuilder sb = new StringBuilder(16);
        sb.append("isEnabled: ");
        sb.append(isEnabled);
        ssb.println(sb.toString());
        boolean z3 = this.f97179e;
        StringBuilder sb2 = new StringBuilder(15);
        sb2.append("isClosed: ");
        sb2.append(z3);
        ssb.println(sb2.toString());
        boolean z4 = this.f97178d != null;
        StringBuilder sb3 = new StringBuilder(22);
        sb3.append("isThreadRunning: ");
        sb3.append(z4);
        ssb.println(sb3.toString());
    }
}
