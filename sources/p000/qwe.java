package p000;

import android.view.View;

/* renamed from: qwe */
final /* synthetic */ class qwe implements aubq {

    /* renamed from: a */
    private final qwg f42308a;

    /* renamed from: b */
    private final View f42309b;

    public qwe(qwg qwg, View view) {
        this.f42308a = qwg;
        this.f42309b = view;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        qwg qwg = this.f42308a;
        this.f42309b.setEnabled(true);
        if (aucb.mo50384b()) {
            qwg.setResult(-1);
            qwg.finish();
            return;
        }
        qwg.f42312e.mo17652a(true);
    }
}
