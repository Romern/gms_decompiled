package p000;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;

/* renamed from: bumn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bumn extends buan {

    /* renamed from: a */
    public long[] f154250a;

    /* renamed from: b */
    protected byte[][] f154251b;

    /* renamed from: e */
    private bumk f154252e;

    protected bumn() {
        this.f153156c = new bumm(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72512a(ByteBuffer byteBuffer) {
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.get(this.f154250a);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
        int length = this.f154251b.length;
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        byteBuffer.position(byteBuffer.position() + (length * 4));
        for (int i = 0; i < length; i++) {
            int i2 = asIntBuffer.get();
            if (i2 != -1) {
                byte[] bArr = new byte[i2];
                this.f154251b[i] = bArr;
                byteBuffer.get(bArr);
            }
        }
    }

    /* renamed from: b */
    public final bumk values() {
        if (this.f154252e == null) {
            this.f154252e = new bumk(this);
        }
        return this.f154252e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final byte mo72515c() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo72516d() {
        int length = this.f154250a.length;
        byte[][] bArr = this.f154251b;
        int length2 = bArr.length;
        int i = (length * 8) + (length2 * 4);
        for (byte[] bArr2 : bArr) {
            if (bArr2 != null) {
                i += bArr2.length;
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72514b(ByteBuffer byteBuffer) {
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.put(this.f154250a);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        byteBuffer.position(byteBuffer.position() + (this.f154251b.length * 4));
        byte[][] bArr = this.f154251b;
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                asIntBuffer.put(-1);
            } else {
                asIntBuffer.put(bArr2.length);
                byteBuffer.put(bArr2);
            }
        }
    }
}
