package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: djz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class djz extends brtm {

    /* renamed from: a */
    public static final /* synthetic */ int f13375a = 0;

    /* renamed from: a */
    public static djz m8701a(ByteBuffer byteBuffer) {
        djz djz = new djz();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        djz.__reset(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return djz;
    }

    /* renamed from: b */
    public static boolean m8702b(ByteBuffer byteBuffer) {
        return brtm.__has_identifier(byteBuffer, "CHMR");
    }

    /* renamed from: Q */
    public final int mo9168Q() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f143329bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo9177c() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo9179d() {
        int __offset = __offset(16);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo9180e() {
        int __offset = __offset(20);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    /* renamed from: f */
    public final brtm mo9181f() {
        brtm brtm = new brtm();
        int __offset = __offset(10);
        if (__offset == 0) {
            return null;
        }
        brtm.__reset(__indirect(__offset + this.bb_pos), this.f143329bb);
        return brtm;
    }

    /* renamed from: b */
    public final int mo9175b() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    /* renamed from: c */
    public final String mo9178c(int i) {
        int __offset = __offset(16);
        if (__offset != 0) {
            return __string(__vector(__offset) + (i * 4));
        }
        return null;
    }

    /* renamed from: b */
    public final dka mo9176b(int i) {
        return mo9171a(new dka(), i);
    }

    /* renamed from: a */
    public final djy mo9169a(int i) {
        return mo9170a(new djy(), i);
    }

    /* renamed from: a */
    public final djy mo9170a(djy djy, int i) {
        int __offset = __offset(6);
        if (__offset == 0) {
            return null;
        }
        djy.__reset(__indirect(__vector(__offset) + (i * 4)), this.f143329bb);
        return djy;
    }

    /* renamed from: a */
    public final dka mo9171a(dka dka, int i) {
        int __offset = __offset(8);
        if (__offset == 0) {
            return null;
        }
        dka.__reset(__indirect(__vector(__offset) + (i * 4)), this.f143329bb);
        return dka;
    }

    /* renamed from: a */
    public final dka mo9172a(String str) {
        int __offset = __offset(8);
        if (__offset != 0) {
            return dka.m8717a(null, __vector(__offset), str, this.f143329bb);
        }
        return null;
    }

    /* renamed from: a */
    public final dnc mo9173a(dnc dnc, int i) {
        int __offset = __offset(22);
        if (__offset == 0) {
            return null;
        }
        dnc.__reset(__indirect(__vector(__offset) + (i * 4)), this.f143329bb);
        return dnc;
    }

    /* renamed from: a */
    public final void mo9174a(brtm brtm, int i) {
        int __offset = __offset(20);
        if (__offset != 0) {
            brtm.__reset(__indirect(__vector(__offset) + (i * 4)), this.f143329bb);
        }
    }
}
