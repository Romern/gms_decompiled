package p000;

import android.app.PendingIntent;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import java.util.concurrent.ExecutionException;

/* renamed from: arfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arfj extends arfh implements arib {

    /* renamed from: l */
    public static final Logger f87596l = ascp.m73787a("D2D", arfj.class.getSimpleName());

    /* renamed from: m */
    private argu f87597m;

    public arfj(arai arai) {
        super(arai, arqd.m73297b(arai.f87197a), ModuleManager.get(arai.f87197a).getCurrentModule().moduleVersion);
    }

    /* renamed from: c */
    private final void m72657c() {
        f87596l.logVerbose("resetNearbyDirectTransferController", new Object[0]);
        argu argu = this.f87597m;
        if (argu != null) {
            argu.mo48264a();
            this.f87597m = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final armu mo48480a(BootstrapOptions bootstrapOptions, arec arec) {
        arai arai = this.f87584b;
        this.f87597m = new argu(arai.f87198b, bootstrapOptions, this, aqxc.m72188a(arai.f87197a));
        return new arnp(this.f87584b.f87200d, arec, this.f87597m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo48482b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48481a() {
        m72657c();
    }

    /* renamed from: a */
    public final void mo48265a(int i, String str) {
        f87596l.mo25416d("onError: %d, %s", Integer.valueOf(i), str);
        this.f87584b.f87200d.mo48402a(i);
        arec arec = this.f87590h;
        if (arec != null) {
            arec.mo48463a(i);
        }
        m72657c();
    }

    /* renamed from: a */
    public final void mo48266a(PendingIntent pendingIntent) {
        try {
            pendingIntent.send();
        } catch (PendingIntent.CanceledException e) {
            f87596l.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo48268a(BootstrapCompletionResult bootstrapCompletionResult) {
        arfa arfa;
        f87596l.mo25412b("onCompleted", new Object[0]);
        this.f87584b.f87200d.mo48401a();
        arec arec = this.f87590h;
        if (arec != null) {
            arec.mo48464a(bootstrapCompletionResult);
        }
        if (this.f87591i && (arfa = this.f87589g) != null) {
            try {
                aucu.m76782a(arfa.mo48477a());
            } catch (InterruptedException | ExecutionException e) {
                f87596l.mo25410a(e);
            }
        }
        m72657c();
    }

    /* renamed from: a */
    public final void mo48269a(BootstrapOptions bootstrapOptions) {
        f87596l.mo25412b("onBootstrapOptions", new Object[0]);
    }

    /* renamed from: a */
    public final void mo48270a(BootstrapProgressResult bootstrapProgressResult) {
        f87596l.mo25412b("onProgress", new Object[0]);
        arec arec = this.f87590h;
        if (arec != null) {
            arec.mo48467a(bootstrapProgressResult);
        }
    }
}
