package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.android.gms.nearby.mediums.BluetoothClassic$ScanningOperation$1;

/* renamed from: aijg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aijg extends airo {

    /* renamed from: a */
    public final ailg f68954a = new ailg();

    /* renamed from: b */
    public final bqgj f68955b;

    /* renamed from: c */
    private final Context f68956c;

    /* renamed from: d */
    private final BluetoothAdapter f68957d;

    /* renamed from: e */
    private final BroadcastReceiver f68958e;

    /* renamed from: f */
    private final IntentFilter f68959f;

    public aijg(Context context, BluetoothAdapter bluetoothAdapter, bqgj bqgj, ahoi ahoi) {
        super(22);
        this.f68956c = context;
        this.f68957d = bluetoothAdapter;
        this.f68955b = bqgj;
        this.f68958e = new BluetoothClassic$ScanningOperation$1(this, "nearby", ahoi);
        IntentFilter intentFilter = new IntentFilter();
        this.f68959f = intentFilter;
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        this.f68959f.addAction("android.bluetooth.device.action.NAME_CHANGED");
        this.f68959f.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
    }

    /* renamed from: c */
    private final void m57288c() {
        if (this.f68957d.startDiscovery()) {
            srn srn = ailf.f69111a;
            return;
        }
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68432a("aijg", "c", 962, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failed to rejuvenate Bluetooth Classic discovery, no more Bluetooth devices will be seen.");
    }

    /* renamed from: a */
    public final synchronized void mo37566a() {
        if (!this.f68957d.cancelDiscovery()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aijg", "a", 907, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to stop Bluetooth Classic discovery.");
        }
        ahhd.m55766a(this.f68956c, this.f68958e);
    }

    /* renamed from: b */
    public final synchronized int mo37568b() {
        int i;
        this.f68956c.registerReceiver(this.f68958e, this.f68959f);
        if (!this.f68957d.startDiscovery()) {
            ahhd.m55766a(this.f68956c, this.f68958e);
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aijg", "b", 897, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to start Bluetooth Classic discovery.");
            i = 4;
        } else {
            i = 2;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo37573a(Intent intent, ailg ailg, ahoi ahoi) {
        if (!mo37903e()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aijg", "a", 919, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Ignoring Bluetooth Classic scan result because we are no longer discovering.");
        } else if ("android.bluetooth.device.action.FOUND".equals(intent.getAction())) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice != null) {
                String name = bluetoothDevice.getName();
                if (!TextUtils.isEmpty(name)) {
                    ailg.mo37634a(name);
                    ahoi.f67655a.mo36944a(bluetoothDevice);
                }
            }
        } else if ("android.bluetooth.device.action.NAME_CHANGED".equals(intent.getAction())) {
            BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice2 != null) {
                ahoi.f67655a.mo36944a(bluetoothDevice2);
            }
        } else if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(intent.getAction())) {
            for (String str : ailg.mo37633a()) {
                srn srn = ailf.f69111a;
                ahpg ahpg = ahoi.f67655a;
                ahpg.f67714e.mo36847a(new ahpf(ahpg, str));
            }
            if (this.f68957d.startDiscovery()) {
                srn srn2 = ailf.f69111a;
                return;
            }
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
            bnsl2.mo68432a("aijg", "c", 962, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to rejuvenate Bluetooth Classic discovery, no more Bluetooth devices will be seen.");
        }
    }
}
