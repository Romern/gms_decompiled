package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.Collection;

/* renamed from: gwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gwf extends hig {

    /* renamed from: a */
    private final aucf f19113a;

    /* renamed from: b */
    private final Class f19114b;

    public gwf(aucf aucf, Class cls) {
        this.f19113a = aucf;
        this.f19114b = cls;
    }

    /* renamed from: a */
    public final void mo12276a(Bundle bundle) {
        bngx bngx;
        Class cls = this.f19114b;
        Status status = (Status) adbw.m50144a(bundle, "status", Status.class);
        sdo.m34959a(status);
        Bundle bundle2 = bundle.getBundle("parcelables");
        if (bundle2 == null) {
            bngx = bngx.m109376e();
        } else {
            bundle2.setClassLoader(cls.getClassLoader());
            bngx = bngx.m109368a((Collection) bundle2.getParcelableArrayList("parcelables"));
        }
        gwl gwl = new gwl(status, bngx.m109368a((Collection) bngx));
        if (gwl.f19124a.mo17710c()) {
            this.f19113a.mo50391a(gwl.f19125b);
        } else {
            this.f19113a.mo50390a((Exception) rzy.m34725a(gwl.f19124a));
        }
    }
}
