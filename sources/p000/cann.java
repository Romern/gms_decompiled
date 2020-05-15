package p000;

import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: cann */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cann {

    /* renamed from: a */
    public static final cann f175381a = new cann(285, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0);

    /* renamed from: b */
    public int[] f175382b;

    /* renamed from: c */
    public int[] f175383c;

    /* renamed from: d */
    public cano f175384d;

    /* renamed from: e */
    public final int f175385e;

    /* renamed from: f */
    public final int f175386f;

    /* renamed from: g */
    private final int f175387g;

    /* renamed from: h */
    private boolean f175388h = false;

    static {
        new cann(4201, 4096, 1);
        new cann(1033, 1024, 1);
        new cann(67, 64, 1);
        new cann(19, 16, 1);
        new cann(ErrorInfo.TYPE_FSC_HTTP_ERROR, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 1);
    }

    public cann(int i, int i2, int i3) {
        this.f175387g = i;
        this.f175385e = i2;
        this.f175386f = i3;
    }

    /* renamed from: a */
    public static int m126830a(int i, int i2) {
        return i ^ i2;
    }

    /* renamed from: b */
    public final int mo74694b(int i, int i2) {
        mo74693a();
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f175382b;
        int[] iArr2 = this.f175383c;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f175385e - 1)];
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f175387g) + ',' + this.f175385e + ')';
    }

    /* renamed from: a */
    public final void mo74693a() {
        if (!this.f175388h) {
            int i = this.f175385e;
            this.f175382b = new int[i];
            this.f175383c = new int[i];
            int i2 = 0;
            int i3 = 1;
            while (true) {
                int i4 = this.f175385e;
                if (i2 >= i4) {
                    break;
                }
                this.f175382b[i2] = i3;
                i3 += i3;
                if (i3 >= i4) {
                    i3 = (i3 ^ this.f175387g) & (i4 - 1);
                }
                i2++;
            }
            for (int i5 = 0; i5 < this.f175385e - 1; i5++) {
                this.f175383c[this.f175382b[i5]] = i5;
            }
            this.f175384d = new cano(this, new int[]{0});
            new cano(this, new int[]{1});
            this.f175388h = true;
        }
    }

    /* renamed from: b */
    public final cano mo74695b() {
        mo74693a();
        return this.f175384d;
    }
}
