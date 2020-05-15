package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: ngb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ngb {
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e0, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094  */
    /* renamed from: a */
    public static synchronized nga m26161a(Context context) {
        ngl ngl;
        String str;
        BluetoothManager bluetoothManager;
        int i;
        synchronized (ngb.class) {
            if (ccov.m131091b()) {
                ngk ngk = new ngk(context);
                return ngk;
            }
            nga nga = null;
            if (ccos.m131056c()) {
                int i2 = Build.VERSION.SDK_INT;
                BluetoothManager bluetoothManager2 = (BluetoothManager) context.getSystemService("bluetooth");
                BluetoothAdapter adapter = bluetoothManager2 != null ? bluetoothManager2.getAdapter() : null;
                if (adapter != null) {
                    ngl = new ngl(adapter);
                    int i3 = Build.VERSION.SDK_INT;
                    Object[] objArr = new Object[1];
                    if (ngl != null) {
                        int i4 = Build.VERSION.SDK_INT;
                        BluetoothManager bluetoothManager3 = (BluetoothManager) context.getSystemService("bluetooth");
                        if (bluetoothManager3 != null) {
                            BluetoothAdapter adapter2 = bluetoothManager3.getAdapter();
                            if (adapter2 == null) {
                                i = 3;
                            } else if (adapter2.getBluetoothLeScanner() != null) {
                                try {
                                    i = adapter2.isOffloadedFilteringSupported() ? adapter2.isOffloadedScanBatchingSupported() ? 0 : 6 : 5;
                                } catch (NullPointerException e) {
                                    i = 0;
                                }
                            } else {
                                i = 4;
                            }
                        } else {
                            i = 2;
                        }
                        StringBuilder sb = new StringBuilder(26);
                        sb.append("not available: ");
                        sb.append(i);
                        str = sb.toString();
                    } else {
                        str = "available";
                    }
                    objArr[0] = str;
                    bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
                    if (bluetoothManager != null) {
                        nha.m26243a("BT access not supported");
                    } else if (((PowerManager) context.getSystemService("power")) == null) {
                        nha.m26243a("Power Manager not available.");
                    } else {
                        ngn ngn = new ngn(context);
                        nhd nhd = new nhd();
                        ngu ngu = new ngu(nhd, ngn);
                        int i5 = Build.VERSION.SDK_INT;
                        if (ngl != null) {
                            nga = new ngj(ngl, ngn, nhd, ngu);
                        } else {
                            nha.m26245b("BLE 'KK+' software access layer enabled");
                            nga = new ngg(context, bluetoothManager, new asfb(context, 1, "BeaconBle_WakeLock", "KKScanner", context.getPackageName()), ngn, nhd, ngu);
                        }
                    }
                }
            }
            ngl = null;
            int i32 = Build.VERSION.SDK_INT;
            Object[] objArr2 = new Object[1];
            if (ngl != null) {
            }
            objArr2[0] = str;
            bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
            if (bluetoothManager != null) {
            }
        }
    }
}
