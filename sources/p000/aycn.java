package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.io.Closeable;

/* renamed from: aycn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aycn implements Closeable, ayjm {

    /* renamed from: a */
    public final ayco f97150a;

    /* renamed from: b */
    private final Context f97151b;

    /* renamed from: c */
    private final ConnectionConfiguration f97152c;

    /* renamed from: d */
    private final aycw f97153d = new aycw();

    public aycn(Context context, ConnectionConfiguration connectionConfiguration) {
        sdo.m34967a("BluetoothClientConnection.constructor");
        this.f97151b = context;
        this.f97152c = connectionConfiguration;
        ayco ayco = new ayco(this.f97151b, BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.f97152c.f110865b), this.f97152c, this.f97153d);
        this.f97150a = ayco;
        ayco.start();
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        sdo.m34967a("dump");
        String valueOf = String.valueOf(this.f97152c.f110865b);
        ssb.println(valueOf.length() == 0 ? new String("Connection: ") : "Connection: ".concat(valueOf));
        ssb.println(this.f97152c);
        ssb.println("---- bt connection health ----");
        this.f97153d.mo53558a(ssb, z, z2);
        ssb.println();
    }

    public final void close() {
        sdo.m34967a("close");
        if (Log.isLoggable("WearableBluetooth", 3)) {
            Log.d("WearableBluetooth", "Interrupting bluetooth thread");
        }
        this.f97150a.close();
    }
}
