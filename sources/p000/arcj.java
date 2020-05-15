package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: arcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arcj extends aaab {

    /* renamed from: a */
    public final arit f87357a;

    /* renamed from: b */
    public final ardc f87358b;

    /* renamed from: c */
    public final String f87359c;

    /* renamed from: d */
    private final Handler f87360d;

    public arcj(arit arit, String str, ardc ardc, Handler handler) {
        super(75, "ContinueWithPinOperation");
        this.f87357a = arit;
        this.f87358b = ardc;
        this.f87359c = str;
        this.f87360d = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87360d.post(new arci(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87357a.mo48579e(status);
    }
}
