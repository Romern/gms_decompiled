package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: vqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vqw {

    /* renamed from: a */
    public static final bmxz f49824a = vqv.m41075a(ccul.f179984a.mo6606a().mo76836a());

    /* renamed from: a */
    public static String m41076a(BluetoothDevice bluetoothDevice) {
        String name = bluetoothDevice.getName();
        if (name != null) {
            try {
                name = URLEncoder.encode(name, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                Log.w("DRIVINGMODE.BT", name.length() == 0 ? new String("Could not encode device name: ") : "Could not encode device name: ".concat(name), e);
            }
        }
        return String.format("%s/%s/%s", "bt_autolaunch", name, bluetoothDevice.getAddress());
    }

    /* renamed from: b */
    public static boolean m41079b(Context context) {
        return m41078a(context, "android.permission.BLUETOOTH");
    }

    /* renamed from: a */
    public static boolean m41077a(Context context) {
        return m41079b(context) && m41078a(context, "android.permission.BLUETOOTH_ADMIN");
    }

    /* renamed from: a */
    private static boolean m41078a(Context context, String str) {
        return C1145kt.m18540a(context, str) == 0;
    }
}
