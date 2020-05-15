package com.google.android.gms.nearby.discovery.fastpair.autotest;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AutoTestBroadcastReceiver extends aacn {

    /* renamed from: a */
    public static final bnic f80498a = bnic.m109493a("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_DELETE_LOCAL_CACHE", "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_AUTO_TEST_SETUP", "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_AUTO_TEST_TEAR_DOWN", "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_AUTO_CONSENT", "android.bluetooth.device.action.PAIRING_REQUEST");

    /* renamed from: b */
    public final buqh f80499b;

    /* renamed from: c */
    public final Context f80500c;

    /* renamed from: d */
    public long f80501d;

    public AutoTestBroadcastReceiver(Context context) {
        super("nearby");
        this.f80500c = context;
        this.f80499b = (buqh) ahgz.m55754a(context, buqh.class);
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (!cfoj.m141545Z()) {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPairAutoTestReceiver: SupportAutoTest not enabled, don't do doReceive!");
        } else if ("android.bluetooth.device.action.PAIRING_REQUEST".equals(intent.getAction())) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f80501d;
            if (elapsedRealtime >= 20000) {
                ((bnsl) ahsd.f67925a.mo68388c()).mo68415a("FastPairAutoTestReceiver: Can't do auto consent because already timeout for %d ms.", elapsedRealtime);
                return;
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice != null) {
                int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", -1);
                if (intExtra != 3) {
                    ((bnsl) ahsd.f67925a.mo68388c()).mo68409a("FastPairAutoTestReceiver: Pairing variant is %d, ignore.", intExtra);
                    return;
                }
                abortBroadcast();
                bluetoothDevice.setPairingConfirmation(true);
                ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("FastPairAutoTestReceiver: Auto consent for device %s.", bluetoothDevice.getAddress());
            }
        } else if (f80498a.contains(intent.getAction())) {
            this.f80499b.mo72987c(new ahwg(this, "fastPairAutoTestBroadcastReceiver", intent));
        }
    }
}
