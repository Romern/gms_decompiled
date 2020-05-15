package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bxuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxuj extends bxuk {

    /* renamed from: a */
    private final ByteBuffer f164847a;

    /* renamed from: b */
    private final ByteBuffer f164848b;

    /* renamed from: c */
    private final long f164849c;

    /* renamed from: d */
    private final long f164850d;

    /* renamed from: g */
    private final long f164851g;

    /* renamed from: h */
    private final long f164852h;

    /* renamed from: i */
    private long f164853i = this.f164850d;

    /* renamed from: a */
    private final void m123601a(long j) {
        this.f164848b.position(m123602b(j));
    }

    /* renamed from: b */
    private final int m123602b(long j) {
        return (int) (j - this.f164849c);
    }

    /* renamed from: a */
    public final int mo73827a() {
        return (int) (this.f164851g - this.f164853i);
    }

    /* renamed from: b */
    public final int mo73842b() {
        return (int) (this.f164853i - this.f164850d);
    }

    /* renamed from: c */
    public final void mo73851c() {
        this.f164847a.position(m123602b(this.f164853i));
    }

    /* renamed from: d */
    public final void mo73855d(int i) {
        if (this.f164853i > this.f164852h) {
            while (true) {
                long j = this.f164853i;
                if (j >= this.f164851g) {
                    throw new bxuh(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(j), Long.valueOf(this.f164851g), 1));
                } else if ((i & -128) != 0) {
                    this.f164853i = j + 1;
                    bxyx.m124499a(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                } else {
                    this.f164853i = 1 + j;
                    bxyx.m124499a(j, (byte) i);
                    return;
                }
            }
        } else {
            while ((i & -128) != 0) {
                long j2 = this.f164853i;
                this.f164853i = j2 + 1;
                bxyx.m124499a(j2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            long j3 = this.f164853i;
            this.f164853i = 1 + j3;
            bxyx.m124499a(j3, (byte) i);
        }
    }

    /* renamed from: e */
    public final void mo73858e(int i) {
        this.f164848b.putInt(m123602b(this.f164853i), i);
        this.f164853i += 4;
    }

    public bxuj(ByteBuffer byteBuffer) {
        this.f164847a = byteBuffer;
        this.f164848b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long a = bxyx.m124495a(byteBuffer);
        this.f164849c = a;
        this.f164850d = a + ((long) byteBuffer.position());
        long limit = this.f164849c + ((long) byteBuffer.limit());
        this.f164851g = limit;
        this.f164852h = limit - 10;
    }

    /* renamed from: c */
    public final void mo73852c(int i) {
        if (i < 0) {
            mo73854c((long) i);
        } else {
            mo73855d(i);
        }
    }

    /* renamed from: e */
    public final void mo73859e(int i, int i2) {
        mo73845b(i, 5);
        mo73858e(i2);
    }

    /* renamed from: a */
    public final void mo73831a(int i, long j) {
        mo73845b(i, 0);
        mo73854c(j);
    }

    /* renamed from: b */
    public final void mo73843b(byte b) {
        long j = this.f164853i;
        if (j < this.f164851g) {
            this.f164853i = 1 + j;
            bxyx.m124499a(j, b);
            return;
        }
        throw new bxuh(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(j), Long.valueOf(this.f164851g), 1));
    }

    /* renamed from: a */
    public final void mo73832a(int i, bxtx bxtx) {
        mo73845b(i, 2);
        mo73838a(bxtx);
    }

    /* renamed from: c */
    public final void mo73853c(int i, int i2) {
        mo73845b(i, 0);
        mo73852c(i2);
    }

    /* renamed from: a */
    public final void mo73833a(int i, bxxc bxxc) {
        mo73845b(1, 3);
        mo73856d(2, i);
        mo73849b(bxxc);
        mo73845b(1, 4);
    }

    /* renamed from: b */
    public final void mo73845b(int i, int i2) {
        mo73855d(bxzh.m124562a(i, i2));
    }

    /* renamed from: c */
    public final void mo73854c(long j) {
        if (this.f164853i > this.f164852h) {
            while (true) {
                long j2 = this.f164853i;
                if (j2 >= this.f164851g) {
                    throw new bxuh(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(j2), Long.valueOf(this.f164851g), 1));
                } else if ((j & -128) != 0) {
                    this.f164853i = j2 + 1;
                    bxyx.m124499a(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } else {
                    this.f164853i = 1 + j2;
                    bxyx.m124499a(j2, (byte) ((int) j));
                    return;
                }
            }
        } else {
            while ((j & -128) != 0) {
                long j3 = this.f164853i;
                this.f164853i = j3 + 1;
                bxyx.m124499a(j3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            long j4 = this.f164853i;
            this.f164853i = 1 + j4;
            bxyx.m124499a(j4, (byte) ((int) j));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxxv.a(java.lang.Object, bxul):void
     arg types: [bxxc, bxul]
     candidates:
      bxxv.a(java.lang.Object, java.lang.Object):boolean
      bxxv.a(java.lang.Object, bxul):void */
    /* renamed from: a */
    public final void mo73834a(int i, bxxc bxxc, bxxv bxxv) {
        mo73845b(i, 2);
        bxsz bxsz = (bxsz) bxxc;
        int l = bxsz.mo73643l();
        if (l == -1) {
            l = bxxv.mo74223b(bxsz);
            bxsz.mo73640b(l);
        }
        mo73855d(l);
        bxxv.mo74219a((Object) bxxc, this.f164856f);
    }

    /* renamed from: b */
    public final void mo73846b(int i, long j) {
        mo73845b(i, 1);
        mo73857d(j);
    }

    /* renamed from: d */
    public final void mo73856d(int i, int i2) {
        mo73845b(i, 0);
        mo73855d(i2);
    }

    /* renamed from: b */
    public final void mo73847b(int i, bxtx bxtx) {
        mo73845b(1, 3);
        mo73856d(2, i);
        mo73832a(3, bxtx);
        mo73845b(1, 4);
    }

    /* renamed from: d */
    public final void mo73857d(long j) {
        this.f164848b.putLong(m123602b(this.f164853i), j);
        this.f164853i += 8;
    }

    /* renamed from: b */
    public final void mo73849b(bxxc bxxc) {
        mo73845b(3, 2);
        mo73839a(bxxc);
    }

    /* renamed from: b */
    public final void mo73850b(byte[] bArr, int i, int i2) {
        if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
            long j = this.f164851g;
            long j2 = (long) i2;
            long j3 = this.f164853i;
            if (j - j2 >= j3) {
                bxyx.f165115a.mo74314a(bArr, (long) i, j3, j2);
                this.f164853i += j2;
                return;
            }
        }
        if (bArr != null) {
            throw new bxuh(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f164853i), Long.valueOf(this.f164851g), Integer.valueOf(i2)));
        }
        throw new NullPointerException("value");
    }

    /* renamed from: a */
    public final void mo73835a(int i, String str) {
        mo73845b(i, 2);
        mo73840a(str);
    }

    /* renamed from: a */
    public final void mo73836a(int i, boolean z) {
        mo73845b(i, 0);
        mo73843b(z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    public final void mo73838a(bxtx bxtx) {
        mo73855d(bxtx.mo73744a());
        bxtx.mo73756a(this);
    }

    /* renamed from: a */
    public final void mo73839a(bxxc bxxc) {
        mo73855d(bxxc.mo74145db());
        bxxc.mo73644a(this);
    }

    /* renamed from: a */
    public final void mo73840a(String str) {
        long j = this.f164853i;
        try {
            int k = bxuk.m123661k(str.length() * 3);
            int k2 = bxuk.m123661k(str.length());
            if (k2 != k) {
                int a = bxzd.m124554a(str);
                mo73855d(a);
                m123601a(this.f164853i);
                bxzd.m124556a(str, this.f164848b);
                this.f164853i += (long) a;
                return;
            }
            int b = m123602b(this.f164853i) + k2;
            this.f164848b.position(b);
            bxzd.m124556a(str, this.f164848b);
            int position = this.f164848b.position() - b;
            mo73855d(position);
            this.f164853i += (long) position;
        } catch (bxzb e) {
            this.f164853i = j;
            m123601a(j);
            mo73864a(str, e);
        } catch (IllegalArgumentException e2) {
            throw new bxuh(e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new bxuh(e3);
        }
    }

    /* renamed from: a */
    public final void mo73841a(byte[] bArr, int i) {
        mo73855d(i);
        mo73850b(bArr, 0, i);
    }

    /* renamed from: a */
    public final void mo73737a(byte[] bArr, int i, int i2) {
        mo73850b(bArr, i, i2);
    }
}
