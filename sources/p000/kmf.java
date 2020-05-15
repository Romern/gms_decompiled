package p000;

import java.util.Set;

/* renamed from: kmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kmf implements klo {

    /* renamed from: a */
    public static final /* synthetic */ int f24459a = 0;

    /* renamed from: b */
    private static final bngx f24460b = bngx.m109363a(kpb.OTP_1, kpb.OTP_2, kpb.OTP_3, kpb.OTP_4, kpb.OTP_5, kpb.OTP_6, kpb.OTP_7, kpb.OTP_8);

    /* renamed from: c */
    private static final bnic f24461c;

    static {
        bnia bnia = new bnia();
        bnia.mo67629b(kpb.OTP_FULL);
        bnia.mo67752b((Iterable) f24460b);
        f24461c = bnia.mo67751a();
    }

    /* renamed from: a */
    public static boolean m18160a(Set set) {
        return !bnpf.m110055b(set, f24461c).isEmpty();
    }

    /* renamed from: a */
    public final kln mo14681a(bngx bngx) {
        klm a = kln.m18126a();
        long count = bngx.stream().filter(kme.f24458a).count();
        if (count > 1) {
            bnre i = bngx.listIterator();
            int i2 = 0;
            while (i.hasNext()) {
                kjl kjl = (kjl) i.next();
                if (!m18160a(kjl.mo14517b())) {
                    a.mo14678a(kjl);
                } else if (count <= ((long) f24460b.size())) {
                    a.mo14678a(kjl.mo14529a((kpb) f24460b.get(i2)));
                    i2++;
                } else {
                    a.mo14680b(kjl);
                }
            }
            return a.mo14676a();
        }
        a.mo14677a(bngx);
        return a.mo14676a();
    }
}
