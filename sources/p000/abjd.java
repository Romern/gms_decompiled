package p000;

import android.content.Context;
import android.os.Build;
import java.util.List;

/* renamed from: abjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abjd {

    /* renamed from: a */
    public final Context f57571a;

    /* renamed from: b */
    private final bqgj f57572b;

    public abjd(Context context, bqgj bqgj) {
        this.f57571a = context;
        this.f57572b = bqgj;
    }

    /* renamed from: a */
    public static final abjc m47786a(String str, List list, boolean z, bmwc bmwc) {
        bngs j = bngx.m109377j();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            abjc abjc = (abjc) ((bqgg) list.get(i)).get();
            z = bmwc.mo28751a(Boolean.valueOf(abjc.mo32132a()), Boolean.valueOf(z));
            j.mo67666b((Iterable) abjc.mo32133b());
        }
        if (!z) {
            return abjc.m47782a(str, j);
        }
        return abjc.m47783c();
    }

    /* renamed from: a */
    public static bnoa m47787a(bslz bslz) {
        return bnoa.m109929a(Long.valueOf(bslz.f144986a), Long.valueOf(bslz.f144987b));
    }

    /* renamed from: a */
    private final List m47788a(List list) {
        bngs j = bngx.m109377j();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            j.mo67668c(mo32144a((bsmf) list.get(i)));
        }
        return j.mo67664a();
    }

    /* renamed from: a */
    public final bqfl mo32144a(bsmf bsmf) {
        int i;
        bslv bslv;
        bsmb bsmb;
        bsma bsma;
        bslx bslx;
        bsme bsme;
        bsmc bsmc;
        bsmd bsmd;
        bslw bslw;
        bsly bsly;
        int i2 = bsmf.f145010a;
        if (i2 != 0) {
            switch (i2) {
                case 3:
                    i = 1;
                    break;
                case 4:
                    i = 2;
                    break;
                case 5:
                    i = 3;
                    break;
                case 6:
                    i = 4;
                    break;
                case 7:
                    i = 5;
                    break;
                case 8:
                    i = 6;
                    break;
                case 9:
                    i = 7;
                    break;
                case 10:
                    i = 8;
                    break;
                case 11:
                    i = 9;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = 10;
        }
        int i3 = i - 1;
        if (i != 0) {
            switch (i3) {
                case 0:
                    if (i2 == 3) {
                        bslv = (bslv) bsmf.f145011b;
                    } else {
                        bslv = bslv.f144965b;
                    }
                    String str = bsmf.f145012c;
                    List a = m47788a(bslv.f144967a);
                    return bqfl.m112747c(bqga.m112785c(a).mo69216a(new abis(str, a), this.f57572b));
                case 1:
                    if (i2 == 4) {
                        bsmb = (bsmb) bsmf.f145011b;
                    } else {
                        bsmb = bsmb.f144993b;
                    }
                    String str2 = bsmf.f145012c;
                    List a2 = m47788a(bsmb.f144995a);
                    return bqfl.m112747c(bqga.m112785c(a2).mo69216a(new abit(str2, a2), this.f57572b));
                case 2:
                    if (i2 == 5) {
                        bsma = (bsma) bsmf.f145011b;
                    } else {
                        bsma = bsma.f144989b;
                    }
                    String str3 = bsmf.f145012c;
                    bsmf bsmf2 = bsma.f144991a;
                    if (bsmf2 == null) {
                        bsmf2 = bsmf.f145008e;
                    }
                    return (bqfl) bqdx.m112673a(bqfl.m112747c(mo32144a(bsmf2)), new abiv(str3), this.f57572b);
                case 3:
                    if (i2 == 6) {
                        bslx = (bslx) bsmf.f145011b;
                    } else {
                        bslx = bslx.f144975c;
                    }
                    String str4 = bsmf.f145012c;
                    List a3 = m47788a(bslx.f144977a);
                    return bqfl.m112747c(bqga.m112785c(a3).mo69216a(new abiu(a3, bslx, str4), this.f57572b));
                case 4:
                    String str5 = bsmf.f145012c;
                    if (i2 == 7) {
                        bsme = (bsme) bsmf.f145011b;
                    } else {
                        bsme = bsme.f145004b;
                    }
                    return bqfl.m112747c(this.f57572b.mo25819b(new abiy(this, bsme, str5)));
                case 5:
                    String str6 = bsmf.f145012c;
                    if (i2 == 8) {
                        bsmc = (bsmc) bsmf.f145011b;
                    } else {
                        bsmc = bsmc.f144996b;
                    }
                    return bqfl.m112747c(this.f57572b.mo25819b(new abiw(this, bsmc, str6)));
                case 6:
                    String str7 = bsmf.f145012c;
                    if (i2 == 9) {
                        bsmd = (bsmd) bsmf.f145011b;
                    } else {
                        bsmd = bsmd.f145000b;
                    }
                    bslz bslz = bsmd.f145002a;
                    if (bslz == null) {
                        bslz = bslz.f144984c;
                    }
                    return bqfl.m112747c(bqga.m112775a(m47787a(bslz).mo6527a(Long.valueOf((long) Build.VERSION.SDK_INT)) ? abjc.m47783c() : abjc.m47781a(str7)));
                case 7:
                    String str8 = bsmf.f145012c;
                    if (i2 == 10) {
                        bslw = (bslw) bsmf.f145011b;
                    } else {
                        bslw = bslw.f144968e;
                    }
                    return bqfl.m112747c(this.f57572b.mo25819b(new abix(this, bslw, str8)));
                case 8:
                    String str9 = bsmf.f145012c;
                    if (i2 == 11) {
                        bsly = (bsly) bsmf.f145011b;
                    } else {
                        bsly = bsly.f144980b;
                    }
                    return bqfl.m112747c(this.f57572b.mo25819b(new abiz(this, bsly, str9)));
                default:
                    return bqfl.m112747c(bqga.m112775a(!bsmf.f145013d ? abjc.m47781a(bsmf.f145012c) : abjc.m47783c()));
            }
        } else {
            throw null;
        }
    }
}
