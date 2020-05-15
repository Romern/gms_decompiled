package p000;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: rbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rbr extends rbi implements aaai {

    /* renamed from: a */
    final rbu f42586a;

    /* renamed from: b */
    private final ClearcutLoggerChimeraService f42587b;

    /* renamed from: c */
    private final aaag f42588c;

    /* renamed from: d */
    private final rdq f42589d;

    /* renamed from: e */
    private final aaac f42590e;

    /* renamed from: f */
    private final String f42591f;

    public rbr(ClearcutLoggerChimeraService clearcutLoggerChimeraService, aaag aaag, rdq rdq, aaac aaac, String str) {
        this.f42587b = clearcutLoggerChimeraService;
        this.f42588c = aaag;
        this.f42589d = rdq;
        this.f42590e = aaac;
        this.f42591f = str;
        this.f42586a = new rbu(clearcutLoggerChimeraService);
    }

    /* renamed from: a */
    public final void mo24427a(rbg rbg) {
        this.f42588c.mo16658a(new rbv(rbg, this.f42591f));
    }

    /* renamed from: b */
    public final void mo24431b(rbg rbg) {
        this.f42588c.mo16658a(new rcc(rbg, this.f42591f));
    }

    /* renamed from: c */
    public final void mo24433c(rbg rbg) {
        this.f42588c.mo16658a(new rce(rbg, this.f42591f));
    }

    /* renamed from: d */
    public final void mo24434d(rbg rbg) {
        this.f42588c.mo16658a(new rbw(rbg, this.f42591f));
    }

    /* renamed from: e */
    public final void mo24435e(rbg rbg) {
        this.f42588c.mo16658a(new rbx(rbg, this.f42591f));
    }

    /* renamed from: a */
    public final void mo24428a(rbg rbg, CollectForDebugParcelable collectForDebugParcelable) {
        this.f42588c.mo16658a(new rcd(rbg, this.f42591f, collectForDebugParcelable));
    }

    /* renamed from: b */
    public final void mo24432b(rbg rbg, String str) {
        this.f42588c.mo16658a(new rby(rbg, str, this.f42589d, this.f42591f));
    }

    /* renamed from: a */
    public final void mo24429a(rbg rbg, LogEventParcelable logEventParcelable) {
        if (cddm.f180532a.mo6606a().mo77292b()) {
            try {
                rbg.mo24340a(new Status(31002, "Logging is disabled"));
            } catch (RemoteException e) {
                Log.w("ClearcutService", "Failed to send operation result", e);
            }
        } else {
            if (cddp.m132711c()) {
                rae.f42460a.mo24406a();
            }
            rai.m33152a(logEventParcelable, rag.EVENTS_SERVICE_RECEIVED);
            try {
                ClearcutLoggerChimeraService.m22442a(this.f42587b, this.f42591f, this.f42590e, logEventParcelable);
                this.f42588c.mo16658a(new rca(rbg, logEventParcelable, this.f42589d, ModuleManager.get(this.f42587b), this.f42591f, this.f42586a, ClearcutLoggerChimeraService.f30053b));
                rai.m33152a(logEventParcelable, rag.EVENTS_SERVICE_DISPATCHED);
            } catch (Throwable th) {
                try {
                    rbg.mo24340a(new Status(31002, "Caller is restricted"));
                } catch (RemoteException e2) {
                    Log.w("ClearcutService", "Failed to send operation result", th);
                }
                rai.m33152a(logEventParcelable, rag.DROPS_BY_RESTRICTION);
            }
        }
    }

    /* renamed from: a */
    public final void mo24430a(rbg rbg, String str) {
        this.f42588c.mo16658a(new rby(rbg, str, this.f42589d, this.f42591f));
    }
}
