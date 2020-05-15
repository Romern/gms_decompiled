package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: ajxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajxc extends ajxf {

    /* renamed from: c */
    private final BluetoothAdapter f71495c = BluetoothAdapter.getDefaultAdapter();

    public ajxc(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final boolean mo39062a() {
        BluetoothAdapter bluetoothAdapter = this.f71495c;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.isEnabled();
        }
        return false;
    }

    /* renamed from: b */
    public final IntentFilter mo39063b() {
        return new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
    }
}
