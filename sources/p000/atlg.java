package p000;

import com.google.android.gms.tapandpay.settings.TapAndPayHomeChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: atlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atlg implements asin {

    /* renamed from: a */
    final WeakReference f90441a;

    public atlg(TapAndPayHomeChimeraActivity tapAndPayHomeChimeraActivity) {
        this.f90441a = new WeakReference(tapAndPayHomeChimeraActivity);
    }

    /* renamed from: a */
    public final void mo49193a() {
        TapAndPayHomeChimeraActivity tapAndPayHomeChimeraActivity = (TapAndPayHomeChimeraActivity) this.f90441a.get();
        if (tapAndPayHomeChimeraActivity != null && tapAndPayHomeChimeraActivity.mo59412h() != null) {
            String str = tapAndPayHomeChimeraActivity.f108676c.f108326b;
            aucb x = tapAndPayHomeChimeraActivity.f108679f.mo24770x();
            x.mo50376a(tapAndPayHomeChimeraActivity, new atlb(tapAndPayHomeChimeraActivity, str));
            x.mo50375a(tapAndPayHomeChimeraActivity, new atlc(tapAndPayHomeChimeraActivity));
        }
    }
}
