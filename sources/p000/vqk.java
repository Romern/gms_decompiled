package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vqk {

    /* renamed from: a */
    private final BluetoothAdapter f49795a;

    /* renamed from: b */
    private final Context f49796b;

    public vqk(Context context) {
        this.f49796b = context;
        this.f49795a = ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
    }

    /* renamed from: a */
    public final String mo28746a(BluetoothDevice bluetoothDevice) {
        String str;
        try {
            str = (String) BluetoothDevice.class.getMethod("getAliasName", new Class[0]).invoke(bluetoothDevice, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.e("CAR.DRIVINGMODE", "Error invoking getAliasName on bluetooth device", e);
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (!vqw.m41079b(this.f49796b) || TextUtils.isEmpty(bluetoothDevice.getName())) {
            return bluetoothDevice.getAddress();
        }
        return bluetoothDevice.getName();
    }

    /* renamed from: b */
    public final boolean mo28748b() {
        return this.f49795a != null && mo28747a();
    }

    /* renamed from: c */
    public final List mo28749c() {
        ArrayList a = bnkn.m109661a();
        if (mo28748b() && this.f49795a.isEnabled()) {
            for (BluetoothDevice bluetoothDevice : this.f49795a.getBondedDevices()) {
                if (vqw.f49824a.mo6527a(bluetoothDevice)) {
                    a.add(bluetoothDevice);
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo28747a() {
        return vqw.m41077a(this.f49796b);
    }
}
