package p000;

import android.content.Context;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: rce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rce extends aaab {

    /* renamed from: a */
    private final rbg f42635a;

    /* renamed from: b */
    private final String f42636b;

    public rce(rbg rbg, String str) {
        super(40, "StopCollectForDebugOperation");
        this.f42635a = rbg;
        this.f42636b = str;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (ClearcutLoggerChimeraService.m22443a(this.f42636b)) {
            qxw.m33075a(context);
            this.f42635a.mo24348c(Status.f30107a);
            return;
        }
        throw new aaaj(31001, "Debug operation disallowed");
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f42635a.mo24348c(status);
    }
}
