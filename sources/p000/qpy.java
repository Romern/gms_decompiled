package p000;

import android.os.Bundle;

/* renamed from: qpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qpy extends rpa {

    /* renamed from: a */
    final /* synthetic */ bxxc f41933a;

    /* renamed from: b */
    final /* synthetic */ Bundle f41934b;

    /* renamed from: c */
    final /* synthetic */ qqa f41935c;

    public qpy(qqa qqa, bxxc bxxc, Bundle bundle) {
        this.f41935c = qqa;
        this.f41933a = bxxc;
        this.f41934b = bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11798a(rjd rjd, aucf aucf) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("entity", this.f41933a.serializeToBytes());
        qsa qsa = (qsa) ((qru) rjd).mo25289B();
        qsd qsd = new qsd(aucf);
        int i = this.f41935c.f41940b;
        Bundle bundle2 = this.f41934b;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        qsa.mo24240a(qsd, i, bundle, bundle2);
    }
}
