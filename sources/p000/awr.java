package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: awr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awr {

    /* renamed from: a */
    public byte[] f2451a;

    /* renamed from: b */
    public int f2452b;

    /* renamed from: c */
    private String f2453c;

    public awr(int i) {
        this.f2453c = null;
        this.f2451a = new byte[i];
        this.f2452b = 0;
    }

    /* renamed from: a */
    public final InputStream mo2769a() {
        return new ByteArrayInputStream(this.f2451a, 0, this.f2452b);
    }

    /* renamed from: b */
    public final String mo2773b() {
        if (this.f2453c == null) {
            int i = this.f2452b;
            String str = "UTF-8";
            if (i >= 2) {
                byte[] bArr = this.f2451a;
                byte b = bArr[0];
                if (b != 0) {
                    byte b2 = b & 255;
                    if (b2 >= 128) {
                        if (b2 != 239) {
                            str = "UTF-16";
                            if (b2 != 254 && i >= 4 && bArr[2] == 0) {
                                this.f2453c = "UTF-32";
                            }
                        }
                        this.f2453c = str;
                    } else if (bArr[1] != 0) {
                        this.f2453c = str;
                    } else if (i >= 4 && bArr[2] == 0) {
                        this.f2453c = "UTF-32LE";
                    } else {
                        this.f2453c = "UTF-16LE";
                    }
                } else if (i < 4 || bArr[1] != 0) {
                    this.f2453c = "UTF-16BE";
                } else if ((bArr[2] & 255) == 254 && (bArr[3] & 255) == 255) {
                    this.f2453c = "UTF-32BE";
                } else {
                    this.f2453c = "UTF-32";
                }
            } else {
                this.f2453c = str;
            }
        }
        return this.f2453c;
    }

    public awr(InputStream inputStream) {
        this.f2453c = null;
        this.f2452b = 0;
        this.f2451a = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES];
        while (true) {
            int read = inputStream.read(this.f2451a, this.f2452b, AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
            if (read > 0) {
                int i = this.f2452b + read;
                this.f2452b = i;
                if (read == 16384) {
                    mo2770a(i + AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo2770a(int i) {
        byte[] bArr = this.f2451a;
        int length = bArr.length;
        if (i > length) {
            byte[] bArr2 = new byte[(length + length)];
            this.f2451a = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
    }

    /* renamed from: a */
    public final void mo2771a(byte[] bArr) {
        mo2772a(bArr, bArr.length);
    }

    /* renamed from: a */
    public final void mo2772a(byte[] bArr, int i) {
        mo2770a(this.f2452b + i);
        System.arraycopy(bArr, 0, this.f2451a, this.f2452b, i);
        this.f2452b += i;
    }

    public awr(byte[] bArr) {
        this.f2453c = null;
        this.f2451a = bArr;
        this.f2452b = bArr.length;
    }
}
