package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bhtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhtm {

    /* renamed from: a */
    public final C1245ok f119561a = new C1245ok();

    /* renamed from: b */
    public final C1245ok f119562b = new C1245ok();

    /* renamed from: a */
    public final void mo64276a(bvoa bvoa) {
        int i = bvoa.f156996a;
        if ((i & 1) == 0 || (i & 4) == 0 || (i & 8) == 0) {
            bhwp a = bhuj.m101555a();
            String valueOf = String.valueOf(bvoa);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("Invalid PlaceInfoMobile: ");
            sb.append(valueOf);
            a.mo64360b(sb.toString());
            return;
        }
        long a2 = ayvd.m84896a(bvoa.f156999d, bvoa.f157000e);
        C1245ok okVar = this.f119561a;
        Long valueOf2 = Long.valueOf(ayvd.m84899a(a2, 18));
        List list = (List) okVar.get(valueOf2);
        if (list == null) {
            list = new ArrayList();
            this.f119561a.put(valueOf2, list);
        }
        bvni bvni = bvoa.f156997b;
        if (bvni == null) {
            bvni = bvni.f156861b;
        }
        Long valueOf3 = Long.valueOf(bvni.f156863a);
        if (!list.contains(valueOf3)) {
            list.add(valueOf3);
        }
    }
}
