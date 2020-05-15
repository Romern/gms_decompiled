package p000;

import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.io.Closeable;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aiqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiqb implements Closeable {

    /* renamed from: a */
    public static final aiqc f69473a = new aiqi(null, null, null, null, null);

    /* renamed from: b */
    public final Map f69474b = new C1223np();

    /* renamed from: c */
    public final BlockingQueue f69475c = new LinkedBlockingQueue();

    /* renamed from: d */
    public final AtomicBoolean f69476d = new AtomicBoolean(false);

    /* renamed from: e */
    private final blvr f69477e;

    /* renamed from: f */
    private final ExecutorService f69478f = ahhr.m55806b();

    private aiqb(BluetoothGattServer bluetoothGattServer, blvr blvr) {
        this.f69477e = blvr;
        blvr.mo66758a(aysp.m84734a(bluetoothGattServer), new aipz(this));
    }

    /* renamed from: a */
    public static aiqb m57690a(Context context) {
        blvr blvr = new blvr(airk.f69554a, airk.f69558e, airk.f69559f, new aysr());
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        if (bluetoothManager == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aiqb", "a", 67, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BleServerSocket failed to retrieve a BluetoothManager for this device.");
            return null;
        }
        BluetoothGattServer openGattServer = bluetoothManager.openGattServer(context, blvr.f98425c);
        if (openGattServer != null) {
            return new aiqb(openGattServer, blvr);
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("aiqb", "a", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("BleServerSocket failed to open a GATT server for this device.");
        return null;
    }

    public final void close() {
        if (this.f69476d.compareAndSet(false, true)) {
            ahhr.m55805a(this.f69478f, "BleServerSocket.weaveThreadOffloader");
            this.f69477e.mo66759a(false);
            this.f69475c.add(f69473a);
        }
    }

    /* renamed from: a */
    public final void mo37839a(Runnable runnable) {
        this.f69478f.execute(runnable);
    }
}
