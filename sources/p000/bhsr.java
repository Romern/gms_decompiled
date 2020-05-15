package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: bhsr */
final /* synthetic */ class bhsr implements bhto {

    /* renamed from: a */
    private final bhst f119486a;

    /* renamed from: b */
    private final C1223np f119487b;

    /* renamed from: c */
    private final List f119488c;

    /* renamed from: d */
    private final bhtx f119489d;

    public bhsr(bhst bhst, C1223np npVar, List list, bhtx bhtx) {
        this.f119486a = bhst;
        this.f119487b = npVar;
        this.f119488c = list;
        this.f119489d = bhtx;
    }

    /* renamed from: a */
    public final void mo64222a(Collection collection, Collection collection2) {
        bhst bhst = this.f119486a;
        C1223np npVar = this.f119487b;
        List list = this.f119488c;
        bhtx bhtx = this.f119489d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bvoa bvoa = (bvoa) it.next();
            if ((bvoa.f156996a & 1) == 0) {
                bhuj.m101555a().mo64360b("Invalid PlaceInfo missing a feature ID");
            } else {
                bvni bvni = bvoa.f156997b;
                if (bvni == null) {
                    bvni = bvni.f156861b;
                }
                list.add(bhsu.m101472a(bvoa, (bvnw) npVar.get(Long.valueOf(bvni.f156863a))));
            }
        }
        if (bicy.m101982a()) {
            list.addAll(bhst.m101466a(list));
        }
        bhsp bhsp = bhst.f119493c;
        if (bhsp != null) {
            bhsp.mo64206b(bhtx, list);
        }
    }
}
