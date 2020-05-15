package p000;

import android.content.DialogInterface;

/* renamed from: tnv */
final /* synthetic */ class tnv implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final tnx f46362a;

    /* renamed from: b */
    private final bskf f46363b;

    public tnv(tnx tnx, bskf bskf) {
        this.f46362a = tnx;
        this.f46363b = bskf;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        tnx tnx = this.f46362a;
        bskf bskf = this.f46363b;
        trs trs = tnx.f46365a.f46571a;
        bngs j = bngx.m109377j();
        bnre i2 = bskf.mo70642a().listIterator();
        while (i2.hasNext()) {
            j.mo67668c(((tqk) i2.next()).mo26732f());
        }
        C0034at atVar = new C0034at();
        atVar.mo2450b(tql.m37366d());
        aucb a = trs.f46556b.mo26695a(j.mo67664a());
        a.mo50373a(new tqv(atVar));
        a.mo50372a(new tqw(atVar));
        a.mo50371a(new tqx(trs));
        atVar.mo2445a(tnx.f46366b, new tnw(tnx));
    }
}
