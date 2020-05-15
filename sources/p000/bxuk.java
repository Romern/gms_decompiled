package p000;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bxuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bxuk extends bxtl {

    /* renamed from: a */
    private static final Logger f164854a = Logger.getLogger(bxuk.class.getName());

    /* renamed from: e */
    public static final boolean f164855e = bxyx.f165117c;

    /* renamed from: f */
    bxul f164856f;

    /* renamed from: a */
    public static int m123631a(int i, bxwk bxwk) {
        return m123657i(i) + m123632a(bxwk);
    }

    @Deprecated
    /* renamed from: b */
    static int m123638b(int i, bxxc bxxc, bxxv bxxv) {
        int i2 = m123657i(i);
        int i3 = i2 + i2;
        bxsz bxsz = (bxsz) bxxc;
        int l = bxsz.mo73643l();
        if (l == -1) {
            l = bxxv.mo74223b(bxsz);
            bxsz.mo73640b(l);
        }
        return i3 + l;
    }

    /* renamed from: c */
    public static int m123642c(int i, bxtx bxtx) {
        return m123657i(i) + m123640b(bxtx);
    }

    /* renamed from: d */
    public static int m123645d(int i, long j) {
        return m123657i(i) + m123651f(j);
    }

    /* renamed from: e */
    public static int m123647e(int i, long j) {
        return m123657i(i) + m123651f(j);
    }

    /* renamed from: f */
    static int m123649f(int i) {
        if (i <= 4096) {
            return i;
        }
        return 4096;
    }

    /* renamed from: f */
    public static int m123651f(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: g */
    public static int m123653g(int i, int i2) {
        return m123657i(i) + m123659j(i2);
    }

    /* renamed from: h */
    public static int m123655h(int i, int i2) {
        return m123657i(i) + m123661k(i2);
    }

    /* renamed from: h */
    public static long m123656h(long j) {
        return (j >> 63) ^ (j + j);
    }

    /* renamed from: i */
    public static int m123657i(int i) {
        return m123661k(bxzh.m124562a(i, 0));
    }

    /* renamed from: j */
    public static int m123659j(int i) {
        if (i >= 0) {
            return m123661k(i);
        }
        return 10;
    }

    /* renamed from: k */
    public static int m123661k(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) != 0) {
            return (i & -268435456) != 0 ? 5 : 4;
        }
        return 3;
    }

    /* renamed from: l */
    public static int m123662l(int i) {
        return m123661k(m123664n(i));
    }

    /* renamed from: m */
    static int m123663m(int i) {
        return m123661k(i) + i;
    }

    /* renamed from: n */
    public static int m123664n(int i) {
        return (i >> 31) ^ (i + i);
    }

    /* renamed from: o */
    public static int m123665o(int i) {
        return m123657i(i) + 1;
    }

    /* renamed from: p */
    public static int m123666p(int i) {
        return m123657i(i) + 8;
    }

    /* renamed from: q */
    public static int m123667q(int i) {
        return m123657i(i) + 4;
    }

    /* renamed from: r */
    public static int m123668r(int i) {
        return m123657i(i) + 8;
    }

    /* renamed from: s */
    public static int m123669s(int i) {
        return m123657i(i) + 4;
    }

    /* renamed from: t */
    public static int m123670t(int i) {
        return m123657i(i) + 4;
    }

    /* renamed from: u */
    public static int m123671u(int i) {
        return m123657i(i) + 8;
    }

    /* renamed from: a */
    public abstract int mo73827a();

    /* renamed from: a */
    public abstract void mo73831a(int i, long j);

    /* renamed from: a */
    public abstract void mo73832a(int i, bxtx bxtx);

    /* renamed from: a */
    public abstract void mo73833a(int i, bxxc bxxc);

    /* renamed from: a */
    public abstract void mo73834a(int i, bxxc bxxc, bxxv bxxv);

    /* renamed from: a */
    public abstract void mo73835a(int i, String str);

    /* renamed from: a */
    public abstract void mo73836a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo73838a(bxtx bxtx);

    /* renamed from: a */
    public abstract void mo73839a(bxxc bxxc);

    /* renamed from: a */
    public abstract void mo73840a(String str);

    /* renamed from: a */
    public abstract void mo73841a(byte[] bArr, int i);

    /* renamed from: a */
    public abstract void mo73737a(byte[] bArr, int i, int i2);

    /* renamed from: b */
    public abstract int mo73842b();

    /* renamed from: b */
    public abstract void mo73843b(byte b);

    /* renamed from: b */
    public abstract void mo73845b(int i, int i2);

    /* renamed from: b */
    public abstract void mo73846b(int i, long j);

    /* renamed from: b */
    public abstract void mo73847b(int i, bxtx bxtx);

    /* renamed from: b */
    public abstract void mo73849b(bxxc bxxc);

    /* renamed from: b */
    public abstract void mo73850b(byte[] bArr, int i, int i2);

    /* renamed from: c */
    public abstract void mo73851c();

    /* renamed from: c */
    public abstract void mo73852c(int i);

    /* renamed from: c */
    public abstract void mo73853c(int i, int i2);

    /* renamed from: c */
    public abstract void mo73854c(long j);

    /* renamed from: d */
    public abstract void mo73855d(int i);

    /* renamed from: d */
    public abstract void mo73856d(int i, int i2);

    /* renamed from: d */
    public abstract void mo73857d(long j);

    /* renamed from: e */
    public abstract void mo73858e(int i);

    /* renamed from: e */
    public abstract void mo73859e(int i, int i2);

    /* renamed from: a */
    public static int m123632a(bxwk bxwk) {
        int i;
        if (bxwk.f164996b != null) {
            i = bxwk.f164996b.mo73744a();
        } else {
            i = bxwk.f164995a != null ? bxwk.f164995a.mo74145db() : 0;
        }
        return m123663m(i);
    }

    /* renamed from: c */
    public static int m123643c(bxxc bxxc) {
        return m123663m(bxxc.mo74145db());
    }

    @Deprecated
    /* renamed from: e */
    public static int m123648e(bxxc bxxc) {
        return bxxc.mo74145db();
    }

    /* renamed from: f */
    public static int m123650f(int i, long j) {
        return m123657i(i) + m123654g(j);
    }

    /* renamed from: g */
    public static int m123654g(long j) {
        return m123651f(m123656h(j));
    }

    /* renamed from: i */
    public static int m123658i(int i, int i2) {
        return m123657i(i) + m123662l(i2);
    }

    /* renamed from: j */
    public static int m123660j(int i, int i2) {
        return m123657i(i) + m123659j(i2);
    }

    /* renamed from: c */
    public static bxuk m123644c(byte[] bArr, int i, int i2) {
        return new bxuf(bArr, i, i2);
    }

    /* renamed from: d */
    public static int m123646d(byte[] bArr) {
        return m123663m(bArr.length);
    }

    /* renamed from: e */
    public final void mo73870e(long j) {
        mo73854c(m123656h(j));
    }

    /* renamed from: g */
    public final void mo73872g(int i) {
        mo73843b((byte) i);
    }

    /* renamed from: h */
    public final void mo73873h(int i) {
        mo73855d(m123664n(i));
    }

    /* renamed from: f */
    public static int m123652f(bxxc bxxc) {
        return m123657i(3) + m123643c(bxxc);
    }

    /* renamed from: c */
    public final void mo73866c(int i, long j) {
        mo73831a(i, m123656h(j));
    }

    /* renamed from: d */
    public final void mo73868d() {
        if (mo73827a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b */
    public static int m123639b(int i, String str) {
        return m123657i(i) + m123641b(str);
    }

    /* renamed from: c */
    public final void mo73867c(byte[] bArr) {
        mo73841a(bArr, bArr.length);
    }

    @Deprecated
    /* renamed from: d */
    public final void mo73869d(bxxc bxxc) {
        bxxc.mo73644a(this);
    }

    /* renamed from: f */
    public final void mo73871f(int i, int i2) {
        mo73856d(i, m123664n(i2));
    }

    /* renamed from: a */
    static int m123633a(bxxc bxxc, bxxv bxxv) {
        bxsz bxsz = (bxsz) bxxc;
        int l = bxsz.mo73643l();
        if (l == -1) {
            l = bxxv.mo74223b(bxsz);
            bxsz.mo73640b(l);
        }
        return m123663m(l);
    }

    /* renamed from: b */
    public static int m123640b(bxtx bxtx) {
        return m123663m(bxtx.mo73744a());
    }

    /* renamed from: b */
    public static int m123641b(String str) {
        int i;
        try {
            i = bxzd.m124554a(str);
        } catch (bxzb e) {
            i = str.getBytes(bxwd.f164980a).length;
        }
        return m123663m(i);
    }

    /* renamed from: a */
    public static bxuk m123634a(OutputStream outputStream) {
        return m123635a(outputStream, 4096);
    }

    /* renamed from: a */
    public static bxuk m123635a(OutputStream outputStream, int i) {
        return new bxue(outputStream, i);
    }

    /* renamed from: b */
    public final void mo73865b(byte[] bArr) {
        mo73850b(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static bxuk m123636a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new bxug(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (!bxyx.f165116b) {
            return new bxui(byteBuffer);
        } else {
            return new bxuj(byteBuffer);
        }
    }

    /* renamed from: a */
    public static bxuk m123637a(byte[] bArr) {
        return m123644c(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final void mo73860a(double d) {
        mo73857d(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo73861a(float f) {
        mo73858e(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void mo73862a(int i, double d) {
        mo73846b(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo73863a(int i, float f) {
        mo73859e(i, Float.floatToRawIntBits(f));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, bxzb]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73864a(String str, bxzb bxzb) {
        f164854a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) bxzb);
        byte[] bytes = str.getBytes(bxwd.f164980a);
        try {
            int length = bytes.length;
            mo73855d(length);
            mo73737a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new bxuh(e);
        } catch (bxuh e2) {
            throw e2;
        }
    }
}
