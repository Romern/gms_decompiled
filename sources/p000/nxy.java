package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;

/* renamed from: nxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nxy {

    /* renamed from: b */
    private static final bnsn f36907b = odk.m28481a("CAR.BT.AdapterWrapper");

    /* renamed from: a */
    public final BluetoothAdapter f36908a;

    private nxy(BluetoothAdapter bluetoothAdapter) {
        this.f36908a = bluetoothAdapter;
    }

    /* renamed from: a */
    static nxy m28149a(Context context) {
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        if (bluetoothManager == null) {
            bnsi b = f36907b.mo68387b();
            b.mo68432a("nxy", "a", 34, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Cannot get BluetoothManager");
            return null;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        if (adapter != null) {
            return new nxy(adapter);
        }
        bnsi b2 = f36907b.mo68387b();
        b2.mo68432a("nxy", "a", 39, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b2.mo68405a("Cannot get BluetoothAdapter");
        return null;
    }

    /* renamed from: b */
    public final boolean mo21820b() {
        try {
            return ((Boolean) BluetoothAdapter.class.getMethod("enableNoAutoConnect", new Class[0]).invoke(this.f36908a, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e) {
            bnsi c = f36907b.mo68388c();
            c.mo68432a("nxy", "b", 66, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Error calling BluetoothAdapter#enableNoAutoConnect, falling back to BluetoothAdapter#enable");
            return this.f36908a.enable();
        }
    }

    /* renamed from: c */
    public final void mo21821c() {
        this.f36908a.cancelDiscovery();
    }

    /* renamed from: a */
    public final String mo21818a() {
        return this.f36908a.getAddress();
    }

    /* renamed from: a */
    public final nxz mo21819a(String str) {
        BluetoothDevice remoteDevice = this.f36908a.getRemoteDevice(str);
        if (remoteDevice != null) {
            return new nxz(remoteDevice);
        }
        return null;
    }
}
