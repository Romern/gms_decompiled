package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: buvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buvm extends OutputStream {

    /* renamed from: a */
    private final Object f155050a = new Object();

    /* renamed from: b */
    private final blux f155051b;

    /* renamed from: c */
    private final byte[] f155052c;

    /* renamed from: d */
    private int f155053d = 0;

    /* renamed from: e */
    private boolean f155054e = false;

    public buvm(blux blux) {
        this.f155051b = blux;
        this.f155052c = new byte[56320];
    }

    public final void close() {
        synchronized (this.f155050a) {
            if (!this.f155054e) {
                flush();
                this.f155054e = true;
                super.close();
            }
        }
    }

    public final void flush() {
        synchronized (this.f155050a) {
            if (!this.f155054e) {
                int i = this.f155053d;
                if (i != 0) {
                    this.f155051b.mo66704b(ByteBuffer.allocate(i).put(this.f155052c, 0, this.f155053d).array());
                    this.f155053d = 0;
                    return;
                }
                srn srn = bvcm.f155598a;
                return;
            }
            throw new IOException("Stream is closed!");
        }
    }

    public final void write(int i) {
        synchronized (this.f155050a) {
            if (!this.f155054e) {
                if (this.f155053d == this.f155052c.length) {
                    flush();
                }
                byte[] bArr = this.f155052c;
                int i2 = this.f155053d;
                this.f155053d = i2 + 1;
                bArr[i2] = (byte) i;
            } else {
                throw new IOException("Stream is closed!");
            }
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        synchronized (this.f155050a) {
            if (!this.f155054e) {
                while (i2 > 0) {
                    if (this.f155053d == this.f155052c.length) {
                        flush();
                    }
                    int min = Math.min(i2, this.f155052c.length - this.f155053d);
                    System.arraycopy(bArr, i, this.f155052c, this.f155053d, min);
                    i2 -= min;
                    i += min;
                    this.f155053d += min;
                }
            } else {
                throw new IOException("Stream is closed!");
            }
        }
    }
}
