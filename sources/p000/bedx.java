package p000;

import android.bluetooth.BluetoothDevice;
import java.util.List;
import java.util.Set;

/* renamed from: bedx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bedx {

    /* renamed from: a */
    final /* synthetic */ bedy f106993a;

    public bedx(bedy bedy) {
        this.f106993a = bedy;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d8, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo58595a(byte[] bArr) {
        bedy bedy = this.f106993a;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (bedy.f106995a) {
            ausd ausd = bedy.f107000f;
            bedt bedt = bedy.f106998d;
            if (!(ausd == null || bedt == null)) {
                try {
                    bedt bedt2 = new bedt(currentTimeMillis, bedr.m91834a(bedt.f106988b.f106984c, bArr));
                    bedy.f106997c.mo58587a(bedt, bedt2);
                    bedy.f106998d = bedt2;
                    ausf.f92404a.mo50711a("received valid Eid data from %s. The state is: %s;", bedt2.f106988b.f106984c.f106972a.mo54353d(), bedt2.f106988b.f106985d);
                    aurv aurv = ausd.f92403c;
                    BluetoothDevice bluetoothDevice = ausd.f92401a;
                    aunx aunx = aurw.f92381a;
                    String valueOf = String.valueOf(bluetoothDevice.getName());
                    aunx.mo50711a(valueOf.length() == 0 ? new String("Received eid data for the device ") : "Received eid data for the device ".concat(valueOf), new Object[0]).mo50708c();
                    List a = autj.m77801a(bluetoothDevice, bedt2);
                    int size = a.size();
                    for (int i = 0; i < size; i++) {
                        autj autj = (autj) a.get(i);
                        aurv.f92380a.f92383c.put(autj.f92488a, autj);
                        aurv.f92380a.mo50858a(bluetoothDevice, autj);
                    }
                    aurw aurw = aurv.f92380a;
                    synchronized (aurw.f92382b) {
                        for (autf autf : (Set) aurw.f92384d.get(bluetoothDevice)) {
                            autr autr = (autr) autf.f92481a.f109171c.get(bluetoothDevice.getAddress());
                            if (autr != null) {
                                autr.mo50911a(autf.f92481a.f109173h, bedt2);
                            }
                        }
                    }
                } catch (bedp e) {
                    ausd.f92403c.mo50854a(ausd.f92401a, e.getMessage());
                }
            }
        }
    }
}
