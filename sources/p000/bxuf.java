package p000;

/* renamed from: bxuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bxuf extends bxuk {

    /* renamed from: a */
    private final byte[] f164838a;

    /* renamed from: b */
    private final int f164839b;

    /* renamed from: c */
    private final int f164840c;

    /* renamed from: d */
    private int f164841d;

    /* renamed from: a */
    public final int mo73827a() {
        return this.f164840c - this.f164841d;
    }

    /* renamed from: b */
    public final int mo73842b() {
        return this.f164841d - this.f164839b;
    }

    /* renamed from: c */
    public void mo73851c() {
    }

    /* renamed from: d */
    public final void mo73855d(int i) {
        if (!bxuk.f164855e || bxtd.m123131a() || mo73827a() < 5) {
            while ((i & -128) != 0) {
                try {
                    byte[] bArr = this.f164838a;
                    int i2 = this.f164841d;
                    this.f164841d = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new bxuh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f164841d), Integer.valueOf(this.f164840c), 1), e);
                }
            }
            byte[] bArr2 = this.f164838a;
            int i3 = this.f164841d;
            this.f164841d = i3 + 1;
            bArr2[i3] = (byte) i;
        } else if ((i & -128) != 0) {
            byte[] bArr3 = this.f164838a;
            int i4 = this.f164841d;
            this.f164841d = i4 + 1;
            bxyx.m124508a(bArr3, (long) i4, (byte) (i | 128));
            int i5 = i >>> 7;
            if ((i5 & -128) == 0) {
                byte[] bArr4 = this.f164838a;
                int i6 = this.f164841d;
                this.f164841d = i6 + 1;
                bxyx.m124508a(bArr4, (long) i6, (byte) i5);
                return;
            }
            byte[] bArr5 = this.f164838a;
            int i7 = this.f164841d;
            this.f164841d = i7 + 1;
            bxyx.m124508a(bArr5, (long) i7, (byte) (i5 | 128));
            int i8 = i5 >>> 7;
            if ((i8 & -128) == 0) {
                byte[] bArr6 = this.f164838a;
                int i9 = this.f164841d;
                this.f164841d = i9 + 1;
                bxyx.m124508a(bArr6, (long) i9, (byte) i8);
                return;
            }
            byte[] bArr7 = this.f164838a;
            int i10 = this.f164841d;
            this.f164841d = i10 + 1;
            bxyx.m124508a(bArr7, (long) i10, (byte) (i8 | 128));
            int i11 = i8 >>> 7;
            if ((i11 & -128) == 0) {
                byte[] bArr8 = this.f164838a;
                int i12 = this.f164841d;
                this.f164841d = i12 + 1;
                bxyx.m124508a(bArr8, (long) i12, (byte) i11);
                return;
            }
            byte[] bArr9 = this.f164838a;
            int i13 = this.f164841d;
            this.f164841d = i13 + 1;
            bxyx.m124508a(bArr9, (long) i13, (byte) (i11 | 128));
            byte[] bArr10 = this.f164838a;
            int i14 = this.f164841d;
            this.f164841d = i14 + 1;
            bxyx.m124508a(bArr10, (long) i14, (byte) (i11 >>> 7));
        } else {
            byte[] bArr11 = this.f164838a;
            int i15 = this.f164841d;
            this.f164841d = i15 + 1;
            bxyx.m124508a(bArr11, (long) i15, (byte) i);
        }
    }

    /* renamed from: e */
    public final void mo73858e(int i) {
        try {
            byte[] bArr = this.f164838a;
            int i2 = this.f164841d;
            int i3 = i2 + 1;
            this.f164841d = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f164841d = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f164841d = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f164841d = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new bxuh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f164841d), Integer.valueOf(this.f164840c), 1), e);
        }
    }

    public bxuf(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            int length = bArr.length;
            int i3 = i + i2;
            if ((i | i2 | (length - i3)) >= 0) {
                this.f164838a = bArr;
                this.f164839b = i;
                this.f164841d = i;
                this.f164840c = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: a */
    public final void mo73831a(int i, long j) {
        mo73845b(i, 0);
        mo73854c(j);
    }

    /* renamed from: c */
    public final void mo73852c(int i) {
        if (i < 0) {
            mo73854c((long) i);
        } else {
            mo73855d(i);
        }
    }

    /* renamed from: a */
    public final void mo73832a(int i, ByteString bxtx) {
        mo73845b(i, 2);
        mo73838a(bxtx);
    }

    /* renamed from: b */
    public final void mo73843b(byte b) {
        try {
            byte[] bArr = this.f164838a;
            int i = this.f164841d;
            this.f164841d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new bxuh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f164841d), Integer.valueOf(this.f164840c), 1), e);
        }
    }

    /* renamed from: e */
    public final void mo73859e(int i, int i2) {
        mo73845b(i, 5);
        mo73858e(i2);
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
    public final void mo73853c(int i, int i2) {
        mo73845b(i, 0);
        mo73852c(i2);
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

    /* renamed from: c */
    public final void mo73854c(long j) {
        if (!bxuk.f164855e || mo73827a() < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = this.f164838a;
                    int i = this.f164841d;
                    this.f164841d = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new bxuh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f164841d), Integer.valueOf(this.f164840c), 1), e);
                }
            }
            byte[] bArr2 = this.f164838a;
            int i2 = this.f164841d;
            this.f164841d = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        while ((j & -128) != 0) {
            byte[] bArr3 = this.f164838a;
            int i3 = this.f164841d;
            this.f164841d = i3 + 1;
            bxyx.m124508a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.f164838a;
        int i4 = this.f164841d;
        this.f164841d = i4 + 1;
        bxyx.m124508a(bArr4, (long) i4, (byte) ((int) j));
    }

    /* renamed from: b */
    public final void mo73847b(int i, ByteString bxtx) {
        mo73845b(1, 3);
        mo73856d(2, i);
        mo73832a(3, bxtx);
        mo73845b(1, 4);
    }

    /* renamed from: b */
    public final void mo73849b(bxxc bxxc) {
        mo73845b(3, 2);
        mo73839a(bxxc);
    }

    /* renamed from: a */
    public final void mo73835a(int i, String str) {
        mo73845b(i, 2);
        mo73840a(str);
    }

    /* renamed from: b */
    public final void mo73850b(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.f164838a, this.f164841d, i2);
            this.f164841d += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new bxuh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f164841d), Integer.valueOf(this.f164840c), Integer.valueOf(i2)), e);
        }
    }

    /* renamed from: a */
    public final void mo73836a(int i, boolean z) {
        mo73845b(i, 0);
        mo73843b(z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    public final void mo73838a(ByteString bxtx) {
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
        int i = this.f164841d;
        try {
            int k = bxuk.m123661k(str.length() * 3);
            int k2 = bxuk.m123661k(str.length());
            if (k2 != k) {
                mo73855d(bxzd.m124554a(str));
                this.f164841d = bxzd.m124555a(str, this.f164838a, this.f164841d, mo73827a());
                return;
            }
            int i2 = i + k2;
            this.f164841d = i2;
            int a = bxzd.m124555a(str, this.f164838a, i2, mo73827a());
            this.f164841d = i;
            mo73855d((a - i) - k2);
            this.f164841d = a;
        } catch (bxzb e) {
            this.f164841d = i;
            mo73864a(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new bxuh(e2);
        }
    }

    /* renamed from: d */
    public final void mo73856d(int i, int i2) {
        mo73845b(i, 0);
        mo73855d(i2);
    }

    /* renamed from: d */
    public final void mo73857d(long j) {
        try {
            byte[] bArr = this.f164838a;
            int i = this.f164841d;
            int i2 = i + 1;
            this.f164841d = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f164841d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f164841d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f164841d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f164841d = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f164841d = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f164841d = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f164841d = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new bxuh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f164841d), Integer.valueOf(this.f164840c), 1), e);
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
