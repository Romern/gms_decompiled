package p000;

import android.os.RemoteException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import java.util.concurrent.ExecutionException;

/* renamed from: arfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arfi extends arfh implements aqxy {

    /* renamed from: l */
    public static final Logger f87594l = ascp.m73787a("D2D", arfi.class.getSimpleName());

    /* renamed from: m */
    private arem f87595m;

    public arfi(arai arai) {
        super(arai, arqd.m73297b(arai.f87197a), ModuleManager.get(arai.f87197a).getCurrentModule().moduleVersion);
    }

    /* renamed from: c */
    private final void m72649c() {
        f87594l.logVerbose("resetBootstrapController()", new Object[0]);
        arem arem = this.f87595m;
        if (arem != null) {
            arem.mo48239e();
            this.f87595m = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final armu mo48480a(BootstrapOptions bootstrapOptions, arec arec) {
        this.f87595m = new arem(this.f87584b, this, bootstrapOptions, aqxo.f87044a, snp.m35703a(1, 10));
        return new arno(this.f87584b.f87200d, arec, this.f87595m);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo48482b() {
        arem arem = this.f87595m;
        if (arem != null) {
            sdo.m34971a(arem.f87522i, (Object) "Bootstrap needs to first be paused before it can be resumed.");
            arem.f87522i = false;
            arem.mo48474f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48481a() {
        m72649c();
    }

    /* renamed from: a */
    public final void mo48223a(int i) {
        this.f87584b.f87200d.mo48402a(i);
        arec arec = this.f87590h;
        if (arec != null) {
            arec.mo48463a(i);
        }
        m72649c();
    }

    /* renamed from: a */
    public final void mo48224a(BootstrapCompletionResult bootstrapCompletionResult) {
        arfa arfa;
        this.f87584b.f87200d.mo48401a();
        arec arec = this.f87590h;
        if (arec != null) {
            arec.mo48464a(bootstrapCompletionResult);
        }
        if (this.f87591i && (arfa = this.f87589g) != null) {
            try {
                aucu.m76782a(arfa.mo48477a());
            } catch (InterruptedException | ExecutionException e) {
                f87594l.mo25410a(e);
            }
        }
        m72649c();
    }

    /* renamed from: a */
    public final void mo48225a(String str) {
        arec arec = this.f87590h;
        if (arec != null) {
            try {
                arec.f87501b.mo48594a(str);
            } catch (RemoteException e) {
                arec.f87500a.mo25410a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo48226a(BootstrapProgressResult bootstrapProgressResult) {
        arec arec = this.f87590h;
        if (arec != null) {
            return arec.mo48467a(bootstrapProgressResult);
        }
        return false;
    }
}
