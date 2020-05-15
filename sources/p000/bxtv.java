package p000;

import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: bxtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxtv extends OutputStream {

    /* renamed from: a */
    private static final byte[] f164790a = new byte[0];

    /* renamed from: b */
    private final int f164791b;

    /* renamed from: c */
    private final ArrayList f164792c;

    /* renamed from: d */
    private int f164793d;

    /* renamed from: e */
    private byte[] f164794e;

    /* renamed from: f */
    private int f164795f;

    public bxtv(int i) {
        if (i >= 0) {
            this.f164791b = i;
            this.f164792c = new ArrayList();
            this.f164794e = new byte[i];
            return;
        }
        throw new IllegalArgumentException("Buffer size < 0");
    }

    /* renamed from: a */
    private final void m123252a(int i) {
        this.f164792c.add(new bxtu(this.f164794e));
        int length = this.f164793d + this.f164794e.length;
        this.f164793d = length;
        this.f164794e = new byte[Math.max(this.f164791b, Math.max(i, length >>> 1))];
        this.f164795f = 0;
    }

    /* renamed from: b */
    public final synchronized int mo73766b() {
        return this.f164793d + this.f164795f;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo73766b()));
    }

    public final synchronized void write(int i) {
        if (this.f164795f == this.f164794e.length) {
            m123252a(1);
        }
        byte[] bArr = this.f164794e;
        int i2 = this.f164795f;
        this.f164795f = i2 + 1;
        bArr[i2] = (byte) i;
    }

    /* renamed from: a */
    public final synchronized ByteString mo73765a() {
        int i = this.f164795f;
        byte[] bArr = this.f164794e;
        int length = bArr.length;
        if (i >= length) {
            this.f164792c.add(new bxtu(bArr));
            this.f164794e = f164790a;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(length, i));
            this.f164792c.add(new bxtu(bArr2));
        }
        this.f164793d += this.f164795f;
        this.f164795f = 0;
        return ByteString.m123257a(this.f164792c);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f164794e;
        int length = bArr2.length;
        int i3 = this.f164795f;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f164795f += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        m123252a(i5);
        System.arraycopy(bArr, i + i4, this.f164794e, 0, i5);
        this.f164795f = i5;
    }
}
