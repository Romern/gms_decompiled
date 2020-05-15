package p000;

import android.bluetooth.BluetoothSocket;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jup {

    /* renamed from: a */
    public static final sek f23237a = new sek("D2D", "BluetoothConnection");

    /* renamed from: b */
    public final DataInputStream f23238b = new DataInputStream(this.f23242f.getInputStream());

    /* renamed from: c */
    public final DataOutputStream f23239c = new DataOutputStream(new BufferedOutputStream(this.f23242f.getOutputStream()));

    /* renamed from: d */
    public final AtomicBoolean f23240d = new AtomicBoolean(false);

    /* renamed from: e */
    public jty f23241e;

    /* renamed from: f */
    private final BluetoothSocket f23242f;

    /* renamed from: g */
    private final ExecutorService f23243g = snp.m35704b(9);

    public jup(BluetoothSocket bluetoothSocket) {
        sdo.m34959a(bluetoothSocket);
        this.f23242f = bluetoothSocket;
    }

    /* renamed from: a */
    public final void mo14113a() {
        if (this.f23240d.compareAndSet(false, true)) {
            try {
                this.f23238b.close();
            } catch (IOException e) {
                f23237a.mo25410a((Throwable) e);
            }
            try {
                this.f23239c.close();
            } catch (IOException e2) {
                f23237a.mo25410a((Throwable) e2);
            }
            try {
                this.f23242f.close();
            } catch (IOException e3) {
                f23237a.mo25410a((Throwable) e3);
            }
            this.f23243g.shutdown();
            SourceChimeraActivity sourceChimeraActivity = this.f23241e.f23209a.f23233b;
            sourceChimeraActivity.f11279n = null;
            sourceChimeraActivity.f11284s = null;
            sourceChimeraActivity.finish();
        }
    }

    /* renamed from: a */
    public final void mo14114a(byte[] bArr) {
        this.f23243g.execute(new juo(this, bArr));
    }
}
