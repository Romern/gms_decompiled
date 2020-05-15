package p000;

import android.bluetooth.BluetoothAdapter;

/* renamed from: afak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afak {

    /* renamed from: a */
    private static final Logger f64087a = new Logger(new String[]{"HostValidator"}, (int[]) null);

    /* renamed from: a */
    public static boolean m52783a() {
        boolean z;
        boolean z2;
        rpr b = rpr.m34216b();
        try {
            z = ifr.m15376b(b);
        } catch (SecurityException e) {
            afba a = afaz.m52798a();
            if (cfcm.m138682b()) {
                a.f64113b.mo24383c("magictether_tether_support_security_exception_count").mo24359a();
                a.f64113b.mo24388e();
            }
            z = true;
        }
        if (!ifr.m15375a(b)) {
            z2 = false;
        } else {
            z2 = z && cfcj.m138657d() && b.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        }
        if (!z2) {
            f64087a.mo25414c("InvalidHost. MobileData: %b, Tethering: %b, whitelist: %b, ble: %b", Boolean.valueOf(ifr.m15375a(b)), Boolean.valueOf(z), Boolean.valueOf(cfcj.m138657d()), Boolean.valueOf(b.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")));
        }
        return z2;
    }

    /* renamed from: b */
    public static boolean m52784b() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return m52783a() && defaultAdapter != null && defaultAdapter.getBluetoothLeScanner() != null && defaultAdapter.isEnabled();
    }
}
