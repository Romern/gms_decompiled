package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: vve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vve extends aaab {

    /* renamed from: a */
    final int f50018a;

    /* renamed from: b */
    private final rnt f50019b;

    public vve(rnt rnt, int i) {
        super(184, "EndDrivingModeOperation");
        this.f50019b = rnt;
        this.f50018a = i;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        vsj vsj = new vsj(context);
        try {
            vsj.f49905a.mo28785b(vuu.m41423a(this.f50018a));
            this.f50019b.mo11797a(Status.f30107a);
            new vrb(context).mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_CLIENT_END_DRIVING_MODE);
            vsj.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f50019b.mo11797a(status);
    }
}
