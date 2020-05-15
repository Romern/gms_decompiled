package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bnzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnzv extends bnyu {

    /* renamed from: a */
    private long f132426a;

    /* renamed from: b */
    private long f132427b;

    /* renamed from: c */
    private int f132428c = 0;

    public bnzv(int i) {
        long j = (long) i;
        this.f132426a = j;
        this.f132427b = j;
    }

    /* renamed from: b */
    private static long m110932b(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
        return j3 ^ (j3 >>> 33);
    }

    /* renamed from: c */
    private static long m110933c(long j) {
        return Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
    }

    /* renamed from: d */
    private static long m110934d(long j) {
        return Long.rotateLeft(j * 5545529020109919103L, 33) * -8663945395140668459L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo68733a(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long c = m110933c(j) ^ this.f132426a;
        this.f132426a = c;
        long rotateLeft = Long.rotateLeft(c, 27);
        long j3 = this.f132427b;
        this.f132426a = ((rotateLeft + j3) * 5) + 1390208809;
        long d = m110934d(j2) ^ j3;
        this.f132427b = d;
        this.f132427b = ((Long.rotateLeft(d, 31) + this.f132426a) * 5) + 944331445;
        this.f132428c += 16;
    }

    /* renamed from: b */
    public final bnzb mo68734b() {
        long j = this.f132426a;
        long j2 = (long) this.f132428c;
        long j3 = this.f132427b ^ j2;
        long j4 = (j ^ j2) + j3;
        this.f132426a = j4;
        this.f132427b = j3 + j4;
        this.f132426a = m110932b(j4);
        long b = m110932b(this.f132427b);
        long j5 = this.f132426a + b;
        this.f132426a = j5;
        this.f132427b = b + j5;
        return bnzb.m110872b(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f132426a).putLong(this.f132427b).array());
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo68735b(ByteBuffer byteBuffer) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        this.f132428c += byteBuffer.remaining();
        long j8 = 0;
        switch (byteBuffer.remaining()) {
            case 1:
                j2 = 0;
                j = j2 ^ ((long) bqcw.m112606a(byteBuffer.get(0)));
                break;
            case 2:
                j3 = 0;
                j2 = j3 ^ (((long) bqcw.m112606a(byteBuffer.get(1))) << 8);
                j = j2 ^ ((long) bqcw.m112606a(byteBuffer.get(0)));
                break;
            case 3:
                j4 = 0;
                j3 = j4 ^ (((long) bqcw.m112606a(byteBuffer.get(2))) << 16);
                j2 = j3 ^ (((long) bqcw.m112606a(byteBuffer.get(1))) << 8);
                j = j2 ^ ((long) bqcw.m112606a(byteBuffer.get(0)));
                break;
            case 4:
                j5 = 0;
                j4 = j5 ^ (((long) bqcw.m112606a(byteBuffer.get(3))) << 24);
                j3 = j4 ^ (((long) bqcw.m112606a(byteBuffer.get(2))) << 16);
                j2 = j3 ^ (((long) bqcw.m112606a(byteBuffer.get(1))) << 8);
                j = j2 ^ ((long) bqcw.m112606a(byteBuffer.get(0)));
                break;
            case 5:
                j6 = 0;
                j5 = j6 ^ (((long) bqcw.m112606a(byteBuffer.get(4))) << 32);
                j4 = j5 ^ (((long) bqcw.m112606a(byteBuffer.get(3))) << 24);
                j3 = j4 ^ (((long) bqcw.m112606a(byteBuffer.get(2))) << 16);
                j2 = j3 ^ (((long) bqcw.m112606a(byteBuffer.get(1))) << 8);
                j = j2 ^ ((long) bqcw.m112606a(byteBuffer.get(0)));
                break;
            case 6:
                j7 = 0;
                j6 = (((long) bqcw.m112606a(byteBuffer.get(5))) << 40) ^ j7;
                j5 = j6 ^ (((long) bqcw.m112606a(byteBuffer.get(4))) << 32);
                j4 = j5 ^ (((long) bqcw.m112606a(byteBuffer.get(3))) << 24);
                j3 = j4 ^ (((long) bqcw.m112606a(byteBuffer.get(2))) << 16);
                j2 = j3 ^ (((long) bqcw.m112606a(byteBuffer.get(1))) << 8);
                j = j2 ^ ((long) bqcw.m112606a(byteBuffer.get(0)));
                break;
            case 7:
                j7 = ((long) bqcw.m112606a(byteBuffer.get(6))) << 48;
                j6 = (((long) bqcw.m112606a(byteBuffer.get(5))) << 40) ^ j7;
                j5 = j6 ^ (((long) bqcw.m112606a(byteBuffer.get(4))) << 32);
                j4 = j5 ^ (((long) bqcw.m112606a(byteBuffer.get(3))) << 24);
                j3 = j4 ^ (((long) bqcw.m112606a(byteBuffer.get(2))) << 16);
                j2 = j3 ^ (((long) bqcw.m112606a(byteBuffer.get(1))) << 8);
                j = j2 ^ ((long) bqcw.m112606a(byteBuffer.get(0)));
                break;
            case 8:
                j = byteBuffer.getLong();
                break;
            case 9:
                j8 ^= (long) bqcw.m112606a(byteBuffer.get(8));
                j = byteBuffer.getLong();
                break;
            case 10:
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(9))) << 8;
                j8 ^= (long) bqcw.m112606a(byteBuffer.get(8));
                j = byteBuffer.getLong();
                break;
            case 11:
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(10))) << 16;
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(9))) << 8;
                j8 ^= (long) bqcw.m112606a(byteBuffer.get(8));
                j = byteBuffer.getLong();
                break;
            case 12:
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(11))) << 24;
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(10))) << 16;
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(9))) << 8;
                j8 ^= (long) bqcw.m112606a(byteBuffer.get(8));
                j = byteBuffer.getLong();
                break;
            case 13:
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(12))) << 32;
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(11))) << 24;
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(10))) << 16;
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(9))) << 8;
                j8 ^= (long) bqcw.m112606a(byteBuffer.get(8));
                j = byteBuffer.getLong();
                break;
            case 14:
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(13))) << 40;
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(12))) << 32;
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(11))) << 24;
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(10))) << 16;
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(9))) << 8;
                j8 ^= (long) bqcw.m112606a(byteBuffer.get(8));
                j = byteBuffer.getLong();
                break;
            case 15:
                j8 = ((long) bqcw.m112606a(byteBuffer.get(14))) << 48;
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(13))) << 40;
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(12))) << 32;
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(11))) << 24;
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(10))) << 16;
                j8 ^= ((long) bqcw.m112606a(byteBuffer.get(9))) << 8;
                j8 ^= (long) bqcw.m112606a(byteBuffer.get(8));
                j = byteBuffer.getLong();
                break;
            default:
                throw new AssertionError("Should never get here.");
        }
        this.f132426a = m110933c(j) ^ this.f132426a;
        this.f132427b ^= m110934d(j8);
    }
}
