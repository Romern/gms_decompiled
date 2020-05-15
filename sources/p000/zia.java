package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: zia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zia implements zhm {

    /* renamed from: b */
    private static final Object f55120b = new Object();

    /* renamed from: c */
    private static final WeakHashMap f55121c = new WeakHashMap();

    /* renamed from: a */
    private final BluetoothDevice f55122a;

    static {
        zvt.m46581a();
    }

    private zia(BluetoothDevice bluetoothDevice) {
        this.f55122a = bluetoothDevice;
    }

    /* renamed from: a */
    public static zhm m45487a(BluetoothDevice bluetoothDevice) {
        synchronized (f55120b) {
            WeakReference weakReference = (WeakReference) f55121c.get(bluetoothDevice);
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    zhm zhm = (zhm) weakReference.get();
                    return zhm;
                }
            }
            zia zia = new zia(bluetoothDevice);
            f55121c.put(bluetoothDevice, new WeakReference(zia));
            return zia;
        }
    }

    /* renamed from: b */
    public final String mo31127b() {
        return this.f55122a.getName();
    }

    public final String toString() {
        return String.format("BluetoothDevice{address=%s, name=%s}", mo31125a(), mo31127b());
    }

    /* renamed from: a */
    public final String mo31125a() {
        return this.f55122a.getAddress();
    }

    /* renamed from: a */
    public final zhn mo31126a(Context context, zho zho) {
        return zib.m45491a(this.f55122a.connectGatt(context, false, new zhz(zho)));
    }
}
