package p000;

import java.nio.ByteBuffer;

/* renamed from: bxub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxub extends bxuc {

    /* renamed from: e */
    private final ByteBuffer f164817e;

    /* renamed from: f */
    private final long f164818f;

    /* renamed from: g */
    private long f164819g;

    /* renamed from: h */
    private long f164820h;

    /* renamed from: i */
    private long f164821i;

    /* renamed from: j */
    private int f164822j;

    /* renamed from: k */
    private int f164823k;

    /* renamed from: l */
    private int f164824l = Integer.MAX_VALUE;

    /* renamed from: D */
    private final void m123376D() {
        long j = this.f164819g + ((long) this.f164822j);
        this.f164819g = j;
        int i = (int) (j - this.f164821i);
        int i2 = this.f164824l;
        if (i > i2) {
            int i3 = i - i2;
            this.f164822j = i3;
            this.f164819g = j - ((long) i3);
            return;
        }
        this.f164822j = 0;
    }

    /* renamed from: E */
    private final int m123377E() {
        return (int) (this.f164819g - this.f164820h);
    }

    /* renamed from: b */
    private final int m123378b(long j) {
        return (int) (j - this.f164818f);
    }

    /* renamed from: A */
    public final boolean mo73783A() {
        return this.f164820h == this.f164819g;
    }

    /* renamed from: B */
    public final int mo73784B() {
        return (int) (this.f164820h - this.f164821i);
    }

    /* renamed from: C */
    public final byte mo73785C() {
        long j = this.f164820h;
        if (j != this.f164819g) {
            this.f164820h = 1 + j;
            return bxyx.m124492a(j);
        }
        throw bxwf.m124088a();
    }

    /* renamed from: a */
    public final int mo73786a() {
        if (!mo73783A()) {
            int t = mo73811t();
            this.f164823k = t;
            if (bxzh.m124563b(t) != 0) {
                return this.f164823k;
            }
            throw bxwf.m124091d();
        }
        this.f164823k = 0;
        return 0;
    }

    /* renamed from: c */
    public final float mo73790c() {
        return Float.intBitsToFloat(mo73824w());
    }

    /* renamed from: d */
    public final long mo73792d() {
        return mo73822u();
    }

    /* renamed from: e */
    public final long mo73794e() {
        return mo73822u();
    }

    /* renamed from: f */
    public final int mo73796f() {
        return mo73811t();
    }

    /* renamed from: g */
    public final long mo73798g() {
        return mo73825x();
    }

    /* renamed from: h */
    public final int mo73799h() {
        return mo73824w();
    }

    /* renamed from: i */
    public final boolean mo73800i() {
        return mo73822u() != 0;
    }

    /* renamed from: j */
    public final String mo73801j() {
        int t = mo73811t();
        if (t > 0 && t <= m123377E()) {
            byte[] bArr = new byte[t];
            long j = (long) t;
            bxyx.m124500a(this.f164820h, bArr, j);
            String str = new String(bArr, bxwd.f164980a);
            this.f164820h += j;
            return str;
        } else if (t == 0) {
            return "";
        } else {
            if (t < 0) {
                throw bxwf.m124089b();
            }
            throw bxwf.m124088a();
        }
    }

    /* renamed from: k */
    public final String mo73802k() {
        int t = mo73811t();
        if (t > 0 && t <= m123377E()) {
            int b = m123378b(this.f164820h);
            ByteBuffer byteBuffer = this.f164817e;
            bxyz bxyz = bxzd.f165126a;
            String b2 = byteBuffer.hasArray() ? bxyz.mo74332b(byteBuffer.array(), byteBuffer.arrayOffset() + b, t) : byteBuffer.isDirect() ? bxyz.mo74329a(byteBuffer, b, t) : bxyz.m124532b(byteBuffer, b, t);
            this.f164820h += (long) t;
            return b2;
        } else if (t == 0) {
            return "";
        } else {
            if (t <= 0) {
                throw bxwf.m124089b();
            }
            throw bxwf.m124088a();
        }
    }

    /* renamed from: l */
    public final bxtx mo73803l() {
        int t = mo73811t();
        if (t > 0 && t <= m123377E()) {
            byte[] bArr = new byte[t];
            long j = (long) t;
            bxyx.m124500a(this.f164820h, bArr, j);
            this.f164820h += j;
            return bxtx.m123264b(bArr);
        } else if (t == 0) {
            return bxtx.f164797b;
        } else {
            if (t < 0) {
                throw bxwf.m124089b();
            }
            throw bxwf.m124088a();
        }
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
        return mo73824w();
    }

    /* renamed from: q */
    public final long mo73808q() {
        return mo73825x();
    }

    /* renamed from: r */
    public final int mo73809r() {
        return bxuc.m123422g(mo73811t());
    }

    /* renamed from: s */
    public final long mo73810s() {
        return bxuc.m123415a(mo73822u());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (p000.bxyx.m124492a(r4) >= 0) goto L_0x0080;
     */
    /* renamed from: t */
    public final int mo73811t() {
        byte b;
        long j = this.f164820h;
        if (this.f164819g != j) {
            long j2 = j + 1;
            byte a = bxyx.m124492a(j);
            if (a >= 0) {
                this.f164820h = j2;
                return a;
            } else if (this.f164819g - j2 >= 9) {
                long j3 = j2 + 1;
                byte a2 = a ^ (bxyx.m124492a(j2) << 7);
                if (a2 >= 0) {
                    long j4 = j3 + 1;
                    byte a3 = a2 ^ (bxyx.m124492a(j3) << 14);
                    if (a3 < 0) {
                        j3 = j4 + 1;
                        byte a4 = a3 ^ (bxyx.m124492a(j4) << 21);
                        if (a4 >= 0) {
                            j4 = j3 + 1;
                            byte a5 = bxyx.m124492a(j3);
                            b = (a4 ^ (a5 << 28)) ^ 266354560;
                            if (a5 < 0) {
                                j3 = j4 + 1;
                                if (bxyx.m124492a(j4) < 0) {
                                    j4 = j3 + 1;
                                    if (bxyx.m124492a(j3) < 0) {
                                        j3 = j4 + 1;
                                        if (bxyx.m124492a(j4) < 0) {
                                            j4 = j3 + 1;
                                            if (bxyx.m124492a(j3) < 0) {
                                                j3 = j4 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            b = a4 ^ -2080896;
                        }
                    } else {
                        b = a3 ^ 16256;
                    }
                    j3 = j4;
                } else {
                    b = a2 ^ Byte.MIN_VALUE;
                }
                this.f164820h = j3;
                return b;
            }
        }
        return (int) mo73823v();
    }

    /* renamed from: u */
    public final long mo73822u() {
        long j;
        byte b;
        long j2;
        long j3;
        long j4 = this.f164820h;
        if (this.f164819g != j4) {
            long j5 = j4 + 1;
            byte a = bxyx.m124492a(j4);
            if (a >= 0) {
                this.f164820h = j5;
                return (long) a;
            } else if (this.f164819g - j5 >= 9) {
                long j6 = j5 + 1;
                byte a2 = a ^ (bxyx.m124492a(j5) << 7);
                if (a2 >= 0) {
                    long j7 = j6 + 1;
                    byte a3 = a2 ^ (bxyx.m124492a(j6) << 14);
                    if (a3 < 0) {
                        j6 = j7 + 1;
                        byte a4 = a3 ^ (bxyx.m124492a(j7) << 21);
                        if (a4 >= 0) {
                            j7 = j6 + 1;
                            long a5 = ((long) a4) ^ (((long) bxyx.m124492a(j6)) << 28);
                            if (a5 < 0) {
                                long j8 = j7 + 1;
                                long a6 = a5 ^ (((long) bxyx.m124492a(j7)) << 35);
                                if (a6 >= 0) {
                                    j7 = j8 + 1;
                                    a5 = a6 ^ (((long) bxyx.m124492a(j8)) << 42);
                                    if (a5 < 0) {
                                        j8 = j7 + 1;
                                        a6 = a5 ^ (((long) bxyx.m124492a(j7)) << 49);
                                        if (a6 >= 0) {
                                            j7 = j8 + 1;
                                            j = (a6 ^ (((long) bxyx.m124492a(j8)) << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                long j9 = 1 + j7;
                                                if (((long) bxyx.m124492a(j7)) >= 0) {
                                                    j6 = j9;
                                                    this.f164820h = j6;
                                                    return j;
                                                }
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
                                j = a6 ^ j3;
                                j6 = j8;
                                this.f164820h = j6;
                                return j;
                            }
                            j2 = 266354560;
                            j = a5 ^ j2;
                        } else {
                            b = a4 ^ -2080896;
                        }
                    } else {
                        j = (long) (a3 ^ 16256);
                    }
                    j6 = j7;
                    this.f164820h = j6;
                    return j;
                }
                b = a2 ^ Byte.MIN_VALUE;
                j = (long) b;
                this.f164820h = j6;
                return j;
            }
        }
        return mo73823v();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final long mo73823v() {
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
    public final int mo73824w() {
        long j = this.f164820h;
        if (this.f164819g - j >= 4) {
            this.f164820h = 4 + j;
            return ((bxyx.m124492a(j + 3) & 255) << 24) | (bxyx.m124492a(j) & 255) | ((bxyx.m124492a(1 + j) & 255) << 8) | ((bxyx.m124492a(2 + j) & 255) << 16);
        }
        throw bxwf.m124088a();
    }

    /* renamed from: x */
    public final long mo73825x() {
        long j = this.f164820h;
        if (this.f164819g - j >= 8) {
            this.f164820h = 8 + j;
            return ((((long) bxyx.m124492a(j + 7)) & 255) << 56) | (((long) bxyx.m124492a(j)) & 255) | ((((long) bxyx.m124492a(1 + j)) & 255) << 8) | ((((long) bxyx.m124492a(2 + j)) & 255) << 16) | ((((long) bxyx.m124492a(3 + j)) & 255) << 24) | ((((long) bxyx.m124492a(4 + j)) & 255) << 32) | ((((long) bxyx.m124492a(5 + j)) & 255) << 40) | ((((long) bxyx.m124492a(6 + j)) & 255) << 48);
        }
        throw bxwf.m124088a();
    }

    /* renamed from: y */
    public final void mo73816y() {
        this.f164821i = this.f164820h;
    }

    /* renamed from: z */
    public final int mo73817z() {
        int i = this.f164824l;
        if (i != Integer.MAX_VALUE) {
            return i - mo73784B();
        }
        return -1;
    }

    public bxub(ByteBuffer byteBuffer) {
        this.f164817e = byteBuffer;
        long a = bxyx.m124495a(byteBuffer);
        this.f164818f = a;
        this.f164819g = a + ((long) byteBuffer.limit());
        long position = this.f164818f + ((long) byteBuffer.position());
        this.f164820h = position;
        this.f164821i = position;
    }

    /* renamed from: b */
    public final double mo73788b() {
        return Double.longBitsToDouble(mo73825x());
    }

    /* renamed from: c */
    public final int mo73791c(int i) {
        if (i >= 0) {
            int B = i + mo73784B();
            int i2 = this.f164824l;
            if (B <= i2) {
                this.f164824l = B;
                m123376D();
                return i2;
            }
            throw bxwf.m124088a();
        }
        throw bxwf.m124089b();
    }

    /* renamed from: d */
    public final void mo73793d(int i) {
        this.f164824l = i;
        m123376D();
    }

    /* renamed from: e */
    public final byte[] mo73795e(int i) {
        if (i >= 0 && i <= m123377E()) {
            byte[] bArr = new byte[i];
            long j = this.f164820h;
            long j2 = (long) i;
            long j3 = j + j2;
            int position = this.f164817e.position();
            int limit = this.f164817e.limit();
            try {
                this.f164817e.position(m123378b(j));
                this.f164817e.limit(m123378b(j3));
                ByteBuffer slice = this.f164817e.slice();
                this.f164817e.position(position);
                this.f164817e.limit(limit);
                slice.get(bArr);
                this.f164820h += j2;
                return bArr;
            } catch (IllegalArgumentException e) {
                throw bxwf.m124088a();
            } catch (Throwable th) {
                this.f164817e.position(position);
                this.f164817e.limit(limit);
                throw th;
            }
        } else if (i > 0) {
            throw bxwf.m124088a();
        } else if (i == 0) {
            return bxwd.f164981b;
        } else {
            throw bxwf.m124089b();
        }
    }

    /* renamed from: f */
    public final void mo73797f(int i) {
        if (i >= 0 && i <= m123377E()) {
            this.f164820h += (long) i;
        } else if (i < 0) {
            throw bxwf.m124089b();
        } else {
            throw bxwf.m124088a();
        }
    }

    /* renamed from: b */
    public final boolean mo73789b(int i) {
        int a;
        int a2 = bxzh.m124561a(i);
        int i2 = 0;
        if (a2 == 0) {
            if (m123377E() < 10) {
                while (i2 < 10) {
                    if (mo73785C() < 0) {
                        i2++;
                    }
                }
                throw bxwf.m124090c();
            }
            while (i2 < 10) {
                long j = this.f164820h;
                this.f164820h = 1 + j;
                if (bxyx.m124492a(j) < 0) {
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

    /* renamed from: a */
    public final void mo73787a(int i) {
        if (this.f164823k != i) {
            throw bxwf.m124092e();
        }
    }
}
