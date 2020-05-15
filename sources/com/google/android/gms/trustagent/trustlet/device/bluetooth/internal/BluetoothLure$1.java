package com.google.android.gms.trustagent.trustlet.device.bluetooth.internal;

import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class BluetoothLure$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ autd f109168a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothLure$1(autd autd, String str) {
        super(str);
        this.f109168a = autd;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String str;
        String str2;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
        if (bluetoothDevice == null) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("No Bluetooth device in broadcast ");
            sb.append(valueOf);
            Log.e("Coffee-BluetoothLure", sb.toString());
        } else if (intExtra == 12) {
            autd autd = this.f109168a;
            if (!autd.f92476b.mo50897c(bluetoothDevice) && !autd.f92478d.getBoolean(auuj.m77871j(bluetoothDevice.getAddress()), false) && !cgzn.f188126a.mo6606a().mo84812a()) {
                String a = auuj.m77854a(bluetoothDevice);
                if (TextUtils.isEmpty(a)) {
                    str = autd.f92475a.getString(C0126R.string.auth_bluetooth_lure_one_line_message_unknown_device);
                } else {
                    str = autd.f92475a.getString(C0126R.string.auth_bluetooth_lure_one_line_message, auuj.m77854a(bluetoothDevice));
                }
                if (TextUtils.isEmpty(a)) {
                    str2 = autd.f92475a.getString(C0126R.string.auth_bluetooth_lure_multi_line_message_unknown_device);
                } else {
                    str2 = autd.f92475a.getString(C0126R.string.auth_bluetooth_lure_multi_line_message, auuj.m77854a(bluetoothDevice));
                }
                int a2 = aupf.m77548a();
                PendingIntent a3 = aupf.m77549a(autd.f92475a, bogq.BLUETOOTH_LURE, a2);
                Intent intent2 = new Intent();
                intent2.setClassName(autd.f92475a, "com.google.android.gms.trustagent.TrustedDevicesIntroActivity");
                intent2.putExtra("com.google.android.gms.auth.trustagent.TrustedDevicesAddingIntroActivity.bluetooth_device", bluetoothDevice);
                intent2.putExtra("com.google.android.gms.auth.TrustAgentIdOfNotificationToClose", a2);
                intent2.putExtra("notification_shown_time", System.currentTimeMillis());
                intent2.putExtra("notification_type_key", 2);
                intent2.addFlags(67108864);
                Context context2 = autd.f92475a;
                int i = autd.f92479e;
                autd.f92479e = i + 1;
                PendingIntent activity = PendingIntent.getActivity(context2, i, intent2, JGCastService.FLAG_PRIVATE_DISPLAY);
                int a4 = qkj.m32287a(autd.f92475a, C0126R.C0127drawable.quantum_ic_lock_open_white_24);
                aupf aupf = new aupf(autd.f92475a);
                aupf.f92251d = activity;
                aupf.f92249b = str;
                aupf.f92250c = str2;
                aupf.f92248a = autd.f92475a.getString(C0126R.string.auth_trust_agent_promotion_notification_title);
                aupf.f92254g = a4;
                aupf.f92252e = a3;
                aupf.f92253f = bogq.BLUETOOTH_LURE;
                aupf.f92264q = a2;
                aupf.mo50787b();
                Log.i("Coffee-BluetoothLure", "log notification event notification type: TrustAgentEvent.BLUETOOTH_LURE, notification event type: TrustAgentEvent.NOTIFICATION_SHOWN");
                bogj bogj = (bogj) bohi.f133070z.mo74144da();
                bxvd da = bogm.f133003e.mo74144da();
                bogq bogq = bogq.BLUETOOTH_LURE;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bogm bogm = (bogm) da.f164949b;
                bogm.f133006b = bogq.f133019h;
                int i2 = bogm.f133005a | 1;
                bogm.f133005a = i2;
                bogm.f133007c = 0;
                bogm.f133005a = i2 | 2;
                bogj.mo68908a((bogm) da.mo74062i());
                aupk.m77567a(autd.f92475a, (bohi) bogj.mo74062i());
                autd.f92478d.edit().putBoolean(auuj.m77871j(bluetoothDevice.getAddress()), true).apply();
            }
        }
    }
}
