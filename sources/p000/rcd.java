package p000;

import android.content.Context;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: rcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rcd extends aaab {

    /* renamed from: a */
    private final rbg f42631a;

    /* renamed from: b */
    private final String f42632b;

    /* renamed from: c */
    private final CollectForDebugParcelable f42633c;

    /* renamed from: d */
    private final rel f42634d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rcd(rbg rbg, String str, CollectForDebugParcelable collectForDebugParcelable) {
        super(40, "StartCollectForDebugWithParcelableOperation");
        rel a = rel.m33456a();
        this.f42631a = rbg;
        this.f42632b = str;
        this.f42633c = collectForDebugParcelable;
        this.f42634d = a;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (ClearcutLoggerChimeraService.m22443a(this.f42632b)) {
            CollectForDebugParcelable a = qxw.m33074a(context, this.f42633c.f30027a);
            this.f42634d.mo24558b();
            this.f42631a.mo24342a(Status.f30107a, a);
            return;
        }
        throw new aaaj(31001, "Debug operation disallowed");
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f42631a.mo24342a(status, (CollectForDebugParcelable) null);
    }
}
