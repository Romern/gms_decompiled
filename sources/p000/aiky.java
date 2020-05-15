package p000;

import android.content.Intent;
import com.google.android.gms.nearby.mediums.BluetoothRadio$1;

/* renamed from: aiky */
public final /* synthetic */ class aiky implements Runnable {

    /* renamed from: a */
    private final BluetoothRadio$1 f69102a;

    /* renamed from: b */
    private final Intent f69103b;

    public aiky(BluetoothRadio$1 bluetoothRadio$1, Intent intent) {
        this.f69102a = bluetoothRadio$1;
        this.f69103b = intent;
    }

    public final void run() {
        BluetoothRadio$1 bluetoothRadio$1 = this.f69102a;
        bluetoothRadio$1.f80650a.mo37630a(this.f69103b);
    }
}
