package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.io.IOException;

/* renamed from: aird */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aird implements blvj {
    /* renamed from: a */
    public final aysm mo13778a(Context context, String str, ayso ayso) {
        BluetoothDevice a = airk.m57794a(str);
        if (a != null) {
            aysm a2 = aysm.m84710a(a.connectGatt(context, false, ayso.f98422b));
            try {
                Thread.sleep(cfnv.m140788l());
                a2.mo54360a(1);
                return a2;
            } catch (InterruptedException e) {
                a2.mo54368e();
                Thread.currentThread().interrupt();
                throw new IOException(String.format("WeaveGattProvider unsuccessfully slept after creating a GATT connection to device %s, aborting connection", a), e);
            }
        } else {
            throw new IOException(String.format("WeaveGattProvider unable to retrieve BluetoothDevice for macAddress %s", str));
        }
    }
}
