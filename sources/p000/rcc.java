package p000;

import android.content.Context;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: rcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rcc extends aaab {

    /* renamed from: a */
    private final rbg f42628a;

    /* renamed from: b */
    private final String f42629b;

    /* renamed from: c */
    private final rel f42630c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rcc(rbg rbg, String str) {
        super(40, "StartCollectForDebugOperation");
        rel a = rel.m33456a();
        this.f42628a = rbg;
        this.f42629b = str;
        this.f42630c = a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qxw.a(android.content.Context, boolean):com.google.android.gms.clearcut.CollectForDebugParcelable
     arg types: [android.content.Context, int]
     candidates:
      qxw.a(android.content.Context, sqv):boolean
      qxw.a(android.content.Context, boolean):com.google.android.gms.clearcut.CollectForDebugParcelable */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (ClearcutLoggerChimeraService.m22443a(this.f42629b)) {
            CollectForDebugParcelable a = qxw.m33074a(context, false);
            this.f42630c.mo24558b();
            this.f42628a.mo24341a(Status.f30107a, a.f30029c);
            return;
        }
        throw new aaaj(31001, "Debug operation disallowed");
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f42628a.mo24341a(status, 0);
    }
}
