package p000;

import android.content.Context;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.clearcut.uploader.QosUploaderChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: rbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rbv extends aaab {

    /* renamed from: a */
    private final rbg f42597a;

    /* renamed from: b */
    private final String f42598b;

    public rbv(rbg rbg, String str) {
        super(40, "ForceUploadOperation");
        this.f42597a = rbg;
        this.f42598b = str;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (ClearcutLoggerChimeraService.m22443a(this.f42598b)) {
            QosUploaderChimeraService qosUploaderChimeraService = new QosUploaderChimeraService();
            qosUploaderChimeraService.mo17665a(context);
            try {
                this.f42597a.mo24345b(!qosUploaderChimeraService.mo17666a("qos_debug_force_upload") ? Status.f30109c : Status.f30107a);
            } finally {
                qosUploaderChimeraService.mo17667b();
            }
        } else {
            throw new aaaj(31001, "Debug operation disallowed");
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f42597a.mo24345b(status);
    }
}
