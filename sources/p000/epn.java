package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: epn */
final /* synthetic */ class epn implements C0038ax {

    /* renamed from: a */
    private final epo f15488a;

    public epn(epo epo) {
        this.f15488a = epo;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        epo epo = this.f15488a;
        epq epq = (epq) obj;
        ArrayList arrayList = new ArrayList();
        List list = epo.f15489a;
        int size = list.size();
        int i = 0;
        while (i < size) {
            C0034at atVar = (C0034at) list.get(i);
            if (atVar.mo2448b() != null) {
                arrayList.add(((epq) atVar.mo2448b()).f15491a);
                i++;
            } else {
                return;
            }
        }
        if (!arrayList.equals(epo.mo2448b())) {
            epo.mo2450b(arrayList);
        }
    }
}
