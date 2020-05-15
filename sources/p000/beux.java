package p000;

import java.nio.ByteBuffer;

/* renamed from: beux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beux {

    /* renamed from: a */
    public final int[] f112568a;

    /* renamed from: b */
    private final int f112569b;

    /* renamed from: c */
    private final int f112570c;

    /* renamed from: d */
    private final int f112571d;

    /* renamed from: e */
    private final int f112572e;

    /* renamed from: f */
    private final int f112573f;

    /* renamed from: g */
    private final Comparable[] f112574g;

    /* renamed from: h */
    private final ByteBuffer f112575h;

    public beux(Comparable[] comparableArr, ByteBuffer byteBuffer, long j) {
        this.f112574g = comparableArr;
        this.f112575h = byteBuffer;
        byteBuffer.rewind();
        long j2 = byteBuffer.getLong();
        if (j2 == j) {
            this.f112569b = byteBuffer.getInt();
            this.f112570c = byteBuffer.getInt();
            this.f112571d = byteBuffer.getInt();
            this.f112572e = byteBuffer.getInt();
            this.f112573f = byteBuffer.getInt();
            int i = byteBuffer.getInt();
            this.f112568a = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = byteBuffer.getInt();
                this.f112568a[i2] = byteBuffer.position();
                byteBuffer.position(this.f112568a[i2] + i3);
            }
            return;
        }
        StringBuilder sb = new StringBuilder(86);
        sb.append("Wrong version in model data. Expected ");
        sb.append(j);
        sb.append(", found ");
        sb.append(j2);
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    public final beuw mo61170a(int i, float[] fArr) {
        int i2;
        float f;
        int i3 = this.f112568a[i];
        int i4 = i3;
        while (true) {
            i2 = 0;
            if ((this.f112575h.get(i4) & 1) != 0) {
                break;
            }
            long j = 0;
            while (i2 < this.f112573f) {
                j |= (((long) this.f112575h.get(i4 + i2)) & 255) << (i2 * 8);
                i2++;
            }
            long j2 = j >>> 1;
            int i5 = this.f112569b;
            long j3 = j2 >>> i5;
            i4 = fArr[(int) (j2 & ((1 << i5) + -1))] <= Float.intBitsToFloat((int) j3) ? i4 + this.f112573f : i3 + ((int) (j3 >>> 32));
        }
        int i6 = 0;
        while (i2 < this.f112572e) {
            i6 |= (this.f112575h.get(i4 + i2) & 255) << (i2 * 8);
            i2++;
        }
        int i7 = i6 >>> 1;
        int i8 = this.f112570c;
        int i9 = ((1 << i8) - 1) & i7;
        int i10 = i7 >>> i8;
        int i11 = this.f112571d;
        if (i11 != 0) {
            f = ((float) i10) / ((float) ((1 << i11) - 1));
        } else {
            f = 1.0f;
        }
        return new beuw(this.f112574g[i9], f);
    }
}
