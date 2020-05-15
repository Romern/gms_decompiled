package p000;

import android.bluetooth.BluetoothDevice;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.util.concurrent.ConcurrentMap;

/* renamed from: ausc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ausc extends ausl {

    /* renamed from: a */
    final /* synthetic */ BluetoothDevice f92399a;

    /* renamed from: b */
    final /* synthetic */ ausf f92400b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ausc(ausf ausf, Object[] objArr, BluetoothDevice bluetoothDevice) {
        super(5, objArr);
        this.f92400b = ausf;
        this.f92399a = bluetoothDevice;
    }

    /* renamed from: a */
    public final void mo50864a() {
        ConcurrentMap concurrentMap;
        BluetoothDevice bluetoothDevice;
        try {
            bedy bedy = (bedy) this.f92400b.f92410f.get(this.f92399a);
            synchronized (bedy.f106995a) {
                bede bede = bedy.f106999e;
                if (bede != null) {
                    bedy.f106999e = null;
                    bedy.f106998d = null;
                    bedy.f107000f = null;
                    try {
                        bede.mo58572d(bedy.m91843a(bede), bedz.f107002b);
                    } finally {
                        bede.close();
                    }
                } else {
                    throw new bedp("This client is not watching a device.");
                }
            }
            concurrentMap = this.f92400b.f92410f;
            bluetoothDevice = this.f92399a;
        } catch (bedp | BluetoothException e) {
            try {
                ausf.f92404a.mo50710a("Fails on disable notification: ", e, new Object[0]).mo50706a();
                concurrentMap = this.f92400b.f92410f;
                bluetoothDevice = this.f92399a;
            } catch (Throwable th) {
                this.f92400b.f92410f.remove(this.f92399a);
                throw th;
            }
        }
        concurrentMap.remove(bluetoothDevice);
    }
}
