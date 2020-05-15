package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.SystemClock;
import com.google.android.gms.fido.u2f.api.view.BleDeviceIdentifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: xiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xiz {

    /* renamed from: d */
    private static final sek f52393d = new sek(new String[]{"ScannedBleDevices"}, (short[]) null);

    /* renamed from: a */
    private final List f52394a = Collections.synchronizedList(bnkn.m109661a());

    /* renamed from: b */
    private boolean f52395b;

    /* renamed from: c */
    private List f52396c;

    /* renamed from: b */
    private static final String m43020b(ScanResult scanResult) {
        String str;
        ScanRecord scanRecord = scanResult.getScanRecord();
        if (scanRecord != null) {
            str = scanRecord.getDeviceName();
        } else {
            str = null;
        }
        return str == null ? scanResult.getDevice().getName() : str;
    }

    /* renamed from: a */
    public final BluetoothDevice mo29821a(String str) {
        for (xiy xiy : this.f52394a) {
            if (xiy.f52389a.getAddress().equals(str)) {
                return xiy.f52389a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Collection mo29822a() {
        List list;
        if (!this.f52395b && (list = this.f52396c) != null) {
            return list;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f52396c = new ArrayList();
        Iterator it = this.f52394a.iterator();
        int i = 0;
        while (it.hasNext()) {
            xiy xiy = (xiy) it.next();
            if (uptimeMillis - xiy.f52392d < 60000) {
                this.f52396c.add(new BleDeviceIdentifier(xiy.f52390b, xiy.f52389a.getAddress(), xiy.f52391c));
            } else {
                it.remove();
                i++;
            }
        }
        if (i > 0) {
            f52393d.mo25414c("%d devices not seen within %d milliseconds pruned", Integer.valueOf(i), 60000L);
        }
        this.f52395b = false;
        return this.f52396c;
    }

    /* renamed from: b */
    public final void mo29824b() {
        this.f52394a.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        r7 = false;
     */
    /* renamed from: a */
    public final boolean mo29823a(ScanResult scanResult) {
        boolean z;
        boolean z2;
        BluetoothDevice device = scanResult.getDevice();
        Iterator it = this.f52394a.iterator();
        int i = -1;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            i++;
            xiy xiy = (xiy) it.next();
            if (xiy.f52389a.getAddress().equals(device.getAddress())) {
                it.remove();
                if (!xiy.f52390b.equals(m43020b(scanResult))) {
                    z = true;
                }
            }
        }
        if (i == -1) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f52394a.add(i == -1 ? 0 : i, new xiy(device, m43020b(scanResult), xit.m43016b(scanResult), SystemClock.uptimeMillis()));
        this.f52395b = true;
        return (!z2) | z;
    }
}
