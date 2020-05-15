package p000;

import java.io.OutputStream;

/* renamed from: bxue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxue extends bxuk {

    /* renamed from: a */
    final byte[] f164833a;

    /* renamed from: b */
    final int f164834b;

    /* renamed from: c */
    int f164835c;

    /* renamed from: d */
    int f164836d;

    /* renamed from: g */
    private final OutputStream f164837g;

    /* renamed from: e */
    private final void m123507e() {
        this.f164837g.write(this.f164833a, 0, this.f164835c);
        this.f164835c = 0;
    }

    /* renamed from: v */
    private final void m123508v(int i) {
        if (this.f164834b - this.f164835c < i) {
            m123507e();
        }
    }

    /* renamed from: a */
    public final int mo73827a() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    /* renamed from: b */
    public final int mo73842b() {
        return this.f164836d;
    }

    /* renamed from: c */
    public final void mo73851c() {
        if (this.f164835c > 0) {
            m123507e();
        }
    }

    /* renamed from: d */
    public final void mo73855d(int i) {
        m123508v(5);
        mo73829a(i);
    }

    public bxue(OutputStream outputStream, int i) {
        if (i >= 0) {
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f164833a = bArr;
            this.f164834b = bArr.length;
            if (outputStream != null) {
                this.f164837g = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73828a(byte b) {
        byte[] bArr = this.f164833a;
        int i = this.f164835c;
        this.f164835c = i + 1;
        bArr[i] = b;
        this.f164836d++;
    }

    /* renamed from: b */
    public final void mo73843b(byte b) {
        if (this.f164835c == this.f164834b) {
            m123507e();
        }
        mo73828a(b);
    }

    /* renamed from: c */
    public final void mo73852c(int i) {
        if (i < 0) {
            mo73854c((long) i);
        } else {
            mo73855d(i);
        }
    }

    /* renamed from: d */
    public final void mo73856d(int i, int i2) {
        m123508v(20);
        mo73830a(i, 0);
        mo73829a(i2);
    }

    /* renamed from: e */
    public final void mo73858e(int i) {
        m123508v(4);
        mo73844b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73829a(int i) {
        if (bxuk.f164855e) {
            long j = (long) this.f164835c;
            while ((i & -128) != 0) {
                byte[] bArr = this.f164833a;
                int i2 = this.f164835c;
                this.f164835c = i2 + 1;
                bxyx.m124508a(bArr, (long) i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.f164833a;
            int i3 = this.f164835c;
            this.f164835c = i3 + 1;
            bxyx.m124508a(bArr2, (long) i3, (byte) i);
            this.f164836d += (int) (((long) this.f164835c) - j);
            return;
        }
        while ((i & -128) != 0) {
            byte[] bArr3 = this.f164833a;
            int i4 = this.f164835c;
            this.f164835c = i4 + 1;
            bArr3[i4] = (byte) ((i & 127) | 128);
            this.f164836d++;
            i >>>= 7;
        }
        byte[] bArr4 = this.f164833a;
        int i5 = this.f164835c;
        this.f164835c = i5 + 1;
        bArr4[i5] = (byte) i;
        this.f164836d++;
    }

    /* renamed from: d */
    public final void mo73857d(long j) {
        m123508v(8);
        mo73848b(j);
    }

    /* renamed from: e */
    public final void mo73859e(int i, int i2) {
        m123508v(14);
        mo73830a(i, 5);
        mo73844b(i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo73844b(int i) {
        byte[] bArr = this.f164833a;
        int i2 = this.f164835c;
        int i3 = i2 + 1;
        this.f164835c = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.f164835c = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        this.f164835c = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f164835c = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.f164836d += 4;
    }

    /* renamed from: c */
    public final void mo73853c(int i, int i2) {
        m123508v(20);
        mo73830a(i, 0);
        if (i2 < 0) {
            mo73837a((long) i2);
        } else {
            mo73829a(i2);
        }
    }

    /* renamed from: b */
    public final void mo73845b(int i, int i2) {
        mo73855d(bxzh.m124562a(i, i2));
    }

    /* renamed from: b */
    public final void mo73846b(int i, long j) {
        m123508v(18);
        mo73830a(i, 1);
        mo73848b(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73830a(int i, int i2) {
        mo73829a(bxzh.m124562a(i, i2));
    }

    /* renamed from: b */
    public final void mo73847b(int i, bxtx bxtx) {
        mo73845b(1, 3);
        mo73856d(2, i);
        mo73832a(3, bxtx);
        mo73845b(1, 4);
    }

    /* renamed from: c */
    public final void mo73854c(long j) {
        m123508v(10);
        mo73837a(j);
    }

    /* renamed from: a */
    public final void mo73831a(int i, long j) {
        m123508v(20);
        mo73830a(i, 0);
        mo73837a(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo73848b(long j) {
        byte[] bArr = this.f164833a;
        int i = this.f164835c;
        int i2 = i + 1;
        this.f164835c = i2;
        bArr[i] = (byte) ((int) (j & 255));
        int i3 = i2 + 1;
        this.f164835c = i3;
        bArr[i2] = (byte) ((int) ((j >> 8) & 255));
        int i4 = i3 + 1;
        this.f164835c = i4;
        bArr[i3] = (byte) ((int) ((j >> 16) & 255));
        int i5 = i4 + 1;
        this.f164835c = i5;
        bArr[i4] = (byte) ((int) (255 & (j >> 24)));
        int i6 = i5 + 1;
        this.f164835c = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        this.f164835c = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        this.f164835c = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f164835c = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.f164836d += 8;
    }

    /* renamed from: a */
    public final void mo73832a(int i, bxtx bxtx) {
        mo73845b(i, 2);
        mo73838a(bxtx);
    }

    /* renamed from: b */
    public final void mo73849b(bxxc bxxc) {
        mo73845b(3, 2);
        mo73839a(bxxc);
    }

    /* renamed from: a */
    public final void mo73833a(int i, bxxc bxxc) {
        mo73845b(1, 3);
        mo73856d(2, i);
        mo73849b(bxxc);
        mo73845b(1, 4);
    }

    /* renamed from: b */
    public final void mo73850b(byte[] bArr, int i, int i2) {
        int i3 = this.f164834b;
        int i4 = this.f164835c;
        int i5 = i3 - i4;
        if (i5 < i2) {
            System.arraycopy(bArr, i, this.f164833a, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f164835c = this.f164834b;
            this.f164836d += i5;
            m123507e();
            if (i7 <= this.f164834b) {
                System.arraycopy(bArr, i6, this.f164833a, 0, i7);
                this.f164835c = i7;
            } else {
                this.f164837g.write(bArr, i6, i7);
            }
            this.f164836d += i7;
            return;
        }
        System.arraycopy(bArr, i, this.f164833a, i4, i2);
        this.f164835c += i2;
        this.f164836d += i2;
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

    /* renamed from: a */
    public final void mo73835a(int i, String str) {
        mo73845b(i, 2);
        mo73840a(str);
    }

    /* renamed from: a */
    public final void mo73836a(int i, boolean z) {
        m123508v(11);
        mo73830a(i, 0);
        mo73828a(z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73837a(long j) {
        if (bxuk.f164855e) {
            long j2 = (long) this.f164835c;
            while ((j & -128) != 0) {
                byte[] bArr = this.f164833a;
                int i = this.f164835c;
                this.f164835c = i + 1;
                bxyx.m124508a(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f164833a;
            int i2 = this.f164835c;
            this.f164835c = i2 + 1;
            bxyx.m124508a(bArr2, (long) i2, (byte) ((int) j));
            this.f164836d += (int) (((long) this.f164835c) - j2);
            return;
        }
        while ((j & -128) != 0) {
            byte[] bArr3 = this.f164833a;
            int i3 = this.f164835c;
            this.f164835c = i3 + 1;
            bArr3[i3] = (byte) ((((int) j) & 127) | 128);
            this.f164836d++;
            j >>>= 7;
        }
        byte[] bArr4 = this.f164833a;
        int i4 = this.f164835c;
        this.f164835c = i4 + 1;
        bArr4[i4] = (byte) ((int) j);
        this.f164836d++;
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
        int i;
        int i2;
        try {
            int length = str.length() * 3;
            int k = bxuk.m123661k(length);
            int i3 = k + length;
            int i4 = this.f164834b;
            if (i3 <= i4) {
                if (i3 > i4 - this.f164835c) {
                    m123507e();
                }
                int k2 = bxuk.m123661k(str.length());
                i = this.f164835c;
                if (k2 != k) {
                    i2 = bxzd.m124554a(str);
                    mo73829a(i2);
                    this.f164835c = bxzd.m124555a(str, this.f164833a, this.f164835c, i2);
                } else {
                    int i5 = i + k2;
                    this.f164835c = i5;
                    int a = bxzd.m124555a(str, this.f164833a, i5, this.f164834b - i5);
                    this.f164835c = i;
                    i2 = (a - i) - k2;
                    mo73829a(i2);
                    this.f164835c = a;
                }
                this.f164836d += i2;
                return;
            }
            byte[] bArr = new byte[length];
            int a2 = bxzd.m124555a(str, bArr, 0, length);
            mo73855d(a2);
            mo73850b(bArr, 0, a2);
        } catch (bxzb e) {
            this.f164836d -= this.f164835c - i;
            this.f164835c = i;
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new bxuh(e2);
        } catch (bxzb e3) {
            mo73864a(str, e3);
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
