package p000;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.fido.communication.ble.BlePairer$1;

/* renamed from: xin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xin {

    /* renamed from: c */
    public static final sek f52362c = new sek(new String[]{"BlePairer"}, (short[]) null);

    /* renamed from: a */
    public final xil f52363a = new xil();

    /* renamed from: b */
    public BroadcastReceiver f52364b;

    /* renamed from: d */
    private final Context f52365d;

    public xin(Context context) {
        bmxy.m108581a(context);
        this.f52365d = context;
    }

    /* renamed from: a */
    public final void mo29812a(BluetoothDevice bluetoothDevice, xim xim) {
        xil xil = this.f52363a;
        bmxy.m108581a(bluetoothDevice);
        xil.f52361a = bluetoothDevice;
        xil xil2 = this.f52363a;
        bmxy.m108581a(xil2.f52361a);
        if (xil2.f52361a.getBondState() != 12 && xil2.f52361a.getBondState() != 11) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
            BlePairer$1 blePairer$1 = new BlePairer$1(this, "fido", xim);
            this.f52364b = blePairer$1;
            this.f52365d.registerReceiver(blePairer$1, intentFilter);
            xil xil3 = this.f52363a;
            bmxy.m108581a(xil3.f52361a);
            if (!xil3.f52361a.createBond()) {
                f52362c.mo25416d("createBond() returns false", new Object[0]);
                xim.mo29723a(2, bluetoothDevice);
            }
        }
    }
}
