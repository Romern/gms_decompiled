package p000;

import android.os.Bundle;
import java.util.List;

/* renamed from: qps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qps extends rpa {

    /* renamed from: a */
    final /* synthetic */ List f41923a;

    /* renamed from: b */
    final /* synthetic */ Bundle f41924b;

    public qps(List list, Bundle bundle) {
        this.f41923a = list;
        this.f41924b = bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11798a(rjd rjd, aucf aucf) {
        qsa qsa = (qsa) ((qru) rjd).mo25289B();
        qsc qsc = new qsc((bxxk) byts.f167713b.mo74142c(7), aucf);
        List list = this.f41923a;
        Bundle bundle = this.f41924b;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        qsa.mo24237a(qsc, list, bundle);
    }
}
