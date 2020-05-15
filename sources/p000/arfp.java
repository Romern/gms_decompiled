package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: arfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arfp extends aaab {

    /* renamed from: a */
    public final argg f87605a;

    /* renamed from: b */
    public final arjf f87606b;

    /* renamed from: c */
    private final Handler f87607c;

    public arfp(arjf arjf, argg argg, Handler handler) {
        super(76, "DisableTargetModeOperation");
        this.f87605a = argg;
        this.f87606b = arjf;
        this.f87607c = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87607c.post(new arfo(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87606b.mo48603c(status);
    }
}
