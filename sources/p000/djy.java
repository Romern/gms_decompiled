package p000;

import java.nio.ByteBuffer;

/* renamed from: djy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class djy extends brtm {
    /* renamed from: a */
    public static int m8680a(brtj brtj, int i, int i2, long j, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        brtj.mo69885d(16);
        brtj.mo69871a(2, j, 0);
        brtj.mo69883c(15, i15);
        brtj.mo69883c(14, i14);
        brtj.mo69883c(13, i13);
        brtj.mo69883c(12, i12);
        brtj.mo69879b(11, i11, 0);
        brtj.mo69879b(10, i10, 0);
        brtj.mo69879b(9, i9, 0);
        brtj.mo69883c(8, i8);
        brtj.mo69879b(7, i7, 0);
        brtj.mo69879b(6, i6, 0);
        brtj.mo69883c(5, i5);
        brtj.mo69883c(4, i4);
        brtj.mo69883c(3, i3);
        brtj.mo69883c(1, i2);
        brtj.mo69879b(0, i, 0);
        int e = brtj.mo69886e();
        brtj.mo69878b(e, 6);
        brtj.mo69878b(e, 10);
        brtj.mo69878b(e, 12);
        return e;
    }

    /* renamed from: b */
    public final String mo9151b() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    /* renamed from: c */
    public final ByteBuffer mo9152c() {
        return __vector_as_bytebuffer(6, 1);
    }

    /* renamed from: d */
    public final long mo9153d() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.f143329bb.getLong(__offset + this.bb_pos);
        }
        return 0;
    }

    /* renamed from: e */
    public final String mo9154e() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    /* renamed from: f */
    public final String mo9155f() {
        int __offset = __offset(12);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    /* renamed from: g */
    public final String mo9156g() {
        int __offset = __offset(14);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    /* renamed from: h */
    public final int mo9157h() {
        int __offset = __offset(16);
        if (__offset != 0) {
            return this.f143329bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    /* renamed from: i */
    public final int mo9158i() {
        int __offset = __offset(18);
        if (__offset != 0) {
            return this.f143329bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    /* renamed from: j */
    public final int mo9159j() {
        int __offset = __offset(20);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    /* renamed from: k */
    public final int mo9160k() {
        int __offset = __offset(22);
        if (__offset != 0) {
            return this.f143329bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    /* renamed from: l */
    public final int mo9161l() {
        int __offset = __offset(24);
        if (__offset != 0) {
            return this.f143329bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    /* renamed from: m */
    public final int mo9162m() {
        int __offset = __offset(26);
        if (__offset != 0) {
            return this.f143329bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    /* renamed from: n */
    public final String mo9163n() {
        int __offset = __offset(28);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    /* renamed from: o */
    public final String mo9164o() {
        int __offset = __offset(30);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    /* renamed from: p */
    public final String mo9165p() {
        int __offset = __offset(32);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    /* renamed from: q */
    public final String mo9166q() {
        int __offset = __offset(34);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    /* renamed from: r */
    public final brtm mo9167r() {
        return mo9150a(new brtm(), 0);
    }

    /* renamed from: a */
    public static int m8681a(brtj brtj, int[] iArr) {
        int length = iArr.length;
        brtj.mo69870a(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return brtj.mo69876b();
            }
            brtj.mo69882c(iArr[length]);
        }
    }

    /* renamed from: a */
    public final int mo9149a() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f143329bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    /* renamed from: a */
    public final brtm mo9150a(brtm brtm, int i) {
        int __offset = __offset(20);
        if (__offset == 0) {
            return null;
        }
        brtm.__reset(__indirect(__vector(__offset) + (i * 4)), this.f143329bb);
        return brtm;
    }
}
