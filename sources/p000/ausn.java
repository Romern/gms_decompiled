package p000;

import android.bluetooth.BluetoothDevice;
import java.util.ArrayList;

/* renamed from: ausn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ausn implements aust {

    /* renamed from: a */
    final /* synthetic */ ausp f92429a;

    /* renamed from: b */
    final /* synthetic */ aulq f92430b;

    public ausn(ausp ausp, aulq aulq) {
        this.f92429a = ausp;
        this.f92430b = aulq;
    }

    /* renamed from: a */
    public final void mo50881a(BluetoothDevice bluetoothDevice, Boolean bool) {
        synchronized (this.f92429a.f92435b) {
            if (this.f92429a.f92436c.containsKey(bluetoothDevice)) {
                ausp.f92434a.mo50711a("Device %s support Eid: %s", bluetoothDevice.getName(), bool.toString());
                if (bool.booleanValue()) {
                    this.f92429a.f92437d.add(bluetoothDevice);
                }
                synchronized (this.f92429a.f92435b) {
                    this.f92429a.f92436c.remove(bluetoothDevice);
                    if (this.f92429a.f92436c.isEmpty()) {
                        this.f92429a.f92439f.set(true);
                        this.f92430b.mo50662a(new ArrayList(this.f92429a.f92437d));
                        this.f92429a.f92437d.clear();
                    }
                }
            }
        }
    }
}
