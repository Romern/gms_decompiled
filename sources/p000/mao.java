package p000;

import android.content.Context;
import java.io.PrintWriter;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: mao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mao {

    /* renamed from: a */
    public static final lvn f33349a = new lvn("TransportSwitcher");

    /* renamed from: f */
    public static final mao f33350f = new mao(snp.m35703a(1, 10));

    /* renamed from: b */
    public int f33351b = 0;

    /* renamed from: c */
    public int f33352c = 0;

    /* renamed from: d */
    public final ScheduledExecutorService f33353d;

    /* renamed from: e */
    public final int f33354e;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public bqgg f33355g;

    public mao(ScheduledExecutorService scheduledExecutorService) {
        sdo.m34959a(scheduledExecutorService);
        this.f33353d = scheduledExecutorService;
        this.f33354e = (int) cckw.f179263a.mo6606a().mo76230T();
    }

    /* renamed from: a */
    public static String m24769a(int i) {
        return i != 0 ? i != 1 ? "D2D_TRANSPORT" : "GMS_TRANSPORT" : "UNKNOWN_TRANSPORT";
    }

    /* renamed from: a */
    public final synchronized bqgg mo19807a(Context context, int i, man man) {
        sdo.m34975b(true, "Cannot switch to UNKNOWN_TRANSPORT!");
        if (this.f33355g != null) {
            if (i != this.f33352c) {
                f33349a.mo25414c("Asked to switch to %s, so cancelled in-progress switch to %s", m24769a(i), m24769a(this.f33352c));
                this.f33351b = 0;
                this.f33355g.cancel(true);
            } else {
                f33349a.mo25414c("Asked to switch to %s but was already switching to that", m24769a(i));
                return this.f33355g;
            }
        } else if (i == this.f33351b) {
            f33349a.mo25412b("Asked to switch to %s but that was current transport and no switch in progress.", m24769a(i));
            return bqga.m112775a((Object) null);
        }
        f33349a.mo25414c("Starting switch from %s to %s", m24769a(this.f33351b), m24769a(i));
        this.f33352c = i;
        bqgg a = bqga.m112773a(new mcj(new mak(this, context, i, man), this.f33353d, this.f33354e, new mal(this, i), mat.m24776a(cckw.f179263a.mo6606a().mo76228R(), TimeUnit.MILLISECONDS)), cckw.m130272j(), TimeUnit.MILLISECONDS, this.f33353d);
        this.f33355g = a;
        bqga.m112781a(a, new mam(this, i), this.f33353d);
        return this.f33355g;
    }

    /* renamed from: a */
    public final synchronized void mo19808a(PrintWriter printWriter) {
        printWriter.println("TransportSwitcher:");
        String a = m24769a(this.f33351b);
        printWriter.println(a.length() == 0 ? new String("    currentTransport=") : "    currentTransport=".concat(a));
        if (this.f33355g != null) {
            String a2 = m24769a(this.f33352c);
            printWriter.println(a2.length() == 0 ? new String("    switchingToTransport=") : "    switchingToTransport=".concat(a2));
        }
    }
}
