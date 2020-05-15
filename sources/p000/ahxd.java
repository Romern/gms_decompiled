package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: ahxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahxd implements ahxh {
    /* renamed from: a */
    private static final void m56824a(Context context, BluetoothDevice bluetoothDevice, boolean z) {
        bluetoothDevice.setSilenceMode(z);
        String address = bluetoothDevice.getAddress();
        if (ayqx.m84636a(context)) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("ayqx", "a", 76, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Send silent mode to validator");
            context.sendBroadcast(new Intent("com.google.android.libraries.bluetooth.fastpair.action.SILENT_STATE_CHANGE").setPackage("com.google.location.nearby.apps.fastpair.validator").putExtra("com.google.android.gms.nearby.discovery.PUBLIC_ADDRESS", address).putExtra("com.google.android.gms.nearby.discovery.EXTRA_SILENT_STATE", z));
            return;
        }
        bnsp bnsp = aypn.f98194a;
    }

    /* renamed from: a */
    public final void mo37254a(Context context, BluetoothDevice bluetoothDevice) {
        if (!burl.m120292a()) {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("BluetoothEventGroupListener: onDisconnect: not un-silencing due to bt disabled.");
            return;
        }
        int i = Build.VERSION.SDK_INT;
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("BluetoothEventGroupListener: onDisconnect: Un-silencing bluetooth device: %s", bluetoothDevice.getAddress());
        m56824a(context, bluetoothDevice, false);
    }

    /* renamed from: a */
    public final void mo37255a(Context context, BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        if (i == 1) {
            int i2 = Build.VERSION.SDK_INT;
            if (cfoj.m141544Y()) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("BluetoothEventGroupListener: onEvent: Silencing bluetooth device: %s", bluetoothDevice.getAddress());
                m56824a(context, bluetoothDevice, true);
            }
        } else if (i == 2) {
            int i3 = Build.VERSION.SDK_INT;
            if (cfoj.m141544Y()) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("BluetoothEventGroupListener: onEvent: Un-silencing bluetooth device: %s", bluetoothDevice.getAddress());
                m56824a(context, bluetoothDevice, false);
            }
        }
    }
}
