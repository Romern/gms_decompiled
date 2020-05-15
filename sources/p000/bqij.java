package p000;

/* renamed from: bqij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqij {

    /* renamed from: a */
    static final int f140796a;

    /* renamed from: b */
    private static final int f140797b;

    /* renamed from: c */
    private static final int f140798c = (Boolean.parseBoolean(System.getProperty("BROTLI_ENABLE_ASSERTS")) ? 1 : 0);

    /* renamed from: d */
    private static final int f140799d;

    /* renamed from: e */
    private static final int f140800e;

    /* renamed from: f */
    private static final int f140801f;

    /* renamed from: g */
    private static final int f140802g;

    /* renamed from: h */
    private static final int f140803h;

    /* renamed from: i */
    private static final int f140804i;

    /* renamed from: j */
    private static final int f140805j;

    /* renamed from: a */
    static void m112869a(bqiq bqiq) {
        if (bqiq.f140884u <= f140804i) {
            return;
        }
        if (bqiq.f140886w == 0) {
            int i = bqiq.f140884u << f140805j;
            int i2 = 4096 - i;
            int i3 = 0;
            bqit.m112904a(bqiq.f140870g, 0, i, 4096);
            bqiq.f140884u = 0;
            while (true) {
                if (i2 >= 4096) {
                    break;
                }
                int a = bqit.m112903a(bqiq.f140864ap, bqiq.f140870g, i2, 4096 - i2);
                if (a <= 0) {
                    bqiq.f140886w = 1;
                    bqiq.f140885v = i2;
                    i2 += f140801f - 1;
                    break;
                }
                i2 += a;
            }
            byte[] bArr = bqiq.f140870g;
            int i4 = i2 >> f140805j;
            if (f140796a == 64) {
                int[] iArr = bqiq.f140872i;
                while (i3 < i4) {
                    int i5 = i3 * 4;
                    iArr[i3] = ((bArr[i5 + 3] & 255) << 24) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16);
                    i3++;
                }
                return;
            }
            short[] sArr = bqiq.f140871h;
            while (i3 < i4) {
                int i6 = i3 + i3;
                sArr[i3] = (short) (((bArr[i6 + 1] & 255) << 8) | (bArr[i6] & 255));
                i3++;
            }
        } else if (m112881i(bqiq) < -2) {
            throw new bqil("No more input");
        }
    }

    /* renamed from: b */
    static int m112872b(bqiq bqiq, int i) {
        int e = m112877e(bqiq);
        bqiq.f140883t += i;
        return ((1 << i) - 1) & e;
    }

    /* renamed from: c */
    static int m112874c(bqiq bqiq, int i) {
        if (f140800e >= 24) {
            return m112872b(bqiq, i);
        }
        if (i <= 16) {
            return m112872b(bqiq, i);
        }
        int b = m112872b(bqiq, 16);
        m112876d(bqiq);
        return (m112872b(bqiq, i - 16) << 16) | b;
    }

    /* renamed from: d */
    static void m112876d(bqiq bqiq) {
        if (f140798c != 0) {
            m112873b(bqiq);
        }
        if (f140796a == 64) {
            int[] iArr = bqiq.f140872i;
            int i = bqiq.f140884u;
            bqiq.f140884u = i + 1;
            bqiq.f140879p = (((long) iArr[i]) << f140800e) | (bqiq.f140879p >>> f140800e);
        } else {
            short[] sArr = bqiq.f140871h;
            int i2 = bqiq.f140884u;
            bqiq.f140884u = i2 + 1;
            bqiq.f140882s = (sArr[i2] << f140800e) | (bqiq.f140882s >>> f140800e);
        }
        bqiq.f140883t -= f140800e;
    }

    /* renamed from: e */
    static int m112877e(bqiq bqiq) {
        if (f140796a == 64) {
            return (int) (bqiq.f140879p >>> bqiq.f140883t);
        }
        return bqiq.f140882s >>> bqiq.f140883t;
    }

    /* renamed from: f */
    static void m112878f(bqiq bqiq) {
        bqiq.f140870g = new byte[4160];
        if (f140796a == 64) {
            bqiq.f140879p = 0;
            bqiq.f140872i = new int[f140803h];
        } else {
            bqiq.f140882s = 0;
            bqiq.f140871h = new short[f140803h];
        }
        bqiq.f140883t = f140796a;
        bqiq.f140884u = f140802g;
        bqiq.f140886w = 0;
        m112882j(bqiq);
    }

    /* renamed from: g */
    static void m112879g(bqiq bqiq) {
        if (bqiq.f140883t == f140796a) {
            m112882j(bqiq);
        }
    }

    /* renamed from: h */
    static void m112880h(bqiq bqiq) {
        int i = (f140796a - bqiq.f140883t) & 7;
        if (i != 0 && m112872b(bqiq, i) != 0) {
            throw new bqil("Corrupted padding bits");
        }
    }

    /* renamed from: i */
    static int m112881i(bqiq bqiq) {
        int i = f140802g;
        if (bqiq.f140886w != 0) {
            i = (bqiq.f140885v + (f140801f - 1)) >> f140805j;
        }
        return i - bqiq.f140884u;
    }

    /* renamed from: j */
    private static void m112882j(bqiq bqiq) {
        m112869a(bqiq);
        m112870a(bqiq, 0);
        m112876d(bqiq);
        m112876d(bqiq);
    }

    static {
        int i;
        if (!Boolean.parseBoolean(System.getProperty("BROTLI_32_BIT_CPU"))) {
            i = 6;
        } else {
            i = 5;
        }
        f140797b = i;
        int i2 = f140797b;
        int i3 = 1 << i2;
        f140796a = i3;
        int i4 = i3 >> 3;
        f140799d = i4;
        f140800e = i3 >> 1;
        int i5 = i4 >> 1;
        f140801f = i5;
        f140802g = 4096 / i5;
        f140803h = 4160 / i5;
        f140804i = 4060 / i5;
        f140805j = i2 - 4;
    }

    /* renamed from: b */
    static void m112873b(bqiq bqiq) {
        if (bqiq.f140883t > f140796a) {
            int i = bqiq.f140883t;
            StringBuilder sb = new StringBuilder(36);
            sb.append("Accumulator underloaded: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: c */
    static void m112875c(bqiq bqiq) {
        if (f140798c != 0) {
            m112873b(bqiq);
        }
        if (bqiq.f140883t >= f140800e) {
            if (f140796a == 64) {
                int[] iArr = bqiq.f140872i;
                int i = bqiq.f140884u;
                bqiq.f140884u = i + 1;
                bqiq.f140879p = (((long) iArr[i]) << f140800e) | (bqiq.f140879p >>> f140800e);
            } else {
                short[] sArr = bqiq.f140871h;
                int i2 = bqiq.f140884u;
                bqiq.f140884u = i2 + 1;
                bqiq.f140882s = (sArr[i2] << f140800e) | (bqiq.f140882s >>> f140800e);
            }
            bqiq.f140883t -= f140800e;
        }
    }

    /* renamed from: a */
    static void m112870a(bqiq bqiq, int i) {
        if (bqiq.f140886w != 0) {
            int i2 = ((bqiq.f140884u << f140805j) + ((bqiq.f140883t + 7) >> 3)) - f140799d;
            int i3 = bqiq.f140885v;
            if (i2 > i3) {
                throw new bqil("Read after end");
            } else if (i != 0 && i2 != i3) {
                throw new bqil("Unused bytes after end");
            }
        }
    }

    /* renamed from: a */
    static void m112871a(bqiq bqiq, byte[] bArr, int i, int i2) {
        if ((bqiq.f140883t & 7) == 0) {
            while (bqiq.f140883t != f140796a && i2 != 0) {
                bArr[i] = (byte) m112877e(bqiq);
                bqiq.f140883t += 8;
                i2--;
                i++;
            }
            if (i2 != 0) {
                int min = Math.min(m112881i(bqiq), i2 >> f140805j);
                if (min > 0) {
                    int i3 = bqiq.f140884u;
                    int i4 = f140805j;
                    int i5 = min << i4;
                    System.arraycopy(bqiq.f140870g, i3 << i4, bArr, i, i5);
                    i += i5;
                    i2 -= i5;
                    bqiq.f140884u += min;
                }
                if (i2 == 0) {
                    return;
                }
                if (m112881i(bqiq) > 0) {
                    m112875c(bqiq);
                    while (i2 != 0) {
                        bArr[i] = (byte) m112877e(bqiq);
                        bqiq.f140883t += 8;
                        i2--;
                        i++;
                    }
                    m112870a(bqiq, 0);
                    return;
                }
                while (i2 > 0) {
                    int a = bqit.m112903a(bqiq.f140864ap, bArr, i, i2);
                    if (a != -1) {
                        i += a;
                        i2 -= a;
                    } else {
                        throw new bqil("Unexpected end of input");
                    }
                }
                return;
            }
            return;
        }
        throw new bqil("Unaligned copyBytes");
    }
}
