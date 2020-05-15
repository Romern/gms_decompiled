package p000;

import java.util.Arrays;

/* renamed from: bxtz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxtz extends bxuc {

    /* renamed from: e */
    private final byte[] f164802e;

    /* renamed from: f */
    private int f164803f;

    /* renamed from: g */
    private int f164804g;

    /* renamed from: h */
    private int f164805h;

    /* renamed from: i */
    private int f164806i;

    /* renamed from: j */
    private int f164807j;

    /* renamed from: k */
    private int f164808k = Integer.MAX_VALUE;

    /* renamed from: D */
    private final void m123299D() {
        int i = this.f164803f + this.f164804g;
        this.f164803f = i;
        int i2 = i - this.f164806i;
        int i3 = this.f164808k;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f164804g = i4;
            this.f164803f = i - i4;
            return;
        }
        this.f164804g = 0;
    }

    /* renamed from: A */
    public final boolean mo73783A() {
        return this.f164805h == this.f164803f;
    }

    /* renamed from: B */
    public final int mo73784B() {
        return this.f164805h - this.f164806i;
    }

    /* renamed from: C */
    public final byte mo73785C() {
        int i = this.f164805h;
        if (i != this.f164803f) {
            byte[] bArr = this.f164802e;
            this.f164805h = i + 1;
            return bArr[i];
        }
        throw bxwf.m124088a();
    }

    /* renamed from: a */
    public final int mo73786a() {
        if (!mo73783A()) {
            int t = mo73811t();
            this.f164807j = t;
            if (bxzh.m124563b(t) != 0) {
                return this.f164807j;
            }
            throw bxwf.m124091d();
        }
        this.f164807j = 0;
        return 0;
    }

    /* renamed from: b */
    public final double mo73788b() {
        return Double.longBitsToDouble(mo73815x());
    }

    /* renamed from: c */
    public final float mo73790c() {
        return Float.intBitsToFloat(mo73814w());
    }

    /* renamed from: d */
    public final long mo73792d() {
        return mo73812u();
    }

    /* renamed from: e */
    public final long mo73794e() {
        return mo73812u();
    }

    /* renamed from: f */
    public final int mo73796f() {
        return mo73811t();
    }

    /* renamed from: g */
    public final long mo73798g() {
        return mo73815x();
    }

    /* renamed from: h */
    public final int mo73799h() {
        return mo73814w();
    }

    /* renamed from: i */
    public final boolean mo73800i() {
        return mo73812u() != 0;
    }

    /* renamed from: j */
    public final String mo73801j() {
        int t = mo73811t();
        if (t > 0) {
            int i = this.f164803f;
            int i2 = this.f164805h;
            if (t <= i - i2) {
                String str = new String(this.f164802e, i2, t, bxwd.f164980a);
                this.f164805h += t;
                return str;
            }
        }
        if (t == 0) {
            return "";
        }
        if (t < 0) {
            throw bxwf.m124089b();
        }
        throw bxwf.m124088a();
    }

    /* renamed from: k */
    public final String mo73802k() {
        int t = mo73811t();
        if (t > 0) {
            int i = this.f164803f;
            int i2 = this.f164805h;
            if (t <= i - i2) {
                String c = bxzd.m124559c(this.f164802e, i2, t);
                this.f164805h += t;
                return c;
            }
        }
        if (t == 0) {
            return "";
        }
        if (t <= 0) {
            throw bxwf.m124089b();
        }
        throw bxwf.m124088a();
    }

    /* renamed from: l */
    public final bxtx mo73803l() {
        int t = mo73811t();
        if (t > 0) {
            int i = this.f164803f;
            int i2 = this.f164805h;
            if (t <= i - i2) {
                bxtx a = bxtx.m123262a(this.f164802e, i2, t);
                this.f164805h += t;
                return a;
            }
        }
        if (t != 0) {
            return bxtx.m123264b(mo73795e(t));
        }
        return bxtx.f164797b;
    }

    /* renamed from: m */
    public final byte[] mo73804m() {
        return mo73795e(mo73811t());
    }

    /* renamed from: n */
    public final int mo73805n() {
        return mo73811t();
    }

    /* renamed from: o */
    public final int mo73806o() {
        return mo73811t();
    }

    /* renamed from: p */
    public final int mo73807p() {
        return mo73814w();
    }

    /* renamed from: q */
    public final long mo73808q() {
        return mo73815x();
    }

    /* renamed from: r */
    public final int mo73809r() {
        return bxuc.m123422g(mo73811t());
    }

    /* renamed from: s */
    public final long mo73810s() {
        return bxuc.m123415a(mo73812u());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r2[r3] >= 0) goto L_0x0066;
     */
    /* renamed from: t */
    public final int mo73811t() {
        byte b;
        int i = this.f164805h;
        int i2 = this.f164803f;
        if (i2 != i) {
            byte[] bArr = this.f164802e;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f164805h = i3;
                return b2;
            } else if (i2 - i3 >= 9) {
                int i4 = i3 + 1;
                byte b3 = b2 ^ (bArr[i3] << 7);
                if (b3 >= 0) {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 14);
                    if (b4 < 0) {
                        i4 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 21);
                        if (b5 >= 0) {
                            i5 = i4 + 1;
                            byte b6 = bArr[i4];
                            b = (b5 ^ (b6 << 28)) ^ 266354560;
                            if (b6 < 0) {
                                i4 = i5 + 1;
                                if (bArr[i5] < 0) {
                                    i5 = i4 + 1;
                                    if (bArr[i4] < 0) {
                                        i4 = i5 + 1;
                                        if (bArr[i5] < 0) {
                                            i5 = i4 + 1;
                                            if (bArr[i4] < 0) {
                                                i4 = i5 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            b = b5 ^ -2080896;
                        }
                    } else {
                        b = b4 ^ 16256;
                    }
                    i4 = i5;
                } else {
                    b = b3 ^ Byte.MIN_VALUE;
                }
                this.f164805h = i4;
                return b;
            }
        }
        return (int) mo73813v();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        if (((long) r2[r3]) >= 0) goto L_0x0095;
     */
    /* renamed from: u */
    public final long mo73812u() {
        int i;
        long j;
        byte b;
        long j2;
        long j3;
        int i2 = this.f164805h;
        int i3 = this.f164803f;
        if (i3 != i2) {
            byte[] bArr = this.f164802e;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.f164805h = i4;
                return (long) b2;
            } else if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                byte b3 = b2 ^ (bArr[i4] << 7);
                if (b3 >= 0) {
                    i = i5 + 1;
                    byte b4 = b3 ^ (bArr[i5] << 14);
                    if (b4 < 0) {
                        i5 = i + 1;
                        byte b5 = b4 ^ (bArr[i] << 21);
                        if (b5 >= 0) {
                            i = i5 + 1;
                            long j4 = (((long) bArr[i5]) << 28) ^ ((long) b5);
                            if (j4 < 0) {
                                int i6 = i + 1;
                                long j5 = j4 ^ (((long) bArr[i]) << 35);
                                if (j5 >= 0) {
                                    i = i6 + 1;
                                    j4 = j5 ^ (((long) bArr[i6]) << 42);
                                    if (j4 < 0) {
                                        i6 = i + 1;
                                        j5 = j4 ^ (((long) bArr[i]) << 49);
                                        if (j5 >= 0) {
                                            i = i6 + 1;
                                            j = (j5 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i6 = i + 1;
                                            }
                                        } else {
                                            j3 = -558586000294016L;
                                        }
                                    } else {
                                        j2 = 4363953127296L;
                                    }
                                } else {
                                    j3 = -34093383808L;
                                }
                                j = j5 ^ j3;
                                i = i6;
                            } else {
                                j2 = 266354560;
                            }
                            j = j4 ^ j2;
                        } else {
                            b = b5 ^ -2080896;
                        }
                    } else {
                        j = (long) (b4 ^ 16256);
                    }
                    this.f164805h = i;
                    return j;
                }
                b = b3 ^ Byte.MIN_VALUE;
                i = i5;
                j = (long) b;
                this.f164805h = i;
                return j;
            }
        }
        return mo73813v();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final long mo73813v() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte C = mo73785C();
            j |= ((long) (C & Byte.MAX_VALUE)) << i;
            if ((C & 128) == 0) {
                return j;
            }
        }
        throw bxwf.m124090c();
    }

    /* renamed from: w */
    public final int mo73814w() {
        int i = this.f164805h;
        if (this.f164803f - i >= 4) {
            byte[] bArr = this.f164802e;
            this.f164805h = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw bxwf.m124088a();
    }

    /* renamed from: x */
    public final long mo73815x() {
        int i = this.f164805h;
        if (this.f164803f - i >= 8) {
            byte[] bArr = this.f164802e;
            this.f164805h = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw bxwf.m124088a();
    }

    /* renamed from: y */
    public final void mo73816y() {
        this.f164806i = this.f164805h;
    }

    /* renamed from: z */
    public final int mo73817z() {
        int i = this.f164808k;
        if (i != Integer.MAX_VALUE) {
            return i - mo73784B();
        }
        return -1;
    }

    public bxtz(byte[] bArr, int i, int i2) {
        this.f164802e = bArr;
        this.f164803f = i2 + i;
        this.f164805h = i;
        this.f164806i = i;
    }

    /* renamed from: b */
    public final boolean mo73789b(int i) {
        int a;
        int a2 = bxzh.m124561a(i);
        int i2 = 0;
        if (a2 == 0) {
            if (this.f164803f - this.f164805h < 10) {
                while (i2 < 10) {
                    if (mo73785C() < 0) {
                        i2++;
                    }
                }
                throw bxwf.m124090c();
            }
            while (i2 < 10) {
                byte[] bArr = this.f164802e;
                int i3 = this.f164805h;
                this.f164805h = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                }
            }
            throw bxwf.m124090c();
            return true;
        } else if (a2 == 1) {
            mo73797f(8);
            return true;
        } else if (a2 == 2) {
            mo73797f(mo73811t());
            return true;
        } else if (a2 == 3) {
            do {
                a = mo73786a();
                if (a == 0) {
                    break;
                }
            } while (mo73789b(a));
            mo73787a(bxzh.m124562a(bxzh.m124563b(i), 4));
            return true;
        } else if (a2 == 4) {
            return false;
        } else {
            if (a2 == 5) {
                mo73797f(4);
                return true;
            }
            throw bxwf.m124093f();
        }
    }

    /* renamed from: c */
    public final int mo73791c(int i) {
        if (i >= 0) {
            int B = i + mo73784B();
            int i2 = this.f164808k;
            if (B <= i2) {
                this.f164808k = B;
                m123299D();
                return i2;
            }
            throw bxwf.m124088a();
        }
        throw bxwf.m124089b();
    }

    /* renamed from: d */
    public final void mo73793d(int i) {
        this.f164808k = i;
        m123299D();
    }

    /* renamed from: e */
    public final byte[] mo73795e(int i) {
        if (i > 0) {
            int i2 = this.f164803f;
            int i3 = this.f164805h;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.f164805h = i4;
                return Arrays.copyOfRange(this.f164802e, i3, i4);
            }
        }
        if (i > 0) {
            throw bxwf.m124088a();
        } else if (i == 0) {
            return bxwd.f164981b;
        } else {
            throw bxwf.m124089b();
        }
    }

    /* renamed from: f */
    public final void mo73797f(int i) {
        if (i >= 0) {
            int i2 = this.f164803f;
            int i3 = this.f164805h;
            if (i <= i2 - i3) {
                this.f164805h = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw bxwf.m124089b();
        }
        throw bxwf.m124088a();
    }

    /* renamed from: a */
    public final void mo73787a(int i) {
        if (this.f164807j != i) {
            throw bxwf.m124092e();
        }
    }
}
