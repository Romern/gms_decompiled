package p000;

import java.util.Iterator;

/* renamed from: azxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azxb extends azwv {

    /* renamed from: a */
    final /* synthetic */ azxc f100155a;

    public azxb(azxc azxc) {
        this.f100155a = azxc;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0152, code lost:
        if (p000.azwz.m86311a(r19, r3.f100149i, r3.f100150j) != false) goto L_0x015e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x017b A[LOOP:2: B:41:0x0175->B:43:0x017b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01a2  */
    /* renamed from: a */
    public final void mo55339a(long j) {
        azxc azxc;
        double d;
        boolean z;
        double d2;
        boolean z2;
        Iterator it;
        azxc azxc2 = this.f100155a;
        long j2 = j / 1000000;
        azxc2.f100160e = false;
        long j3 = azxc2.f100159d;
        if (j3 == -1) {
            j3 = j2;
        }
        double d3 = (double) (j2 - j3);
        Double.isNaN(d3);
        double d4 = d3 / 1000.0d;
        azxc2.f100159d = j2;
        if (azxc2.f100158c != 0) {
            if (d4 > 0.064d) {
                d4 = 0.064d;
            }
            Iterator it2 = azxc2.f100156a.iterator();
            while (it2.hasNext()) {
                azwz azwz = (azwz) it2.next();
                Boolean bool = (Boolean) azxc2.f100157b.get(azwz);
                if (bool != null) {
                    if (bool.booleanValue()) {
                        boolean a = azwz.mo55348a();
                        if (a && azwz.f100151k) {
                            azxc = azxc2;
                            d = d4;
                        } else {
                            azwz.f100153m += d4;
                            double d5 = azwz.f100146f;
                            double d6 = azwz.f100147g;
                            double d7 = azwz.f100148h;
                            double d8 = azwz.f100144d;
                            d = d4;
                            double d9 = azwz.f100145e;
                            while (true) {
                                z = a;
                                d2 = azwz.f100153m;
                                azxc = azxc2;
                                if (d2 < 0.001d) {
                                    break;
                                }
                                azwz.f100153m = d2 - 4046.848d;
                                double d10 = azwz.f100141a;
                                double d11 = azwz.f100150j;
                                double d12 = azwz.f100142b;
                                double d13 = ((d11 - d5) * 100.0d) - (d6 * 18.0d);
                                double d14 = d6 + (d13 * 0.001d * 0.5d);
                                double d15 = ((d11 - (d5 + ((d6 * 0.001d) * 0.5d))) * 100.0d) - (d14 * 18.0d);
                                double d16 = d6 + (d15 * 0.001d * 0.5d);
                                double d17 = ((d11 - (d5 + ((d14 * 0.001d) * 0.5d))) * 100.0d) - (d16 * 18.0d);
                                double d18 = d5 + (d16 * 0.001d);
                                double d19 = d6 + (d17 * 0.001d);
                                double d20 = d14 + d16;
                                double d21 = d15 + d17;
                                double d22 = d5 + ((((d6 + (d20 + d20)) + d19) / 6.0d) * 0.001d);
                                double d23 = ((((d13 + (d21 + d21)) + (((d11 - d18) * 100.0d) - (d19 * 18.0d))) / 6.0d) * 0.001d) + d6;
                                if (azwz.f100152l && azwz.m86311a(d22, azwz.f100149i, d11)) {
                                    azwz.f100153m = 0.0d;
                                }
                                d8 = d5;
                                d9 = d6;
                                azxc2 = azxc;
                                d5 = d22;
                                d7 = d18;
                                d6 = d23;
                                a = z;
                            }
                            azwz.f100148h = d7;
                            azwz.f100146f = d5;
                            azwz.f100147g = d6;
                            azwz.f100144d = d8;
                            azwz.f100145e = d9;
                            if (d2 > 0.0d) {
                                double d24 = d2 / 0.001d;
                                double d25 = 1.0d - d24;
                                d5 = (d5 * d24) + (d8 * d25);
                                azwz.f100146f = d5;
                                azwz.f100147g = (d6 * d24) + (d9 * d25);
                            }
                            double d26 = d5;
                            if (azwz.f100152l) {
                                double d27 = azwz.f100141a;
                            }
                            if (!azwz.mo55348a()) {
                                z2 = z;
                                boolean z3 = azwz.f100151k;
                                azwz.f100151k = z2;
                                it = azwz.f100143c.iterator();
                                while (it.hasNext()) {
                                    ((azxd) it.next()).mo55355a(azwz.f100146f);
                                }
                                if (!z2) {
                                    azxc2 = azxc;
                                    d4 = d;
                                }
                            }
                            double d28 = azwz.f100141a;
                            double d29 = azwz.f100150j;
                            azwz.f100149i = d29;
                            azwz.f100146f = d29;
                            azwz.f100147g = 0.0d;
                            azwz.f100153m = 0.0d;
                            z2 = true;
                            boolean z32 = azwz.f100151k;
                            azwz.f100151k = z2;
                            it = azwz.f100143c.iterator();
                            while (it.hasNext()) {
                            }
                            if (!z2) {
                            }
                        }
                        azxc.f100157b.put(azwz, false);
                        azxc.f100158c--;
                        azxc2 = azxc;
                        d4 = d;
                    }
                }
            }
            azxc2.mo55354c();
        }
    }
}
