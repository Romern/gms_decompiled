package p000;

import java.util.Iterator;

/* renamed from: bbgz */
final /* synthetic */ class bbgz implements bmxj {

    /* renamed from: a */
    private final bmxv f102618a;

    public bbgz(bmxv bmxv) {
        this.f102618a = bmxv;
    }

    public final Object apply(Object obj) {
        bmxv bmxv = this.f102618a;
        bbfv b = bbfw.m87969b();
        bngx a = ((bbfw) bmxv.mo66814b()).mo56107a();
        bngx a2 = ((bbfw) obj).mo56107a();
        bngs j = bngx.m109377j();
        int size = a.size();
        Iterator it = a2.iterator();
        for (int i = 0; i < size; i++) {
            bbfz bbfz = (bbfz) a.get(i);
            if (bbfy.m87975b(bbfz.mo56113c())) {
                j.mo67668c(bbfz);
            } else {
                j.mo67668c((bbfz) it.next());
            }
        }
        b.mo56121a(j.mo67664a());
        return b.mo56119a();
    }
}
