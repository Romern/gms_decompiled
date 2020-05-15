package p000;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.util.List;

/* renamed from: busw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class busw extends BroadcastReceiver {

    /* renamed from: a */
    private final buss f154826a;

    public busw(buss buss) {
        this.f154826a = buss;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (busy.f154827e.containsValue(intent.getAction()) && bluetoothDevice != null) {
                List a = this.f154826a.f154820a.mo73091a();
                if (a.isEmpty()) {
                    bnsl bnsl = (bnsl) busr.f154819a.mo68390d();
                    bnsl.mo68432a("busw", "onReceive", (int) BaseMfiEventCallback.TYPE_EXPIRED_MFI, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("BTConnStateMgr: receive connection change, but no listener registered.");
                    return;
                }
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    ((busx) a.get(i)).mo37229a(((Integer) ((bnod) busy.f154827e).f131895d.get(intent.getAction())).intValue(), intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1), intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1), bluetoothDevice);
                }
                return;
            }
            busr busr = busr.f154819a;
            return;
        }
        busr busr2 = busr.f154819a;
    }
}
