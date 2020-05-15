package com.android.volley.toolbox;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.ByteArrayOutputStream;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PoolingByteArrayOutputStream extends ByteArrayOutputStream {

    /* renamed from: a */
    private final ByteArrayPool f7363a;

    public PoolingByteArrayOutputStream(ByteArrayPool byteArrayPool) {
        this(byteArrayPool, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    /* renamed from: a */
    private final void m4793a(int i) {
        if (this.count + i > this.buf.length) {
            ByteArrayPool byteArrayPool = this.f7363a;
            int i2 = this.count + i;
            byte[] buf = byteArrayPool.getBuf(i2 + i2);
            System.arraycopy(this.buf, 0, buf, 0, this.count);
            this.f7363a.returnBuf(this.buf);
            this.buf = buf;
        }
    }

    public void close() {
        this.f7363a.returnBuf(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f7363a.returnBuf(this.buf);
    }

    public synchronized void write(int i) {
        m4793a(1);
        super.write(i);
    }

    public PoolingByteArrayOutputStream(ByteArrayPool byteArrayPool, int i) {
        this.f7363a = byteArrayPool;
        this.buf = byteArrayPool.getBuf(Math.max(i, (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES));
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        m4793a(i2);
        super.write(bArr, i, i2);
    }
}
