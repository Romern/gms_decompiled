package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: arcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arcr extends aaab {

    /* renamed from: a */
    public final arit f87375a;

    /* renamed from: b */
    public final ardc f87376b;

    /* renamed from: c */
    public final Bundle f87377c;

    /* renamed from: d */
    private final Handler f87378d;

    public arcr(arit arit, Bundle bundle, ardc ardc, Handler handler) {
        super(75, "ResumeBootstrapOperation");
        this.f87375a = arit;
        this.f87376b = ardc;
        this.f87377c = bundle;
        this.f87378d = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87378d.post(new arcq(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87375a.mo48581g(status);
    }
}
