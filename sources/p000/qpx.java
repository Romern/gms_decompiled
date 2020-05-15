package p000;

import android.os.Bundle;

/* renamed from: qpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qpx extends rpa {

    /* renamed from: a */
    final /* synthetic */ Bundle f41931a;

    /* renamed from: b */
    final /* synthetic */ qqa f41932b;

    public qpx(qqa qqa, Bundle bundle) {
        this.f41932b = qqa;
        this.f41931a = bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11798a(rjd rjd, aucf aucf) {
        qsa qsa = (qsa) ((qru) rjd).mo25289B();
        qsc qsc = new qsc(this.f41932b.f41939a, aucf);
        int i = this.f41932b.f41940b;
        Bundle bundle = this.f41931a;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        qsa.mo24234a(qsc, i, bundle);
    }
}
