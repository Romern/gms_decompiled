package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: arcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arcl extends aaab {

    /* renamed from: a */
    public final arit f87362a;

    /* renamed from: b */
    public final ardc f87363b;

    /* renamed from: c */
    private final Handler f87364c;

    public arcl(arit arit, ardc ardc, Handler handler) {
        super(75, "DisconnectOperation");
        this.f87362a = arit;
        this.f87363b = ardc;
        this.f87364c = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87364c.post(new arck(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87362a.mo48580f(status);
    }
}
