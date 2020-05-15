package p000;

import android.bluetooth.BluetoothDevice;
import android.os.Build;

/* renamed from: ahxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahxm extends buqn {

    /* renamed from: a */
    final /* synthetic */ BluetoothDevice f68292a;

    /* renamed from: b */
    final /* synthetic */ ahxn f68293b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahxm(ahxn ahxn, String str, BluetoothDevice bluetoothDevice) {
        super(str);
        this.f68293b = ahxn;
        this.f68292a = bluetoothDevice;
    }

    public final void run() {
        int i;
        ahxn ahxn = this.f68293b;
        ahxj ahxj = ahxn.f68295b;
        BluetoothDevice bluetoothDevice = this.f68292a;
        ahyz a = ahxn.f68296c.mo37033a(bluetoothDevice.getAddress());
        if (a == null || (a.f68427a & 1024) == 0) {
            i = 0;
        } else {
            aiaa aiaa = a.f68439n;
            if (aiaa == null) {
                aiaa = aiaa.f68501K;
            }
            if (ahvd.m56713a(ahvd.m56709a(aiaa), ahxn.f68294a)) {
                i = 1;
            } else {
                i = 0;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        ahxj.mo37260a(bluetoothDevice, 7, new byte[]{(byte) (i | 2)});
        this.f68293b.f68295b.mo37260a(this.f68292a, 8, new byte[]{1, (byte) Build.VERSION.SDK_INT});
    }
}
