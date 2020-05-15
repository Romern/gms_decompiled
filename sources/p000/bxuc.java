package p000;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: bxuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bxuc {

    /* renamed from: a */
    int f164825a;

    /* renamed from: b */
    final int f164826b = 100;

    /* renamed from: c */
    public int f164827c = Integer.MAX_VALUE;

    /* renamed from: d */
    bxud f164828d;

    /* renamed from: a */
    public static int m123414a(int i, InputStream inputStream) {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i2 |= (read & 127) << i3;
                if ((read & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw bxwf.m124088a();
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw bxwf.m124088a();
            } else if ((read2 & 128) == 0) {
                return i2;
            } else {
                i3 += 7;
            }
        }
        throw bxwf.m124090c();
    }

    /* renamed from: a */
    public static long m123415a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: g */
    public static int m123422g(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: A */
    public abstract boolean mo73783A();

    /* renamed from: B */
    public abstract int mo73784B();

    /* renamed from: C */
    public abstract byte mo73785C();

    /* renamed from: a */
    public abstract int mo73786a();

    /* renamed from: a */
    public abstract void mo73787a(int i);

    /* renamed from: b */
    public abstract double mo73788b();

    /* renamed from: b */
    public abstract boolean mo73789b(int i);

    /* renamed from: c */
    public abstract float mo73790c();

    /* renamed from: c */
    public abstract int mo73791c(int i);

    /* renamed from: d */
    public abstract long mo73792d();

    /* renamed from: d */
    public abstract void mo73793d(int i);

    /* renamed from: e */
    public abstract long mo73794e();

    /* renamed from: e */
    public abstract byte[] mo73795e(int i);

    /* renamed from: f */
    public abstract int mo73796f();

    /* renamed from: f */
    public abstract void mo73797f(int i);

    /* renamed from: g */
    public abstract long mo73798g();

    /* renamed from: h */
    public abstract int mo73799h();

    /* renamed from: i */
    public abstract boolean mo73800i();

    /* renamed from: j */
    public abstract String mo73801j();

    /* renamed from: k */
    public abstract String mo73802k();

    /* renamed from: l */
    public abstract ByteString mo73803l();

    /* renamed from: m */
    public abstract byte[] mo73804m();

    /* renamed from: n */
    public abstract int mo73805n();

    /* renamed from: o */
    public abstract int mo73806o();

    /* renamed from: p */
    public abstract int mo73807p();

    /* renamed from: q */
    public abstract long mo73808q();

    /* renamed from: r */
    public abstract int mo73809r();

    /* renamed from: s */
    public abstract long mo73810s();

    /* renamed from: t */
    public abstract int mo73811t();

    /* renamed from: y */
    public abstract void mo73816y();

    /* renamed from: z */
    public abstract int mo73817z();

    /* renamed from: a */
    public static bxuc m123416a(InputStream inputStream) {
        return m123417a(inputStream, 4096);
    }

    /* renamed from: a */
    public static bxuc m123417a(InputStream inputStream, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        } else if (inputStream != null) {
            return new bxua(inputStream, i);
        } else {
            return m123419a(bxwd.f164981b);
        }
    }

    /* renamed from: a */
    public static bxuc m123418a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return m123421a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        if (byteBuffer.isDirect() && bxyx.f165116b) {
            return new bxub(byteBuffer);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m123421a(bArr, 0, remaining);
    }

    /* renamed from: a */
    public static bxuc m123419a(byte[] bArr) {
        return m123420a(bArr, bArr.length);
    }

    /* renamed from: a */
    public static bxuc m123420a(byte[] bArr, int i) {
        return m123421a(bArr, 0, i);
    }

    /* renamed from: a */
    static bxuc m123421a(byte[] bArr, int i, int i2) {
        bxtz bxtz = new bxtz(bArr, i, i2);
        try {
            bxtz.mo73791c(i2);
            return bxtz;
        } catch (bxwf e) {
            throw new IllegalArgumentException(e);
        }
    }
}
