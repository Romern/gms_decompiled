package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: xlq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xlq {

    /* renamed from: a */
    private final byte[] f52677a;

    /* renamed from: b */
    private final byte f52678b;

    /* renamed from: c */
    private final long f52679c;

    /* renamed from: d */
    private final xln f52680d;

    public xlq(byte[] bArr, byte b, long j, xln xln) {
        boolean z = true;
        bmxy.m108588a(bArr.length == 32);
        bmxy.m108589a((j >= 4294967296L || j < 0) ? false : z, "Signature counter is not within a legitimate range");
        this.f52677a = bArr;
        this.f52678b = b;
        this.f52679c = j;
        this.f52680d = xln;
    }

    /* renamed from: a */
    public final byte[] mo29917a() {
        long j = this.f52679c;
        byte[] a = bqce.m112562a(this.f52677a, ByteBuffer.allocate(1).put(this.f52678b).array(), new byte[]{(byte) ((int) (j >>> 24)), (byte) ((int) (j >>> 16)), (byte) ((int) (j >>> 8)), (byte) ((int) j)});
        xln xln = this.f52680d;
        if (xln == null) {
            return a;
        }
        byte[] bArr = xln.f52672b;
        int length = bArr.length;
        return bqce.m112562a(a, bqce.m112562a(xln.f52671a, new byte[]{(byte) (length >>> 8), (byte) length}, bArr, xln.f52673c));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xlq) {
            xlq xlq = (xlq) obj;
            if (!Arrays.equals(this.f52677a, xlq.f52677a) || !bmxi.m108538a(Byte.valueOf(this.f52678b), Byte.valueOf(xlq.f52678b)) || !bmxi.m108538a(Long.valueOf(this.f52679c), Long.valueOf(xlq.f52679c)) || !bmxi.m108538a(this.f52680d, xlq.f52680d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f52677a)), Byte.valueOf(this.f52678b), Long.valueOf(this.f52679c), this.f52680d});
    }
}
