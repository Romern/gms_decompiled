package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: gwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gwg extends hig {

    /* renamed from: a */
    private final aucf f19115a;

    /* renamed from: b */
    private final Class f19116b;

    public gwg(aucf aucf, Class cls) {
        this.f19115a = aucf;
        this.f19116b = cls;
    }

    /* renamed from: a */
    public final void mo12276a(Bundle bundle) {
        Class cls = this.f19116b;
        Status status = (Status) adbw.m50144a(bundle, "status", Status.class);
        sdo.m34959a(status);
        gwm gwm = new gwm(status, bmxv.m108567c(adbw.m50144a(bundle, "parcelable", cls)));
        if (gwm.f19126a.mo17710c()) {
            this.f19115a.mo50391a((SafeParcelable) gwm.f19127b.mo66814b());
        } else {
            this.f19115a.mo50390a((Exception) rzy.m34725a(gwm.f19126a));
        }
    }
}
