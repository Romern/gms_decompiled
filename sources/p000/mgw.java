package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.backup.d2d.component.D2dSourceChimeraService;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: mgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mgw implements mfq {

    /* renamed from: a */
    public static final lvn f33663a = new lvn("SourceServiceLifecycleManager");

    /* renamed from: b */
    private final Context f33664b;

    /* renamed from: c */
    private final mfr f33665c;

    /* renamed from: d */
    private final met f33666d;

    /* renamed from: e */
    private final mgq f33667e;

    /* renamed from: f */
    private final ScheduledExecutorService f33668f;

    /* renamed from: g */
    private final mao f33669g;

    /* renamed from: h */
    private final lzl f33670h;

    /* renamed from: i */
    private final List f33671i = new ArrayList();

    /* renamed from: j */
    private boolean f33672j = false;

    /* renamed from: k */
    private final mez f33673k;

    public mgw(Context context, mfr mfr, met met, mez mez, mgq mgq, lzl lzl, mao mao, ScheduledExecutorService scheduledExecutorService) {
        sdo.m34959a(context);
        this.f33664b = context;
        sdo.m34959a(mfr);
        this.f33665c = mfr;
        sdo.m34959a(met);
        this.f33666d = met;
        sdo.m34959a(mez);
        this.f33673k = mez;
        sdo.m34959a(mgq);
        this.f33667e = mgq;
        sdo.m34959a(lzl);
        this.f33670h = lzl;
        sdo.m34959a(scheduledExecutorService);
        this.f33668f = scheduledExecutorService;
        this.f33669g = mao;
    }

    /* renamed from: a */
    public static int m25080a(int i) {
        return i != 1 ? 3 : 2;
    }

    /* renamed from: b */
    private final bqgg m25083b(int i) {
        bqgg a = this.f33669g.mo19807a(this.f33664b, i, this.f33666d);
        bqga.m112781a(a, new mgs(this, i), this.f33668f);
        return a;
    }

    /* renamed from: f */
    private final void m25084f() {
        bqga.m112781a(this.f33670h.mo19782b(), new mgu(), bqfb.INSTANCE);
        this.f33670h.mo19783c();
        mgq mgq = this.f33667e;
        mgq.f33652a.post(new mgn(mgq));
        mgq mgq2 = this.f33667e;
        mgq2.f33652a.post(new mgk(mgq2));
        Context context = this.f33664b;
        context.stopService(D2dSourceChimeraService.m21900a(context));
        if (ccop.f179637a.mo6606a().mo76547e()) {
            this.f33673k.mo19910a(mfe.f33572a);
        }
    }

    /* renamed from: c */
    public final synchronized void mo20004c() {
        if (!this.f33672j) {
            f33663a.mo25414c("D2dTransport ready: initializing for D2d transfer.", new Object[0]);
            mo20001a(8, null, 3, 3);
            this.f33665c.mo19945a();
            this.f33672j = true;
            return;
        }
        f33663a.mo25414c("D2dTransport ready, but was already ready. Not re-initializing.", new Object[0]);
    }

    /* renamed from: d */
    public final synchronized void mo20005d() {
        if (this.f33672j) {
            f33663a.mo25414c("Finished attempting to switch from D2DTransport. Shutting down driver and service.", new Object[0]);
            this.f33665c.mo19946a(this);
            m25084f();
            this.f33672j = false;
            return;
        }
        f33663a.mo25414c("Ready to shutdown after switching to GMSTransport, but was already shut down.", new Object[0]);
    }

    /* renamed from: e */
    public final synchronized void mo20006e() {
        this.f33666d.mo19758c();
        if (!cckw.m130265c()) {
            m25081a("App data disabled, no need to disable D2dTransport.");
            m25084f();
            return;
        }
        mo20001a(3, null, 1, 2);
        bqga.m112781a(m25083b(1), new mgt(this), this.f33668f);
        m25081a("Scheduled switch back to GmsTransport");
    }

    /* renamed from: a */
    public static final synchronized void m25081a(String str) {
        synchronized (mgw.class) {
            f33663a.mo25412b(str, new Object[0]);
            lvn lvn = f33663a;
            String str2 = !cckw.m130265c() ? "disabled" : "enabled";
            lvn.logVerbose(str2.length() == 0 ? new String("    App data transfer ") : "    App data transfer ".concat(str2), new Object[0]);
        }
    }

    /* renamed from: b */
    public final synchronized void mo20003b() {
        if (!cckw.m130265c()) {
            m25081a("App data disabled, not enabling D2dTransport.");
            return;
        }
        mo20001a(2, null, 1, 3);
        bqga.m112781a(m25083b(2), new mgr(this), this.f33668f);
        m25081a("Preparing to initialize D2dTransport");
    }

    /* renamed from: a */
    private final synchronized void m25082a(mgv mgv) {
        this.f33671i.add(mgv);
    }

    /* renamed from: a */
    public final synchronized void mo19944a() {
        f33663a.mo25412b("D2dTransportDriver shutdown complete.", new Object[0]);
        mo20001a(10, null, 1, 1);
    }

    /* renamed from: a */
    public final void mo20001a(int i, String str, int i2, int i3) {
        int i4 = i - 1;
        switch (i4) {
            case 1:
                m25082a(new mgv("EVENT_PERPARE_APP_DATA_TRANSFER", str));
                break;
            case 2:
                m25082a(new mgv("EVENT_TRY_STOP_SERVICE", str));
                break;
            case 3:
                m25082a(new mgv("ENTER_COOLDOWN", str));
                break;
            case 4:
                m25082a(new mgv("EXIT_COOLDOWN", str));
                break;
            case 5:
                m25082a(new mgv("SWITCHING_TRANSPORT", str));
                break;
            case 6:
                m25082a(new mgv("SWITCH_COMPLETE", str));
                break;
            case 7:
                m25082a(new mgv("PREPARE_DRIVER", str));
                break;
            case 8:
                m25082a(new mgv("REQUEST_DRIVER_SHUTDOWN", str));
                break;
            case 9:
                m25082a(new mgv("DRIVER_SHUTDOWN_COMPLETE", str));
                break;
        }
        met met = this.f33666d;
        bxvd da = mtu.f34712f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mtu mtu = (mtu) da.f164949b;
        mtu.f34715b = i4;
        mtu.f34714a |= 1;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mtu mtu2 = (mtu) da.f164949b;
        int i5 = mtu2.f34714a | 2;
        mtu2.f34714a = i5;
        mtu2.f34716c = elapsedRealtime;
        mtu2.f34717d = i2 - 1;
        int i6 = i5 | 4;
        mtu2.f34714a = i6;
        mtu2.f34718e = i3 - 1;
        mtu2.f34714a = i6 | 8;
        met.f33540i.add((mtu) da.mo74062i());
    }

    /* renamed from: a */
    public final synchronized void mo20002a(PrintWriter printWriter) {
        if (cckw.m130265c()) {
            printWriter.println("SourceServiceLifeCycleManager:");
            printWriter.println();
            List list = this.f33671i;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                printWriter.println(((mgv) list.get(i)).toString());
            }
            this.f33669g.mo19808a(printWriter);
            return;
        }
        printWriter.println("    App data transfer disabled");
    }
}
