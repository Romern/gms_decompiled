package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;

/* renamed from: ahxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahxc implements ahxh {
    /* renamed from: a */
    public final void mo37254a(Context context, BluetoothDevice bluetoothDevice) {
    }

    /* renamed from: a */
    public final void mo37255a(Context context, BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        if (bArr != null && bArr.length >= 2 && bArr[0] == 4 && bArr[1] == 1) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68409a("AcknowledgementEventGroupListener: Support rfcomm ring or not, event code = %d", i);
            ((ahxj) ahgz.m55754a(context, ahxj.class)).mo37259a(bluetoothDevice, 4, 1, i);
        }
    }
}
