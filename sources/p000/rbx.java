package p000;

import android.content.Context;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: rbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rbx extends aaab {

    /* renamed from: a */
    private final rbg f42601a;

    /* renamed from: b */
    private final String f42602b;

    public rbx(rbg rbg, String str) {
        super(40, "GetCollectForDebugParcelableOperation");
        this.f42601a = rbg;
        this.f42602b = str;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (ClearcutLoggerChimeraService.m22443a(this.f42602b)) {
            this.f42601a.mo24347b(Status.f30107a, qxw.m33077b(context));
            return;
        }
        throw new aaaj(31001, "Debug operation disallowed");
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f42601a.mo24347b(status, (CollectForDebugParcelable) null);
    }
}
