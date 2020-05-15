package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: bqur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bqur implements bqwb {

    /* renamed from: b */
    private static final int[] f141644b = m113442b(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    int[] f141645a;

    /* renamed from: c */
    private final int f141646c;

    public bqur(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.f141645a = m113442b(bArr);
            this.f141646c = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: a */
    private static int m113438a(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* renamed from: b */
    static int[] m113442b(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    /* renamed from: a */
    public abstract int mo69334a();

    /* renamed from: a */
    public abstract int[] mo69335a(int[] iArr, int i);

    /* renamed from: a */
    static void m113439a(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i = 0; i < 10; i++) {
            m113440a(iArr2, 0, 4, 8, 12);
            m113440a(iArr2, 1, 5, 9, 13);
            m113440a(iArr2, 2, 6, 10, 14);
            m113440a(iArr2, 3, 7, 11, 15);
            m113440a(iArr2, 0, 5, 10, 15);
            m113440a(iArr2, 1, 6, 11, 12);
            m113440a(iArr2, 2, 7, 8, 13);
            m113440a(iArr2, 3, 4, 9, 14);
        }
    }

    /* renamed from: a */
    static void m113440a(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int a = m113438a(i5 ^ iArr[i4], 16);
        iArr[i4] = a;
        int i6 = iArr[i3] + a;
        iArr[i3] = i6;
        int a2 = m113438a(iArr[i2] ^ i6, 12);
        iArr[i2] = a2;
        int i7 = iArr[i] + a2;
        iArr[i] = i7;
        int a3 = m113438a(iArr[i4] ^ i7, 8);
        iArr[i4] = a3;
        int i8 = iArr[i3] + a3;
        iArr[i3] = i8;
        iArr[i2] = m113438a(iArr[i2] ^ i8, 7);
    }

    /* renamed from: a */
    static void m113441a(int[] iArr, int[] iArr2) {
        int[] iArr3 = f141644b;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, f141644b.length, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ByteBuffer mo69336a(byte[] bArr, int i) {
        int[] a = mo69335a(m113442b(bArr), i);
        int[] iArr = (int[]) a.clone();
        m113439a(iArr);
        for (int i2 = 0; i2 < a.length; i2++) {
            a[i2] = a[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(a, 0, 16);
        return order;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo69337a(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - mo69334a() >= bArr.length) {
            byte[] a = bqwf.m113516a(mo69334a());
            byteBuffer.put(a);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int remaining = wrap.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer a2 = mo69336a(a, this.f141646c + i2);
                if (i2 == i - 1) {
                    bqup.m113431a(byteBuffer, wrap, a2, remaining % 64);
                } else {
                    bqup.m113431a(byteBuffer, wrap, a2, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: a */
    public final byte[] mo69330a(byte[] bArr) {
        int length = bArr.length;
        if (length <= Integer.MAX_VALUE - mo69334a()) {
            ByteBuffer allocate = ByteBuffer.allocate(mo69334a() + length);
            mo69337a(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
