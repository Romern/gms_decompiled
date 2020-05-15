package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: atic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atic extends atkj {
    public atic(String str, aswm aswm) {
        super("GetStableHardwareId", str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49623c(status, (String) null);
    }

    /* renamed from: a */
    public final boolean mo50004a() {
        return true;
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        super.mo50005b(context);
        this.f90414d.mo49623c(Status.f30107a, stm.m36299a(asiu.m74180a("stable_device_id", context, askc.m74272b())));
    }
}
