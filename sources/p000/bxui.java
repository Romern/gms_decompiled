package p000;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bxui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxui extends bxuk {

    /* renamed from: a */
    private final ByteBuffer f164844a;

    /* renamed from: b */
    private final ByteBuffer f164845b;

    /* renamed from: c */
    private final int f164846c;

    /* renamed from: c */
    private final void m123572c(String str) {
        try {
            bxzd.m124556a(str, this.f164845b);
        } catch (IndexOutOfBoundsException e) {
            throw new bxuh(e);
        }
    }

    /* renamed from: a */
    public final int mo73827a() {
        return this.f164845b.remaining();
    }

    /* renamed from: b */
    public final int mo73842b() {
        return this.f164845b.position() - this.f164846c;
    }

    /* renamed from: d */
    public final void mo73855d(int i) {
        while ((i & -128) != 0) {
            try {
                this.f164845b.put((byte) ((i & 127) | 128));
                i >>>= 7;
            } catch (BufferOverflowException e) {
                throw new bxuh(e);
            }
        }
        this.f164845b.put((byte) i);
    }

    public bxui(ByteBuffer byteBuffer) {
        this.f164844a = byteBuffer;
        this.f164845b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.f164846c = byteBuffer.position();
    }

    /* renamed from: a */
    public final void mo73831a(int i, long j) {
        mo73845b(i, 0);
        mo73854c(j);
    }

    /* renamed from: e */
    public final void mo73858e(int i) {
        try {
            this.f164845b.putInt(i);
        } catch (BufferOverflowException e) {
            throw new bxuh(e);
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
            this.f164845b.put(b);
        } catch (BufferOverflowException e) {
            throw new bxuh(e);
        }
    }

    /* renamed from: c */
    public final void mo73851c() {
        this.f164844a.position(this.f164845b.position());
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
    public final void mo73852c(int i) {
        if (i < 0) {
            mo73854c((long) i);
        } else {
            mo73855d(i);
        }
    }

    /* renamed from: d */
    public final void mo73856d(int i, int i2) {
        mo73845b(i, 0);
        mo73855d(i2);
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

    /* renamed from: b */
    public final void mo73847b(int i, ByteString bxtx) {
        mo73845b(1, 3);
        mo73856d(2, i);
        mo73832a(3, bxtx);
        mo73845b(1, 4);
    }

    /* renamed from: c */
    public final void mo73853c(int i, int i2) {
        mo73845b(i, 0);
        mo73852c(i2);
    }

    /* renamed from: d */
    public final void mo73857d(long j) {
        try {
            this.f164845b.putLong(j);
        } catch (BufferOverflowException e) {
            throw new bxuh(e);
        }
    }

    /* renamed from: b */
    public final void mo73849b(bxxc bxxc) {
        mo73845b(3, 2);
        mo73839a(bxxc);
    }

    /* renamed from: c */
    public final void mo73854c(long j) {
        while ((-128 & j) != 0) {
            try {
                this.f164845b.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            } catch (BufferOverflowException e) {
                throw new bxuh(e);
            }
        }
        this.f164845b.put((byte) ((int) j));
    }

    /* renamed from: a */
    public final void mo73835a(int i, String str) {
        mo73845b(i, 2);
        mo73840a(str);
    }

    /* renamed from: b */
    public final void mo73850b(byte[] bArr, int i, int i2) {
        try {
            this.f164845b.put(bArr, i, i2);
        } catch (IndexOutOfBoundsException e) {
            throw new bxuh(e);
        } catch (BufferOverflowException e2) {
            throw new bxuh(e2);
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
        int position = this.f164845b.position();
        try {
            int k = bxuk.m123661k(str.length() * 3);
            int k2 = bxuk.m123661k(str.length());
            if (k2 == k) {
                int position2 = this.f164845b.position() + k2;
                this.f164845b.position(position2);
                m123572c(str);
                int position3 = this.f164845b.position();
                this.f164845b.position(position);
                mo73855d(position3 - position2);
                this.f164845b.position(position3);
                return;
            }
            mo73855d(bxzd.m124554a(str));
            m123572c(str);
        } catch (bxzb e) {
            this.f164845b.position(position);
            mo73864a(str, e);
        } catch (IllegalArgumentException e2) {
            throw new bxuh(e2);
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
