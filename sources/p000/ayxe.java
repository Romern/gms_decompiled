package p000;

import java.util.Map;

/* renamed from: ayxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayxe implements ayvq {
    /* renamed from: a */
    public final bqgg mo54453a(ayvw ayvw) {
        if (ayvw instanceof ayyd) {
            ayyd ayyd = (ayyd) ayvw;
            aywu b = ayyd.mo54526b();
            bxvj bxvj = ayxg.f98679a;
            Map map = bxvk.f164959aj;
            b.mo74135a(bxvj);
            if (b.f164952m.mo73911a(bxvj.f164958d)) {
                aywu b2 = ayyd.mo54526b();
                bxvj bxvj2 = ayxg.f98679a;
                b2.mo74135a(bxvj2);
                Object b3 = b2.f164952m.mo73913b(bxvj2.f164958d);
                if (b3 == null) {
                    b3 = bxvj2.f164956b;
                } else {
                    bxvj2.mo74139a(b3);
                }
                ayxf ayxf = (ayxf) b3;
                if ((ayxf.f98677a & 1) == 0) {
                    return bqga.m112775a(new ayvk(3, null));
                }
                String str = ayxf.f98678b;
                if (str.isEmpty()) {
                    return bqga.m112775a(new ayvk(2, null));
                }
                bmxy.m108581a(str);
                return bqga.m112775a(new ayvk(1, str));
            }
        }
        return bqga.m112775a((Object) null);
    }
}
