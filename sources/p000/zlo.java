package p000;

import com.google.android.gms.fitness.result.DataSourcesResult;

/* renamed from: zlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zlo extends zaz {

    /* renamed from: a */
    final /* synthetic */ caah f55391a;

    /* renamed from: b */
    final /* synthetic */ bqgy f55392b;

    /* renamed from: c */
    final /* synthetic */ zlu f55393c;

    public zlo(zlu zlu, caah caah, bqgy bqgy) {
        this.f55393c = zlu;
        this.f55391a = caah;
        this.f55392b = bqgy;
    }

    /* renamed from: a */
    public final void mo30897a(DataSourcesResult dataSourcesResult) {
        bngx a = yvx.m44924a(dataSourcesResult.f32340a);
        srn srn = zlu.f55408a;
        a.size();
        this.f55393c.f55409b.getPackage();
        yyd.m44991b(a);
        bngs b = bngx.m109371b(a.size());
        bzzy bzzy = (bzzy) bzzz.f172298f.mo74144da();
        String str = this.f55393c.f55409b.getPackage();
        if (bzzy.f164950c) {
            bzzy.mo74035c();
            bzzy.f164950c = false;
        }
        bzzz bzzz = (bzzz) bzzy.f164949b;
        str.getClass();
        bzzz.f172300a |= 1;
        bzzz.f172301b = str;
        bzzz bzzz2 = (bzzz) bzzy.mo74062i();
        bnre i = a.listIterator();
        while (i.hasNext()) {
            caae caae = (caae) i.next();
            caah caah = this.f55391a;
            caah caah2 = caae.f172330f;
            if (caah2 == null) {
                caah2 = caah.f172333d;
            }
            if (!bzzn.m126363a(caah, caah2)) {
                bnsl bnsl = (bnsl) zlu.f55408a.mo68388c();
                bnsl.mo68432a("zlo", "a", 140, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("Got invalid data source [%s] when requesting type [%s]", caae.f172326b, this.f55391a.f172336b);
            } else {
                yyc c = yyd.m44993c(caae);
                c.mo30855a(bzzz2);
                b.mo67668c(c.mo30854a());
            }
        }
        this.f55392b.mo69138b(b.mo67664a());
    }
}
