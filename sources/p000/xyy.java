package p000;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;
import com.google.android.gms.fido.common.Transport;
import java.util.HashSet;
import java.util.Set;

/* renamed from: xyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xyy {

    /* renamed from: a */
    private final BluetoothAdapter f53416a;

    /* renamed from: b */
    private final Set f53417b;

    /* renamed from: c */
    private final boolean f53418c;

    /* renamed from: d */
    private final xhy f53419d;

    static {
        new Logger(new String[]{"EnabledTransportsProvider"}, (short[]) null);
    }

    public xyy(BluetoothAdapter bluetoothAdapter, xhy xhy, boolean z, Set set) {
        this.f53416a = bluetoothAdapter;
        this.f53419d = xhy;
        this.f53418c = z;
        bmxy.m108581a(set);
        this.f53417b = set;
    }

    /* renamed from: a */
    public final Set mo30279a() {
        Set hashSet = new HashSet();
        if (this.f53416a != null) {
            hashSet.add(Transport.BLUETOOTH_LOW_ENERGY);
        }
        if (this.f53419d != null) {
            hashSet.add(Transport.NFC);
        }
        if (this.f53418c) {
            hashSet.add(Transport.USB);
        }
        if (hashSet.size() != 1) {
            hashSet = bnpf.m110055b(hashSet, this.f53417b);
        }
        int i = Build.VERSION.SDK_INT;
        return hashSet;
    }
}
