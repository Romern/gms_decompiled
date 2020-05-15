package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: zhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zhy implements zhl {

    /* renamed from: a */
    private static final srn f55116a = zvt.m46581a();

    /* renamed from: b */
    private final BluetoothAdapter f55117b;

    /* renamed from: c */
    private final ConcurrentMap f55118c = new ConcurrentHashMap();

    public zhy(BluetoothAdapter bluetoothAdapter) {
        this.f55117b = bluetoothAdapter;
    }

    /* renamed from: a */
    public static zhl m45482a(Context context) {
        return new zhy(((BluetoothManager) context.getSystemService("bluetooth")).getAdapter());
    }

    /* renamed from: b */
    public final void mo31124b(zhk zhk) {
        BluetoothAdapter bluetoothAdapter = this.f55117b;
        bmxy.m108581a(zhk);
        BluetoothAdapter.LeScanCallback zhx = new zhx(zhk);
        BluetoothAdapter.LeScanCallback leScanCallback = (BluetoothAdapter.LeScanCallback) this.f55118c.putIfAbsent(zhk, zhx);
        if (leScanCallback != null) {
            zhx = leScanCallback;
        }
        bluetoothAdapter.startLeScan(zhx);
    }

    /* renamed from: a */
    public final zhm mo31121a(String str) {
        return zia.m45487a(this.f55117b.getRemoteDevice(str));
    }

    /* renamed from: a */
    public final void mo31122a(zhk zhk) {
        bmxy.m108581a(zhk);
        BluetoothAdapter.LeScanCallback leScanCallback = (BluetoothAdapter.LeScanCallback) this.f55118c.remove(zhk);
        if (leScanCallback != null) {
            this.f55117b.stopLeScan(leScanCallback);
        } else {
            ((bnsl) f55116a.mo68388c()).mo68405a("Couldn't find wrapper for scan callback");
        }
    }

    /* renamed from: a */
    public final boolean mo31123a() {
        return this.f55117b.isEnabled();
    }
}
