package p000;

import android.bluetooth.BluetoothDevice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: autj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class autj {

    /* renamed from: a */
    public final autp f92488a;

    /* renamed from: b */
    public boolean f92489b;

    /* renamed from: c */
    public long f92490c = -1;

    public autj(autj autj) {
        this.f92488a = autj.f92488a;
        this.f92489b = autj.f92489b;
        this.f92490c = autj.f92490c;
    }

    /* renamed from: a */
    private static autj m77800a(BluetoothDevice bluetoothDevice, String str, long j, boolean z) {
        try {
            autj autj = new autj(new autp(bluetoothDevice, str));
            autj.f92490c = j;
            autj.f92489b = z;
            return autj;
        } catch (auto e) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof autj) {
            autj autj = (autj) obj;
            return this.f92488a.equals(autj.f92488a) && this.f92489b == autj.f92489b && this.f92490c == autj.f92490c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f92488a, Boolean.valueOf(this.f92489b), Long.valueOf(this.f92490c)});
    }

    public autj(autp autp) {
        this.f92488a = autp;
    }

    /* renamed from: a */
    public static List m77801a(BluetoothDevice bluetoothDevice, bedt bedt) {
        ArrayList arrayList = new ArrayList();
        beds beds = bedt.f106988b;
        bedl bedl = beds.f106984c.f106974c;
        bedn bedn = beds.f106985d;
        if (bedl.f106975a) {
            arrayList.add(m77800a(bluetoothDevice, "on_body", bedn.f106978a, bedn.f106979b));
        }
        if (bedl.f106976b) {
            arrayList.add(m77800a(bluetoothDevice, "user_authenticated", bedn.f106978a, bedn.f106980c));
        }
        return arrayList;
    }
}
