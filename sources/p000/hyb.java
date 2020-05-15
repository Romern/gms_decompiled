package p000;

import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.Map;

/* renamed from: hyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hyb {

    /* renamed from: a */
    public static final srn f20544a = srn.m36124a();

    /* renamed from: b */
    public final hzh f20545b = new hxz(this);

    /* renamed from: c */
    public final bndu f20546c = bndu.m109109r();

    /* renamed from: d */
    public final hzs f20547d = new hzj();

    /* renamed from: e */
    public final hzu f20548e;

    /* renamed from: f */
    public final hzl f20549f;

    /* renamed from: g */
    public final hzk f20550g;

    /* renamed from: h */
    public final hzq f20551h;

    public hyb(hzu hzu, hzl hzl, hzk hzk, hzq hzq) {
        bmxy.m108581a(hzu);
        bmxy.m108581a(hzl);
        bmxy.m108581a(hzk);
        bmxy.m108581a(hzq);
        this.f20548e = hzu;
        this.f20549f = hzl;
        this.f20550g = hzk;
        this.f20551h = hzq;
    }

    /* renamed from: a */
    public static long m15004a() {
        return ccdy.m129349b() * 1000;
    }

    /* renamed from: a */
    public final void mo12805a(long j) {
        long a = j - m15004a();
        bngs j2 = bngx.m109377j();
        Iterator it = this.f20546c.mo67315n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((Long) entry.getValue()).longValue() <= a) {
                j2.mo67668c((String) entry.getKey());
                it.remove();
            }
        }
        bngx a2 = j2.mo67664a();
        if (!a2.isEmpty()) {
            bnre i = a2.listIterator();
            while (i.hasNext()) {
                String str = (String) i.next();
                this.f20550g.mo12830a(ibh.m15188f(str));
                hzk hzk = this.f20550g;
                bmxy.m108581a(str);
                hzk.f20592a.f20600g.mo12842a(hxv.m14997a(str, Status.f30110d));
            }
        }
    }
}
