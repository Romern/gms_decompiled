package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: arfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arfn extends aaab {

    /* renamed from: a */
    public final argg f87601a;

    /* renamed from: b */
    public final arjf f87602b;

    /* renamed from: c */
    private final Handler f87603c;

    public arfn(arjf arjf, argg argg, Handler handler) {
        super(76, "AbortDirectTransferOperation");
        this.f87601a = argg;
        this.f87602b = arjf;
        this.f87603c = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87603c.post(new arfm(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87602b.mo48605e(status);
    }
}
