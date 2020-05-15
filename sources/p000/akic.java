package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;

/* renamed from: akic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akic {
    /* renamed from: a */
    public static aucb m59784a(Context context) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return aucu.m76777a(new Exception("Bluetooth adapter is null."));
        }
        if (defaultAdapter.isEnabled()) {
            return aucu.m76778a((Object) null);
        }
        return aucu.m76780a(ahhr.m55807c(), new akib(context, defaultAdapter));
    }

    /* renamed from: a */
    public static boolean m59785a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.isEnabled();
        }
        return false;
    }
}
