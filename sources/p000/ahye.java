package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ahye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahye implements ahxk {

    /* renamed from: a */
    public final ExecutorService f68331a = snp.m35704b(10);

    /* renamed from: b */
    public final Context f68332b;

    /* renamed from: c */
    public final BluetoothDevice f68333c;

    /* renamed from: d */
    public BluetoothSocket f68334d;

    /* renamed from: e */
    public final AtomicInteger f68335e = new AtomicInteger(0);

    /* renamed from: f */
    public boolean f68336f = false;

    /* renamed from: g */
    private final ExecutorService f68337g = snp.m35704b(10);

    /* renamed from: h */
    private final ExecutorService f68338h = snp.m35704b(10);

    /* renamed from: i */
    private final AtomicReference f68339i = new AtomicReference();

    /* renamed from: j */
    private ahyd f68340j = ahyd.DISCONNECTED;

    /* renamed from: k */
    private final bmxz f68341k;

    public ahye(Context context, BluetoothDevice bluetoothDevice, bmxz bmxz) {
        this.f68332b = context;
        this.f68333c = bluetoothDevice;
        this.f68341k = bmxz;
    }

    /* renamed from: a */
    public static long m56855a(int i) {
        return TimeUnit.SECONDS.toMillis(cfog.f184854a.mo6606a().mo81980aO()) * ((long) Math.pow(2.0d, (double) ((cfog.m141294v() - ((long) i)) - 1)));
    }

    /* renamed from: b */
    public final void mo37282b(ahxi ahxi) {
        this.f68339i.set(ahxi);
    }

    /* renamed from: c */
    public final boolean mo37284c() {
        boolean a = this.f68341k.mo6527a(this.f68333c);
        if (a && !this.f68336f) {
            m56856a(ahyd.CONNECTED);
            mo37277a(this.f68334d);
            try {
                this.f68334d = this.f68333c.createRfcommSocketToServiceRecord(UUID.fromString(cfog.f184854a.mo6606a().mo81955Q()));
                if (!cfoj.m141561k()) {
                    try {
                        mo37283b(this.f68334d);
                    } catch (IOException e) {
                        bnsl bnsl = (bnsl) ahsd.f67925a.mo68390d();
                        bnsl.mo68437a(e);
                        bnsl.mo68420a("RfcommEventStreamMedium: [%s] Failed to connect the socket", this.f68333c);
                        mo37277a(this.f68334d);
                        mo37286e();
                        return false;
                    }
                }
                this.f68338h.execute(new ahxy(this));
                return true;
            } catch (IOException e2) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("RfcommEventStreamMedium: [%s] Failed to create the socket", this.f68333c);
                mo37286e();
                return false;
            }
        } else {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68425a("RfcommEventStreamMedium: [%s] Skip connect, isProfileConnected=%b, isDisconnectRequested=%b", this.f68333c, Boolean.valueOf(a), Boolean.valueOf(this.f68336f));
            mo37286e();
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo37285d() {
        return !this.f68336f && this.f68340j.equals(ahyd.CONNECTED);
    }

    /* renamed from: e */
    public final void mo37286e() {
        mo37280a(new ahyc(this));
        mo37282b((ahxi) null);
        m56856a(ahyd.DISCONNECTED);
    }

    /* renamed from: b */
    public final void mo37283b(BluetoothSocket bluetoothSocket) {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("RfcommEventStreamMedium: [%s] Cancel device discovery.", this.f68333c);
        BluetoothAdapter.getDefaultAdapter().cancelDiscovery();
        try {
            bluetoothSocket.connect();
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("RfcommEventStreamMedium: [%s] Connect rfcomm channel.", this.f68333c);
            this.f68335e.set((int) cfog.m141294v());
            mo37280a(new ahyb(this));
        } catch (NullPointerException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: a */
    private final void m56856a(ahyd ahyd) {
        if (!this.f68340j.equals(ahyd)) {
            this.f68340j = ahyd;
            ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("RfcommEventStreamMedium: [%s] Change to %s", this.f68333c, ahyd);
        }
    }

    /* renamed from: a */
    public final void mo37262a() {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("RfcommEventStreamMedium: [%s] Disconnect is requested", this.f68333c);
        mo37278a(new ahxu(this));
    }

    /* renamed from: a */
    public final void mo37263a(int i, int i2, byte[] bArr) {
        mo37278a(new ahxx(this, i, i2, bArr));
    }

    /* renamed from: a */
    public final void mo37264a(ahxi ahxi) {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("RfcommEventStreamMedium: [%s] Event stream listener is set", this.f68333c);
        mo37278a(new ahxv(this, ahxi));
    }

    /* renamed from: b */
    public final boolean mo37265b() {
        return mo37281a(new ahxw(this), "isConnected");
    }

    /* renamed from: a */
    public final void mo37277a(BluetoothSocket bluetoothSocket) {
        if (bluetoothSocket != null) {
            try {
                bluetoothSocket.close();
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("RfcommEventStreamMedium: [%s] Close socket done", this.f68333c);
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68420a("RfcommEventStreamMedium: [%s] Failed to close the socket", this.f68333c);
            }
        }
    }

    /* renamed from: a */
    public final void mo37278a(Runnable runnable) {
        this.f68337g.execute(runnable);
    }

    /* renamed from: a */
    public final void mo37279a(Runnable runnable, long j) {
        bqhi.m112839a(j, TimeUnit.MILLISECONDS);
        mo37278a(runnable);
    }

    /* renamed from: a */
    public final void mo37280a(C1228nu nuVar) {
        ahxi ahxi = (ahxi) this.f68339i.get();
        if (ahxi != null) {
            nuVar.mo9443a(ahxi);
        }
    }

    /* renamed from: a */
    public final boolean mo37281a(bmzi bmzi, String str) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        mo37278a(new ahxz(atomicBoolean, bmzi, countDownLatch));
        try {
            countDownLatch.await();
            return atomicBoolean.get();
        } catch (InterruptedException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68424a("RfcommEventStreamMedium: [%s] Failed to wait for %s", this.f68333c, str);
            return false;
        }
    }
}
