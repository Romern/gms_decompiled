package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: mjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mjv {

    /* renamed from: a */
    private static final lvn f33849a = new lvn("UsbConnectionStateTracker");

    /* renamed from: b */
    private volatile int f33850b;

    /* renamed from: c */
    private final ScheduledExecutorService f33851c;

    /* renamed from: d */
    private ScheduledFuture f33852d = null;

    /* renamed from: e */
    private final long f33853e;

    /* renamed from: f */
    private final mju f33854f;

    public mjv(ScheduledExecutorService scheduledExecutorService, long j, mju mju) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        this.f33850b = 3;
        sdo.m34959a(scheduledExecutorService);
        this.f33851c = scheduledExecutorService;
        this.f33853e = j;
        sdo.m34959a(mju);
        this.f33854f = mju;
    }

    /* renamed from: a */
    private final synchronized void m25235a(int i) {
        int i2 = this.f33850b;
        f33849a.mo25414c("USB connection state transitioning from %s to %s", m25236b(i2), m25236b(i));
        this.f33850b = i;
        this.f33854f.mo19976a(i, i2);
    }

    /* renamed from: b */
    private static String m25236b(int i) {
        if (i == 1) {
            return "CONNECTED";
        }
        if (i != 2) {
            return i != 3 ? Integer.toString(i) : "DISCONNECTED_AFTER_COOLDOWN";
        }
        return "DISCONNECTED_WITHIN_COOLDOWN";
    }

    /* renamed from: c */
    public final synchronized void mo20111c() {
        if (this.f33850b != 2) {
            f33849a.mo25412b("Not switching to DISCONNECTED_AFTER_COOLDOWN as USB has since reconnected.", new Object[0]);
        } else {
            m25235a(3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo20110b() {
        if (this.f33850b == 1) {
            m25235a(2);
            this.f33852d = ((sny) this.f33851c).schedule(new mjt(this), this.f33853e, TimeUnit.MILLISECONDS);
            return;
        }
        f33849a.mo25416d("onDisconnected invoked when USB was already disconnected", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo20109a() {
        if (this.f33850b != 1) {
            m25235a(1);
            ScheduledFuture scheduledFuture = this.f33852d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f33852d = null;
            }
        } else {
            f33849a.mo25416d("onConnected invoked when USB was already connected", new Object[0]);
        }
    }
}
