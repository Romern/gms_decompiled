package com.google.android.gms.fido.communication.ble;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BlePairer$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ xim f31678a;

    /* renamed from: b */
    final /* synthetic */ xin f31679b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlePairer$1(xin xin, String str, xim xim) {
        super(str);
        this.f31679b = xin;
        this.f31678a = xim;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        xin xin = this.f31679b;
        xim xim = this.f31678a;
        sek sek = xin.f52362c;
        String action = intent.getAction();
        if (!"android.bluetooth.device.action.BOND_STATE_CHANGED".equals(action)) {
            sek sek2 = xin.f52362c;
            String valueOf = String.valueOf(action);
            sek2.mo25418e(valueOf.length() == 0 ? new String("bluetoothStateChangeReceiver: received spurious action: ") : "bluetoothStateChangeReceiver: received spurious action: ".concat(valueOf), new Object[0]);
            return;
        }
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        xil xil = xin.f52363a;
        if (bluetoothDevice != null && bluetoothDevice.getAddress().equals(xil.mo29811a().getAddress())) {
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
            if (intExtra == 12) {
                xin.f52362c.mo25414c(String.format("Successfully paired with device: %s", xin.f52363a.mo29811a()), new Object[0]);
                context.unregisterReceiver(xin.f52364b);
                xim.mo29723a(1, bluetoothDevice);
            } else if (intExtra == 11) {
                xin.f52362c.mo25409a(String.format("Pairing with device: %s in progress", xin.f52363a.mo29811a()), new Object[0]);
            } else if (intExtra == 10) {
                xin.f52362c.mo25414c(String.format("Pairing with device: %s failed", xin.f52363a.mo29811a()), new Object[0]);
                context.unregisterReceiver(xin.f52364b);
                xim.mo29723a(2, bluetoothDevice);
            }
        } else {
            xin.f52362c.mo25418e("Received bond state change intent for %s, waiting for %s, ignoring.", bluetoothDevice, xin.f52363a.mo29811a());
        }
    }
}
