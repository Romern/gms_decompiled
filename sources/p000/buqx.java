package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Build;

/* renamed from: buqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buqx {
    /* renamed from: a */
    public static int m120256a(String str) {
        int i = Build.VERSION.SDK_INT;
        try {
            return ((Integer) ayqm.m84613a(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str)).mo54282a("getBatteryLevel", new Class[0]).mo54281b(new Object[0])).intValue();
        } catch (ayqn e) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68390d();
            bnsl.mo68432a("buqx", "a", 68, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FastPair: Failed to get battery level from device.");
            return -1;
        }
    }

    /* renamed from: b */
    public static String m120261b(String str) {
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
        try {
            return (String) ayqm.m84613a(remoteDevice).mo54282a("getAliasName", new Class[0]).mo54281b(new Object[0]);
        } catch (ayqn e) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68390d();
            bnsl.mo68432a("buqx", "b", 83, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FastPair: Failed to get alias name from device");
            return remoteDevice.getName();
        }
    }

    /* renamed from: c */
    public static String m120262c(String str) {
        try {
            return (String) ayqm.m84613a(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str)).mo54282a("getAlias", new Class[0]).mo54281b(new Object[0]);
        } catch (ayqn e) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("buqx", "c", 116, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FastPair: Failed to get alias from device");
            return null;
        }
    }

    /* renamed from: a */
    public static String m120257a(BluetoothDevice bluetoothDevice, int i) {
        try {
            byte[] metadata = bluetoothDevice.getMetadata(i);
            if (metadata != null) {
                return new String(metadata);
            }
            return null;
        } catch (NoSuchMethodError e) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m120258a(BluetoothDevice bluetoothDevice, int i, String str) {
        try {
            ayql a = ayqm.m84613a(bluetoothDevice).mo54282a("setMetadata", Integer.TYPE, byte[].class);
            Integer valueOf = Integer.valueOf(i);
            a.mo54280a(valueOf, str.getBytes());
            bnsl bnsl = (bnsl) busr.f154819a.mo68390d();
            bnsl.mo68432a("buqx", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("FastPair: setMetadata to %s, %d: %s", bluetoothDevice.getAddress(), valueOf, str);
        } catch (ayqn e) {
            bnsl bnsl2 = (bnsl) busr.f154819a.mo68390d();
            bnsl2.mo68432a("buqx", "a", 133, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68409a("FastPair: Failed to setMetadata with byte[] value, key:%d", i);
        }
    }

    /* renamed from: a */
    public static void m120259a(String str, String str2) {
        int i = Build.VERSION.SDK_INT;
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
        busr busr = busr.f154819a;
        remoteDevice.getName();
        try {
            ayqm.m84613a(remoteDevice).mo54282a("setAlias", String.class).mo54280a(str2);
        } catch (ayqn e) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68390d();
            bnsl.mo68432a("buqx", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FastPair: Failed to set alias.");
        }
    }

    /* renamed from: a */
    public static boolean m120260a(BluetoothDevice bluetoothDevice) {
        try {
            byte[] metadata = bluetoothDevice.getMetadata(6);
            if (metadata != null) {
                return Boolean.parseBoolean(new String(metadata));
            }
            return false;
        } catch (NoSuchMethodError e) {
            return false;
        }
    }
}
