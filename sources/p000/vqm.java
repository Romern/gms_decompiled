package p000;

import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: vqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vqm extends vqo {

    /* renamed from: b */
    private final Set f49800b = bnon.f131923a;

    public vqm(String str) {
        super(str);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28750a(BluetoothDevice bluetoothDevice) {
        ParcelUuid[] uuids = bluetoothDevice.getUuids();
        if (uuids == null || (r0 = uuids.length) == 0) {
            return this.f49800b;
        }
        HashSet a = bnpf.m110047a();
        for (ParcelUuid parcelUuid : uuids) {
            a.add(Long.valueOf(parcelUuid.getUuid().getMostSignificantBits() >> 32));
        }
        return a;
    }
}
