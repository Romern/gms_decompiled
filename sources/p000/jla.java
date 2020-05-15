package p000;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* renamed from: jla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jla {

    /* renamed from: a */
    public static final Logger f22734a = jsy.m17256a("EidGenerator");

    /* renamed from: a */
    private static final jkw m16859a(List list, long j, long j2, byte[] bArr) {
        byte[] bArr2;
        jta a = jsz.m17257a();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                bArr2 = null;
                break;
            }
            jrh jrh = (jrh) it.next();
            if (jrh.mo7823c() && jrh.mo7827h() && jrh.mo7825f() && jrh.mo7826g() <= j && j < jrh.mo7824d()) {
                try {
                    bArr2 = Base64.decode(jrh.mo7822b(), 8);
                    break;
                } catch (IllegalArgumentException e) {
                    f22734a.mo25417e("Unable to parse beacon seed.", e, new Object[0]);
                    bArr2 = null;
                }
            }
        }
        if (bArr2 == null) {
            f22734a.mo25416d("Unable to get EID seed for device. Timestamp: %s.", Long.valueOf(j));
            a.mo14065u(1);
            return null;
        }
        byte[] a2 = jkx.m16858a(bArr2, j, bArr);
        if (a2 == null) {
            f22734a.mo25416d("Fatal error generating EID data. eidSeed: %s, startOfPeriodMs: %s, endOfPeriodMs: %s, extraEntropy: %s", bArr2, Long.valueOf(j), Long.valueOf(j2), bArr);
            a.mo14065u(2);
            return null;
        }
        a.mo14065u(0);
        return new jkw(a2, j, j2);
    }

    /* renamed from: a */
    public final jkw mo13841a(List list, long j, long j2) {
        return m16859a(list, j, j2, (byte[]) null);
    }

    /* renamed from: a */
    public final jkw mo13842a(byte[] bArr, List list, long j, long j2) {
        jta a = jsz.m17257a();
        jkw a2 = m16859a(list, j, j2, bArr);
        jkw a3 = mo13841a(list, j, j2);
        if (a2 != null && a3 != null) {
            a.mo14064t(0);
            return new jkw(ByteBuffer.allocate(4).put(a3.f22722a).put(a2.f22722a).array(), j, j2);
        } else if (a2 == null) {
            a.mo14064t(1);
            return null;
        } else {
            a.mo14064t(2);
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: jla.a(java.util.List, long, boolean):jkz
     arg types: [java.util.List, long, int]
     candidates:
      jla.a(java.util.List, long, long):jkw
      jla.a(java.util.List, long, boolean):jkz */
    /* renamed from: a */
    public final jkz mo13843a(List list, long j) {
        return mo13844a(list, j, false);
    }

    /* renamed from: a */
    public final jkz mo13844a(List list, long j, boolean z) {
        jkz jkz;
        jrh jrh;
        boolean z2;
        boolean z3;
        long j2;
        long j3;
        boolean z4 = true;
        boolean z5 = list != null;
        jta a = jsz.m17257a();
        long currentTimeMillis = System.currentTimeMillis();
        sdo.m34974b(z5);
        Iterator it = list.iterator();
        while (true) {
            jkz = null;
            if (!it.hasNext()) {
                jrh = null;
                break;
            }
            jrh = (jrh) it.next();
            if (jrh.mo7823c() && jrh.mo7827h() && jrh.mo7825f()) {
                if ((jrh.mo7824d() - jrh.mo7826g()) % j == 0) {
                    if (jrh.mo7826g() <= currentTimeMillis && currentTimeMillis < jrh.mo7824d()) {
                        break;
                    }
                } else {
                    f22734a.mo25418e("Seed has period length which is not an multiple of the rotation length. Seed: %s", jrh.mo7822b());
                }
            } else {
                f22734a.mo25418e("Seed is missing crucial data; skipping.", new Object[0]);
            }
        }
        if (jrh != null) {
            long g = jrh.mo7826g();
            while (g <= jrh.mo7824d()) {
                long j4 = g + j;
                if (g > currentTimeMillis || currentTimeMillis >= j4) {
                    g = j4;
                } else {
                    if (g <= currentTimeMillis) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sdo.m34974b(z3);
                    if (currentTimeMillis >= j4) {
                        z4 = false;
                    }
                    sdo.m34974b(z4);
                    if (currentTimeMillis < cchi.m129671c() + g) {
                        j3 = g - j;
                        j2 = g;
                    } else {
                        j2 = j4 + j;
                        j3 = j4;
                    }
                    a.mo14066v(0);
                    return new jkz(g, j4, j3, j2);
                }
            }
            a.mo14066v(3);
            throw new RuntimeException(String.format("Could not find valid EID period. startOfPeriodMs: %s, endOfPeriodMs: %s", Long.valueOf(jrh.mo7826g()), Long.valueOf(jrh.mo7824d())));
        } else if (z) {
            sdo.m34974b(z5);
            Iterator it2 = list.iterator();
            long j5 = Long.MAX_VALUE;
            long j6 = Long.MIN_VALUE;
            long j7 = Long.MAX_VALUE;
            while (it2.hasNext()) {
                jrh jrh2 = (jrh) it2.next();
                if (!jrh2.mo7823c() || !jrh2.mo7827h() || !jrh2.mo7825f()) {
                    f22734a.mo25418e("Seed is missing crucial data; skipping.", new Object[0]);
                } else if ((jrh2.mo7824d() - jrh2.mo7826g()) % j != 0) {
                    f22734a.mo25418e("Seed has period length which is not an multiple of the rotation length. Seed: %s", jrh2.mo7822b());
                } else {
                    if (jrh2.mo7826g() > currentTimeMillis || currentTimeMillis >= jrh2.mo7824d()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sdo.m34970a(z2);
                    if (jrh2.mo7826g() > currentTimeMillis) {
                        long g2 = jrh2.mo7826g() - currentTimeMillis;
                        if (g2 < j5) {
                            j7 = jrh2.mo7826g();
                            j6 = j7 + j;
                            j5 = g2;
                        }
                    } else if (jrh2.mo7824d() <= currentTimeMillis) {
                        long d = currentTimeMillis - jrh2.mo7824d();
                        if (d < j5) {
                            long d2 = jrh2.mo7824d();
                            j6 = d2;
                            j7 = d2 - j;
                            j5 = d;
                        }
                    }
                }
            }
            if (j5 <= j) {
                jkz = new jkz(Long.MAX_VALUE, Long.MAX_VALUE, j7, j6);
            }
            if (jkz == null) {
                a.mo14066v(2);
            } else {
                a.mo14066v(0);
            }
            return jkz;
        } else {
            a.mo14066v(1);
            return null;
        }
    }
}
