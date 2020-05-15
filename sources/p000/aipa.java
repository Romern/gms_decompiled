package p000;

import android.bluetooth.BluetoothSocket;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: aipa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aipa extends ailj {

    /* renamed from: c */
    public final BluetoothSocket f69407c;

    public aipa(BluetoothSocket bluetoothSocket) {
        super(String.format("BluetoothClassicSocket:%s", bluetoothSocket.getRemoteDevice().getAddress()));
        this.f69407c = bluetoothSocket;
    }

    /* renamed from: a */
    public final InputStream mo37636a() {
        throw null;
    }

    /* renamed from: b */
    public final OutputStream mo37638b() {
        throw null;
    }

    /* renamed from: c */
    public final void mo37639c() {
        this.f69407c.close();
    }
}
