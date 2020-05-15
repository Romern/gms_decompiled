package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: yjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yjh extends ykl {

    /* renamed from: i */
    private final boolean f53925i;

    public yjh(yjg yjg) {
        super(yjg);
        this.f53925i = yjg.f53924m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List mo30562a(List list, yhg yhg, yhy yhy) {
        List list2 = list;
        yhy yhy2 = yhy;
        List a = yjy.m44259a(list2, ygv.f53774d);
        List a2 = yjy.m44259a(list2, ygv.f53775e);
        Object obj = null;
        if (a.size() == 1 && a2.size() == 1 && this.f53925i) {
            ygx ygx = (ygx) bnjd.m109587b(a);
            ygx ygx2 = (ygx) bnjd.m109587b(a2);
            yhu yhu = (yhu) bnjd.m109589b(ygx2.mo30473a(), (Object) null);
            if (yhu != null) {
                yhx a3 = yjy.m44266a(yhy2, ygx.mo30474b());
                long a4 = yhu.mo30385a();
                bnre i = ygx.mo30473a().listIterator();
                while (i.hasNext()) {
                    yhu yhu2 = (yhu) i.next();
                    long b = yhu.mo30387b();
                    if (yhu2.mo30387b() <= a4 || yhu2.mo30385a() >= b) {
                        yfp.m43965a(a3, yhu2);
                    } else if (yhu2.mo30385a() < a4) {
                        this.f53920f.mo30575a(a3.mo30521c(), yhu2, yfv.m44005a(yhu2.mo30385a(), a4));
                    }
                }
                ygx = a3.mo30520b();
            }
            return bngx.m109357a(ygx, ygx2);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            ygx ygx3 = (ygx) list2.get(i2);
            yhu yhu3 = (yhu) bnjd.m109589b(ygx3.mo30473a(), obj);
            if (yhu3 != null) {
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    long a5 = yhu3.mo30385a();
                    yhu b2 = yfp.m43972b(((ygx) arrayList.get(i3)).mo30473a().listIterator(), a5, yhu3.mo30387b());
                    if (b2 != null && b2.mo30385a() < a5) {
                        yhx a6 = yjy.m44266a(yhy2, ygx3.mo30474b());
                        yfp.m43964a(a6, bnjd.m109590c(ygx3.mo30473a(), 1));
                        ygx3 = a6.mo30520b();
                    }
                }
            }
            arrayList.add(ygx3);
            i2++;
            obj = null;
        }
        return bngx.m109368a((Collection) arrayList);
    }
}
