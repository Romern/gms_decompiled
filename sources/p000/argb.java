package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: argb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class argb extends aaab {

    /* renamed from: a */
    public final arjc f87631a;

    /* renamed from: b */
    public final argg f87632b;

    /* renamed from: c */
    public final arjf f87633c;

    /* renamed from: d */
    private final Handler f87634d;

    public argb(arjf arjf, argg argg, arjc arjc, Handler handler) {
        super(76, "ResumeBootstrapOperation");
        this.f87631a = arjc;
        this.f87632b = argg;
        this.f87633c = arjf;
        this.f87634d = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87634d.post(new arga(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87633c.mo48602b(status);
    }
}
