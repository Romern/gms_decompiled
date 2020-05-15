package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

/* renamed from: arfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arfr extends aaab {

    /* renamed from: a */
    public final BootstrapOptions f87609a;

    /* renamed from: b */
    public final arjc f87610b;

    /* renamed from: c */
    public final argg f87611c;

    /* renamed from: d */
    public final arjf f87612d;

    /* renamed from: e */
    private final Handler f87613e;

    public arfr(arjf arjf, argg argg, BootstrapOptions bootstrapOptions, arjc arjc, Handler handler) {
        super(76, "EnableTargetModeOperation");
        this.f87609a = bootstrapOptions;
        this.f87610b = arjc;
        this.f87611c = argg;
        this.f87612d = arjf;
        this.f87613e = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87613e.post(new arfq(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87612d.mo48597a(status);
    }
}
