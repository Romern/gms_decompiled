package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: citr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class citr extends InputStream {

    /* renamed from: a */
    public boolean f191445a;

    /* renamed from: b */
    public ByteBuffer f191446b;

    /* renamed from: c */
    public IOException f191447c;

    /* renamed from: d */
    private final citq f191448d;

    public citr(citq citq) {
        this.f191448d = citq;
    }

    /* renamed from: a */
    private final void m150998a() {
        if (this.f191445a) {
            IOException iOException = this.f191447c;
            if (iOException != null) {
                throw iOException;
            }
        } else if (!m150999b()) {
            if (this.f191446b == null) {
                this.f191446b = ByteBuffer.allocateDirect(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
            }
            this.f191446b.clear();
            citq citq = this.f191448d;
            citq.f191430b.read(this.f191446b);
            citq.f191429a.mo86558a(citq.getReadTimeout());
            IOException iOException2 = this.f191447c;
            if (iOException2 == null) {
                ByteBuffer byteBuffer = this.f191446b;
                if (byteBuffer != null) {
                    byteBuffer.flip();
                    return;
                }
                return;
            }
            throw iOException2;
        }
    }

    /* renamed from: b */
    private final boolean m150999b() {
        ByteBuffer byteBuffer = this.f191446b;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }

    public final int read() {
        m150998a();
        if (m150999b()) {
            return this.f191446b.get() & 255;
        }
        return -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            m150998a();
            if (!m150999b()) {
                return -1;
            }
            int min = Math.min(this.f191446b.limit() - this.f191446b.position(), i2);
            this.f191446b.get(bArr, i, min);
            return min;
        }
    }
}
