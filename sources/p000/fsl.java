package p000;

import java.io.UnsupportedEncodingException;

/* renamed from: fsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fsl {

    /* renamed from: a */
    public int f17189a = 0;

    /* renamed from: b */
    public int f17190b = 0;

    /* renamed from: c */
    public final int[] f17191c;

    /* renamed from: d */
    public final byte[] f17192d;

    public fsl(int[] iArr, byte[] bArr) {
        this.f17191c = iArr;
        this.f17192d = bArr;
    }

    /* renamed from: a */
    public final void mo11249a(int i) {
        if (i < this.f17189a) {
            this.f17189a = 0;
            this.f17190b = 0;
        }
        while (true) {
            int i2 = this.f17189a;
            if (i2 < i) {
                this.f17190b += this.f17191c[i2];
                this.f17189a = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final String mo11250b(int i) {
        mo11249a(i);
        try {
            return new String(this.f17192d, this.f17190b, this.f17191c[this.f17189a], "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }
}
