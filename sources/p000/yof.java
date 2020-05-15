package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: yof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class yof extends ykp {

    /* renamed from: j */
    private static final yjw f54269j = new yjw(2);

    public yof(yko yko) {
        super(yko);
    }

    /* renamed from: a */
    private final ygx m44486a(Iterable iterable, yhx yhx) {
        yjx yjx;
        yfv d = yfv.m44006d();
        if (((ykl) this).f53976h) {
            yjx = yjq.m44239a(this.f53917c);
        } else {
            yjx = null;
        }
        if (yjx != null) {
            return ykm.m44281a(iterable, d, yhx);
        }
        return ykm.m44281a(iterable, d, yhx);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List mo30562a(List list, yhg yhg, yhy yhy) {
        ygx a = mo30640a(list, yhy);
        List a2 = yjy.m44259a(list, ygv.m44056b(ygv.f53772b));
        List a3 = yjy.m44259a(list, ygv.m44057b("from_third_party_location"));
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ygx ygx = (ygx) list.get(i);
            if ("com.google.activity.segment".equals(ygx.mo30474b().mo30423c())) {
                arrayList.add(ygx);
            }
        }
        bngs j = bngx.m109377j();
        j.mo67666b((Iterable) a2);
        j.mo67666b((Iterable) a3);
        j.mo67668c(a);
        j.mo67666b((Iterable) arrayList);
        return super.mo30562a(j.mo67664a(), yhg, yhy);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ygx mo30640a(List list, yhy yhy) {
        bngs j = bngx.m109377j();
        j.mo67666b((Iterable) yjy.m44259a(list, ygv.m44057b("high_fidelity_from_activity")));
        j.mo67666b((Iterable) yjy.m44259a(list, ygv.m44057b("from_activity")));
        bngx a = j.mo67664a();
        yhx a2 = yjy.m44265a("com.google.distance.delta", "platform_distance_delta", yfl.f53726a, (caaq) null);
        ygx a3 = yjy.m44262a(list, "com.google.distance.delta", "from_steps");
        if (a3 == null) {
            return m44486a(a, a2);
        }
        yfr b = a3.mo30474b();
        Iterable<yhu> a4 = a3.mo30473a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            a4 = f54269j.mo30580a(a4, ((ygx) a.get(i)).mo30473a(), yjy.m44266a(yhy, b));
        }
        yhx a5 = yhy.m44167a(a3.mo30474b());
        for (yhu yhu : a4) {
            yht a6 = a5.mo30521c().mo30504a(yhu);
            a6.mo30506a(yhu.mo30511d());
            a6.mo30503a().mo30432a((double) yhu.mo30510b(0));
        }
        return m44486a(bnfi.m109236a(a, bngx.m109356a(a5.mo30520b())), a2);
    }
}
