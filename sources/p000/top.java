package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: top */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class top {

    /* renamed from: a */
    public static final bnic f46413a = bnic.m109491a("http", "https", "android");

    /* renamed from: b */
    private final rjx f46414b;

    public top(rjx rjx) {
        this.f46414b = rjx;
    }

    /* renamed from: a */
    public static bmxv m37297a(bngx bngx, String str) {
        String str2;
        bmxv bmxv;
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            bxwc bxwc = ((byty) i.next()).f167734b;
            int size = bxwc.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    bytw bytw = (bytw) bxwc.get(i2);
                    String str3 = bytw.f167728b;
                    if (!bmxx.m108577a(str3) && !bmxx.m108577a(str)) {
                        if (!str3.endsWith("/")) {
                            str3 = str3.concat("/");
                        }
                        if (!str.endsWith("/")) {
                            str2 = str.concat("/");
                        } else {
                            str2 = str;
                        }
                        if (str3.equals(str2)) {
                            bytv bytv = bytw.f167729c;
                            if (bytv == null) {
                                bytv = bytv.f167717g;
                            }
                            if (bytv.f167720b.isEmpty()) {
                                bmxv = bmvz.f131120a;
                            } else {
                                bytv bytv2 = bytw.f167729c;
                                if (bytv2 == null) {
                                    bytv2 = bytv.f167717g;
                                }
                                bmxv = bmxv.m108566b(bytv2);
                            }
                            if (bmxv.mo66813a()) {
                                return bmxv;
                            }
                        }
                    }
                    i2++;
                }
            }
        }
        return bmvz.f131120a;
    }

    /* renamed from: a */
    private static final bngx m37298a(List list) {
        return bnfi.m109235a(list).mo67502a(ton.f46411a).mo67501a(too.f46412a).mo67505b();
    }

    /* renamed from: a */
    public final aucb mo26689a(bngx bngx) {
        bngs j = bngx.m109377j();
        for (List list : bnkn.m109667a(bngx, 100)) {
            if (!m37298a(list).isEmpty()) {
                rjx rjx = this.f46414b;
                bngx a = m37298a(list);
                sdo.m34961a(a.size());
                j.mo67668c(rjx.mo24701a((rpa) new qpt(a)));
            }
        }
        bngx a2 = j.mo67664a();
        if (a2.isEmpty()) {
            return aucu.m76778a((Object) bngx.m109376e());
        }
        return aucu.m76779a((Collection) a2).mo50363a(new tom(a2));
    }
}
