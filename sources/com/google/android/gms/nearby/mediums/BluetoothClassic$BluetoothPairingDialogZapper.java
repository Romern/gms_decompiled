package com.google.android.gms.nearby.mediums;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothClassic$BluetoothPairingDialogZapper extends aacn {

    /* renamed from: a */
    private final Context f80644a;

    /* renamed from: b */
    private final IntentFilter f80645b;

    /* renamed from: c */
    private int f80646c = 0;

    public BluetoothClassic$BluetoothPairingDialogZapper(Context context) {
        super("nearby");
        this.f80644a = context;
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST");
        this.f80645b = intentFilter;
        intentFilter.addAction("android.bluetooth.device.action.CONNECTION_ACCESS_REQUEST");
        this.f80645b.setPriority(999);
    }

    /* renamed from: a */
    public final synchronized void mo44289a() {
        if (cfnv.m140753O()) {
            if (this.f80646c == 0) {
                this.f80644a.registerReceiver(this, this.f80645b);
            }
            this.f80646c++;
        }
    }

    /* renamed from: b */
    public final synchronized void mo44290b() {
        if (cfnv.m140753O()) {
            int i = this.f80646c - 1;
            this.f80646c = i;
            if (i == 0) {
                ahhd.m55766a(this.f80644a, this);
            }
        }
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action = intent.getAction();
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("com.google.android.gms.nearby.mediums.BluetoothClassic$BluetoothPairingDialogZapper", "a", 619, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Bluetooth Classic pairing intent received: %s", action);
        if ("android.bluetooth.device.action.PAIRING_REQUEST".equals(action)) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", Integer.MIN_VALUE);
            if (intExtra == 2 || intExtra == 3) {
                bluetoothDevice.setPairingConfirmation(true);
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                bnsl2.mo68432a("com.google.android.gms.nearby.mediums.BluetoothClassic$BluetoothPairingDialogZapper", "a", 628, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Intercepted and confirmed Bluetooth Classic pairing dialog for %s", bluetoothDevice.getName());
                abortBroadcast();
            }
        }
    }
}
