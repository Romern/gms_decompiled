package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: aurv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aurv implements aust {

    /* renamed from: a */
    public final /* synthetic */ aurw f92380a;

    public aurv(aurw aurw) {
        this.f92380a = aurw;
    }

    /* renamed from: a */
    public final void mo50854a(BluetoothDevice bluetoothDevice, String str) {
        aunx aunx = aurw.f92381a;
        String name = bluetoothDevice.getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72 + String.valueOf(str).length());
        sb.append("Received failure response for eid data for the device ");
        sb.append(name);
        sb.append(" . The reason is: ");
        sb.append(str);
        aunx.mo50711a(sb.toString(), new Object[0]);
        this.f92380a.mo50856a(bluetoothDevice);
    }
}
