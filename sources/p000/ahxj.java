package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ahxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahxj {

    /* renamed from: a */
    public final Context f68287a;

    /* renamed from: b */
    public final Map f68288b = new HashMap();

    /* renamed from: c */
    public final Map f68289c = new HashMap();

    /* renamed from: d */
    public ahxi f68290d;

    /* renamed from: a */
    public static String m56838a(int i, int i2) {
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        return sb.toString();
    }

    public ahxj(Context context) {
        this.f68287a = context;
    }

    /* renamed from: a */
    public final void mo37259a(BluetoothDevice bluetoothDevice, int i, int i2, int i3) {
        bnsl bnsl = (bnsl) ahsd.f67925a.mo68390d();
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        Integer valueOf3 = Integer.valueOf(i3);
        bnsl.mo68426a("FindDevice: Updating RFcomm response for %s: group %s, code %s, ackCode %s", bluetoothDevice, valueOf, valueOf2, valueOf3);
        if (bluetoothDevice != null) {
            String address = bluetoothDevice.getAddress();
            Map map = (Map) this.f68289c.get(address);
            if (map == null) {
                map = new HashMap();
                this.f68289c.put(address, map);
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FindDevice: Inserted new device response map for %s", address);
            }
            map.put(m56838a(i, i2), valueOf3);
            ((bnsl) ahsd.f67925a.mo68390d()).mo68425a("FindDevice: Inserted event code and ack code for device %s: eventGroup %s,eventCode %s", address, valueOf, valueOf2);
        }
    }

    /* renamed from: a */
    public final void mo37260a(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        ahxk ahxk = (ahxk) this.f68288b.get(bluetoothDevice);
        String a = boan.f132472f.mo68794a(bArr);
        if (ahxk != null) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68425a("EventStreamManager: Sending %s to device (%s) on code %s", a, bluetoothDevice, Integer.valueOf(i));
            ahxk.mo37263a(3, i, bArr);
            return;
        }
        ((bnsl) ahsd.f67925a.mo68390d()).mo68425a("EventStreamManager: Failed to send %s to device (%s) on code %s", a, bluetoothDevice, Integer.valueOf(i));
    }

    /* renamed from: a */
    public final boolean mo37261a(BluetoothDevice bluetoothDevice) {
        ahxk ahxk = (ahxk) this.f68288b.get(bluetoothDevice);
        if (ahxk == null) {
            srn srn = ahsd.f67925a;
            return false;
        } else if (!ahxk.mo37265b()) {
            srn srn2 = ahsd.f67925a;
            this.f68288b.remove(bluetoothDevice);
            return false;
        } else {
            srn srn3 = ahsd.f67925a;
            return true;
        }
    }
}
