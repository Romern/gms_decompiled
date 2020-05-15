package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

/* renamed from: ypz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ypz extends ykl {

    /* renamed from: i */
    private final boolean f54371i;

    public ypz(ypy ypy) {
        super(ypy);
        this.f54371i = ypy.f54370l;
    }

    /* renamed from: a */
    private static int m44561a(List list, caap caap) {
        for (int i = 0; i < list.size(); i++) {
            yfr b = ((ygx) list.get(i)).mo30474b();
            if (b.mo30422b().mo30409a().equals("com.google.android.gms") && b.mo30428g() != null) {
                caap a = caap.m126421a(b.mo30428g().f172360c);
                if (a == null) {
                    a = caap.UNKNOWN;
                }
                if (a == caap) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: yfp.a(java.util.List, java.util.concurrent.TimeUnit):long
     arg types: [bngx, java.util.concurrent.TimeUnit]
     candidates:
      yfp.a(yhu, int):float
      yfp.a(yhg, java.util.ListIterator):bngx
      yfp.a(java.util.List, java.lang.Object):java.util.List
      yfp.a(java.util.ListIterator, long):yhu
      yfp.a(yht, java.util.List):void
      yfp.a(yhx, java.lang.Iterable):void
      yfp.a(yhx, yhu):void
      yfp.a(yhg, yhg):boolean
      yfp.a(java.util.List, java.util.concurrent.TimeUnit):long */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List mo30562a(List list, yhg yhg, yhy yhy) {
        int i;
        List list2 = list;
        if (this.f54371i) {
            int a = m44561a(list2, caap.PHONE);
            int a2 = m44561a(list2, caap.WATCH);
            if (!(a == -1 || a2 == -1)) {
                ygx ygx = (ygx) list2.get(a2);
                bngx a3 = ygx.mo30473a();
                bngx a4 = ((ygx) list2.get(a)).mo30473a();
                yfr b = ygx.mo30474b();
                yfq a5 = yfr.m43986a();
                a5.mo30416a(b.mo30429h());
                a5.mo30421b(b.mo30423c());
                a5.mo30420a(b.mo30422b());
                caaq g = b.mo30428g();
                bmxy.m108581a(g);
                a5.mo30418a(g);
                a5.mo30419a(b.mo30427f());
                yhx a6 = yhy.m44167a(a5.mo30415a());
                ListIterator listIterator = a4.listIterator();
                int size = a3.size();
                int i2 = 0;
                while (i2 < size) {
                    yhu yhu = (yhu) a3.get(i2);
                    bngx a7 = yfp.m43959a(yhu, listIterator);
                    if (a7.size() < 2) {
                        yfp.m43965a(a6, yhu);
                        i = i2;
                    } else {
                        float b2 = (float) yfp.m43968b(a7);
                        long a8 = yfp.m43957a((List) a7, TimeUnit.NANOSECONDS);
                        float a9 = yfp.m43956a(yhu, 1);
                        i = i2;
                        long a10 = yhh.m44102a(yhu, TimeUnit.NANOSECONDS);
                        if (b2 < a9 * 0.7f && ((float) a8) < ((float) a10) * 0.7f) {
                            yfp.m43965a(a6, yhu);
                        } else if (a9 >= 0.7f * b2) {
                            int size2 = a7.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                yhu yhu2 = (yhu) a7.get(i3);
                                int j = yhu.mo30517j();
                                int j2 = yhu2.mo30517j();
                                yht a11 = a6.mo30521c().mo30504a(yhu2);
                                a11.mo30506a(yhu.mo30511d());
                                a11.mo30503a().mo30433a(Math.round((((float) j) * ((float) j2)) / b2));
                            }
                        }
                    }
                    i2 = i + 1;
                }
                ygx b3 = a6.mo30520b();
                ArrayList arrayList = new ArrayList(list2);
                arrayList.set(a2, b3);
                return arrayList;
            }
        }
        return list2;
    }
}
