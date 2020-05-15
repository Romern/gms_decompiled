package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.nearby.bootstrap.BluetoothScanner$1;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ahci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahci implements ahcv {

    /* renamed from: a */
    public static final bnsp f66985a = bnsp.m110328a("NearbyBootstrap");

    /* renamed from: b */
    public ahdv f66986b;

    /* renamed from: c */
    public final Map f66987c;

    /* renamed from: d */
    final BroadcastReceiver f66988d = new BluetoothScanner$1(this, "nearby");

    /* renamed from: e */
    public final buqb f66989e;

    /* renamed from: f */
    private final Context f66990f;

    /* renamed from: g */
    private final BluetoothAdapter f66991g;

    /* renamed from: h */
    private boolean f66992h;

    public ahci(Context context, buqb buqb) {
        this.f66990f = context;
        this.f66989e = buqb;
        this.f66987c = new HashMap();
        this.f66991g = BluetoothAdapter.getDefaultAdapter();
        this.f66992h = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo36286a() {
        if (this.f66992h) {
            BluetoothAdapter bluetoothAdapter = this.f66991g;
            if (bluetoothAdapter != null) {
                bluetoothAdapter.cancelDiscovery();
                this.f66990f.unregisterReceiver(this.f66988d);
                this.f66992h = false;
                if (mo36295b()) {
                    try {
                        this.f66986b.mo36361a();
                    } catch (RemoteException | NullPointerException e) {
                        bnsl bnsl = (bnsl) f66985a.mo68388c();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("ahci", "a", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("BluetoothScanner: Fail to call onScanStopped");
                    }
                }
            } else {
                bnsl bnsl2 = (bnsl) f66985a.mo68388c();
                bnsl2.mo68432a("ahci", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("BluetoothScanner: Bluetooth adapter is not available");
            }
        }
    }

    /* renamed from: b */
    public final boolean mo36295b() {
        ahdv ahdv = this.f66986b;
        return (ahdv == null || ahdv.asBinder() == null || !this.f66986b.asBinder().isBinderAlive()) ? false : true;
    }

    /* renamed from: c */
    public final boolean mo36289c() {
        return this.f66992h;
    }

    /* renamed from: a */
    public final synchronized void mo36287a(ahdv ahdv) {
        if (this.f66991g != null) {
            this.f66986b = ahdv;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.FOUND");
            intentFilter.addAction("android.bluetooth.device.action.NAME_CHANGED");
            intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
            this.f66990f.registerReceiver(this.f66988d, intentFilter);
            this.f66991g.startDiscovery();
            this.f66992h = true;
            return;
        }
        bnsl bnsl = (bnsl) f66985a.mo68388c();
        bnsl.mo68432a("ahci", "a", 47, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("BluetoothScanner: Bluetooth adapter is not available");
    }
}
