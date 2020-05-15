package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: vvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vvg extends aaab {

    /* renamed from: a */
    final int f50021a;

    /* renamed from: b */
    private final rnt f50022b;

    public vvg(rnt rnt, int i) {
        super(184, "StartDrivingModeOperation");
        this.f50022b = rnt;
        this.f50021a = i;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        vsj vsj = new vsj(context);
        try {
            vsj.f49905a.mo28786c(vuu.m41423a(this.f50021a));
            this.f50022b.mo11797a(Status.f30107a);
            new vrb(context).mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_CLIENT_START_DRIVING_MODE);
            vsj.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f50022b.mo11797a(status);
    }
}
