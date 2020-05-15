package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;

/* renamed from: ahuc */
public final /* synthetic */ class ahuc implements Runnable {

    /* renamed from: a */
    private final Context f68056a;

    /* renamed from: b */
    private final bnha f68057b;

    public ahuc(Context context, bnha bnha) {
        this.f68056a = context;
        this.f68057b = bnha;
    }

    public final void run() {
        Context context = this.f68056a;
        bnhe b = this.f68057b.mo67618b();
        bnrd a = b.keySet().iterator();
        while (a.hasNext()) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) a.next();
            aiaa aiaa = ((ahyz) b.get(bluetoothDevice)).f68439n;
            if (aiaa == null) {
                aiaa = aiaa.f68501K;
            }
            srn srn = ahsd.f67925a;
            bluetoothDevice.getAddress();
            ahur.m56673a(context, bluetoothDevice, aiaa, 5, ahzs.MAIN);
            if (buqx.m120260a(bluetoothDevice)) {
                ahur.m56673a(context, bluetoothDevice, aiaa, 7, ahzs.LEFT);
                ahur.m56673a(context, bluetoothDevice, aiaa, 8, ahzs.RIGHT);
                ahur.m56673a(context, bluetoothDevice, aiaa, 9, ahzs.CASE);
            }
        }
    }
}
