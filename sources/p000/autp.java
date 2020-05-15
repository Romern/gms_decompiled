package p000;

import android.bluetooth.BluetoothDevice;
import java.util.Arrays;

/* renamed from: autp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class autp {

    /* renamed from: a */
    public final BluetoothDevice f92504a;

    /* renamed from: b */
    public final String f92505b;

    public autp(BluetoothDevice bluetoothDevice, String str) {
        if ("on_body".equals(str) || "user_authenticated".equals(str)) {
            this.f92504a = bluetoothDevice;
            this.f92505b = str;
            return;
        }
        throw new auto();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof autp) {
            autp autp = (autp) obj;
            return this.f92504a.equals(autp.f92504a) && this.f92505b.equals(autp.f92505b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f92504a, this.f92505b});
    }

    public final String toString() {
        return this.f92505b;
    }
}
