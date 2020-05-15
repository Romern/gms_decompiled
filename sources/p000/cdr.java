package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.OutputStream;

/* renamed from: cdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdr extends OutputStream {

    /* renamed from: a */
    private final OutputStream f6583a;

    /* renamed from: b */
    private byte[] f6584b;

    /* renamed from: c */
    private final cgr f6585c;

    /* renamed from: d */
    private int f6586d;

    /* renamed from: a */
    private final void m4013a() {
        int i = this.f6586d;
        if (i > 0) {
            this.f6583a.write(this.f6584b, 0, i);
            this.f6586d = 0;
        }
    }

    /* renamed from: b */
    private final void m4014b() {
        if (this.f6586d == this.f6584b.length) {
            m4013a();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        try {
            flush();
            this.f6583a.close();
            byte[] bArr = this.f6584b;
            if (bArr != null) {
                this.f6585c.mo3874a(bArr);
                this.f6584b = null;
            }
        } catch (Throwable th) {
            this.f6583a.close();
            throw th;
        }
    }

    public final void flush() {
        m4013a();
        this.f6583a.flush();
    }

    public final void write(int i) {
        byte[] bArr = this.f6584b;
        int i2 = this.f6586d;
        this.f6586d = i2 + 1;
        bArr[i2] = (byte) i;
        m4014b();
    }

    public cdr(OutputStream outputStream, cgr cgr) {
        this.f6583a = outputStream;
        this.f6585c = cgr;
        this.f6584b = (byte[]) cgr.mo3870a(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE, byte[].class);
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f6586d;
            if (i6 == 0 && i4 >= this.f6584b.length) {
                this.f6583a.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.f6584b.length - i6);
            System.arraycopy(bArr, i5, this.f6584b, this.f6586d, min);
            this.f6586d += min;
            i3 += min;
            m4014b();
        } while (i3 < i2);
    }
}
