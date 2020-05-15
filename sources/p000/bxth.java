package p000;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: bxth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxth implements bxxp {

    /* renamed from: a */
    private final byte[] f164771a;

    /* renamed from: b */
    private int f164772b;

    /* renamed from: c */
    private int f164773c;

    /* renamed from: d */
    private int f164774d;

    /* renamed from: e */
    private int f164775e;

    public bxth() {
    }

    /* renamed from: A */
    private final long m123150A() {
        m123155b(8);
        return m123152C();
    }

    /* renamed from: B */
    private final int m123151B() {
        int i = this.f164772b;
        byte[] bArr = this.f164771a;
        this.f164772b = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: C */
    private final long m123152C() {
        int i = this.f164772b;
        byte[] bArr = this.f164771a;
        this.f164772b = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: a */
    private final Object m123153a(bxzf bxzf, Class cls, bxus bxus) {
        bxzf bxzf2 = bxzf.DOUBLE;
        switch (bxzf.ordinal()) {
            case 0:
                return Double.valueOf(mo73696d());
            case 1:
                return Float.valueOf(mo73698e());
            case 2:
                return Long.valueOf(mo73702g());
            case 3:
                return Long.valueOf(mo73700f());
            case 4:
                return Integer.valueOf(mo73704h());
            case 5:
                return Long.valueOf(mo73706i());
            case 6:
                return Integer.valueOf(mo73708j());
            case 7:
                return Boolean.valueOf(mo73711k());
            case 8:
                return mo73714m();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return mo73683a(cls, bxus);
            case 11:
                return mo73716n();
            case 12:
                return Integer.valueOf(mo73718o());
            case 13:
                return Integer.valueOf(mo73720p());
            case 14:
                return Integer.valueOf(mo73722q());
            case 15:
                return Long.valueOf(mo73724r());
            case 16:
                return Integer.valueOf(mo73725s());
            case 17:
                return Long.valueOf(mo73726t());
        }
    }

    /* renamed from: b */
    private final void m123155b(int i) {
        if (i < 0 || i > this.f164773c - this.f164772b) {
            throw bxwf.m124088a();
        }
    }

    /* renamed from: c */
    private final Object m123156c(bxxv bxxv, bxus bxus) {
        int w = m123163w();
        m123155b(w);
        int i = this.f164773c;
        int i2 = this.f164772b + w;
        this.f164773c = i2;
        try {
            Object a = bxxv.mo74218a();
            bxxv.mo74220a(a, this, bxus);
            bxxv.mo74225d(a);
            if (this.f164772b == i2) {
                return a;
            }
            throw bxwf.m124095h();
        } finally {
            this.f164773c = i;
        }
    }

    /* renamed from: d */
    private final Object m123158d(bxxv bxxv, bxus bxus) {
        int i = this.f164775e;
        this.f164775e = bxzh.m124562a(bxzh.m124563b(this.f164774d), 4);
        try {
            Object a = bxxv.mo74218a();
            bxxv.mo74220a(a, this, bxus);
            bxxv.mo74225d(a);
            if (this.f164774d == this.f164775e) {
                return a;
            }
            throw bxwf.m124095h();
        } finally {
            this.f164775e = i;
        }
    }

    /* renamed from: e */
    private final void m123160e(int i) {
        m123155b(i);
        if ((i & 3) != 0) {
            throw bxwf.m124095h();
        }
    }

    /* renamed from: f */
    private final void m123161f(int i) {
        if (this.f164772b != i) {
            throw bxwf.m124088a();
        }
    }

    /* renamed from: v */
    private final boolean m123162v() {
        return this.f164772b == this.f164773c;
    }

    /* renamed from: w */
    private final int m123163w() {
        byte b;
        int i = this.f164772b;
        int i2 = this.f164773c;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f164771a;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f164772b = i3;
                return b2;
            } else if (i2 - i3 < 9) {
                return (int) m123164x();
            } else {
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
                                                if (bArr[i5] < 0) {
                                                    throw bxwf.m124090c();
                                                }
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
                this.f164772b = i4;
                return b;
            }
        } else {
            throw bxwf.m124088a();
        }
    }

    /* renamed from: x */
    private final long m123164x() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte y = m123165y();
            j |= ((long) (y & Byte.MAX_VALUE)) << i;
            if ((y & 128) == 0) {
                return j;
            }
        }
        throw bxwf.m124090c();
    }

    /* renamed from: y */
    private final byte m123165y() {
        int i = this.f164772b;
        if (i != this.f164773c) {
            byte[] bArr = this.f164771a;
            this.f164772b = i + 1;
            return bArr[i];
        }
        throw bxwf.m124088a();
    }

    /* renamed from: z */
    private final int m123166z() {
        m123155b(4);
        return m123151B();
    }

    /* renamed from: b */
    public final int mo73689b() {
        return this.f164774d;
    }

    /* renamed from: g */
    public final long mo73702g() {
        m123157c(0);
        return mo73727u();
    }

    /* renamed from: h */
    public final int mo73704h() {
        m123157c(0);
        return m123163w();
    }

    /* renamed from: i */
    public final long mo73706i() {
        m123157c(1);
        return m123150A();
    }

    /* renamed from: j */
    public final int mo73708j() {
        m123157c(5);
        return m123166z();
    }

    /* renamed from: k */
    public final void mo73710k(List list) {
        int i;
        if (bxzh.m124561a(this.f164774d) == 2) {
            do {
                list.add(mo73716n());
                if (!m123162v()) {
                    i = this.f164772b;
                } else {
                    return;
                }
            } while (m123163w() == this.f164774d);
            this.f164772b = i;
            return;
        }
        throw bxwf.m124093f();
    }

    /* renamed from: l */
    public final String mo73712l() {
        return mo73684a(false);
    }

    /* renamed from: m */
    public final String mo73714m() {
        return mo73684a(true);
    }

    /* renamed from: n */
    public final bxtx mo73716n() {
        m123157c(2);
        int w = m123163w();
        if (w == 0) {
            return bxtx.f164797b;
        }
        m123155b(w);
        bxtx b = bxtx.m123265b(this.f164771a, this.f164772b, w);
        this.f164772b += w;
        return b;
    }

    /* renamed from: o */
    public final int mo73718o() {
        m123157c(0);
        return m123163w();
    }

    /* renamed from: p */
    public final int mo73720p() {
        m123157c(0);
        return m123163w();
    }

    /* renamed from: q */
    public final int mo73722q() {
        m123157c(5);
        return m123166z();
    }

    /* renamed from: r */
    public final long mo73724r() {
        m123157c(1);
        return m123150A();
    }

    /* renamed from: s */
    public final int mo73725s() {
        m123157c(0);
        return bxuc.m123422g(m123163w());
    }

    /* renamed from: t */
    public final long mo73726t() {
        m123157c(0);
        return bxuc.m123415a(mo73727u());
    }

    /* renamed from: u */
    public final long mo73727u() {
        int i;
        long j;
        byte b;
        long j2;
        long j3;
        int i2 = this.f164772b;
        int i3 = this.f164773c;
        if (i3 != i2) {
            byte[] bArr = this.f164771a;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.f164772b = i4;
                return (long) b2;
            } else if (i3 - i4 < 9) {
                return m123164x();
            } else {
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
                                                if (((long) bArr[i]) < 0) {
                                                    throw bxwf.m124090c();
                                                }
                                                i = i6;
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
                    this.f164772b = i;
                    return j;
                }
                b = b3 ^ Byte.MIN_VALUE;
                i = i5;
                j = (long) b;
                this.f164772b = i;
                return j;
            }
        } else {
            throw bxwf.m124088a();
        }
    }

    /* renamed from: f */
    public final long mo73700f() {
        m123157c(0);
        return mo73727u();
    }

    /* renamed from: g */
    public final void mo73703g(List list) {
        int i;
        int i2;
        if (list instanceof bxvm) {
            bxvm bxvm = (bxvm) list;
            int a = bxzh.m124561a(this.f164774d);
            if (a == 2) {
                int w = m123163w();
                m123160e(w);
                int i3 = this.f164772b + w;
                while (this.f164772b < i3) {
                    bxvm.mo74153d(m123151B());
                }
            } else if (a == 5) {
                do {
                    bxvm.mo74153d(mo73708j());
                    if (!m123162v()) {
                        i2 = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i2;
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a2 = bxzh.m124561a(this.f164774d);
            if (a2 == 2) {
                int w2 = m123163w();
                m123160e(w2);
                int i4 = this.f164772b + w2;
                while (this.f164772b < i4) {
                    list.add(Integer.valueOf(m123151B()));
                }
            } else if (a2 == 5) {
                do {
                    list.add(Integer.valueOf(mo73708j()));
                    if (!m123162v()) {
                        i = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i;
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: h */
    public final void mo73705h(List list) {
        int i;
        int i2;
        if (list instanceof bxtk) {
            bxtk bxtk = (bxtk) list;
            int a = bxzh.m124561a(this.f164774d);
            if (a == 0) {
                do {
                    bxtk.mo73729a(mo73711k());
                    if (!m123162v()) {
                        i2 = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i2;
            } else if (a == 2) {
                int w = this.f164772b + m123163w();
                while (this.f164772b < w) {
                    bxtk.mo73729a(m123163w() != 0);
                }
                m123161f(w);
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a2 = bxzh.m124561a(this.f164774d);
            if (a2 == 0) {
                do {
                    list.add(Boolean.valueOf(mo73711k()));
                    if (!m123162v()) {
                        i = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i;
            } else if (a2 == 2) {
                int w2 = this.f164772b + m123163w();
                while (this.f164772b < w2) {
                    list.add(Boolean.valueOf(m123163w() != 0));
                }
                m123161f(w2);
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxth.a(java.util.List, boolean):void
     arg types: [java.util.List, int]
     candidates:
      bxth.a(bxxv, bxus):java.lang.Object
      bxth.a(java.lang.Class, bxus):java.lang.Object
      bxxp.a(bxxv, bxus):java.lang.Object
      bxxp.a(java.lang.Class, bxus):java.lang.Object
      bxth.a(java.util.List, boolean):void */
    /* renamed from: i */
    public final void mo73707i(List list) {
        mo73687a(list, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxth.a(java.util.List, boolean):void
     arg types: [java.util.List, int]
     candidates:
      bxth.a(bxxv, bxus):java.lang.Object
      bxth.a(java.lang.Class, bxus):java.lang.Object
      bxxp.a(bxxv, bxus):java.lang.Object
      bxxp.a(java.lang.Class, bxus):java.lang.Object
      bxth.a(java.util.List, boolean):void */
    /* renamed from: j */
    public final void mo73709j(List list) {
        mo73687a(list, true);
    }

    /* renamed from: l */
    public final void mo73713l(List list) {
        int i;
        int i2;
        if (list instanceof bxvm) {
            bxvm bxvm = (bxvm) list;
            int a = bxzh.m124561a(this.f164774d);
            if (a == 0) {
                do {
                    bxvm.mo74153d(mo73718o());
                    if (!m123162v()) {
                        i2 = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i2;
            } else if (a == 2) {
                int w = this.f164772b + m123163w();
                while (this.f164772b < w) {
                    bxvm.mo74153d(m123163w());
                }
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a2 = bxzh.m124561a(this.f164774d);
            if (a2 == 0) {
                do {
                    list.add(Integer.valueOf(mo73718o()));
                    if (!m123162v()) {
                        i = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i;
            } else if (a2 == 2) {
                int w2 = this.f164772b + m123163w();
                while (this.f164772b < w2) {
                    list.add(Integer.valueOf(m123163w()));
                }
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: m */
    public final void mo73715m(List list) {
        int i;
        int i2;
        if (list instanceof bxvm) {
            bxvm bxvm = (bxvm) list;
            int a = bxzh.m124561a(this.f164774d);
            if (a == 0) {
                do {
                    bxvm.mo74153d(mo73720p());
                    if (!m123162v()) {
                        i2 = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i2;
            } else if (a == 2) {
                int w = this.f164772b + m123163w();
                while (this.f164772b < w) {
                    bxvm.mo74153d(m123163w());
                }
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a2 = bxzh.m124561a(this.f164774d);
            if (a2 == 0) {
                do {
                    list.add(Integer.valueOf(mo73720p()));
                    if (!m123162v()) {
                        i = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i;
            } else if (a2 == 2) {
                int w2 = this.f164772b + m123163w();
                while (this.f164772b < w2) {
                    list.add(Integer.valueOf(m123163w()));
                }
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: o */
    public final void mo73719o(List list) {
        int i;
        int i2;
        if (list instanceof bxwq) {
            bxwq bxwq = (bxwq) list;
            int a = bxzh.m124561a(this.f164774d);
            if (a == 1) {
                do {
                    bxwq.mo74161a(mo73724r());
                    if (!m123162v()) {
                        i2 = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i2;
            } else if (a == 2) {
                int w = m123163w();
                m123159d(w);
                int i3 = this.f164772b + w;
                while (this.f164772b < i3) {
                    bxwq.mo74161a(m123152C());
                }
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a2 = bxzh.m124561a(this.f164774d);
            if (a2 == 1) {
                do {
                    list.add(Long.valueOf(mo73724r()));
                    if (!m123162v()) {
                        i = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i;
            } else if (a2 == 2) {
                int w2 = m123163w();
                m123159d(w2);
                int i4 = this.f164772b + w2;
                while (this.f164772b < i4) {
                    list.add(Long.valueOf(m123152C()));
                }
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: p */
    public final void mo73721p(List list) {
        int i;
        int i2;
        if (list instanceof bxvm) {
            bxvm bxvm = (bxvm) list;
            int a = bxzh.m124561a(this.f164774d);
            if (a == 0) {
                do {
                    bxvm.mo74153d(mo73725s());
                    if (!m123162v()) {
                        i2 = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i2;
            } else if (a == 2) {
                int w = this.f164772b + m123163w();
                while (this.f164772b < w) {
                    bxvm.mo74153d(bxuc.m123422g(m123163w()));
                }
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a2 = bxzh.m124561a(this.f164774d);
            if (a2 == 0) {
                do {
                    list.add(Integer.valueOf(mo73725s()));
                    if (!m123162v()) {
                        i = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i;
            } else if (a2 == 2) {
                int w2 = this.f164772b + m123163w();
                while (this.f164772b < w2) {
                    list.add(Integer.valueOf(bxuc.m123422g(m123163w())));
                }
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: q */
    public final void mo73723q(List list) {
        int i;
        int i2;
        if (list instanceof bxwq) {
            bxwq bxwq = (bxwq) list;
            int a = bxzh.m124561a(this.f164774d);
            if (a == 0) {
                do {
                    bxwq.mo74161a(mo73726t());
                    if (!m123162v()) {
                        i2 = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i2;
            } else if (a == 2) {
                int w = this.f164772b + m123163w();
                while (this.f164772b < w) {
                    bxwq.mo74161a(bxuc.m123415a(mo73727u()));
                }
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a2 = bxzh.m124561a(this.f164774d);
            if (a2 == 0) {
                do {
                    list.add(Long.valueOf(mo73726t()));
                    if (!m123162v()) {
                        i = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i;
            } else if (a2 == 2) {
                int w2 = this.f164772b + m123163w();
                while (this.f164772b < w2) {
                    list.add(Long.valueOf(bxuc.m123415a(mo73727u())));
                }
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    public bxth(ByteBuffer byteBuffer) {
        this.f164771a = byteBuffer.array();
        this.f164772b = byteBuffer.arrayOffset() + byteBuffer.position();
        this.f164773c = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    /* renamed from: b */
    public final Object mo73690b(bxxv bxxv, bxus bxus) {
        m123157c(3);
        return m123158d(bxxv, bxus);
    }

    /* renamed from: e */
    public final float mo73698e() {
        m123157c(5);
        return Float.intBitsToFloat(m123166z());
    }

    /* renamed from: f */
    public final void mo73701f(List list) {
        int i;
        int i2;
        if (list instanceof bxwq) {
            bxwq bxwq = (bxwq) list;
            int a = bxzh.m124561a(this.f164774d);
            if (a == 1) {
                do {
                    bxwq.mo74161a(mo73706i());
                    if (!m123162v()) {
                        i2 = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i2;
            } else if (a == 2) {
                int w = m123163w();
                m123159d(w);
                int i3 = this.f164772b + w;
                while (this.f164772b < i3) {
                    bxwq.mo74161a(m123152C());
                }
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a2 = bxzh.m124561a(this.f164774d);
            if (a2 == 1) {
                do {
                    list.add(Long.valueOf(mo73706i()));
                    if (!m123162v()) {
                        i = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i;
            } else if (a2 == 2) {
                int w2 = m123163w();
                m123159d(w2);
                int i4 = this.f164772b + w2;
                while (this.f164772b < i4) {
                    list.add(Long.valueOf(m123152C()));
                }
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: b */
    public final Object mo73691b(Class cls, bxus bxus) {
        m123157c(3);
        return m123158d(bxxm.f165037a.mo74227a(cls), bxus);
    }

    /* renamed from: e */
    public final void mo73699e(List list) {
        int i;
        int i2;
        if (list instanceof bxvm) {
            bxvm bxvm = (bxvm) list;
            int a = bxzh.m124561a(this.f164774d);
            if (a == 0) {
                do {
                    bxvm.mo74153d(mo73704h());
                    if (!m123162v()) {
                        i2 = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i2;
            } else if (a == 2) {
                int w = this.f164772b + m123163w();
                while (this.f164772b < w) {
                    bxvm.mo74153d(m123163w());
                }
                m123161f(w);
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a2 = bxzh.m124561a(this.f164774d);
            if (a2 == 0) {
                do {
                    list.add(Integer.valueOf(mo73704h()));
                    if (!m123162v()) {
                        i = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i;
            } else if (a2 == 2) {
                int w2 = this.f164772b + m123163w();
                while (this.f164772b < w2) {
                    list.add(Integer.valueOf(m123163w()));
                }
                m123161f(w2);
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: c */
    private final void m123157c(int i) {
        if (bxzh.m124561a(this.f164774d) != i) {
            throw bxwf.m124093f();
        }
    }

    /* renamed from: d */
    private final void m123159d(int i) {
        m123155b(i);
        if ((i & 7) != 0) {
            throw bxwf.m124095h();
        }
    }

    /* renamed from: b */
    public final void mo73692b(List list) {
        int i;
        int i2;
        if (list instanceof bxuz) {
            bxuz bxuz = (bxuz) list;
            int a = bxzh.m124561a(this.f164774d);
            if (a == 2) {
                int w = m123163w();
                m123160e(w);
                int i3 = this.f164772b + w;
                while (this.f164772b < i3) {
                    bxuz.mo73922a(Float.intBitsToFloat(m123151B()));
                }
            } else if (a == 5) {
                do {
                    bxuz.mo73922a(mo73698e());
                    if (!m123162v()) {
                        i2 = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i2;
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a2 = bxzh.m124561a(this.f164774d);
            if (a2 == 2) {
                int w2 = m123163w();
                m123160e(w2);
                int i4 = this.f164772b + w2;
                while (this.f164772b < i4) {
                    list.add(Float.valueOf(Float.intBitsToFloat(m123151B())));
                }
            } else if (a2 == 5) {
                do {
                    list.add(Float.valueOf(mo73698e()));
                    if (!m123162v()) {
                        i = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i;
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: n */
    public final void mo73717n(List list) {
        int i;
        int i2;
        if (list instanceof bxvm) {
            bxvm bxvm = (bxvm) list;
            int a = bxzh.m124561a(this.f164774d);
            if (a == 2) {
                int w = m123163w();
                m123160e(w);
                int i3 = this.f164772b + w;
                while (this.f164772b < i3) {
                    bxvm.mo74153d(m123151B());
                }
            } else if (a == 5) {
                do {
                    bxvm.mo74153d(mo73722q());
                    if (!m123162v()) {
                        i2 = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i2;
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a2 = bxzh.m124561a(this.f164774d);
            if (a2 == 2) {
                int w2 = m123163w();
                m123160e(w2);
                int i4 = this.f164772b + w2;
                while (this.f164772b < i4) {
                    list.add(Integer.valueOf(m123151B()));
                }
            } else if (a2 == 5) {
                do {
                    list.add(Integer.valueOf(mo73722q()));
                    if (!m123162v()) {
                        i = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i;
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: c */
    public final void mo73694c(List list) {
        int i;
        int i2;
        if (list instanceof bxwq) {
            bxwq bxwq = (bxwq) list;
            int a = bxzh.m124561a(this.f164774d);
            if (a == 0) {
                do {
                    bxwq.mo74161a(mo73700f());
                    if (!m123162v()) {
                        i2 = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i2;
            } else if (a == 2) {
                int w = this.f164772b + m123163w();
                while (this.f164772b < w) {
                    bxwq.mo74161a(mo73727u());
                }
                m123161f(w);
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a2 = bxzh.m124561a(this.f164774d);
            if (a2 == 0) {
                do {
                    list.add(Long.valueOf(mo73700f()));
                    if (!m123162v()) {
                        i = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i;
            } else if (a2 == 2) {
                int w2 = this.f164772b + m123163w();
                while (this.f164772b < w2) {
                    list.add(Long.valueOf(mo73727u()));
                }
                m123161f(w2);
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: k */
    public final boolean mo73711k() {
        m123157c(0);
        return m123163w() != 0;
    }

    /* renamed from: d */
    public final double mo73696d() {
        m123157c(1);
        return Double.longBitsToDouble(m123150A());
    }

    /* renamed from: d */
    public final void mo73697d(List list) {
        int i;
        int i2;
        if (list instanceof bxwq) {
            bxwq bxwq = (bxwq) list;
            int a = bxzh.m124561a(this.f164774d);
            if (a == 0) {
                do {
                    bxwq.mo74161a(mo73702g());
                    if (!m123162v()) {
                        i2 = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i2;
            } else if (a == 2) {
                int w = this.f164772b + m123163w();
                while (this.f164772b < w) {
                    bxwq.mo74161a(mo73727u());
                }
                m123161f(w);
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a2 = bxzh.m124561a(this.f164774d);
            if (a2 == 0) {
                do {
                    list.add(Long.valueOf(mo73702g()));
                    if (!m123162v()) {
                        i = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i;
            } else if (a2 == 2) {
                int w2 = this.f164772b + m123163w();
                while (this.f164772b < w2) {
                    list.add(Long.valueOf(mo73727u()));
                }
                m123161f(w2);
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: b */
    public final void mo73693b(List list, bxxv bxxv, bxus bxus) {
        int i;
        if (bxzh.m124561a(this.f164774d) == 3) {
            int i2 = this.f164774d;
            do {
                list.add(m123158d(bxxv, bxus));
                if (!m123162v()) {
                    i = this.f164772b;
                } else {
                    return;
                }
            } while (m123163w() == i2);
            this.f164772b = i;
            return;
        }
        throw bxwf.m124093f();
    }

    /* renamed from: a */
    private final void m123154a(int i) {
        m123155b(i);
        this.f164772b += i;
    }

    /* renamed from: a */
    public final int mo73681a() {
        if (!m123162v()) {
            int w = m123163w();
            this.f164774d = w;
            if (w != this.f164775e) {
                return bxzh.m124563b(w);
            }
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* renamed from: c */
    public final boolean mo73695c() {
        int i;
        if (m123162v() || (i = this.f164774d) == this.f164775e) {
            return false;
        }
        int a = bxzh.m124561a(i);
        if (a == 0) {
            int i2 = this.f164773c;
            int i3 = this.f164772b;
            if (i2 - i3 >= 10) {
                byte[] bArr = this.f164771a;
                int i4 = 0;
                while (true) {
                    if (i4 >= 10) {
                        break;
                    }
                    int i5 = i3 + 1;
                    if (bArr[i3] >= 0) {
                        this.f164772b = i5;
                        break;
                    }
                    i4++;
                    i3 = i5;
                }
                return true;
            }
            for (int i6 = 0; i6 < 10; i6++) {
                if (m123165y() >= 0) {
                    return true;
                }
            }
            throw bxwf.m124090c();
        } else if (a == 1) {
            m123154a(8);
            return true;
        } else if (a == 2) {
            m123154a(m123163w());
            return true;
        } else if (a == 3) {
            int i7 = this.f164775e;
            this.f164775e = bxzh.m124562a(bxzh.m124563b(this.f164774d), 4);
            while (mo73681a() != Integer.MAX_VALUE && mo73695c()) {
                while (mo73681a() != Integer.MAX_VALUE) {
                    while (mo73681a() != Integer.MAX_VALUE) {
                    }
                }
            }
            if (this.f164774d == this.f164775e) {
                this.f164775e = i7;
                return true;
            }
            throw bxwf.m124095h();
        } else if (a == 5) {
            m123154a(4);
            return true;
        } else {
            throw bxwf.m124093f();
        }
    }

    /* renamed from: a */
    public final Object mo73682a(bxxv bxxv, bxus bxus) {
        m123157c(2);
        return m123156c(bxxv, bxus);
    }

    /* renamed from: a */
    public final Object mo73683a(Class cls, bxus bxus) {
        m123157c(2);
        return m123156c(bxxm.f165037a.mo74227a(cls), bxus);
    }

    /* renamed from: a */
    public final String mo73684a(boolean z) {
        m123157c(2);
        int w = m123163w();
        if (w == 0) {
            return "";
        }
        m123155b(w);
        if (z) {
            byte[] bArr = this.f164771a;
            int i = this.f164772b;
            if (!bxzd.m124557a(bArr, i, i + w)) {
                throw bxwf.m124096i();
            }
        }
        String str = new String(this.f164771a, this.f164772b, w, bxwd.f164980a);
        this.f164772b += w;
        return str;
    }

    /* renamed from: a */
    public final void mo73685a(List list) {
        int i;
        int i2;
        if (list instanceof bxum) {
            bxum bxum = (bxum) list;
            int a = bxzh.m124561a(this.f164774d);
            if (a == 1) {
                do {
                    bxum.mo73894a(mo73696d());
                    if (!m123162v()) {
                        i2 = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i2;
            } else if (a == 2) {
                int w = m123163w();
                m123159d(w);
                int i3 = this.f164772b + w;
                while (this.f164772b < i3) {
                    bxum.mo73894a(Double.longBitsToDouble(m123152C()));
                }
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a2 = bxzh.m124561a(this.f164774d);
            if (a2 == 1) {
                do {
                    list.add(Double.valueOf(mo73696d()));
                    if (!m123162v()) {
                        i = this.f164772b;
                    } else {
                        return;
                    }
                } while (m123163w() == this.f164774d);
                this.f164772b = i;
            } else if (a2 == 2) {
                int w2 = m123163w();
                m123159d(w2);
                int i4 = this.f164772b + w2;
                while (this.f164772b < i4) {
                    list.add(Double.valueOf(Double.longBitsToDouble(m123152C())));
                }
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: a */
    public final void mo73686a(List list, bxxv bxxv, bxus bxus) {
        int i;
        if (bxzh.m124561a(this.f164774d) == 2) {
            int i2 = this.f164774d;
            do {
                list.add(m123156c(bxxv, bxus));
                if (!m123162v()) {
                    i = this.f164772b;
                } else {
                    return;
                }
            } while (m123163w() == i2);
            this.f164772b = i;
            return;
        }
        throw bxwf.m124093f();
    }

    /* renamed from: a */
    public final void mo73687a(List list, boolean z) {
        int i;
        int i2;
        if (bxzh.m124561a(this.f164774d) != 2) {
            throw bxwf.m124093f();
        } else if ((list instanceof bxwm) && !z) {
            bxwm bxwm = (bxwm) list;
            do {
                bxwm.mo74189a(mo73716n());
                if (!m123162v()) {
                    i2 = this.f164772b;
                } else {
                    return;
                }
            } while (m123163w() == this.f164774d);
            this.f164772b = i2;
        } else {
            do {
                list.add(mo73684a(z));
                if (!m123162v()) {
                    i = this.f164772b;
                } else {
                    return;
                }
            } while (m123163w() == this.f164774d);
            this.f164772b = i;
        }
    }

    /* renamed from: a */
    public final void mo73688a(Map map, bxwu bxwu, bxus bxus) {
        m123157c(2);
        int w = m123163w();
        m123155b(w);
        int i = this.f164773c;
        this.f164773c = this.f164772b + w;
        try {
            Object obj = bxwu.f165009b;
            Object obj2 = bxwu.f165011d;
            while (true) {
                int a = mo73681a();
                if (a == Integer.MAX_VALUE) {
                    map.put(obj, obj2);
                    this.f164773c = i;
                    return;
                } else if (a == 1) {
                    obj = m123153a(bxwu.f165008a, (Class) null, (bxus) null);
                } else if (a == 2) {
                    obj2 = m123153a(bxwu.f165010c, bxwu.f165011d.getClass(), bxus);
                } else if (!mo73695c()) {
                    throw new bxwf("Unable to parse map entry.");
                }
            }
        } catch (bxwe e) {
            if (!mo73695c()) {
                throw new bxwf("Unable to parse map entry.");
            }
        } catch (Throwable th) {
            this.f164773c = i;
            throw th;
        }
    }
}
