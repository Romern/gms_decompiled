package p000;

import java.util.List;

/* renamed from: caqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caqn implements caqz {

    /* renamed from: a */
    final /* synthetic */ caqo f175569a;

    public caqn(caqo caqo) {
        this.f175569a = caqo;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo74755a(caou caou) {
        caqo caqo = this.f175569a;
        caqo.f175571b.f175642d.f175564p = 2;
        caqo.f175573d = capy.m126942a();
        this.f175569a.f175572c.mo74749k();
        return this.f175569a.mo74768a(caou);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo74758b(List list) {
        caqo caqo = this.f175569a;
        caqo.f175571b.f175642d.f175564p = 3;
        caqo.f175572c.mo74747i();
        this.f175569a.f175573d = capy.m126943a(list);
        caqo caqo2 = this.f175569a;
        return caqo2.mo74768a(caqo2.mo74767a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo74756a(List list) {
        if (!list.contains(cash.CONTEXT_NOT_MATCHING)) {
            caqo caqo = this.f175569a;
            caqo.f175571b.f175642d.f175564p = 5;
            caqo.f175573d = capy.m126942a();
            caqo caqo2 = this.f175569a;
            return caqo2.mo74768a(caqo2.mo74767a());
        }
        if (list.contains(cash.CONTEXT_NOT_MATCHING)) {
            caqo caqo3 = this.f175569a;
            caqo3.f175571b.f175642d.f175564p = 7;
            caqo3.f175573d = capy.m126943a(list);
        } else {
            this.f175569a.f175571b.f175642d.f175564p = 6;
        }
        caqo caqo4 = this.f175569a;
        return caqo4.mo74768a(caqo4.mo74767a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo74757a(List list, caou caou) {
        caqo caqo = this.f175569a;
        caqo.f175571b.f175642d.f175564p = 1;
        byte[] bArr = capy.f175522a;
        caqo.f175573d = null;
        caqo.f175572c.mo74749k();
        caoz.m126908a();
        capb.m126909a(this.f175569a.f175579j);
        caqo caqo2 = this.f175569a;
        caqo2.f175578i.mo74763a(caou.mo49410c());
        caqo2.f175572c.mo74748j();
        caqo2.f175574e.mo74765a();
        if (caqo2.f175570a.f175482r) {
            caqo2.f175572c.mo74744f();
        }
        return caqo2.mo74769b(caou);
    }
}
