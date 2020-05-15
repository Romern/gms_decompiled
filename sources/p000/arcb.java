package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: arcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arcb extends aaab {

    /* renamed from: a */
    public final arit f87335a;

    /* renamed from: b */
    public final ardc f87336b;

    /* renamed from: c */
    private final Handler f87337c;

    public arcb(arit arit, ardc ardc, Handler handler) {
        super(75, "AbortDirectTransferOperation");
        this.f87335a = arit;
        this.f87336b = ardc;
        this.f87337c = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87337c.post(new arca(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87335a.mo48584j(status);
    }
}
