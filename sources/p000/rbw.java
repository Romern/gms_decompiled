package p000;

import android.content.Context;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: rbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rbw extends aaab {

    /* renamed from: a */
    private final rbg f42599a;

    /* renamed from: b */
    private final String f42600b;

    public rbw(rbg rbg, String str) {
        super(40, "GetCollectForDebugExpiryTimeOperation");
        this.f42599a = rbg;
        this.f42600b = str;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (ClearcutLoggerChimeraService.m22443a(this.f42600b)) {
            this.f42599a.mo24346b(Status.f30107a, qxw.m33077b(context).f30029c);
            return;
        }
        throw new aaaj(31001, "Debug operation disallowed");
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f42599a.mo24346b(status, 0);
    }
}
