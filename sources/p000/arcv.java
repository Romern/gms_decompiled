package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: arcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arcv extends aaab {

    /* renamed from: a */
    public final arit f87387a;

    /* renamed from: b */
    public final ariz f87388b;

    /* renamed from: c */
    public final ardc f87389c;

    /* renamed from: d */
    private final Handler f87390d;

    public arcv(arit arit, ariz ariz, ardc ardc, Handler handler) {
        super(75, "StartScanOperation");
        this.f87388b = ariz;
        this.f87387a = arit;
        this.f87389c = ardc;
        this.f87390d = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87390d.post(new arcu(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87387a.mo48574a(status);
    }
}
