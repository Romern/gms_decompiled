package p000;

import android.bluetooth.BluetoothDevice;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: xua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xua implements Runnable {

    /* renamed from: a */
    public int f53103a;

    /* renamed from: b */
    public List f53104b;

    /* renamed from: c */
    public bqgy f53105c;

    /* renamed from: d */
    final /* synthetic */ xub f53106d;

    /* renamed from: e */
    private bqgg f53107e;

    public xua(xub xub) {
        this.f53106d = xub;
    }

    /* renamed from: a */
    public final void mo30134a() {
        bqgg bqgg;
        if (this.f53103a < this.f53104b.size()) {
            xub xub = this.f53106d;
            xuc xuc = xub.f53112f;
            BluetoothDevice bluetoothDevice = xub.f53113g;
            byte[] bArr = (byte[]) this.f53104b.get(this.f53103a);
            if (!xuc.mo30143a(bluetoothDevice)) {
                xuc.f53121o.mo25418e("Cannot send notification, %s is not active Client.", bluetoothDevice);
                bqgg = bqga.m112775a((Object) false);
            } else if (xuc.f53134n != null) {
                xuc.f53121o.mo25418e("Another notify operation is currently pending.", new Object[0]);
                bqgg = bqga.m112775a((Object) false);
            } else {
                xuc.f53123c.setValue(bArr);
                if (!xuc.f53128h.notifyCharacteristicChanged(bluetoothDevice, xuc.f53123c, true)) {
                    xuc.f53121o.mo25418e("Failed to notify FIDO status characteristic change.", new Object[0]);
                    bqgg = bqga.m112775a((Object) false);
                } else {
                    xuc.f53121o.mo25414c("Notifying Client with value of %s bytes...", Integer.valueOf(bArr.length));
                    xuc.f53134n = bqgy.m112818c();
                    bqgg = xuc.f53134n;
                }
            }
            this.f53107e = bqgg;
            bqgg.mo741a(this, bqfb.INSTANCE);
            return;
        }
        this.f53105c.mo69138b((Object) true);
    }

    public final void run() {
        try {
            if (!((Boolean) this.f53107e.get()).booleanValue()) {
                xub.f53108m.mo25418e("Failed to send fragment %s/%s", Integer.valueOf(this.f53103a + 1), Integer.valueOf(this.f53104b.size()));
                this.f53105c.mo69138b((Object) false);
                return;
            }
            xub.f53108m.mo25414c("  sent fragment %s/%s", Integer.valueOf(this.f53103a + 1), Integer.valueOf(this.f53104b.size()));
            this.f53103a++;
            mo30134a();
        } catch (InterruptedException | ExecutionException e) {
            this.f53105c.mo69136a(e);
        }
    }
}
