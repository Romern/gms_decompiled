package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;

/* renamed from: mjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class mjq extends mkn {

    /* renamed from: a */
    private final byte[] f33845a = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES];

    /* renamed from: b */
    private int f33846b = 0;

    /* renamed from: c */
    private int f33847c = 0;

    /* renamed from: a */
    public final int mo20106a(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return 0;
        }
        int i3 = this.f33847c;
        int i4 = this.f33846b;
        int i5 = i3 - i4;
        if (i5 == 0) {
            if (i4 != 0) {
                throw new RuntimeException("mReadBufferStart not 0");
            } else if (i3 != 0) {
                throw new RuntimeException("mReadBufferEnd not 0");
            } else if (i2 < 16384) {
                try {
                    i5 = mo20107b(this.f33845a, 0, AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
                    if (i5 >= 0) {
                        this.f33847c = i5;
                    } else {
                        mo20133b();
                        throw new mjp("Unable to read data from USB.");
                    }
                } catch (IOException e) {
                    mo20133b();
                    throw new mjp("Unable to read data from USB.", e);
                }
            } else {
                int b = mo20107b(bArr, i, i2);
                if (b >= 0) {
                    return b;
                }
                mo20133b();
                throw new mjp("Unable to read data from USB.");
            }
        }
        if (i5 <= 0) {
            return 0;
        }
        int min = Math.min(i5, i2);
        System.arraycopy(this.f33845a, this.f33846b, bArr, i, min);
        if (min < i5) {
            this.f33846b += min;
        } else {
            this.f33846b = 0;
            this.f33847c = 0;
        }
        return min;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo20107b(byte[] bArr, int i, int i2);
}
