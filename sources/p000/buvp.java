package p000;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* renamed from: buvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buvp extends bvbj {

    /* renamed from: a */
    private final Context f155071a;

    public buvp(Context context) {
        this.f155071a = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bvbw mo73150a(buzt buzt) {
        if ((buzt.f155425a & 16) == 0) {
            return null;
        }
        buzu buzu = buzt.f155429e;
        if (buzu == null) {
            buzu = buzu.f155430c;
        }
        String a = bvau.m120845a(buzu.f155433b.getKey());
        srn srn = bvcm.f155598a;
        return new buvo(this.f155071a, true, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bvbw mo73151a(buzt buzt, Set set) {
        buzu buzu = buzt.f155429e;
        if (buzu == null) {
            buzu = buzu.f155430c;
        }
        if ((buzu.f155432a & 1) != 0) {
            buzu buzu2 = buzt.f155429e;
            if (buzu2 == null) {
                buzu2 = buzu.f155430c;
            }
            String a = bvau.m120845a(buzu2.f155433b.getKey());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                buvo buvo = (buvo) it.next();
                if (buvo.f155059a.equals(a)) {
                    srn srn = bvcm.f155598a;
                    return buvo;
                }
            }
            return null;
        }
        buzx buzx = buzt.f155427c;
        if (buzx == null) {
            buzx = buzx.f155443c;
        }
        if ((buzx.f155445a & 1) == 0) {
            return null;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            buvo buvo2 = (buvo) it2.next();
            buzx buzx2 = buzt.f155427c;
            if (buzx2 == null) {
                buzx2 = buzx.f155443c;
            }
            if (buzx2.equals(buvo2.mo73149g())) {
                srn srn2 = bvcm.f155598a;
                buzx buzx3 = buzt.f155427c;
                if (buzx3 == null) {
                    buzx3 = buzx.f155443c;
                }
                String str = buzx3.f155446b;
                return buvo2;
            }
        }
        return null;
    }
}
