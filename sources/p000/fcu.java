package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: fcu */
final /* synthetic */ class fcu implements C1234o {

    /* renamed from: a */
    private final fda f16290a;

    public fcu(fda fda) {
        this.f16290a = fda;
    }

    /* renamed from: a */
    public final Object mo10678a(Object obj) {
        List<bsxn> list;
        fda fda = this.f16290a;
        bsxk bsxk = ((epq) obj).f15491a;
        if (bsxk.f147581b == 6) {
            list = ((bsvg) bsxk.f147582c).f147250a;
        } else {
            list = bngx.m109376e();
        }
        ArrayList arrayList = new ArrayList();
        for (bsxn bsxn : list) {
            arrayList.add(fda.f16297b.mo10684c(bsxn));
        }
        return new epo(arrayList);
    }
}
