package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: arcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arcx extends aaab {

    /* renamed from: a */
    public final arit f87392a;

    /* renamed from: b */
    public final ardc f87393b;

    /* renamed from: c */
    private final Handler f87394c;

    public arcx(arit arit, ardc ardc, Handler handler) {
        super(75, "StopScanOperation");
        this.f87392a = arit;
        this.f87393b = ardc;
        this.f87394c = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87394c.post(new arcw(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87392a.mo48576b(status);
    }
}
