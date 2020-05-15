package p000;

import android.os.Bundle;

/* renamed from: qpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qpz extends rpa {

    /* renamed from: a */
    final /* synthetic */ bxxc f41936a;

    /* renamed from: b */
    final /* synthetic */ Bundle f41937b;

    /* renamed from: c */
    final /* synthetic */ qqa f41938c;

    public qpz(qqa qqa, bxxc bxxc, Bundle bundle) {
        this.f41938c = qqa;
        this.f41936a = bxxc;
        this.f41937b = bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11798a(rjd rjd, aucf aucf) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("entity", this.f41936a.serializeToBytes());
        qsa qsa = (qsa) ((qru) rjd).mo25289B();
        qsd qsd = new qsd(aucf);
        int i = this.f41938c.f41940b;
        Bundle bundle2 = this.f41937b;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        qsa.mo24245b(qsd, i, bundle, bundle2);
    }
}
