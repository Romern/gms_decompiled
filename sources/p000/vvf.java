package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: vvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vvf extends aaab {

    /* renamed from: a */
    private final rnt f50020a;

    public vvf(rnt rnt) {
        super(184, "IsInDrivingModeOperation");
        this.f50020a = rnt;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        vsj vsj = new vsj(context);
        try {
            this.f50020a.mo11797a(new Status(0, Boolean.valueOf(vsj.f49905a.mo28784b()).toString()));
            vsj.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f50020a.mo11797a(status);
    }
}
