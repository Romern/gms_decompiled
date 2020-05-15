package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* renamed from: atjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjl extends atkk {
    public atjl(String str, aswm aswm) {
        super("ReportInAppManualUnlock", str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49629f(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        new atkm(context).mo50011a(SystemClock.elapsedRealtime());
        aszy.m75273d(context);
        this.f90414d.mo49629f(Status.f30107a);
    }
}
