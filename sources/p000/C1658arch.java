package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: arch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1658arch extends aaab {

    /* renamed from: a */
    public final arit f87350a;

    /* renamed from: b */
    public final ardc f87351b;

    /* renamed from: c */
    public final D2DDevice f87352c;

    /* renamed from: d */
    public final String f87353d;

    /* renamed from: e */
    public final ariq f87354e;

    /* renamed from: f */
    private final Handler f87355f;

    public C1658arch(arit arit, D2DDevice d2DDevice, String str, ariq ariq, ardc ardc, Handler handler) {
        super(75, "ConnectOperation");
        this.f87350a = arit;
        this.f87351b = ardc;
        this.f87352c = d2DDevice;
        this.f87353d = str;
        this.f87354e = ariq;
        this.f87355f = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87355f.post(new arcg(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87350a.mo48577c(status);
    }
}
