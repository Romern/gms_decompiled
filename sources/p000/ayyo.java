package p000;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: ayyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayyo {

    /* renamed from: a */
    private final Map f98749a;

    /* renamed from: b */
    private final bxus f98750b = bxus.m123744c();

    public ayyo(Map map) {
        this.f98749a = map;
    }

    /* renamed from: a */
    public final void mo54530a(bxvg bxvg, List list, bxxb bxxb, List list2) {
        ayyl ayyl;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Integer num = (Integer) list.get(i);
            cijl cijl = (cijl) this.f98749a.get(Integer.valueOf(num.intValue()));
            if (cijl != null) {
                ayyl = (ayyl) cijl.mo6445a();
            } else {
                ayyl = null;
            }
            if (ayyl != null) {
                int intValue = num.intValue();
                bxvj a = this.f98750b.mo73903a((bxvg) ((GeneratedMessageLite) bxvg.mo74142c(6)), intValue);
                Map map = GeneratedMessageLite.f164959aj;
                bxvg.mo74135a(a);
                Object b = bxvg.f164952m.mo73913b(a.f164958d);
                if (b == null) {
                    b = a.f164956b;
                } else {
                    a.mo74139a(b);
                }
                bqgg a2 = ayyl.mo54529a((bxxc) b);
                bmxy.m108581a(a2);
                if (!ayyl.f98745a.equals(a2)) {
                    if (bxxb == null) {
                        list2.add(a2);
                    } else if (a2.isDone()) {
                        try {
                            ((ayyk) bqga.m112780a((Future) a2)).mo54528a(bxxb);
                        } catch (ExecutionException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        list2.add(bqdx.m112673a(a2, new ayym(bxxb), bqfb.INSTANCE));
                    }
                }
            }
        }
    }
}
