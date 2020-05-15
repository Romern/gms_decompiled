package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: qsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qsb extends qrw {

    /* renamed from: a */
    private final Class f42018a;

    /* renamed from: b */
    private final aucf f42019b;

    public qsb(Class cls, aucf aucf) {
        this.f42018a = cls;
        this.f42019b = aucf;
    }

    /* renamed from: a */
    public final void mo24233a(Bundle bundle) {
        qse qse = new qse((Status) adbw.m50144a(bundle, "status", Status.class), adbw.m50144a(bundle, "parcelable", this.f42018a));
        if (qse.f42023a.mo17710c()) {
            this.f42019b.mo50391a(qse.f42024b);
        } else {
            this.f42019b.mo50390a((Exception) rzy.m34725a(qse.f42023a));
        }
    }
}
